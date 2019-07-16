package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import pe.edu.unsch.entities.Cargaacademica;
import pe.edu.unsch.entities.Curso;
import pe.edu.unsch.entities.Docente;

@Repository("CargaacademicaDao")
public class CargaacademicaDaoImpl implements CargaacademicaDao {
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public List<Curso> listCurso() {
		// TODO Auto-generated method stub
		return (List<Curso>) em.createQuery("select c from Curso c", Curso.class).getResultList();
	}

	@Override
	public List<Docente> listDocente() {
		// TODO Auto-generated method stub
		return (List<Docente>) em.createQuery("select d from Docente d", Docente.class).getResultList();
	}

	@Override
	public List<Cargaacademica> listCarga() {
		// TODO Auto-generated method stub
		return (List<Cargaacademica>) em.createQuery("select new Cargaacademica(concat(d.nombre, ' ', d.apellidos) as nombre,sum(c.horas_semanales) as horas, ca.semestre_academico as semestre)" + 
				" from Cargaacademica ca" + 
				" inner join ca.curso c" + 
				" inner join ca.docente d" + 
				" group by d.nombre").getResultList();

}
}
