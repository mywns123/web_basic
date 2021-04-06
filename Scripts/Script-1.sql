create table member(
   id varchar(15) not null,
   password char(41),
   name varchar(15),
   age int(11),
   gender varchar(5),
   email varchar(30),
   primary key (id)
);