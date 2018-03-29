package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenes;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationGenesDAO;


public class TransportersAnnotationGenesDAOImpl extends GenericDaoImpl<TransportersAnnotationGenes> implements ITransportersAnnotationGenesDAO{

	public TransportersAnnotationGenesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationGenes.class);
	
	}

	public void addTransportersAnnotationGene(TransportersAnnotationGenes transportersAnnotationGenes) {
		super.save(transportersAnnotationGenes);
		
	}

	public void addTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes) {
		for (TransportersAnnotationGenes TransportersAnnotationGene: TransportersAnnotationGenes) {
			this.addTransportersAnnotationGene(TransportersAnnotationGene);
		}
		
	}

	public List<TransportersAnnotationGenes> getAllTransportersAnnotationGenes() {
		return super.findAll();
	}

	public TransportersAnnotationGenes getTransportersAnnotationGene(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationGene(TransportersAnnotationGenes TransportersAnnotationGene) {
		super.delete(TransportersAnnotationGene);
		
	}

	public void removeTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes) {
		for (TransportersAnnotationGenes TransportersAnnotationGene: TransportersAnnotationGenes) {
			this.removeTransportersAnnotationGene(TransportersAnnotationGene);
		}		
	}

	public void updateTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes) {
		for (TransportersAnnotationGenes TransportersAnnotationGene: TransportersAnnotationGenes) {
			this.update(TransportersAnnotationGene);
		}
		
	}

	public void updateTransportersAnnotationGene(TransportersAnnotationGenes TransportersAnnotationGene) {
		super.update(TransportersAnnotationGene);
		
	}

}
