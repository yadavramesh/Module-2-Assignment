package com.cg.app.service;

import java.util.List;

import com.cg.app.entity.Trainee;


public interface TraineeService {
	
	public Trainee save(Trainee trainee);
	
	public List<Trainee> retrieve();
	
	public Trainee findById(int id);
	
	public Trainee update(Trainee trainee,int traineeId);
	
	public Boolean delete(int id);

}
