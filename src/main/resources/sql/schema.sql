drop table if exists game cascade
Create table game(id int PRIMARY KEY not null,category varchar(20))
drop table if exists balance_game cascade
create table balance_game(id int PRIMARY KEY NOT NULL,solution1 varchar(70),solution2 varchar(70))
drop table if exists quiz cascade
create table quiz(id int PRIMARY KEY NOT NULL,question varchar(100),answer varchar(50))
drop table if exists OX_quiz cascade
create table OX_quiz(id int PRIMARY KEY NOT NULL,question varchar(100),answer boolean)
drop table if exists start_game cascade
create table start_game(id int PRIMARY KEY NOT NULL,question varchar(10),example varchar(100))
drop table if exists with_one_mouth cascade
create table with_one_mouth(id int PRIMARY KEY NOT NULL,woreds varchar(20))