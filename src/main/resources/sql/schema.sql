drop table if exists game cascade
Create table game(id int PRIMARY KEY not null,category varchar(20))
drop table if exists balance_game cascade
create table balance_game(id int PRIMARY KEY NOT NULL,solution1 varchar(50),solution2 varchar(50))