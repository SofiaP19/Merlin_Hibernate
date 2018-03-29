package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTaxonomyData;



public interface ITransportersAnnotationTaxonomyDataDAO {
	
	public void addTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData); 
	
	public void addTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData); 
	
	public List<TransportersAnnotationTaxonomyData> getAllTransportersAnnotationTaxonomyData(); 
	
	public TransportersAnnotationTaxonomyData getTransportersAnnotationTaxonomyData(Integer id); 
	
	public void removeTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData); 
	
	public void removeTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData); 
	
	public void updateTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData); 
	
	public void updateTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData);

}
