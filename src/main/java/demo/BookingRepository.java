package demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by ivero on 26.12.2017.
 */
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Collection<Booking> findByBookingName(String bookingName);

}
