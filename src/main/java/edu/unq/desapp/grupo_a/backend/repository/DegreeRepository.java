package edu.unq.desapp.grupo_a.backend.repository;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import edu.unq.desapp.grupo_a.backend.model.Degree;

@Repository
public class DegreeRepository extends HibernateGenericDAO<Degree> implements GenericRepository<Degree> {

	private static final long serialVersionUID = -4425722631916607857L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DegreeRepository() {	}

	@Override
	public Class<Degree> getDomainClass() {
		return Degree.class;
	}

	public String findDegreeNameForAcademicOffer(Long idAcademicOffer) {
		String hql = "SELECT degree.name FROM Degree as degree" +
				" inner join degree.academicOffers as academicOffer" +
				" where academicOffer.id = :idAcademicOffer";
		Query query = this.getSessionFactory().getCurrentSession().createQuery(hql)
				.setParameter("idAcademicOffer", idAcademicOffer);
		return (String) query.uniqueResult();
	}
}
