package files;



public class FilesOutputStream {

	public static void main(String arg[]) {
		
	}
}
//show databases
//create database anudip
//use anudip
//show tables
//create table javastudent(id int, name varchar(200))
//desc javastudent
//Drop table javastudent
//drop database anudip 
//create table student(id int primary key, name varchar(10) not null, age int);
//alter table student add Foreign key(staff) reference staff(id);
//create table details(stid int reference student(id), gender char(10));
//create table details(stid int, gender char(10), foreign(stid) reference student(id));\
//create database java
//create table staff(id int primary key auto_increment, name varchar(50), subject varchar(50));
//insert into staff(name, subject) values ('Amit','java'),('Ankit','.net');

//jdbc-java database connectivity :- is is an platform but it can not able to execute sql query.
//so we need a connector to connect java and sql.
//this connector is a jar it act as a bridge between java and sql.
//helps to execute sql query in java platform.

//there are four type of connection driver.
//type1 driver :- jdbc-odbc-basic driver.
//type2 driver :- native api driver.
//type3 driver :- network driver.
//type4 driver :- database protocol or thin drivers.