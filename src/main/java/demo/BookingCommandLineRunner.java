package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by ivero on 26.12.2017.
 */
@Component
public class BookingCommandLineRunner implements CommandLineRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public void run(String... strings) throws Exception {
        for (Booking b : this.bookingRepository.findAll()) {
            System.out.println(b.toString());
        }
    }
}
