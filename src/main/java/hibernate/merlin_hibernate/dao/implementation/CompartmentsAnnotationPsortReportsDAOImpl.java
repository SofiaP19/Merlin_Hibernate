package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.CompartmentsAnnotationPsortReports;
import hibernate.merlin_hibernate.dao.Interface.ICompartmentsAnnotationPsortReportsDAO;


public class CompartmentsAnnotationPsortReportsDAOImpl extends GenericDaoImpl<CompartmentsAnnotationPsortReports> implements ICompartmentsAnnotationPsortReportsDAO{

	public CompartmentsAnnotationPsortReportsDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, CompartmentsAnnotationPsortReports.class);
		
	}

	public void addCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport) {
		super.save(CompartmentsAnnotationPsortReport);
		
	}

	public void addCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport: CompartmentsAnnotationPsortReports) {
			this.addCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReport);
		}
		
	}

	public List<CompartmentsAnnotationPsortReports> getAllCompartmentsAnnotationPsortReports() {
		return super.findAll();
	}

	public CompartmentsAnnotationPsortReports getCompartmentsAnnotationPsortReport(Integer id) {
		return super.findById(id);
	}

	public void removeCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport) {
		super.delete(CompartmentsAnnotationPsortReport);
		
	}

	public void removeCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport: CompartmentsAnnotationPsortReports) {
			this.removeCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReport);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReports(List<CompartmentsAnnotationPsortReports> CompartmentsAnnotationPsortReports) {
		for (CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport: CompartmentsAnnotationPsortReports) {
			this.update(CompartmentsAnnotationPsortReport);
		}
		
	}

	public void updateCompartmentsAnnotationPsortReport(CompartmentsAnnotationPsortReports CompartmentsAnnotationPsortReport) {
		super.update(CompartmentsAnnotationPsortReport);
		
	}

}
