package tobyleetv2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperTypeToken4 {
	static class TypeSafeMap {
		Map<Class<?>, Object> map = new HashMap<>();
		
		<T> void put(Class<T> className, T value) {
			map.put(className, value);
		}
		
		<T> T get(Class<T> className) {
			return className.cast(map.get(className));
		}
	}
	
	static class TypeReference<T> {
		Type type;
		public TypeReference(){
			Type stype = getClass().getGenericSuperclass();
			if(stype instanceof ParameterizedType) {
				this.type = ((ParameterizedType)stype).getActualTypeArguments()[0];
			}
			else throw new RuntimeException();
		}
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TypeReference t = new TypeReference<String>();
		TypeReference t = new TypeReference<String>() {};
		System.out.println(t.type);
	}
}
