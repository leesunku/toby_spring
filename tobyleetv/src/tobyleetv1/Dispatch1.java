package tobyleetv1;

public class Dispatch1 {
	static class Service {
		void run() {
			System.out.println("run()");
		}
	}
	public static void main(String[] args) {
		new Service().run();
	}
}
