package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenesHasMetabolitesHasType;
import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenesHasTcdbRegistries;



public interface ITransportersAnnotationGenesHasMetabolitesHasTypeDAO {
	
	public void addTransportersAnnotationGenesHasMetabolitesHasType(TransportersAnnotationGenesHasMetabolitesHasType TransportersAnnotationGenesHasMetabolitesHasType); 
	
	public void addTransportersAnnotationGenesHasMetabolitesHasTypeList(List<TransportersAnnotationGenesHasMetabolitesHasType> TransportersAnnotationGenesHasMetabolitesHasTypeList); 
	
	public List<TransportersAnnotationGenesHasMetabolitesHasType> getAllTransportersAnnotationGenesHasMetabolitesHasType(); 
	
	public TransportersAnnotationGenesHasMetabolitesHasType getTransportersAnnotationGenesHasMetabolitesHasType(Integer id); 
	
	public void removeTransportersAnnotationGenesHasMetabolitesHasType(TransportersAnnotationGenesHasMetabolitesHasType TransportersAnnotationGenesHasMetabolitesHasType); 
	
	public void removeTransportersAnnotationGenesHasMetabolitesHasTypeList(List<TransportersAnnotationGenesHasMetabolitesHasType> TransportersAnnotationGenesHasMetabolitesHasTypeList); 
	
	public void updateTransportersAnnotationGenesHasMetabolitesHasTypeList(List<TransportersAnnotationGenesHasMetabolitesHasType> TransportersAnnotationGenesHasMetabolitesHasTypeList); 
	
	public void updateTransportersAnnotationGenesHasMetabolitesHasType(TransportersAnnotationGenesHasMetabolitesHasType TransportersAnnotationGenesHasMetabolitesHasType);

}