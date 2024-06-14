package com.ekotomitl.models;

	import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_profile_id", nullable=false)
	private int user_profile_id;
	
	@OneToOne
	@JoinColumn(name="iduser")
	private User user;

	//Constructor vacio
	public UserProfile() {
		super();
	}

	//Constructor
	public UserProfile(int user_profile_id, User user) {
		super();
		this.user_profile_id = user_profile_id;
		this.user = user;
	}

	public int getIdUserProfile() {
		return user_profile_id;
	}

	public void setIdUserProfile(int user_profile_id) {
		this.user_profile_id = user_profile_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserProfile [user_profile_id=" + user_profile_id + ", user=" + user + "]";
	}
	
	

}

