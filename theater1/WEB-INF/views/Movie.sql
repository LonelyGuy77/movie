select * from question;
select * from qeustion_answer;
desc question;
desc qeustion_answer;

show tables;
drop table question;
drop table question_answer;

delete from question_answer where no = 120;
truncate `question_answer`;  
truncate `question`;  
truncate `frequency_question`;  
SET foreign_key_checks = 0;
SET foreign_key_checks = 1;

CREATE TABLE IF NOT EXISTS `kmoon`.`question_answer` (
  `question_no` INT UNSIGNED NOT NULL,
  `atitle` VARCHAR(100) NULL,
  `acontent` TEXT(5000) NULL,
  `awriter` VARCHAR(40) NOT NULL DEFAULT 'admin',
  `awdate` DATE NULL,
  INDEX `fk_question_copy1_question1_idx` (`question_no` ASC),
  CONSTRAINT `fk_question_copy1_question1`
    FOREIGN KEY (`question_no`)
    REFERENCES `kmoon`.`question` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `kmoon`.`question` (
  `no` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NULL,
  'Kinds' VARCHAR(100) NULL,
  `content` TEXT(5000) NULL,
  `writer` VARCHAR(40) NULL,
  `wdate` DATE NULL,
  `check_answer` ENUM('Y', 'N') NULL DEFAULT 'N',
  PRIMARY KEY (`no`))
ENGINE = InnoDB;


SELECT * FROM question INNER JOIN question_answer  ON question.no=question_answer.question_no;


insert into question
		(no,writer,title,content,kinds,wdate,check_answer)
		values('120','홍길동','영자나와','씨발놈아!','1',now(),default);
insert into question_answer (question_no,awriter,atitle,acontent,awdate) values('120','홍길동','영자나와','씨발놈아!',now());


	insert into
		question_answer(question_no,awriter,atitle,acontent,awdate)
		values(#{question_no},#{awriter},#{atitle},#{acontent},now());


		create table frequency_question(no int unsigned not null primary key auto_increment,title varchar(100) not null, content text, kinds varchar(20));
		
		
