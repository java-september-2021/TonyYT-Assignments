package com.TonyYTan.Overflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;



//import com.TonyYTan.Overflow.models.Tag;
//import com.TonyYTan.Overflow.models.Answer;

@Entity
@Table (name ="questions")
public class Question {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Transient
//	List<Tag> temTag;
	
	
	@NotBlank (message ="questions can not be blank!!!!!!!!!!!")
	private String name;
	
	@Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    //same question can have many tags
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "quesion_tags",
	    	joinColumns = @JoinColumn(name = "question_id"),
	    	inverseJoinColumns = @JoinColumn(name="tag_id")
	    	)
	private List<Tag> tags;
	    
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Answer> answers;
	    
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	    
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Question() {
	}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

//		public List<Tag> getTemTag() {
//			return temTag;
//		}
//
//		public void setTemTag(List<Tag> temTag) {
//			this.temTag = temTag;
//		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Tag> getTags() {
			return tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Answer> getAnswers() {
			return answers;
		}

		public void setAnswers(List<Answer> answers) {
			this.answers = answers;
		}

		
	    
	    
	    
}
