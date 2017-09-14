package com.farfetch.api.core.toggleservice.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Toggle implements Serializable {

	private static final long serialVersionUID = 1621533754802031825L;

	@Id
    @GeneratedValue
    private Long id;
	
	@Column(nullable = false)
    private String name;
	
	@Column(nullable = false)
	private Integer priority;
	
	protected Toggle() {
	}

	public Toggle(String name, Integer priority) {
		this.name = name;
		this.priority = priority;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
}
