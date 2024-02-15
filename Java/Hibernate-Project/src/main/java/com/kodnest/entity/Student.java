package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
     int id;
     String name;

    // Constructors

    public Student(int id, String name) {
    	super();
        this.id = id;
        this.name = name;
    }

    // Getter and Setter methods
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

}
