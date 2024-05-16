CREATE TABLE `noticias` (`titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) NOT NULL,`fecha` DATE  ,PRIMARY KEY (`titulo`));

CREATE TABLE `comentarios` (`identificador` VARCHAR(255) NOT NULL, `texto` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) NOT NULL,PRIMARY KEY (`identificador`));

ALTER TABLE `noticias` ADD CONSTRAINT `noticias_fk` FOREIGN KEY (`titulo`) REFERENCES `comentarios`(`identificador`);

