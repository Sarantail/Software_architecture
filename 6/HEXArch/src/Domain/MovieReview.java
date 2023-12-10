package Domain;

public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }
    // метод выводит на печать инфо из бд

    @Override
    public String toString() {
        return " " + movieScore + " " + remark;
    }
}
