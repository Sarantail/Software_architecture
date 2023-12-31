package Application;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieApp {

    private iFetchMovieReviews fetchMovieReviews;
    private iPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    // подключение к портам внешних адаптеров MovieReviewsRepo и ConsolePrinter
    public MovieApp(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    public void accept(MovieSearchRequest movieSearchRequest) {
        // получаем через fetchMovieReviews список отзывов
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        // методом filterRandomReviews фильтруем полученные отзывы
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList));
        // отфильтрованный список отправляем на печать
        printMovieReviews.writeMovieReviews(randomReviews);
    }
}
