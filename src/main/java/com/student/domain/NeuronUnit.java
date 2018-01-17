package com.student.domain;

import java.util.Set;

public class NeuronUnit extends BaseDomainBean {

	private String id;

	private Set<NeuronLink> links;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<NeuronLink> getLinks() {
		return links;
	}

	public void setLinks(Set<NeuronLink> links) {
		this.links = links;
	}

	public double fnActive() {
		// TODO Auto-generated method stub
		return 0;
	}

}