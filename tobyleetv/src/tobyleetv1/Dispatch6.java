package tobyleetv1;

import java.util.Arrays;
import java.util.List;

public class Dispatch6 {
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
		List<Service> svc = Arrays.asList(new MyService1(), new MyService2());
//		old
//		for (Service s : svc)
//			s.run();
//		java 1.8 람다
		//svc.forEach(s -> s.run());
		
//		메소드 레퍼런스
		svc.forEach(Service::run);
	}
}
