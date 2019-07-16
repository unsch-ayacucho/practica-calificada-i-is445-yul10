package pe.edu.unsch.service;

import java.util.List;
import pe.edu.unsch.entities.Cargaacademica;
import pe.edu.unsch.entities.Curso;
import pe.edu.unsch.entities.Docente;

public interface CargaacademicaService {

	List<Cargaacademica> listCarga();
	List<Curso> listCurso();
	List<Docente> listDocente();
}
