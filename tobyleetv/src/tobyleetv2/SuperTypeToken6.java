package tobyleetv2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperTypeToken6 {
	static class TypeSafeMap {
		Map<TypeReference<?>, Object> map = new HashMap<>();
		
		<T> void put(TypeReference<T> tr, T value) {
			map.put(tr, value);
		}
		
		<T> T get(TypeReference<T> tr) {
			if (tr.type instanceof Class<?>)
				return ((Class<T>) tr.type).cast(map.get(tr));
			else
				return ((Class<T>)((ParameterizedType)tr.type).getRawType()).cast(map.get(tr));
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass().getSuperclass() != obj.getClass().getSuperclass())
				return false;
			TypeReference other = (TypeReference) obj;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		TypeSafeMap m = new TypeSafeMap();
		TypeReference<Integer> trInt = new TypeReference<Integer>() {};
		m.put(trInt, 1);
		m.put(new TypeReference<String>() {}, "String");
		m.put(new TypeReference<List<Integer>>() {}, Arrays.asList(1,2,3));
		m.put(new TypeReference<List<String>>() {}, Arrays.asList("a","b","c"));
		System.out.println(m.get(trInt));
		System.out.println(m.get(new TypeReference<String>() {}));
		System.out.println(m.get(new TypeReference<List<Integer>>() {}));
		System.out.println(m.get(new TypeReference<List<String>>() {}));
	}
}
