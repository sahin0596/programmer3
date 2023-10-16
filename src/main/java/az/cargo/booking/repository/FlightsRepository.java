package az.cargo.booking.repository;

import az.cargo.booking.domain.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends JpaRepository<Flights,Long> {
}
