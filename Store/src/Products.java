import java.util.*;

public abstract class Products {
	
	public abstract String getPname();
	public abstract String getPID();
	public abstract String getPdesc();
	public abstract ArrayList<String> getPcid();
	public abstract double getPprice();
	
	@Override
	public String toString(){
		return "Product name: "+this.getPname()+", ID: "+this.getPID()+""
				+ ", Price: "+this.getPprice()+", belongs to: "+this.getPcid();
	}
//	private String productID;
//	private String productName;
//	private String productDescription;
//	private ArrayList<String> productCategoryID;
//	private String productPrice;
//	
//	//constructor
//	public Products(String productID, String productName, String productDescription, ArrayList<String> productCategoryID, String productPrice){
//		this.productID = productID;
//		this.productName = productName;
//		this.productDescription = productDescription;
//		this.productCategoryID = new ArrayList<String>(productCategoryID);
//		this.productPrice = productPrice;
//	}
//	
//	public boolean add(Products p){
//		
//	}
	
}
