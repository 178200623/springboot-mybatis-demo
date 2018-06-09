-----------------------------------------------角色 权限--------------------------------------------------------
用户表
create table base_user (
  id VARCHAR(255) NOT NULL PRIMARY KEY ,#主键,关联角色
  username VARCHAR(255) NOT NULL ,#用户名
  password varchar(255) not null ,#密码
  status varchar(2) not null,#状态
  create_time datetime NOT null #创建时间
)
角色表
create table base_userroles(
  id	INTEGER	not null primary key auto_increment,#主键
  user_id	VARCHAR(255) not null ,	#用户id,外键
  role_id	VARCHAR(255) not null ,	#角色id
  role_name	VARCHAR(255) not null ,	#角色名称
  last_modify_time	DATETIME	not null, #最后修改时间
  logoff	VARCHAR(2) not null ,	#角色状态(正常or注销)
  description	VARCHAR(255) not null 	#角色描述
)
---------------------------------------------------概述-----------------------------------------------------
简介introduct

create table introduct(
  id	INTEGER	not null primary key auto_increment,#	主键
  content	VARCHAR(255)	not null,#	内容
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255)	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	not null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255)	not null,#	最后一次修改者,关联用户表base_user
  status	VARCHAR(2)	not null,#	状态(正常or作废)
  introduct_img	INTEGER	not null #	封面图Workimages_id
)
人物表Partner_Team

create table Partner_Team (
  id INTEGER not null primary key auto_increment, #	主键
  Parend_id VARCHAR(255)  not null, #	人物唯一id
  name VARCHAR(255) not null, #	名字
  sex VARCHAR(2) not null, #	性别
  birthday DATETIME not null, #	出生日VARCHAR(255)期
  address VARCHAR(255) not null, #	家庭住址
  contactphone VARCHAR(255) not null, #	联系方式
  nationalitycode VARCHAR(255) not null, #	国籍
  nationcaode VARCHAR(255) not null, #	民族
  create_time DATETIME not null, #	创建时间
  create_user_id VARCHAR(255) not null, #	创建者id,关联用户表base_user
  last_modify_time DATETIME DEFAULT null, #	最后一次修改时间
  last_modify_user_id VARCHAR(255) DEFAULT null, #	最后一次修改者id,关联用户表base_user
  position_id INTEGER DEFAULT null, #	职位id,外键
  department_id INTEGER DEFAULT null, #	所属部门id,外键
  remark VARCHAR(255) DEFAULT null, #	备注
  status VARCHAR(2) not null, #	(正常or注销)
  partner_img INTEGER DEFAULT null #	封面图Workimages_id
)
简介表Resume

create table Resume (
  id INTEGER not null primary key auto_increment, #	主键
  resume_id VARCHAR(255) not null , #	关联人物表Parend_id
  resume VARCHAR(255) not null, #	简历
)
职位表Position

create table Position	(
  id	INTEGER	not null primary key auto_increment,#	主键
  position_name	VARCHAR(255)	not null #	职位名称
  position_img INTEGER DEFAULT null #	封面图Workimages_id
)
部门表Department

create table Department(
  id	INTEGER	not null primary key auto_increment,#	主键
  department_name	VARCHAR(255)	not null #	部门名称
)
奖项Awards

create table Awards(
  id	INTEGER	not null primary key auto_increment,#
  awardsdate_time	DATETIME	not null,#	获奖时间
  awards_name	VARCHAR(255)	not null,#	获奖名称
  status	VARCHAR(255)	DEFAULT null,#	状态(正常or作废)
  award_img	INTEGER	DEFAULT null #	封面图Workimages_id
)

-----------------------------------------------------作品--------------------------------------------------------

作品Works

