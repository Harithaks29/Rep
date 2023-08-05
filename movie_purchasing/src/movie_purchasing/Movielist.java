package movie_purchasing;
import java.util.ArrayList;
public class Movielist {
	public static void main(String[]args) {
		
		ArrayList<Movie> movielist=new ArrayList<Movie>();
		movielist.add(new Movie(1,"theri","tamil","action",150));
		movielist.add(new Movie(2,"kanjana","tamil","horror",150));
		movielist.add(new Movie(3,"thunivu","tamil","action",150));
		movielist.add(new Movie(4,"lift","tamil","horror",150));
		movielist.add(new Movie(5,"don","tamil","comedy",150));
		movielist.add(new Movie(6,"doctor","tamil","comedy",150));
		movielist.add(new Movie(7,"vikram","tamil","action",150));
		movielist.add(new Movie(8,"doctor","tamil","action",150));
		
		ArrayList<Movie> newlist=new ArrayList<Movie>();
		String type="action";
		for(Movie i:movielist) {
			if(i.getType()==type) {
				newlist.add(i);
			}			
			else
			{
//				System.out.println(i.print()+"type is not same as"+" "+type);
			}
		}
//		System.out.println(newlist.toString());
		for (Movie movie: movielist) {
			System.out.println(movie.toString());
		}
	}
}