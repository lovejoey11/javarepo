package com.demo.model;

public class Category {
	private String categoryID;
	private String categoryName;
	private String categoryDescription;
	
	public Category() {
	}

	public Category(String categoryID, String categoryName,
			String categoryDescription) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
}
