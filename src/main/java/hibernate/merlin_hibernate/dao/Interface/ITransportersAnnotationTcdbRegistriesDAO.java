package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTcdbRegistries;



public interface ITransportersAnnotationTcdbRegistriesDAO{
	
	public void addTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry); 
	
	public void addTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistries); 
	
	public List<TransportersAnnotationTcdbRegistries> getAllTransportersAnnotationTcdbRegistries(); 
	
	public TransportersAnnotationTcdbRegistries getTransportersAnnotationTcdbRegistry(Integer id); 
	
	public void removeTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry); 
	
	public void removeTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistry); 
	
	public void updateTransportersAnnotationTcdbRegistries(List<TransportersAnnotationTcdbRegistries> TransportersAnnotationTcdbRegistry); 
	
	public void updateTransportersAnnotationTcdbRegistry(TransportersAnnotationTcdbRegistries TransportersAnnotationTcdbRegistry);

}
