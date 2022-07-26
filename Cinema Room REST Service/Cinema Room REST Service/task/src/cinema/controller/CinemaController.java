package cinema.controller;

import cinema.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CinemaController {

    private final Cinema cinema;

    @Autowired
    public CinemaController(Cinema cinema) {
        this.cinema = cinema.generateSeats(9,9);
    }

    @GetMapping("/seats")
    public Cinema getSeats() {
        return cinema;
    }


}
