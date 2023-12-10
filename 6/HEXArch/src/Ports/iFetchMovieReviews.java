package Ports;

import java.util.List;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

//на вход получает запросы от MovieReviewsRepo, возвращает список

public interface iFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
