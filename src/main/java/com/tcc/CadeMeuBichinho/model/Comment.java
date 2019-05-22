package com.tcc.CadeMeuBichinho.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Comment")
public class Comment {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@ManyToOne
	private Pet pet;
	@ManyToOne
	@JsonIgnore
	private User userReceived;
	@ManyToOne
	@JsonIgnore
	private User userSend;
	private Date date; 
	private String link;
	private String comment;
	private Boolean notificationActive;

	public Comment() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public User getUserReceived() {
		return userReceived;
	}

	public void setUserReceived(User userReceived) {
		this.userReceived = userReceived;
	}

	public User getUserSend() {
		return userSend;
	}

	public void setUserSend(User userSend) {
		this.userSend = userSend;
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getNotificationActive() {
		return notificationActive;
	}

	public void setNotificationActive(Boolean notificationActive) {
		this.notificationActive = notificationActive;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	
}
