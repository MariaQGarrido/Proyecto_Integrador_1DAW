DROP TABLE IF EXISTS INSCRITO_EN;
DROP TABLE IF EXISTS ACTIVIDADES;
DROP TABLE IF EXISTS USUARIOS;
DROP TABLE IF EXISTS SALA;

CREATE TABLE IF NOT EXISTS SALA(
    id_sala INT UNIQUE PRIMARY KEY auto_increment,
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
    id_sala INT,
    nombre_actividad VARCHAR(10),
    descripcion_actividad VARCHAR(100),
    usuarios_maximos INT,
    usuarios_inscritos INT,
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
(1, 50, 'Gimnasio'),
(2, 30,'Piscina climatizada'),
(3, 10,'Pista de tenis');

INSERT INTO USUARIOS (id_usuario, nombre, apellidos, matricula, ciclo, password) VALUES
(1, 'María', 'Garrido Bravo', '123456H', 'DAM',  '1234'),
(2, 'Alejandro', 'Raboso Martos', '234567T','DAW', '1357'),
(3, 'Rosa', 'Hu', '463827Y','ASIR', '2468'),
(4, 'Sara', 'Villanueva', '489343L','TAFD', '1234'),
(5, 'Lucas', 'Film', '289398I','TAFD', '1234'),
(6, 'Diego', 'García', '328932U','TAFD', '1234');

INSERT INTO ACTIVIDADES (id_actividad, id_monitor, id_sala, nombre_actividad, descripcion_actividad, usuarios_maximos, usuarios_inscritos, dia_actividad, hora) VALUES
(1, 4, 1, 'Pilates','Una actividad para relajarse un rato',10,5, '2025-04-11', '11:05'),
(2, 5, 2,'Waterpolo','El gorro no se proporciona',15,10, '2025-04-12', '9:30'),
(3, 6, 3,'Tenis','Se necesita raqueta propia',4,2, '2025-04-21', '13:00');

INSERT INTO INSCRITO_EN (id_usr, id_act) VALUES
(1, 1),
(2, 3),
(3, 2);


select*from actividades a , sala s where a.id_sala = s.id_sala 