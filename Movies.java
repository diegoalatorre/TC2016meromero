import java.io.FileNotFoundException;
import java.util.Scanner;

public class Movies {

	private static Scanner scan;
	
	public static void main(String[] args) throws FileNotFoundException {

		scan = new Scanner(System.in);

		WSQ09 moviesData1 = new WSQ09("C:/Users/diego.alatorre/Documents/Diego/ISC/2Semestre/POO/2Parcial/movies.txt");
		
		moviesData1.readFile();
		System.out.println("(a) Give me 2 movies separated by ( &, | , ^) to get the relationships of the actors\n(b) Give me the name of an actor and find his/her co-actors\nWrite 'a' or 'b'.");
		String choice = scan.nextLine();

		if (choice.equals("a")){
			System.out.println("Give me 2 movies separated by ( &, | , ^) to obatain the set of actors relationships. E.g: Apollo 13|Sleepless in Seattle");
			
			String movies = scan.nextLine();
			moviesData1.relations(movies);
		}
		else if (choice.equals("b")){
			System.out.println("Give me name of an actor and find his/her co-actors. E.g: Tom Hanks");
			String actor = scan.nextLine();
			moviesData1.coActors(actor);
		}
		
		
	}
}
