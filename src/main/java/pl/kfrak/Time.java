package pl.kfrak;

/**
 * Created by RENT on 2017-04-25.
 */
public class Time {
    //pola
    private int minutes;
    private int hours;


    public static void main(String[] args) {
        Time t = new Time("12:45");
        System.out.println(t);

        t.addHours(-13);
        System.out.println(t);

        t.addMinutes(-50);
        System.out.println(t);
    }


    //gettery, settery
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //toString
    @Override
    public String toString() {
        return "Jest godzina [hh:mm]: " + hours + ":" + minutes;
    }

    //konstruktor przyjmujący Stringa "12:50"
    public Time(String text) {
        String[] splitted = text.split(":");
        String hoursString = splitted[0];
        String minutesString = splitted[1];
        hours = Integer.parseInt(hoursString);
        minutes = Integer.parseInt(minutesString);
    }

    public void addHours(int hours) {
        this.hours += hours;
        while (this.hours > 23) {
            this.hours -= 24;
        }
        while (this.hours < 0) {
            this.hours += 24;
        }
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        while (this.minutes > 59) {
            this.minutes -= 60;
            addHours(1);
        }
        while (this.minutes < 0) {
            this.minutes += 60;
            addHours(-1);
        }
    }
}

