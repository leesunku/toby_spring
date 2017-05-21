package tobyleetv2;

public class TypeToken1 {
	static <T> T create(Class<T> className) throws Exception{
		return className.newInstance();
	}
	public static void main(String[] args) throws Exception {
		Integer i = create(Integer.class);
		System.out.println(i.getClass());
	}
}
