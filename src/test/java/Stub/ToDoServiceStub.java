package Stub;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {
    public List<String> retrieveToDos(String user) {
        return Arrays.asList("Learn Spring MVN", "Learn Spring", "Learn To Dance");
    }
}
