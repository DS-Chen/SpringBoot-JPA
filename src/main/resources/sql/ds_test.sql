-- 学生表
create table student(
  s_id int primary key auto_increment,
  s_name varchar(20),
  s_sex varchar(8),
  s_age int,
  s_cid int,
  foreign key(s_cid) references headclass(hc_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8
insert into student(s_name,s_sex,s_age,s_cid) values('tom','男',20,1);
insert into student(s_name,s_sex,s_age,s_cid) values('jack','男',18,2);
insert into student(s_name,s_sex,s_age,s_cid) values('chen','男',21,1);
-- 课程表
create table course(
c_id int primary key auto_increment,
c_name varchar(20),
c_credit int
)ENGINE=InnoDB  DEFAULT CHARSET=utf8
insert into course(c_name,c_credit) values('Math',5);
insert into course(c_name,c_credit) values('Computer',3);

-- 学生课程中间表
create table student_course(
 sc_sid int,
 sc_cid int,
 sc_date date,
 primary key(sc_sid,sc_cid),
 foreign key(sc_sid) references student(s_id),
 foreign key(sc_cid) references course(c_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

insert into student_course(sc_sid,sc_cid,sc_date) values(1,1,'2018-01-01');
insert into student_course(sc_sid,sc_cid,sc_date) values(1,2,'2018-01-02');
insert into student_course(sc_sid,sc_cid,sc_date) values(2,1,'2018-02-01');
insert into student_course(sc_sid,sc_cid,sc_date) values(2,2,'2018-02-02');
insert into student_course(sc_sid,sc_cid,sc_date) values(3,1,'2018-02-05');
insert into student_course(sc_sid,sc_cid,sc_date) values(3,2,'2018-02-06');

-- 班主任表
create table headtecher(
	ht_id int primary key auto_increment,
    ht_name varchar(20),
    ht_age int
)engine=InnoDB default charset=utf8

insert into headtecher(ht_name,ht_age) values('张三',35);
insert into headtecher(ht_name,ht_age) values('刘能',40);

-- 班级表
create table headclass(
	hc_id int primary key auto_increment,
    hc_name varchar(20),
    ht_id int unique,
    foreign key(ht_id) references headtecher(ht_id)
)engine=InnoDB default charset=utf8

insert into headclass(hc_name,ht_id) values('软件工程（1）班',1);
insert into headclass(hc_name,ht_id) values('软件工程（2）班',2)



