
create database pcc;
use pcc; 
drop table if exists `master_data`;

create table `master_data`(
id int(11) auto_increment primary key ,
district varchar(45) ,
area varchar(45) ,
town varchar(45), 
zone varchar(45)
);

drop table if exists `user`;
create table `user`(
username varchar(16) ,
email varchar(255), 
id int(11) auto_increment primary key, 
name varchar(32) ,
father_name varchar(32) ,
dob date ,
gender varchar(32) ,
nominee_name varchar(32) ,
relationship varchar(32) ,
password varchar(32) ,
mobile_number varchar(10) ,
phone_number varchar(10) ,
house_number varchar(32),
locality varchar(32) ,
street varchar(32) ,
landmark varchar(32) ,
pin varchar(6)
);

drop table if exists `user_register`;
create table`user_register`(
name varchar(16) ,
email varchar(255) ,
password varchar(32) ,
mobile varchar(10) ,
id int(11) auto_increment primary key
);




INSERT INTO `pcc`.`user` (`id`, `dob`, `email`, `father_name`, `gender`, `house_number`, `landmark`, `locality`, `mobile`, `name`, `nominee_name`, `phone`, `pin`, `relationship`, `street`) VALUES ('1', '2000-09-26', 'xyz@gmail.com', 'abc', 'male', '104', 'xyz place', 'xyz', '9656432432', 'xyz', 'xyz nom', '9191567567', '560100', 'grandfather', 'xyz street');
INSERT INTO `pcc`.`user` (`id`, `dob`, `email`, `father_name`, `gender`, `house_number`, `landmark`, `locality`, `mobile`, `name`, `nominee_name`, `phone`, `pin`, `relationship`, `street`) VALUES ('2', '2000-09-25', 'abc@gmail.com', 'abc', 'female', '104', 'xyz place', 'xyz', '9056432432', 'xyz', 'xyz nom', '9191567567', '560100', 'grandfather', 'xyz street');


INSERT INTO `pcc`.`master_data` (`id`, `district`, `area`, `town`, `zone`) VALUES ('1', 'qwe', 'asd', 'dfg', 'xcv');
INSERT INTO `pcc`.`master_data` (`id`, `district`, `area`, `town`, `zone`) VALUES ('2', 'qse', 'asz', 'dhg', 'xc');
