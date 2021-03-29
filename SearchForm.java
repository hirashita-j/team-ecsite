package jp.co.internous.dandelion.model.form;

import java.io.Serializable;

public class SearchForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String itemName;
	
	private int category;
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setCategory(int category) {
		this.category = category;
	}
}
