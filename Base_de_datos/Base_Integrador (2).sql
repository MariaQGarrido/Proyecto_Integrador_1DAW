DROP TABLE IF EXISTS OCURRE_EN;
DROP TABLE IF EXISTS INSCRITO_EN;
DROP TABLE IF EXISTS SALA;
DROP TABLE IF EXISTS ACTIVIDADES;
DROP TABLE IF EXISTS USUARIOS;

CREATE TABLE IF NOT EXISTS USUARIOS(
    id_usuario INT PRIMARY KEY,
    nombre VARCHAR(30),
    apellidos VARCHAR(30),
    matricula VARCHAR(30),
    ciclo VARCHAR(4)
);

CREATE TABLE IF NOT EXISTS ACTIVIDADES(
    id_actividad INT PRIMARY KEY,
    id_monitor INT,
    nombre_actividad VARCHAR(10),
    descripcion_actividad VARCHAR(50),
    usuarios_maximos INT,
    usuarios_inscritos INT
);
ALTER TABLE ACTIVIDADES ADD CONSTRAINT FOREIGN KEY(id_monitor) REFERENCES USUARIOS(id_usuario);

CREATE TABLE IF NOT EXISTS INSCRITO_EN (
    id_usr INT,
    id_act INT,
    PRIMARY KEY (id_usr, id_act)
);
ALTER TABLE INSCRITO_EN ADD CONSTRAINT FOREIGN KEY(id_usr) REFERENCES USUARIOS(id_usuario);
ALTER TABLE INSCRITO_EN ADD CONSTRAINT FOREIGN KEY(id_act) REFERENCES ACTIVIDADES(id_actividad);  

CREATE TABLE IF NOT EXISTS SALA(
    id_sala INT UNIQUE PRIMARY KEY,
    capacidad VARCHAR(30),
    tipo_sala VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS OCURRE_EN(
    codigo_sala INT,
    codigo_actividad INT,
    dia_actividad DATE,
    hora VARCHAR(5),
    PRIMARY KEY (dia_actividad, hora)
);
ALTER TABLE OCURRE_EN ADD CONSTRAINT FOREIGN KEY(codigo_actividad) REFERENCES ACTIVIDADES(id_actividad);
ALTER TABLE OCURRE_EN ADD CONSTRAINT FOREIGN KEY(codigo_sala) REFERENCES SALA(id_sala);

-- Inserto los datos
INSERT INTO USUARIOS (id_usuario, nombre, apellidos, matricula, ciclo) VALUES
(1, 'María', 'Garrido Bravo', '123456H', 'DAM'),
(2, 'Alejandro', 'Raboso Martos', '234567T','DAW'),
(3, 'Rosa', 'Hu', '463827Y','ASIR'),
(4, 'Sara', 'Villanueva', '489343L','TAFD'),
(5, 'Lucas', 'Film', '289398I','TAFD'),
(6, 'Diego', 'García', '328932U','TAFD');

INSERT INTO ACTIVIDADES (id_actividad, id_monitor, nombre_actividad, descripcion_actividad, usuarios_maximos, usuarios_inscritos) VALUES
(1, 4, 'Pilates','Una actividad para relajarse un rato',10,5),
(2, 5,'Waterpolo','El gorro no se proporciona',15,10),
(3, 6,'Tenis','Se necesita raqueta propia',4,2);

INSERT INTO INSCRITO_EN (id_usr, id_act) VALUES
(1, 1),
(2, 3),
(3, 2);

INSERT INTO SALA (id_sala, capacidad, tipo_sala) VALUES
(1, 50, 'Gimnasio'),
(2, 30,'Piscina climatizada'),
(3, 10,'Pista de tenis');

INSERT INTO OCURRE_EN (codigo_sala, codigo_actividad, dia_actividad, hora) VALUES
(1, 1, '2025-04-11', '11:05'),
(2, 2, '2025-04-12', '9:30'),
(3, 3, '2025-04-21', '13:00');