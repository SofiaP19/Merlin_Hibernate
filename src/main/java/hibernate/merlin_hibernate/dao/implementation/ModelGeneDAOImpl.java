package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.ModelChromosome;
import hibernate.merlin_hibernate.Entities.ModelGene;
import hibernate.merlin_hibernate.dao.Interface.IGenericDao;
import hibernate.merlin_hibernate.dao.Interface.IModelGeneDAO;


public class ModelGeneDAOImpl extends GenericDaoImpl<ModelGene> implements IModelGeneDAO {

	public ModelGeneDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelGene.class);
		
	}

	public void addModelGene(ModelGene modelGene) {
		super.save(modelGene);
		
	}

	public void addModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.addModelGene(modelGene);
		}
		
	}

	public List<ModelGene> getAllModelGene() {
		return super.findAll();
	}

	public ModelGene getModelGene(Integer id) {
		return super.findById(id);
	}

	public void removeModelGene(ModelGene modelGene) {
		super.delete(modelGene);
		
	}

	public void removeModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.removeModelGene(modelGene);
		}
		
	}

	public void updateModelGeneList(List<ModelGene> modelGeneList) {
		for (ModelGene modelGene: modelGeneList) {
			this.update(modelGene);
		}
		
	}

	public void updateModelGene(ModelGene modelGene) {
		super.update(modelGene);
		
	}
	
	public String getChromosomeName(ModelGene modelGene) {

		Integer chromosomeid = modelGene.getChromosomeIdchromosome();
		IGenericDao<ModelChromosome> chromosomeDao = new GenericDaoImpl<ModelChromosome>(this.getSessionFactory(),ModelChromosome.class);
		ModelChromosome chromosome = chromosomeDao.findById(chromosomeid);
		return chromosome.getName();

	}

}
