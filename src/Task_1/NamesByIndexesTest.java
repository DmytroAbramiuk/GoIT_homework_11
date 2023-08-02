package Task_1;

import java.util.List;

public class NamesByIndexesTest {
    public static void main(String[] args) {
        List<String> nameList = List.of("Dima", "Oleh", "Andrew", "Natalia", "Klava", "Kostya", "Viktor"
                , "Max", "Ivan", "Mark", "John", "Elisabeth", "Ivana", "Ann", "Olga", "Artem", "Kolya", "Veronika"
                , "Maria", "Jason", "Elon", "Arkadiy", "Emilia", "Antonio", "Leonardo", "Harry", "Tales", "Hermione");

        NamesByIndexes nbi = new NamesByIndexes(nameList);
        System.out.println("nbi.getNames() = " + nbi.getNames());
    }
}
