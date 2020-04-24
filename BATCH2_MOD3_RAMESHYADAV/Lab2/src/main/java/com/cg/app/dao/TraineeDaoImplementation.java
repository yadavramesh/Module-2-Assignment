package com.cg.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.app.entity.Trainee;

@Transactional
@Repository
public class TraineeDaoImplementation implements TraineeDao{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Trainee trainee) {
		
		em.persist(trainee);
	}

	@Override
	public List<Trainee> retrieve() {
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList();	
	}
	
	@Override
	public Trainee findById(int id) {
		 Trainee trainee = em.find(Trainee.class,id);
		 return trainee;
		
	}
	
	@Override
	public Trainee update(Trainee trainee,int traineeId) {
		Trainee update_trainee=em.find(Trainee.class, traineeId);
		update_trainee.setTraineeName(trainee.getTraineeName());
		update_trainee.setTraineeDomain(trainee.getTraineeDomain());
		return update_trainee;
	}
	
	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		Trainee trainee = em.find(Trainee.class, id);
		if(trainee!=null)
			{
			em.remove(trainee);
			return true;
			}
		return false;
	}
	
	
	


}
