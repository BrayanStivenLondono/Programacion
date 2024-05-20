CREATE DATABASE videojuegos;
use videojuegos;

CREATE TABLE videojuegos(
id INTEGER auto_increment primary key,
nombre varchar(50),
plataforma varchar(50),
genero varchar(80),
precio float
);

insert into videojuegos (nombre, plataforma, genero, precio)
values 
('Batman', 'PS4','Videojuego de accion', 35),
('Crysis', 'PC','videojuego de ciencia ficcion', 25),
('Call of Duty', 'X-Box_360','Video juego de guerra', 40),
('FIFA 15', 'PS4','Video juego de futbol soccer', 45),
('Final Fantasy XIII', 'X-Box_360','Video Juego de Fantasia y aventura', 30),
('Mario Galaxy II', 'WII','Video Juego de aventura', 50),
('Mario Kart', 'WII','Video Juego de misiones y carreras', 50);