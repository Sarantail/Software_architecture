import Adapters.ConsolePrinter;
import Adapters.MovieReviewsRepo;
import Adapters.UserCommand;
import Application.MovieUser;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;
import Ports.iUserInput;

public class App {
    public static void main(String[] args) throws Exception {
        // создание экземпляров адаптеров MovieReviewsRepo и ConsolePrinter
        iFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        iPrintMovieReviews printMovieReviews = new ConsolePrinter();

        // создание команды-запроса
        iUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);
        // "обертка" для userCommand
        MovieUser movieUser = new MovieUser(userCommand);
        // создание экземпляров запросов
        MovieSearchRequest Love_doves = new MovieSearchRequest("Love and doves");
        MovieSearchRequest starTreck = new MovieSearchRequest("StarTreck");

        System.out.println(Love_doves.getMovieName());
        movieUser.processInput(Love_doves);

        System.out.println(starTreck.getMovieName());
        movieUser.processInput(starTreck);
    }
}
