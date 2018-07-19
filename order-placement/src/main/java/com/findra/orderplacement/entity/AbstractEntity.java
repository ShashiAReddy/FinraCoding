package com.findra.orderplacement.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang.builder.ToStringBuilder;

@MappedSuperclass
public abstract class AbstractEntity implements java.io.Serializable {

	private static final long serialVersionUID = -5455315854496665789L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO) // need to change and create a hibernate sequence
	private Long id;

	@Column(name = "OBJECT_ID")
	private UUID objectId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getObjectId() {
		return objectId;
	}

	public void setObjectId(UUID objectId) {
		this.objectId = objectId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
