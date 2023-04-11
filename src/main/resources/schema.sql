drop table if exists spittle;
drop table if exists spitter;

create table spitter (
  id INT not null,
  username varchar(25) not null,
  password varchar(25) not null,
  fullName varchar(100) not null,
  email varchar(50) not null,
  updateByEmail boolean not null, 
    status varchar(50) not null,
    PRIMARY KEY (id)
);

create table spittle (
  id INT not null,
  spitter integer not null,
  message varchar(2000) not null,
  postedTime DATE not null,
  foreign key (spitter) references spitter(id)
);

