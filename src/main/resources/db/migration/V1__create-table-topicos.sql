CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje VARCHAR(500) NOT NULL,
    fecha DATETIME NOT NULL,
    status TINYINT NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL,

    PRIMARY KEY (id)
);


--CREATE TABLE autores (
--    id BIGINT NOT NULL AUTO_INCREMENT,
--    nombre VARCHAR(255) NOT NULL,
--    email VARCHAR(60) NOT NULL,
--    PRIMARY KEY (id)
--);



--CREATE TABLE topicos (
--    id BIGINT NOT NULL AUTO_INCREMENT,
--    titulo VARCHAR(255) NOT NULL,
--    mensaje TEXT NOT NULL,
--    fechaDeCreacion DATETIME NOT NULL,
--    status ENUM('activo', 'inactivo', 'pendiente') NOT NULL,
--    autor_id BIGINT NOT NULL,
--    curso_id BIGINT,
--    PRIMARY KEY (id),
--    CONSTRAINT fk_topicos_autor_id FOREIGN KEY (autor_id) REFERENCES autores(id),
--    CONSTRAINT fk_topicos_curso_id FOREIGN KEY (curso_id) REFERENCES cursos(id)
-- fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
--);
