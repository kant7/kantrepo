create table tab_mybatis(
	name varchar2(10) primary key,
	email varchar2(100),
	phone varchar2(11)
);

insert into tab_mybatis 
values ('호랑이','thosit@naee.com','01044472343');

insert into tab_mybatis 
values ('말코임','qewdq@naee.com','1234654');

insert into tab_mybatis 
values ('커피임','thosit@naee.com','01044472343');


drop table tab_mybatis;