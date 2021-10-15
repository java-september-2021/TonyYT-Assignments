package com.TonyYTan.language.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "langs")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Size(min=2, max=20)
	private String name;
	// @Size(min=2, max=20)
	private String creator;
	//@NotNull
	private float currentVersion;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	// constructor
	public Language() {
	}

	public Language(String name, String creator, float currentVersion) {
		super();
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}

	// getter and setter
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCreator() {
		return creator;
	}

	public float getCurrentVersion() {
		return currentVersion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void setCurrentVersion(float currentVersion) {
		this.currentVersion = currentVersion;
	}

}
