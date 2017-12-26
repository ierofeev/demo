package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by ivero on 27.12.2017.
 */
@RestController
public class BookingRestController {

    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping("/bookings")
    Collection<Booking> bookingCollection() {
        return this.bookingRepository.findAll();
    }

}
