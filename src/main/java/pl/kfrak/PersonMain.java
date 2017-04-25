package pl.kfrak;

/**
 * Created by RENT on 2017-04-25.
 */
public class PersonMain {
    public static void main(String[] args) {
      //  Person person; //domyślna wartośc klasy (stworzonej) to null
        //typ prosty ma zawsze jakąś wartość; typ obiektowy - nulla

//        Person person = new Person();//stworzylismy nowa osobe
//        person.name = "Adam";
//
//        Person person2 = new Person();//stworzylismy nowa osobe
//        person2.name = "Jan";
//
//        System.out.println(person.name);
//        System.out.println(person2);
//
//        person.printName();
//        person2.printName();

        Person person3 = new Person("Kuba");
        person3.printName();

        System.out.println(person3.toString());
    }
}
