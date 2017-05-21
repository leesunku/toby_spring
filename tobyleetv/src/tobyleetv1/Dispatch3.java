package tobyleetv1;

public class Dispatch3 {
	static class Service {
		void run(int number) {
			System.out.println("run(" + number + ")");
		}
		void run(String msg) {
			System.out.println("run(" + msg + ")");
		}
	}
	public static void main(String[] args) {
		new Service().run(3);
		new Service().run("Dispatch");
	}
}
