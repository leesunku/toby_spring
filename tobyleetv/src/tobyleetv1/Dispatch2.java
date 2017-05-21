package tobyleetv1;

public class Dispatch2 {
	static class Service {
		void run() {
			System.out.println("run()");
		}
		void run(String msg) {
			System.out.println("run(" + msg + ")");
		}
	}
	public static void main(String[] args) {
		new Service().run();
		new Service().run("Dispatch");
	}
}
