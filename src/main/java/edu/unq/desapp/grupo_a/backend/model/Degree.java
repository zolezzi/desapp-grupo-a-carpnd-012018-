package edu.unq.desapp.grupo_a.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "degrees")
public class Degree extends PersistenceEntity {

	private static final long serialVersionUID = 6591632026675920348L;

	private String name;

    public Degree() {
    }

    public Degree(String string) {
		// TODO Auto-generated constructor stub
    	this.name = string;
	}

	public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}


}
