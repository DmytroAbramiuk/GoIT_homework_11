package Task_2;

import java.util.List;

public class SorterTest {
    public static void main(String[] args) {
        List<String> nameList = List.of("Dima", "Oleh", "Andrew", "Natalia", "Klava", "Kostya", "Viktor"
                , "Max", "Ivan", "Mark", "John", "Elisabeth", "Ivana", "Ann", "Olga", "Artem", "Kolya", "Veronika"
                , "Maria", "Jason", "Elon", "Arkadiy", "Emilia", "Antonio", "Leonardo", "Harry", "Tales", "Hermione");

        Sorter sorter = new Sorter(nameList);
        System.out.println("sorter.sort() = " + sorter.sort());
    }
}
