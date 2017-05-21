package tobyleetv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeToken4 {
	static class TypeSafeMap {
		Map<Class<?>, Object> map =  new HashMap<>();
		<T> void put(Class<?> className, T value){
			map.put(className, value);
		}
		<T> T get(Class<T> className){
			return className.cast(map.get(className));
		}
	}
	public static void main(String[] args) throws Exception {
		TypeSafeMap m = new TypeSafeMap();
		m.put(Integer.class, 1);
		m.put(String.class, "String");
		m.put(List.class, Arrays.asList(1,2,3));
		System.out.println(m.get(Integer.class));
		System.out.println(m.get(String.class));
		System.out.println(m.get(List.class));
	}
}
