drop database if exists `sample`;
create database `sample` charset=utf8; // 创建数据库语句

use `sample`;  //使用数据库语句

drop table if exists `status`;  //创建表的语句
create table `status`
(
  id tinyint(4) unsigned primary key auto_increment,
  name varchar(24) not null,
  create_time datetime not null,
  update_time datetime not null
);

 insert into t_user (user_name, age, address, create_time)  
															//表的插入语句 
 values 
 ("苏志超", 22, "交大理工10栋621", NOW()),
("苏志超", 22, "交大理工10栋621", NOW());

delete from t_user where user_id = 7; //表的删除语句
 
 
  flush tables with read lock;   //刷新表结构