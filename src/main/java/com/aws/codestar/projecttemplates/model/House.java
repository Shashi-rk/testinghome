package com.aws.codestar.projecttemplates.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class House implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;

    public House(String name) {
        this.name = name;
    }

	public House() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +this.name;
	}

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
