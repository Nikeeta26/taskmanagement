package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//auto increment
    private int id;
    private String name;
    private String dis;
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDis() {
		return dis;
	}
	public void setDis(String email) {
		this.dis = email;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dis=" + dis + "]";
	}
	
	
	
	
}
