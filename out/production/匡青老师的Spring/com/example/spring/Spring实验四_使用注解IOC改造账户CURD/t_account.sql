drop database if exists `spring_database`;
create database `spring_database` charset=utf8; // 创建数据库语句

use `spring_database`;  //使用数据库语句

drop table if exists `t_account`;  //创建表的语句
create table `t_account`
(
  id int(16) unsigned primary key auto_increment,
  username varchar(24) not null,
  password varchar(24) not null,
);

insert into t_account (username, password)  //表的插入语句
  values
  ("13247749919", "12345678"),
  ("13177941625", "12345678");

delete from t_user where user_id = 7; //表的删除语句
 
 
  flush tables with read lock;   //刷新表结构