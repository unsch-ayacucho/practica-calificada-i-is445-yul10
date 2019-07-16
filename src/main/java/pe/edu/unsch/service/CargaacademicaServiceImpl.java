package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.unsch.dao.CargaacademicaDao;
import pe.edu.unsch.entities.Cargaacademica;
import pe.edu.unsch.entities.Curso;
import pe.edu.unsch.entities.Docente;

@Service("docenteService")
@Transactional
public class CargaacademicaServiceImpl implements CargaacademicaService {

	@Autowired
	private CargaacademicaDao cargaacademicaDao;

	@Override
	public List<Cargaacademica> listCarga() {
		// TODO Auto-generated method stub
		return cargaacademicaDao.listCarga();
	}

	@Override
	public List<Curso> listCurso() {
		// TODO Auto-generated method stub
		return cargaacademicaDao.listCurso();
	}

	@Override
	public List<Docente> listDocente() {
		// TODO Auto-generated method stub
		return cargaacademicaDao.listDocente();
	}

}
