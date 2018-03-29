package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.Entities.TransportersAnnotationTaxonomyData;
import hibernate.merlin_hibernate.dao.Interface.ITransportersAnnotationTaxonomyDataDAO;


public class TransportersAnnotationTaxonomyDataDAOImpl extends GenericDaoImpl<TransportersAnnotationTaxonomyData> implements ITransportersAnnotationTaxonomyDataDAO{

	public TransportersAnnotationTaxonomyDataDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, TransportersAnnotationTaxonomyData.class);
		
	}

	public void addTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData) {
		super.save(TransportersAnnotationTaxonomyData);
		
	}

	public void addTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData TransportersAnnotTaxonomyData: TransportersAnnotationTaxonomyData) {
			this.addTransportersAnnotationTaxonomyData(TransportersAnnotTaxonomyData);
		}
	}

	public List<TransportersAnnotationTaxonomyData> getAllTransportersAnnotationTaxonomyData() {
		return super.findAll();
	}

	public TransportersAnnotationTaxonomyData getTransportersAnnotationTaxonomyData(Integer id) {
		return super.findById(id);
	}

	public void removeTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData) {
		super.delete(TransportersAnnotationTaxonomyData);
		
	}

	public void removeTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData TransportersAnnotTaxonomyData: TransportersAnnotationTaxonomyData) {
			this.removeTransportersAnnotationTaxonomyData(TransportersAnnotTaxonomyData);
		}
		
	}

	public void updateTransportersAnnotationTaxonomyListData(List<TransportersAnnotationTaxonomyData> TransportersAnnotationTaxonomyData) {
		for (TransportersAnnotationTaxonomyData TransportersAnnotTaxonomyData: TransportersAnnotationTaxonomyData) {
			this.update(TransportersAnnotTaxonomyData);
		}
		
	}

	public void updateTransportersAnnotationTaxonomyData(TransportersAnnotationTaxonomyData TransportersAnnotationTaxonomyData) {
		super.update(TransportersAnnotationTaxonomyData);
		
	}

}
