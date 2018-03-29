package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenes;


public interface ITransportersAnnotationGenesDAO {
	
	public void addTransportersAnnotationGene(TransportersAnnotationGenes TransportersAnnotationGene); 
	
	public void addTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes); 
	
	public List<TransportersAnnotationGenes> getAllTransportersAnnotationGenes(); 
	
	public TransportersAnnotationGenes getTransportersAnnotationGene(Integer id); 
	
	public void removeTransportersAnnotationGene(TransportersAnnotationGenes TransportersAnnotationGene); 
	
	public void removeTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes); 
	
	public void updateTransportersAnnotationGenes(List<TransportersAnnotationGenes> TransportersAnnotationGenes); 
	
	public void updateTransportersAnnotationGene(TransportersAnnotationGenes TransportersAnnotationGene);

}


