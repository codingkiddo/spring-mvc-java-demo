drop table if exists spittle;
drop table if exists spitter;

create table spitter (
  id INT  not null AUTO_INCREMENT,
  username varchar(25) not null,
  password varchar(25) not null,
  first_name varchar(100) not null,
    last_name varchar(100) not null,
  email varchar(50) not null, 
    PRIMARY KEY (id)
);

create table spittle (
  id INT  not null AUTO_INCREMENT,
  spitter integer  null,
  message varchar(2000) not null,
  created_at DATE not null,
    latitude double NOT NULL,
    longitude double NOT NULL,
    PRIMARY KEY (id), 
  foreign key (spitter) references spitter(id)
);


insert into Spitter (id, username, password, first_name, last_name, email) values (1, 'habuma', 'password', 'Craig', 'Walls', 'craig@habuma.com');
insert into Spitter (id, username, password, first_name, last_name, email) values (2, 'mwalls', 'password', 'Michael', 'Walls', 'mwalls@habuma.com');
insert into Spitter (id, username, password, first_name, last_name, email) values (3, 'chuck', 'password', 'Chuck', 'Wagon', 'chuck@habuma.com');
insert into Spitter (id, username, password, first_name, last_name, email) values (4, 'artnames', 'password', 'Art', 'Names', 'art@habuma.com');

insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (1, 1, 'This is a test spittle message', '2012-06-09', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (2, 1, 'This is another test spittle message', '2012-06-09', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (3, 1, 'This is a third test spittle message', '2012-07-04', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (4, 2, 'Hello from Chuck!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (5, 4, 'Hello from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (6, 4, 'Hello again from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (7, 4, 'Hola from Arthur!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (8, 4, 'Buenos Dias from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (9, 4, 'Ni Hao from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (10, 4, 'Guten Tag from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (11, 4, 'Konnichi wa from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (12, 4, 'Buon giorno from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (13, 4, 'Bonjour from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (14, 4, 'Aloha from Art!', '2012-03-25', 000.000, 000.000);
insert into Spittle (id, spitter, message, created_at, latitude, longitude) values (15, 4, 'God dag from Art!', '2012-03-25', 000.000, 000.000);

