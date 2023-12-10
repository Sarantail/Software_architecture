package Adapters;

import java.util.*;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;

// класс - база данных отзывов, реализованная в виде словаря с ключом: название фильма
public class MovieReviewsRepo implements iFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    // запрос на подключение к порту fetchMovieReviews

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("Love and doves", Collections.singletonList(new MovieReview("1", 10.0, "Perfect")));
        movieReviewMap.put("StarTreck",
                Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
