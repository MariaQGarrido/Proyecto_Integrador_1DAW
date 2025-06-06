DROP TABLE IF EXISTS INSCRITO_EN;
DROP TABLE IF EXISTS ACTIVIDADES;
DROP TABLE IF EXISTS USUARIOS;
DROP TABLE IF EXISTS SALA;

CREATE TABLE IF NOT EXISTS SALA(
    id_sala VARCHAR(10) PRIMARY KEY,
    capacidad VARCHAR(30),
    tipo_sala VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS USUARIOS(
    id_usuario INT PRIMARY KEY,
    nombre VARCHAR(30),
    apellidos VARCHAR(30),
    matricula VARCHAR(30),
    ciclo VARCHAR(4),
    password VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS ACTIVIDADES(
    id_actividad INT PRIMARY KEY auto_increment,
    id_monitor INT,
    id_sala VARCHAR(10),
    nombre_actividad VARCHAR(50),
    descripcion_actividad VARCHAR(100),
    usuarios_maximos INT,
    usuarios_inscritos INT default (0),
	dia_actividad DATE,
    hora VARCHAR(6)
);
ALTER TABLE ACTIVIDADES ADD CONSTRAINT FOREIGN KEY(id_monitor) REFERENCES USUARIOS(id_usuario);
ALTER TABLE ACTIVIDADES ADD CONSTRAINT FOREIGN KEY (id_sala) REFERENCES SALA(id_sala);

CREATE TABLE IF NOT EXISTS INSCRITO_EN (
    id_usr INT,
    id_act INT,
    PRIMARY KEY (id_usr, id_act)
);
ALTER TABLE INSCRITO_EN ADD CONSTRAINT FOREIGN KEY(id_usr) REFERENCES USUARIOS(id_usuario);
ALTER TABLE INSCRITO_EN ADD CONSTRAINT FOREIGN KEY(id_act) REFERENCES ACTIVIDADES(id_actividad);  

-- Inserto los datos
INSERT INTO SALA (id_sala, capacidad, tipo_sala) VALUES
('PPA1',40,'PABELLON'),
('PPA2',40,'PABELLON'),
('PPA3',40,'PABELLON'),
('PPIS',40,'PISCINA'),
('PPB1',10,'PISTAS DE BALONCESTO'),
('PPB2',10,'PISTAS DE BALONCESTO'),
('PPE1',40,'PISTAS DE ATLETISMO'),
('PPE2',40,'PISTAS DE ATLETISMO');

INSERT INTO USUARIOS (id_usuario, nombre, apellidos, matricula, ciclo, password) VALUES
(1, 'María', 'Garrido Bravo', '123456H', 'DAM',  '1234'),
(2, 'Alejandro', 'Raboso Martos', '234567T','DAW', '1234'),
(3, 'Rosa', 'Hu', '463827Y','ASIR', '1234'),
(6, 'Manuel', 'García', '328932U','DAW', '1234'),
(7, 'Lucas', 'Sanchez', '495719P','ASIR', '1234'),
(4, 'Sara', 'Villanueva', '489343L','TAFD', '1234'),
(5, 'Irene', 'Del Rincón', '289398I','TAFD', '1234');


INSERT INTO ACTIVIDADES (id_actividad, id_monitor, id_sala, nombre_actividad, descripcion_actividad, usuarios_maximos, usuarios_inscritos, dia_actividad, hora) VALUES
(1, 4, 'PPA1', 'Pilates','Una actividad para relajarse un rato',10,1, '2025-04-11', '11:05'),
(2, 4,'PPIS','Waterpolo','El gorro no se proporciona',15,1, '2025-04-12', '9:30'),
(3, 4, 'PPE1','Atletismo','',5,1, '2025-04-21', '13:00'),
(4,5,'PPA1','Futbol Sala','Último partido de la temporada', 11,0,'2025-11-11','9:30'),
(5,4,'PPA3','Baloncesto','En caso de que haga buen tiempo, se jugará afuera',11,11,'2025-12-01','12:30');

INSERT INTO INSCRITO_EN (id_usr, id_act) VALUES
(1, 1),
(2, 2),
(3, 3);