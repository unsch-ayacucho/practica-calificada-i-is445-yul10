create database cargaprojectbd;

use cargaprojectbd;

create table docente (
	id_docente int primary key,
    nombre varchar(50) not null,
    apellidos varchar(50) null    
);

create table curso (
	id_curso int primary key,
    nombre_curso varchar(50) not null,
    horas_semanales int not null    
);

create table cargaacademica (
	id_carga_academica int primary key,
    id_docente int not null,
    id_curso int not null,
    semestre_academico varchar(50) null
);

alter table carga_academica
add constraint fk_cargaAcademica_docente
foreign key (id_docente) references docente(id_docente);

alter table carga_academica
add constraint fk_cargaAcademica_curso
foreign key (id_curso) references curso(id_curso);


INSERT INTO `cargabd`.`docente` (`id_docente`, `nombre`, `apellidos`) VALUES ('1', 'Fredy', 'Barrientos');
INSERT INTO `cargabd`.`docente` (`id_docente`, `nombre`, `apellidos`) VALUES ('2', 'Eloy', 'Vila');


INSERT INTO `cargabd`.`curso` (`id_curso`, `nombre_curso`, `horas_semanales`) VALUES ('1', 'SistemasInformacion II', '8');
INSERT INTO `cargabd`.`curso` (`id_curso`, `nombre_curso`, `horas_semanales`) VALUES ('2', 'Igenieria De Software', '16');


INSERT INTO `cargabd`.`cargaacademica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre_academico`) VALUES ('1', '1', '1', '2019 I');
INSERT INTO `cargabd`.`cargaacademica` (`id_carga_academica`, `id_docente`, `id_curso`, `semestre_academico`) VALUES ('2', '2', '2', '2019 I');





