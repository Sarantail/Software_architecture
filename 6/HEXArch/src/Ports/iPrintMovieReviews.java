package Ports;

import java.util.List;

import Domain.MovieReview;

//порт к адаптеру консольного принтера: получает на вход список movieReviewList. Выводит на печать 

public interface iPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
