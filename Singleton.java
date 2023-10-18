public class Singleton{
	private static Singleton instance;

	private Singleton(){
	}

	public static Singleton getInstance(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}

class MainSingle{
	public static void main(String[] args){
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(System.identityHashCode(singleton));
		System.out.println(System.identityHashCode(singleton2));

		boolean b = System.identityHashCode(singleton) == System.identityHashCode(singleton2);

		System.out.println(b);
	}
}