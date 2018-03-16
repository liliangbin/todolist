package com.example.demo.dao;

import com.example.demo.model.EventList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/16  21:30
 */
public interface EventDao extends CrudRepository<EventList,Long> {

    List<EventList>  findAllByDoneIs( boolean done);


}
