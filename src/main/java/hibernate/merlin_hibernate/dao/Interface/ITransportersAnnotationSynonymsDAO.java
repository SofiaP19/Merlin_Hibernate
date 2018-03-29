package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationSynonyms;


public interface ITransportersAnnotationSynonymsDAO {
	
	public void addTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym); 
	
	public void addTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms); 
	
	public List<TransportersAnnotationSynonyms> getAllTransportersAnnotationSynonyms(); 
	
	public TransportersAnnotationSynonyms getTransportersAnnotationSynonym(Integer id); 
	
	public void removeTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym); 
	
	public void removeTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms); 
	
	public void updateTransportersAnnotationSynonyms(List<TransportersAnnotationSynonyms> TransportersAnnotationSynonyms); 
	
	public void updateTransportersAnnotationSynonym(TransportersAnnotationSynonyms TransportersAnnotationSynonym);

}
