package tobyleetv1;

public class Dispatch4 {
	static abstract class Service {
		abstract void run();
	}

	static class MyService1 extends Service {
		@Override
		void run() {
			System.out.println("run1");
		}
	}
	static class MyService2 extends Service {
		@Override
		void run() {
			System.out.println("run2");
		}
	}
	public static void main(String[] args) {
		MyService1 svc1 = new MyService1();
		svc1.run();
		MyService2 svc2 = new MyService2();
		svc2.run();
	}
}
