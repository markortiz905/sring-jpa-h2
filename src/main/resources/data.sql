DROP TABLE IF EXISTS person;

create table person (
 id integer not null,
 name varchar(255) not null,
 address varchar(255) not null,
 primary key(id)
);

INSERT INTO PERSON (ID, NAME, ADDRESS ) 
VALUES(10001,  'Mark', 'Pasig');
INSERT INTO PERSON (ID, NAME, ADDRESS ) 
VALUES(10002,  'Marcus', 'Pasig');