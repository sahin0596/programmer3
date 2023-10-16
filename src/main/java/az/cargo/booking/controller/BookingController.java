package az.cargo.booking.controller;

import az.cargo.booking.dto.request.BookingRequest;
import az.cargo.booking.dto.response.BookingResponse;
import az.cargo.booking.service.BookingServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/b1")
public class BookingController {

  private final BookingServiceImp bookingServiceImp;

  @GetMapping("/{id}")
  public ResponseEntity <BookingResponse> findById(@PathVariable Long id) {
    return new ResponseEntity<>(bookingServiceImp.findById(id), HttpStatus.OK);
  }
  @GetMapping()
  public ResponseEntity<List<BookingResponse>> findAll(){
    return new ResponseEntity<>(bookingServiceImp.findAll(),HttpStatus.OK);
  }
  @PostMapping("/payments/{paymentId}/users/{userId}")
   public ResponseEntity<BookingResponse> save(@PathVariable Long userId,
                                               @PathVariable Long paymentId,
                                               @RequestBody BookingRequest bookingRequest){
    return  new ResponseEntity<>(bookingServiceImp.save(userId,paymentId,bookingRequest),HttpStatus.CREATED);
  }
  @GetMapping("/{id}")
  public void delete(@PathVariable Long id){
    bookingServiceImp.delete(id);
  }
}