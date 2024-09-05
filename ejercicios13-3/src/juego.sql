create database juego ;
use juego ;

create table cj (  /*60*/
id int unsigned primary key auto_increment,
nombre varchar (50) not null,
fecha_nacimiento date
);

create table relleno (  /*60*/
id int unsigned primary key auto_increment,
nombre varchar (50) not null,
cantidad_dinero int unsigned
);