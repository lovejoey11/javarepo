
public class Productsfactory {
	
	public static Product getProducts(ProductAbstractFactory factory){
		return factory.createProducts();
	}

}
