package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.TraineeDao;
import com.cg.app.entity.Trainee;


@Service
public class TraineeServiceImplementation implements TraineeService{
	
	@Autowired
	private TraineeDao dao;
	
	@Override
	public Trainee save(Trainee trainee)
	{
		dao.create(trainee);
		return trainee;
	}
	

	@Override
	public List<Trainee> retrieve() {
		
		return dao.retrieve();
	}
	
	@Override
	public Trainee findById(int id) {
		  
		return dao.findById(id);
	}
	
	@Override
	public Trainee update(Trainee trainee,int traineeId) {
		return dao.update(trainee,traineeId);
		
	}
	
	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		
		return dao.delete(id);
	}

}
