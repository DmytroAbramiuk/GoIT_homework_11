package Task_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NamesByIndexes implements NamesByOddIndexes{
    private List<String> nameList;

    NamesByIndexes(List<String> nameList){
        this.nameList = nameList;
    }

    @Override
    public List<String> getNames() {
        return IntStream
                .range(0, nameList.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> (index) + ". " + nameList.get(index))
                .collect(Collectors.toList());
    }
}
