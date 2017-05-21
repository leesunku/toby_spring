package tobyleetv2;

public class TypeToken3 {
	<T> T create(Class<T> className) throws InstantiationException, IllegalAccessException {
		return (T)className.newInstance();
	}
	public static void main(String[] args) throws Exception {
		Object o = "String";
		Integer i = (Integer)o;
		System.out.println(i);
	}
}
