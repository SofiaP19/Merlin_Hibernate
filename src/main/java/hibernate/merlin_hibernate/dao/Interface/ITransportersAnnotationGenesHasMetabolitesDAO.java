package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationGenesHasMetabolites;



public interface ITransportersAnnotationGenesHasMetabolitesDAO {
	
	public void addTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite); 
	
	public void addTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites); 
	
	public List<TransportersAnnotationGenesHasMetabolites> getAllTransportersAnnotationGenesHasMetabolites(); 
	
	public TransportersAnnotationGenesHasMetabolites getTransportersAnnotationGenesHasMetabolite(Integer id); 
	
	public void removeTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite); 
	
	public void removeTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites); 
	
	public void updateTransportersAnnotationGenesHasMetabolites(List<TransportersAnnotationGenesHasMetabolites> transportersAnnotationGenesHasMetabolites); 
	
	public void updateTransportersAnnotationGenesHasMetabolite(TransportersAnnotationGenesHasMetabolites transportersAnnotationGenesHasMetabolite);

}
