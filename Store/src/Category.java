
public class Category extends Categories {
	private String Cname;
	private String CID;
	private String Cdesc;
	
	public Category (String Cname, String CID, String Cdesc){
			this.Cname = Cname;
			this.CID = CID;
			this.Cdesc = Cdesc;
	}
	@Override
	public String getCname() {
		// TODO Auto-generated method stub
		return this.Cname;
	}

	@Override
	public String getCID() {
		// TODO Auto-generated method stub
		return this.CID;
	}

	@Override
	public String getCdesc() {
		// TODO Auto-generated method stub
		return this.Cdesc;
	}
	
	public void changeCname(String newName){
		if (Cname.equals(newName)){
			System.out.println("Your New Category Name is same as original");
		}else{
			Cname = newName;
		}
	}
	public void changeCID(String newCID){
		if (Cname.equals(newCID)){
			System.out.println("Your New Category ID is same as original");
		}else{
			Cname = newCID;
		}
	}
	public void changeCdesc(String newCdesc){
		if (Cname.equals(newCdesc)){
			System.out.println("Your New Category Description is same as original");
		}else{
			Cname = newCdesc;
		}
	}
}
