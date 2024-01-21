package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpDao implements EmpService {

	 @Autowired
		EmpRepo er;
	
		@Override
		public void myinfo(Emp e1) {
			// TODO Auto-generated method stub
			er.save(e1);
		}
	

	@Override
	public List<Emp> getinfo() {
		// TODO Auto-generated method stub
		return er.findAll();
	}
	
	

	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		
		er.deleteById(id);
	}

	@Override
	public Emp getonestud(int id) {
		
		Emp sp =er.getById(id);
		return sp;
	}


	

	


	



	
	
	
 


}
