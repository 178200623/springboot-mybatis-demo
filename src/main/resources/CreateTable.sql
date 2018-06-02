create table base_user (
  id VARCHAR(255) NOT NULL PRIMARY KEY ,#主键，关联角色
  username VARCHAR(255) NOT NULL ,#用户名
  password varchar(255) not null ,#密码
  status varchar(2) not null,#状态
  create_time datetime NOT null #创建时间
)

create table base_userroles(
  id	INTEGER	not null primary key auto_increment,#主键
  user_id	VARCHAR(255) not null ,	#用户id，外键
  role_id	VARCHAR(255) not null ,	#角色id
  role_name	VARCHAR(255) not null ,	#角色名称
  last_modify_time	DATETIME	not null, #最后修改时间
  logoff	VARCHAR(2) not null ,	#角色状态（正常or注销）
  description	VARCHAR(255) not null 	#角色描述
)

create table introduct(
  id	INTEGER	not null primary key auto_increment,#	主键
  content	VARCHAR(255)	not null,#	内容
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255)	not null,#	创建者,关联用户表base_user
  last_modify_time	DATETIME	not null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255)	not null,#	最后一次修改者,关联用户表base_user
  status	VARCHAR(2)	not null,#	状态（正常or作废）
  introduct_img	INTEGER	not null #	封面图Workimages_id
)

create table Partner_Team (
  id INTEGER not null primary key auto_increment, #	主键
  Parend_id VARCHAR not null, #	人物唯一id
  name VARCHAR(255) not null, #	名字
  sex VARCHAR(2) not null, #	性别
  birthday DATETIME not null, #	出生日VARCHAR(255)期
  address VARCHAR(255) not null, #	家庭住址
  contactphone VARCHAR(255) not null, #	联系方式
  nationalitycode VARCHAR(255) not null, #	国籍
  nationcaode VARCHAR(255) not null, #	民族
  create_time DATETIME not null, #	创建时间
  create_user_id VARCHAR(255) not null, #	创建者id,关联用户表base_user
  last_modify_time DATETIME not null, #	最后一次修改时间
  last_modify_user_id VARCHAR(255) not null, #	最后一次修改者id,关联用户表base_user
  position_id INTEGER not null, #	职位id，外键
  department_id INTEGER not null, #	所属部门id,外键
  remark VARCHAR(255) not null, #	备注
  status VARCHAR(2) not null, #	（正常or注销）
  partner_img INTEGER not null #	封面图Workimages_id
)

create table Resume (
  id VARCHAR(255) not null primary key , #	主键，关联人物表Parend_id
  resume VARCHAR(255) not null, #	简历
  last_modify_time DATETIME not null, #	最后一次修改时间
  last_modify_user_id VARCHAR(255) not null #	最后一次修改者id
)

create table Position	(
  id	INTEGER	not null primary key auto_increment,#	主键
  position_name	VARCHAR(255)	not null #	职位名称
)

create table Department(
  id	INTEGER	not null primary key auto_increment,#	主键
  department_name	VARCHAR(255)	not null #	部门名称
)

create table Awards(
  id	INTEGER	not null primary key auto_increment,#
  awardsdate_time	DATETIME	not null,#	获奖时间
  awards_name	VARCHAR(255)	not null,#	获奖名称
  create_time	DATETIME	not null,#	创建时间
  create_user_id	VARCHAR(255)	not null,#	创建者id,关联用户表base_user
  last_modify_time	DATETIME	not null,#	最后一次修改时间
  last_modify_user_id	VARCHAR(255)	not null,#	最后一次修改者id,关联用户表base_user
  status	VARCHAR(255)	not null,#	状态（正常or作废）
  award_img	INTEGER	not null #	封面图Workimages_id
)