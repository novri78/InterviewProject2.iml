package Stub;

import java.util.ArrayList;
import java.util.List;

public class ToDoBussinessImpl {
    private final ToDoService toDoService;

    ToDoBussinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveToDosRelatedToSpring(String user) {
        List<String> filteredToDos = new ArrayList<>();
        List<String> allTodos = toDoService.retrieveToDos(user);
        for (String todo : allTodos) {
            if (todo.contains("Spring")) {
                filteredToDos.add(todo);
            }
        }
        return filteredToDos;
    }
}
