package tobyleetv1;

import java.util.Arrays;
import java.util.List;

public class Dispatch11 {
	interface Post {
		void postOn(Facebook sns);
		void postOn(Twitter sns);
	}

	static class Text implements Post {
		public void postOn(Facebook sns) {
			System.out.println("Text -> Facebook");
		}
		public void postOn(Twitter sns) {
			System.out.println("Text -> Twitter");
		}
	}
	static class Picture implements Post {
		public void postOn(Facebook sns) {
			System.out.println("Picture -> Facebook");
		}
		public void postOn(Twitter sns) {
			System.out.println("Picture -> Twitter");
		}
	}
	
	interface SNS {}
	static class Facebook implements SNS{
	};
	static class Twitter implements SNS {
	};

	public static void main(String[] args) {
		List<Post> posts = Arrays.asList(new Text(), new Picture());
		List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());
		posts.forEach(p->sns.forEach(s->p.postOn(s)));
	}
}
