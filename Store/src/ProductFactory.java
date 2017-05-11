
import java.util.*;


public class ProductFactory implements ProductAbstractFactory {
	
	private String Pname;
	private String PID;
	private String Pdesc;
	private ArrayList<String> PCID;
	private double Pprice;
	
	public ProductFactory(String Pname, String PID, String Pdesc, ArrayList<String> PCID, double Pprice){
		this.Pname = Pname;
		this.PID = PID;
		this.Pdesc = Pdesc;
		this.PCID = PCID;
		this.Pprice = Pprice;
	}
	
	

	@Override
	public Product createProducts() {
		// TODO Auto-generated method stub
		return new Product(Pname, PID, Pdesc, PCID, Pprice);
	}

}
