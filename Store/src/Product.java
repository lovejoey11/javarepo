import java.util.*;


public class Product extends Products {
	
	private String Pname;
	private String PID;
	private String Pdesc;
	private ArrayList<String> PCID;
	private double Pprice;
	
	public Product(String Pname,String PID, String Pdesc, ArrayList<String> PCID, double Pprice){
		this.Pname = Pname;
		this.PID = PID;
		this.Pdesc = Pdesc;
		this.PCID = PCID;
		this.Pprice = Pprice;
	}
	@Override
	public String getPname() {
		// TODO Auto-generated method stub
		return this.Pname;
	}

	@Override
	public String getPID() {
		// TODO Auto-generated method stub
		return this.PID;
	}

	@Override
	public String getPdesc() {
		// TODO Auto-generated method stub
		return this.Pdesc;
	}

	@Override
	public ArrayList<String> getPcid() {
		// TODO Auto-generated method stub
		return this.PCID;
	}

	@Override
	public double getPprice() {
		// TODO Auto-generated method stub
		return this.Pprice;
	}
	
	public boolean addCat(String newCID) throws Exception{
		boolean result = false;
		try {
			if (PCID.contains(newCID)){
				System.out.println("Your category is exsit");
			}else{
				PCID.add(newCID);
				result = true;
				}
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean delCat(String oldCID) throws Exception{
		boolean result = false; 
		try{
			if(PCID.contains(oldCID)){
				PCID.remove(oldCID);
				result = true;
			}else{
				System.out.println("Your Category is not here, Please Check again.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	public void changePname(String newPname){
		if (Pname.equals(newPname)){
			System.out.println("Your New Product Name is same as original");
		}else{
			Pname = newPname;
		}
	}
	
	public void changePID(String newPID){
		if (Pname.equals(newPID)){
			System.out.println("Your New Product ID is same as original");
		}else{
			Pname = newPID;
		}
	}
	
	public void changePdesc(String newPdesc){
		if (Pname.equals(newPdesc)){
			System.out.println("Your New Product descriptoin is same as original");
		}else{
			Pname = newPdesc;
		}
	}
	
	public void changePprice(double newprice){
		if (Pprice == newprice){
			System.out.println("Your New Product price is same as original");
		}else{
			Pprice = newprice;
		}
	}

}
