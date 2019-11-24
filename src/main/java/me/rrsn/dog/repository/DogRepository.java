package me.rrsn.dog.repository;

import me.rrsn.dog.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}

