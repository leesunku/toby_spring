package tobyleetv2;

public class SuperTypeToken1 {
	static class Sup<T>{
		T value;
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Sup<String> s = new Sup<>();
		System.out.println(s.getClass().getDeclaredField("value").getType());;
	}
}
