package pl.kfrak;

/**
 * Created by RENT on 2017-04-25.
 * *
 * Point który ma X i Y inty
 * gettery i settery
 * konstruktor z parametrami
 * equals
 * toString
 */

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        System.out.println("dodawanie współrzednych");
        Point point1 = new Point(3,4);
        System.out.println("Punkt 1 " + point1);

        point1.add(3,5);
        System.out.println("Po dodaniu " + point1);

        System.out.println("dodawanie punktu");
        Point point2 = new Point(3,4);
        System.out.println("Punkt " + point2);
        Point point3 = new Point(7, 6);
        System.out.println("Punkt do dodania " + point3);
        point2.addPoint(point3);
        System.out.println("Po dodaniu " +point2);

        System.out.println("Stringiem");
        Point point4 = new Point("a,b");
        System.out.println(point4);
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //chcemy mieć konstruktor który przyjmuje stringa i w tym stringu powinnam mieć x i y i przypisać do pól
    public Point(String text){ // "100,2"

        if(text == null){
            throw new IllegalArgumentException("Nie można sparsować pustej tablicy"); //niepoprawne dane wejściowe + komunikat
        }
        String[] splitted = text.split(",");

        if(splitted.length != 2){
            throw new IllegalArgumentException("Zła liczba elementów tablicy");
        }
        String xString = splitted[0]; //"100"
        String yString = splitted[1];//jeśli podam "abcd" to tu się wywali, bo tablica nie znajdzie indeksu 1 tj tej po przecisnku

        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("Zły format danych");
        }

    }


    //dodaj do punktu drugi punkt
    //np mam punkt 3, 10
    //dodaj do tego punkt 5, 8
    //otrzymuje 8, 18
    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void addPoint(Point point){
        int x2 = point.getX();
        int y2 = point.getY();
        this.x = x + x2;
        this.y = y + y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}