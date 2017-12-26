package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ivero on 26.12.2017.
 */
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;
    private String bookingName;

    public Booking() {}

    public Booking(String bookingName) {
        super();
        this.bookingName = bookingName;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", bookingName=" + bookingName + "] ";
    }

    public String getBookingName() {
        return bookingName;
    }

    public Long getId() {
        return id;
    }
}
