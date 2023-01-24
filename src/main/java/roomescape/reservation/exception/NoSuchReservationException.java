package roomescape.reservation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoSuchReservationException extends RuntimeException {
    public NoSuchReservationException() {
    }

    public NoSuchReservationException(String message) {
        super(message);
    }
}