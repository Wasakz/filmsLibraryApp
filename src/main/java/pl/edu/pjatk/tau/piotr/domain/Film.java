package pl.edu.pjatk.tau.piotr.domain;

public class Film {
    private Long id;
    private String title;
    private String author;
    private String description;
    private Integer yearOfRelease;

    public Film() {
    }

    public Film(String title, String author, String description, Integer yearOfRelease) {
        this.id = null;
        this.title = title;
        this.author = author;
        this.description = description;
        this.yearOfRelease = yearOfRelease;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        Film other = (Film) o;
        boolean ret = other.getAuthor().equals(this.getAuthor()) &&
                other.getTitle().equals((this.getTitle())) &&
                other.getDescription().equals(this.getDescription()) &&
                ((other.getId() == this.getId()) || (other.getId().longValue() == this.getId().longValue())) &&
                ((other.getYearOfRelease() == this.getYearOfRelease()) || (other.getYearOfRelease().intValue() == this.getYearOfRelease().intValue()));
        return ret;

    }

    @Override
    public String toString() {
        return "[" + id+ ", "
                + title + ", " + author + ", " + yearOfRelease + " , " + description  + "]";
    }
}

