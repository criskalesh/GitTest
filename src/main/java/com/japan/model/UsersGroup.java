package com.japan.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users_group database table.
 * 
 */
@Entity
@Table(name="users_group")
public class UsersGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int groupId;

	private String description;

	private String name;

	public UsersGroup() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}