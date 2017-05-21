package tobyleetv2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class SuperTypeToken3 {
	static class Sup<T>{
		T value;
	}
	// ANONYMOUS CLASS
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Sup b = new Sup<List<String>>() {};
		Type t = b.getClass().getGenericSuperclass();
		ParameterizedType ptype = (ParameterizedType) t;
		System.out.println(ptype.getActualTypeArguments()[0]);
	}
}
