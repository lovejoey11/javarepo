
public class CategoryFactory implements CategoryAbstractFactory {
	
	private String Cname;
	private String CID;
	private String Cdesc;
	
	public CategoryFactory(String Cname, String CID, String Cdesc){
		this.Cname = Cname;
		this.CID = CID;
		this.Cdesc = Cdesc;
	}
	@Override
	public Category createCategories() {
		// TODO Auto-generated method stub
		return new Category(Cname, CID, Cdesc);
		}

}
