package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empupdata {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	    private String name;
	    private String email;
	    private String address;
	    
	    
		public int getId() {
			return id;
		}
		
		public void setId(int id2) {
			this.id=id;
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Empupdata [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
		}


		
		
}
