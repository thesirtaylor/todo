package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import data.ToDo;
public interface TodoRepository extends MongoRepository<ToDo, String> {
}
