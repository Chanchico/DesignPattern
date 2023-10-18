interface Product{
	public void something();
}

class ProductA implements Product{
	public void something(){

	}
}

class ProductB implements Product{
	public void something(){
		
	}
}

abstract class Creator {
	public abstract Product createProduct();
}

class CreatorProductA extends Creator{
	@Override
	public Product createProduct(){
		return new ProductA();
	}
}

class CreatorProductB extends Creator{
	@Override
	public Product createProduct(){
		return new ProductB();
	}
}

class MainFabrique{
	static Creator creator;
	public static void main(String[] args){
		if(args[0].equals("1")){
			creator = new CreatorProductA();
			System.out.println(creator.createProduct());
		} else {
			creator = new CreatorProductB();
			System.out.println(creator.createProduct());
		}
	}
}