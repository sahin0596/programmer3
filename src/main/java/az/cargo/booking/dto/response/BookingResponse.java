package az.cargo.booking.dto.response;

import az.cargo.booking.domain.Flights;
import az.cargo.booking.domain.Hotel;
import az.cargo.booking.domain.RentalCar;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingResponse {

    Long id;

    String bookingDate;

    Double totalCost;

    List<Flights> flights;

    List<Hotel>hotels;

    List<RentalCar> rentalCars;

    PaymentResponse payment;
}
