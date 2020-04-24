package com.cg.app.dao;

import java.util.List;

import com.cg.app.entity.Trainee;


public interface TraineeDao {
	
	public void create(Trainee trainee);
	
	public List<Trainee> retrieve();
	
	public Trainee update(Trainee trainee,int traineeId);
	
	public Boolean delete(int id);
	
	public Trainee findById(int id);

}
