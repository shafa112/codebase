public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.x = 5;
		System.out.println(b.x);
		b.fun();
		
		
		A a = b;
		System.out.println(a.x);
		
		a.fun();
		

	}
	
	static class A{
		int x;
		
		void fun() {
			System.out.println("I am in A class");
		}
		
		static void play() {
			System.out.println("I am in A play");
		}
	}
	
	static class B extends A{
		int x;
		
		void fun() {
			System.out.println("I am in B class");
		}
		
		static void play() {
			System.out.println("I am in B play");
		}
	}

}
