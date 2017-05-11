import java.util.*;


public class TestdesignPattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Store s = new Store();
		s.connectsql();
//		testAbstractFactory();
	}
	
	private static void testAbstractFactory() throws Exception{
		ArrayList<String> TempList = new ArrayList<String>();
		TempList.add("5001");
		TempList.add("5002");
		Product Phone = Productsfactory.getProducts(new ProductFactory("IPhone 6", "0001", "New generation IPhone 6", TempList, 699.00 ));
		Categories Electronics  = Categoriesfactory.getCategories(new CategoryFactory("Electronics", "5001", "Electronic deveices") );
		System.out.println("AbstractFactory Product Config::"+Phone);
		System.out.println("Abstractfactory Category Config :: "+Electronics);
		Phone.addCat("5003");
		System.out.println("AbstractFactory Product Config::"+Phone);
		Phone.delCat("5002");
		System.out.println("AbstractFactory Product Config::"+Phone);
		Phone.addCat("5003");
		System.out.println("AbstractFactory Product Config::"+Phone);
		Phone.delCat("5002");
		System.out.println("AbstractFactory Product Config::"+Phone);
	}

}
