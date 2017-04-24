package pl.kfrak;

/**
 * Created by RENT on 2017-04-24.
 *
 * Point który ma X i Y inty
 * gettery i settery
 * konstruktor z parametrami
 * equals
 * toString
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
    }


    //chcemy mieć konstruktor który przyjmuje stronga i w tym strinku powinnam mieć x i y i przypisać do pól
    public Point (String text){ //"100, 2"
        String[] splitted = text.split(",")
                //uwaga może można podać złego stringa?!
    }

    //dodaj do punktu drugi punkt
    //np mam punkt 3, 10
    //dodaj do tego punkt 5, 8
    //otrzymuje 8, 18
    public void add(Point point){

    }
}
