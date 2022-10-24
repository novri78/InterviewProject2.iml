package Stub;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ToDoBussinessImplStubTest {

    @Test
    public void usingAStub(){
        ToDoService toDoService = new ToDoServiceStub();
        ToDoBussinessImpl toDoBussinessImpl = new ToDoBussinessImpl(toDoService);
        List<String> toDos = toDoBussinessImpl
                .retrieveToDosRelatedToSpring("Novri");
        assertEquals(2,toDos.size());
    }
}
