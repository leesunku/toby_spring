package tobyleetv1;

import java.util.Arrays;
import java.util.List;

public class Dispatch10 {
	interface Post { void postOn(SNS sns); }

	static class Text implements Post {
		public void postOn(SNS sns) {
			if (sns instanceof Facebook){
				System.out.println("Text -> Facebook");
			}
			if (sns instanceof Twitter){
				System.out.println("Text -> Twitter");
			}
			if (sns instanceof GooglePlus){
				System.out.println("Text -> GooglePlus");
			}
		}
	}
	static class Picture implements Post {
		public void postOn(SNS sns) {
			if (sns instanceof Facebook){
				System.out.println("Picture -> Facebook");
			}
			if (sns instanceof Twitter){
				System.out.println("Picture -> Twitter");
			}
			if (sns instanceof GooglePlus){
				System.out.println("Picture -> GooglePlus");
			}
		}
	}
	
	interface SNS {}
	static class Facebook implements SNS{
	};
	static class Twitter implements SNS {
	};
	static class GooglePlus implements SNS {
	};

	public static void main(String[] args) {
		List<Post> posts = Arrays.asList(new Text(), new Picture());
		List<SNS> sns = Arrays.asList(new Facebook(), new Twitter(), new GooglePlus());
		
		/*for (Post p : posts){
			for(SNS s : sns){
				p.postOn(s);
			}
		}*/
		posts.forEach(p->sns.forEach(s->p.postOn(s)));
	}
}
