package com.cn.controller;

import com.cn.service.PartnerTeamService;
import com.cn.util.Result;
import com.cn.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PartnerTeamController {

    @Autowired
    private PartnerTeamService partnerTeamService;

    private Result result ;

    /**
     * 获取合伙人列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/summary/partner")
    public Result selectAllPartner() throws Exception{
        Map<String, Object>  mapList =new HashMap<String, Object>();
        mapList = partnerTeamService.selelctAllPartner();
        result = ResultUtil.success(mapList);
        return result;
    }

    /**
     * 获取团队信息
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/api/summary/team")
    public Result selectOtherPartner() throws Exception{
        Map<String, Object>  mapList = new HashMap<String, Object>();
        mapList = partnerTeamService.selelctOtherPartner();

        result = ResultUtil.success(mapList);
        return result;
    }

    /**
     * 获取职员列表
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "api/staff",method = RequestMethod.GET)
    public Result findAllPartner(@RequestParam("pageNum") int pageNum,@RequestParam("pageCount") int pageCount) throws Exception{

        result = ResultUtil.success(partnerTeamService.findAllPartner(pageNum,pageCount));
        return result;
    }
    /**
     * 删除员工
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "api/staff",method = RequestMethod.DELETE)
    public Result delPartner(@RequestParam("ids") int[] ids) throws Exception{

        for (int i:ids) {
            int res = partnerTeamService.deleteByPrimaryKey(i);
            if (res > 0 ){
                result = ResultUtil.success(2000,"删除成功");
            }else{
                result = ResultUtil.success(3000,"删除失败");
            }
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "api/staff",method = RequestMethod.POST)
    public Result updatePartner(@RequestBody Map<String,Object> body) throws Exception{
        partnerTeamService.updateByPrimaryKey((Map<String, Object>) body.get("staff"));
        return result;
    }
}