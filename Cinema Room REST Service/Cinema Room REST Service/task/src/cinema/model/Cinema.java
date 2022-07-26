package cinema.model;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class Cinema {

    private int totalRows;
    private int totalColumns;
    private List<Seat> availableSeats;

    public Cinema() {
    }

    public Cinema(int totalRows, int totalColumns, List<Seat> availableSeats) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        this.availableSeats = availableSeats;
    }

    public Cinema generateSeats(int totalRows, int totalColumns) {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalColumns; j++) {
                seats.add(new Seat(i, j));
            }
        }
        return new Cinema(totalRows, totalColumns, seats);
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<Seat> availableSeats) {
        this.availableSeats = availableSeats;
    }
}
