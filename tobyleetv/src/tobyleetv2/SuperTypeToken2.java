package tobyleetv2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class SuperTypeToken2 {
	static class Sup<T>{
		T value;
	}
	static class Sub extends Sup<String> {
		
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Sub b = new Sub();
		Type t = b.getClass().getGenericSuperclass();
		ParameterizedType ptype = (ParameterizedType) t;
		System.out.println(ptype.getActualTypeArguments()[0]);
	}
}
