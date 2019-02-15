package com.microservice.trainning.repository;

import com.microservice.trainning.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 2/15/19.
 */
public interface EventRepository  extends MongoRepository<Event, String>{

    List<Event> findByName(@Param("name") String name);
    List<Event> findByNumberLimit(@Param("numberLimit") Integer numberLimit);
}
