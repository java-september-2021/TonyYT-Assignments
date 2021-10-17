package com.TonyYTan.lookify.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "songs")
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5)
	private String name;
	
	@NotNull
	@Size(min=5)
	private String artist;
	
	@NotNull
	@Min(1)
	@Max(10)
	private Integer rating;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedBy;

	//constructor
	public Song(@NotNull @Size(min = 5) String name, @NotNull @Size(min = 5) String artist,
			@NotNull @Size(min = 1, max = 10) Integer rating) {
		this.name = name;
		this.artist = artist;
		this.rating = rating;
	}
	
	public Song() {
	}
	
	//getters and setters

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public Integer getRating() {
		return rating;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}


	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}


	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
}
