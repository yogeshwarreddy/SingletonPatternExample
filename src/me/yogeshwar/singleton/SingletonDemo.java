package me.yogeshwar.singleton;

public class SingletonDemo {
	private static void testSingleton() {
		MySingleton singleton = MySingleton.getInstance();
		MySingleton singleton2 = MySingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+(singleton==singleton2));
		System.out.println(Thread.currentThread().getName()+" "+singleton.toString());
		System.out.println(Thread.currentThread().getName()+" "+singleton2.toString());
	}
	public static void main(String[] args) {
		(new Thread(SingletonDemo::testSingleton)).start();
		(new Thread(SingletonDemo::testSingleton)).start();
		(new Thread(SingletonDemo::testSingleton)).start();
	}

}
