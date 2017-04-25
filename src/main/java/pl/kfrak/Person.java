package pl.kfrak;

/**
 * Created by RENT on 2017-04-25.
 */
public class Person {
    //klasa = sposób odwzorowania rzeczywistości
    //klasa "osoba" to wzór osób, które bedziemy tworzyc

    //pole = jakby stan klasy np. osoba moze miec imie, nazwisko, wzorts itd
    //pola = zmienne, jakie ma kazdy obiekt klasy
    //POLA
    private String name;
    public String surname;
    public int age;
    public String email;

    public String getName(){
        return name;
    }
    //jezeli metoda jest statyczna to wykonujesz ja na klasie a nie na obiekcie danej klasy
    //dla statica nie trzeba tworzyc obiektow

//    public String setName(String name){
//        return name;
//    }
    //jesli nie ma settera to nikt nigdy nie bedzie mogl zmienic imienia

    /*
    * modyfikator dostepu:
    * default - pakietowy, bez modyfikatora
    * public - publiczny, wszyscy maja dostep
    * private - tylko wewnatrz klasy
    * protected - wewnatrz klasy + wewnątrz klas dziedziczacych
    *
    * ENKAPSULACJA:
    * okreslony zestaw czynnosci co mozemy zrobic
    * z nasza klasa
    *
    * a to jakie sa tam pola/bebechy, to nie jest istotne
    *
    */

    //KONSTRUKTORY
    //maja nazwe taka jak nazwe klasy
    //nie maja typu zwracanego, bo zawsze konstruktor osoba zwraca osobe
    //domyślny konstruktor (jesli nie napiszemy zadnego w klasie to
    //java wygeneruje domyslny konstruktor jak ponizej:
    public Person(){

    }//tj pusta

    public Person(String newName){
        name = newName;
    }


    //METODY - funkcje zachowania klasy
    public void printName(){
        System.out.println(name);
    }

    @Override
    public String toString(){
        return "Person " + "name " + name;
    }

}