create table Works(
  id	INTEGER	not null primary key auto_increment,#	主键
  work_name	VARCHAR(255)	not null,#	作品名称
  worktype_id	VARCHAR(255)	not null,#	作品类别id,外键
  constructionsite	VARCHAR(255)	DEFAULT null,#	建造地点
  coveredarea	VARCHAR(255)	DEFAULT null,#	建筑面积(单位:平方米)
  designstart_time	DATETIME	not null,#	设计开始时间
  designstop_time	DATETIME	DEFAULT null,#	设计结束时间
  completion_time	VARCHAR(255)	DEFAULT null,#	竣工时间
  design_id	VARCHAR(255)	DEFAULT null,#	设计师id,关联人物表Patient_id
  design_name	VARCHAR(255)	DEFAULT null,#	设计师名称
  description	VARCHAR(1000)	DEFAULT null,#	作品简述
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255)	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255)	DEFAULT null,#	最后一次修改者id,关联用户表base_user
  comment_id	INTEGER	DEFAULT null,#	评论id,关联评论表Comment_id
  status	VARCHAR(255)	not null #	状态(正常or作废)
)
  作品类别表Worktype

create table Worktype (
  id            INTEGER      not null primary key auto_increment, #	主键
  worktype_name VARCHAR(255) not null #	类别名称
)
  作品图片Workimages

create table Workimages(
  id	INTEGER	not null primary key auto_increment,#	主键
  image_id	INTEGER	not null,#	图片id,关联作品id
  image_path	VARCHAR(255)	not null,#	图片路径
  mainfigure	INTEGER	not null,#	封面主图(是/否)
  status	VARCHAR(2)	DEFAULT null #	状态(正常or作废)
  remark  VARCHAR(2)	DEFAULT null #	备注
)


------------------------------------------------------媒体-------------------------------------------------------

出版Publish
create table Publish(
  id	INTEGER	not null primary key auto_increment,#
  publish_name	VARCHAR(255) 	not null,#	出版读物
  publish_time	DATETIME	not null,#	出版时间
  description	VARCHAR(255) 	not null,#	出版描述
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255) 	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255) 	DEFAULT null,#	最后一次修改者,关联用户表base_user
  status	VARCHAR(2) 	DEFAULT null,#	状态(正常or作废)
  publish_img	INTEGER	not null #	封面图Workimages_id
)
评论表Comment

create table Comment(
  id	INTEGER	not null primary key auto_increment,#	主键
  title	VARCHAR(255) 	not null,#	标题
  author	VARCHAR(255) 	DEFAULT null,#	发表者
  content	VARCHAR(255) 	DEFAULT null,#	内容
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255) 	not null,#	创建者id
   last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255) 	DEFAULT null,#	最后一次修改者id,关联用户表base_user
  status	VARCHAR(2) 	not null,#	状态(正常or作废)
  comment_img	INTEGER	not null #	封面图Workimages_id
)
展览Exhibition

create table Exhibition(
  id	INTEGER	not null primary key auto_increment,#
  exhibit_time	DATETIME	not null,#	展览时间
  exhibit_name	VARCHAR(255) 	not null,#	展览名称
  exhibit_address	VARCHAR(255) 	DEFAULT null,#	展览地点
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255) 	not null,#	创建者id
  last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255) 	DEFAULT null,#	最后一次修改者id,关联用户表base_user
  status	VARCHAR(255) 	not null,#	状态(正常or作废)
  exhibit_img	INTEGER	not null #	封面图Workimages_id
)



-------------------------------------------------------记事------------------------------------------------------
记事Remember

create table Remember(
  id	INTEGER	not null primary key auto_increment,#
  remember_time	DATETIME	not null,#	记事时间
  description	VARCHAR(255) 	not null,#	事件描述
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255) 	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255) 	DEFAULT null,#	最后一次修改者,关联用户表base_user
  status	VARCHAR(2) 	not null #	状态(正常or作废))
)

-------------------------------------------------------联系------------------------------------------------------
联系Contact

create table Contact(
  address	VARCHAR(255)	not null,#	地址
  zipcode	VARCHAR(255)	not null,#	邮编
  telephone	VARCHAR(255)	not null,#	电话
  fax	VARCHAR(255)	not null,#	传真
  ec_mail	VARCHAR(255)	not null,#	工程联络信箱
  bm_mail	VARCHAR(255)	not null,#	商务媒体信箱
  rp_mail	VARCHAR(255)	not null,#	招聘实习信箱
  create_time	DATETIME	not null,#	创建时间
  create_user	VARCHAR(255)	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	DEFAULT null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255)	DEFAULT null,#	最后一次修改者,关联用户表base_user
  status	VARCHAR(255)	not null #	状态(正常or作废)
  contact_img VARCHAR(255)	DEFAULT null
)


