package net.flix;

/*this is the start of session 3.3 hands on learning
 *
 */
class Movie
{
    //here is the instance fields, what do i need as input.
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private MovieRating rating;
    private MovieGenre genre;

    public Movie()
    {
        //no-op
    }
    public Movie(String title)
    {
        this();
        setTitle(title);
    }

    public Movie(String title, int releaseYear, Double revenue)
    {
        //delegate to setters for any validation.
        this(title); //this delegates to the ctor above for the title. think of it as a cascade.
        setReleaseYear(releaseYear); //this is a delegation for the setter validation
        setRevenue(revenue); //this is the same as the delegation for releaseYear.
    }

    public Movie(String title, int releaseYear, Double revenue, MovieRating rating, MovieGenre genre)
    {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }
    //business methods - what can a movie do?


    //accessor methods - get/set aka access control


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Integer getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue()
    {
        return revenue;
    }

    public void setRevenue(Double revenue)
    {
        this.revenue = revenue;
    }

    public MovieRating getRating()
    {
        return rating;
    }

    public void setRating(MovieRating rating)
    {
        this.rating = rating;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        /*return "net.flix.Movie[" + "title='" + getTitle() + '\'' + ", releaseYear=" + getReleaseYear() +
                ", revenue=" + getRevenue() +  ", Rating: " + getRating() + ", Genre: " + getGenre() +']';
        */
        return String.format("Movie: title= %s, release year= %s, revenue= %,.2f, rating= %s, genre= %s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}
