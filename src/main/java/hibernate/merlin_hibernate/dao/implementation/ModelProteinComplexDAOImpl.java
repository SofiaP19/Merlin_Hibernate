package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.ModelProteinComplex;
import hibernate.merlin_hibernate.dao.Interface.IModelProteinComplexDAO;

public class ModelProteinComplexDAOImpl extends GenericDaoImpl<ModelProteinComplex> implements IModelProteinComplexDAO{

	public ModelProteinComplexDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelProteinComplex.class);
		
	}

	public void addModelProteinComplex(ModelProteinComplex modelProteinComplex) {
		super.save(modelProteinComplex);
		
	}

	public void addModelProteinComplexList(List<ModelProteinComplex> modelProteinComplexList) {
		for (ModelProteinComplex modelProteinComplex: modelProteinComplexList) {
			this.addModelProteinComplex(modelProteinComplex);
		}
		
	}

	public List<ModelProteinComplex> getAllModelProteinComplex() {
		return super.findAll();
	}

	public ModelProteinComplex getModelProteinComplex(Integer id) {
		return super.findById(id);
	}

	public void removeModelProteinComplex(ModelProteinComplex modelProteinComplex) {
		super.delete(modelProteinComplex);
		
	}

	public void removeModelProteinComplexList(List<ModelProteinComplex> modelProteinComplexList) {
		for (ModelProteinComplex modelProteinComplex: modelProteinComplexList) {
			this.removeModelProteinComplex(modelProteinComplex);
		}
		
	}

	public void updateModelProteinComplexList(List<ModelProteinComplex> modelProteinComplexList) {
		for (ModelProteinComplex modelProteinComplex: modelProteinComplexList) {
			this.update(modelProteinComplex);
		}
		
	}

	public void updateModelProteinComplex(ModelProteinComplex modelProteinComplex) {
		super.update(modelProteinComplex);
		
	}

}
