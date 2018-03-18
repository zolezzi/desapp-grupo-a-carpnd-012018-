package edu.unq.desapp.grupo_a.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unq.desapp.grupo_a.backend.dto.DegreeDTO;
import edu.unq.desapp.grupo_a.backend.model.Degree;
import edu.unq.desapp.grupo_a.backend.repository.DegreeRepository;

@Transactional
@Service
public class DegreeService extends GenericService<Degree> {

	@Autowired
	private DegreeRepository repository;

	public DegreeService() {
	}

	public DegreeService(DegreeRepository repo) {
		this.setRepository(repo);
	}

	public DegreeRepository getRepository() {
		return repository;
	}

	public void setRepository(DegreeRepository repository) {
		this.repository = repository;
	}

	@Transactional
	public String getDegreeName(Long idDegree) {
		return this.find(idDegree).getName();
	}

	@Transactional
	public String getDegreeNameForAcademicOffer(Long idAcademicOffer) {
		return this.getRepository().findDegreeNameForAcademicOffer(idAcademicOffer);
	}

	public void saveDegree(DegreeDTO dto) {
	
		
	}

}
