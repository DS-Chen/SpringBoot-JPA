-- 学生表
create table student(
  id int primary key auto_increment,
  name varchar(20),
  sex varchar(8),
  age int,
  c_id int,
  foreign key(c_id) references headclass(hc_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8
insert into student(name,sex,age,c_id) values('tom','男',20,1);
insert into student(name,sex,age,c_id) values('jack','男',18,2);
insert into student(name,sex,age,c_id) values('chen','男',21,1);
-- 课程表
create table course(
id int primary key auto_increment,
name varchar(20),
credit int
)ENGINE=InnoDB  DEFAULT CHARSET=utf8
insert into course(name,credit) values('Math',5);
insert into course(name,credit) values('Computer',3);

-- 学生课程中间表
create table student_course(
 s_id int,
 c_id int,
 sc_date date,
 primary key(s_id,c_id),
 foreign key(s_id) references student(id),
 foreign key(c_id) references course(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

insert into student_course(s_id,c_id,sc_date) values(1,1,'2018-01-01');
insert into student_course(s_id,c_id,sc_date) values(1,2,'2018-01-02');
insert into student_course(s_id,c_id,sc_date) values(2,1,'2018-02-01');
insert into student_course(s_id,c_id,sc_date) values(2,2,'2018-02-02');

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

select * from
student S
left join student_course SC on S.id=SC.s_id
left join course C on SC.c_id=C.id
left join headclass HC on S.c_id=HC.hc_id
left join headtecher HT on HC.ht_id=HT.ht_id
where S.id=1


