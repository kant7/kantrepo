create table tab_mybatis(
	name varchar2(10) primary key,
	email varchar2(100),
	phone varchar2(11)
);

insert into tab_mybatis 
values ('남궁훈','thosit@naee.com','01044472343');

insert into tab_mybatis 
values ('홍길동','qewdq@naee.com','1234654');

insert into tab_mybatis 
values ('이순신','thosit@naee.com','01044472343');


drop table tab_mybatis;