package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taskupdate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	 private Long id;
	 
		// @NotBlank
		    private String title;
		    
	        private String description;
		    
		    private boolean completed;
		    
		    @Override
			public String toString() {
				return "task [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
						+ "]";
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public boolean isCompleted() {
				return completed;
			}

			public void setCompleted(boolean completed) {
				this.completed = completed;
			}

			
	
	
}
