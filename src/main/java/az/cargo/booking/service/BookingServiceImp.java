package az.cargo.booking.service;


import az.cargo.booking.dto.request.BookingRequest;
import az.cargo.booking.dto.response.BookingResponse;

import java.util.List;

public interface BookingServiceImp {
    List<BookingResponse> findAll();

    BookingResponse findById(Long id);

    BookingResponse save(Long userId, Long paymentId, BookingRequest bookingRequest);

    void delete(Long id);
}
