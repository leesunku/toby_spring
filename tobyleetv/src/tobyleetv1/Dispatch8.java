package tobyleetv1;

import java.util.Arrays;
import java.util.List;

public class Dispatch8 {
	interface Post { void postOn(SNS sns); }

	static class Text implements Post {
		public void postOn(SNS sns) {
			System.out.println("Text -> " + sns.getClass().getSimpleName());
		}
	}
	static class Picture implements Post {
		public void postOn(SNS sns) {
			System.out.println("Picture -> " + sns.getClass().getSimpleName());
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
		
		/*for (Post p : posts){
			for(SNS s : sns){
				p.postOn(s);
			}
		}*/
		posts.forEach(p->sns.forEach(s->p.postOn(s)));
	}
}
