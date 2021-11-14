package domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXp() {
        return XP_STANDARD + 20d;
    }
}
