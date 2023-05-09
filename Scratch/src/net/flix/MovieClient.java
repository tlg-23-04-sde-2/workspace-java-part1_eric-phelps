package net.flix;

/*
 *
 */
class MovieClient
{
    public static void main(String[] args)
    {
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        movie1.setReleaseYear(1997);
        movie1.setRevenue(750_000_000.0);

        System.out.println(movie1); //toString is automagically called.

        //for movie 2 we will be implementing a constructor, it is more efficient.
        Movie movie2 = new Movie("Ace Ventura", 1994, 15_000_000.00);
        System.out.println(movie2);

        Movie movie3 = new Movie("White Roses");
        System.out.println(movie3);

        Movie movie4 = new Movie("Mario", 2023, 28_000_000.00, MovieRating.PG, MovieGenre.COMEDY);
        System.out.println(movie4);

    }
}