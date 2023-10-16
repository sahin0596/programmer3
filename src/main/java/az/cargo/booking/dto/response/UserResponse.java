package az.cargo.booking.dto.response;

import az.cargo.booking.domain.Booking;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    Long userId;

    String name;

    String surname;

    String email;

    String phoneNumber;

    List<BookingResponse> bookings;

}
