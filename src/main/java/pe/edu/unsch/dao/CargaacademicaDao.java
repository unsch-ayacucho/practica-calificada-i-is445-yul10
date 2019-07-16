package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.Cargaacademica;
import pe.edu.unsch.entities.Curso;
import pe.edu.unsch.entities.Docente;

public interface CargaacademicaDao {
	
	List<Cargaacademica> listCarga();
	List<Curso> listCurso();
	List<Docente> listDocente();
}
