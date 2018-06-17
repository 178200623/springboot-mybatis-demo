package com.cn.controller;

import com.cn.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Paths;
import java.util.Map;


@RestController
public class WorkimagesController {


    private final ResourceLoader resourceLoader;

    @Autowired
    public WorkimagesController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Value("${web.upload-path}")
    private String path;

    /**
     * 上传保存图片方法一
     * @param file
     * @param request
     * @return
     * @throws FileNotFoundException
     */
    @ResponseBody
    @RequestMapping(value="/api/img",method = RequestMethod.POST)
    public String SaveImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws FileNotFoundException {


        if (!file.isEmpty()) {
            String saveFileName = file.getOriginalFilename();
            File saveFile = new File(ResourceUtils.getFile("classpath:static").getPath()+"\\" + saveFileName);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
                System.out.println(saveFile.getName() + " 上传成功");
                return (saveFile.getName() + " 上传成功");
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();

            }
        } else {

        }
        return   "333";
    }


    /**
     * 跳转到文件上传页面
     * @return
     */
    @RequestMapping("test")
    public String toUpload(){
        return "test";
    }

    /**
     * 上传保存图片方法二
     * @param file 要上传的文件
     * @return
     */
    @RequestMapping(value="/fileUpload",method = RequestMethod.POST)
    public String upload(@RequestParam("fileName") MultipartFile file, Map<String, Object> map){

        // 要上传的目标文件存放路径
        String localPath = "D:/img";
        // 上传成功或者失败的提示
        String msg = "";

        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            // 上传成功，给出页面提示
            msg = "上传成功！";
        }else {
            msg = "上传失败！";

        }

        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());

        return "forward:/test";
    }

    /**
     * 显示单张图片
     * @return
     */
    @ResponseBody
    @RequestMapping("/show")
    public ResponseEntity<?> showPhotos(@RequestParam("fileName") String fileName){
        try {
            // 由于是读取本机的文件，file是一定要加上的， path是在application配置文件中的路径
            return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(path,fileName).toString()));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
