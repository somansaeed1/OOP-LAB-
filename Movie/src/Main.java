 import java.util.ArrayList;

   public class Main {
    public static void main(String[] args){
        ArrayList<Movie> movies = new ArrayList<Movie>();
        System.out.println("Welcome To The Funland");
        System.out.println("The Size Of The Movie Is: " + movies.size());
        System.out.println("Is The Movie Empty? " + movies.isEmpty());
        System.out.println("Please Add The Movies In Your Favourites!");
        movies.add(new Movie("Main Hoon Na", 2001, "SRK", "Romantic", 10));
        movies.add(new Movie("Ek Tha Tiger", 2012, "SKF", "Action", 9));
        movies.add(new Movie("K.G.F", 2021, "Yash", "Action, Romance", 7));
        for (Movie movie : movies) {
            System.out.println("Your Favourite Movies Include\n");
            System.out.println(movie);
        }
        System.out.println("Now The Size Of The Movie Is: " + movies.size());
        System.out.println("Is The Movie Empty Now? " + movies.isEmpty());
        movies.remove(0);
        for (Movie movie : movies) {
            System.out.println("The Movie List After Removing Is: \n");
            System.out.println(movie);
        }
        movies.set(0, new Movie("Salaar", 2023, "Prabhas", "Action", 10));
        for (Movie movie : movies) {
            System.out.println("The Movie List After Updating Is: \n");
            System.out.println(movie);
        }
        for (Movie movie : movies) {
            movie.setRating(movie.getRating() + 1);
            System.out.println("The Movie List After Updating The Rating Is: \n" + movie);
            System.out.println(movie);
        }
    }
}