package service;

import data.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TodoRepository;
import java.util.List;
import exception.EntityNotFoundException;

@Service
public class ToDoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<ToDo> findAll(){
        return todoRepository.findAll();
    }
    public ToDo findById(String id){
        return todoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public ToDo save (ToDo toDo){
        return todoRepository.save(toDo);
    }
    public void deleteById(String id){
        todoRepository.deleteById(id);
    }
}
