
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstance();
		Singleton news = Singleton.getInstance();
		
		
		
	}

	
	private static Singleton firstInstance = null;
	
	private Singleton() { }
	
	public static Singleton getInstance() {
		
		if (firstInstance == null){
			firstInstance = new Singleton();
			System.out.println("a new singleton has created!");
		}
		print();
		return firstInstance;
	}
	
	public static void print(){
		
		System.out.println("Hello");
	}
}
