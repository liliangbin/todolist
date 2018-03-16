package com.example.demo.service;

import com.example.demo.dao.EventDao;
import com.example.demo.model.EventList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/16  21:32
 */
@Service
public class EventService {

    @Autowired
    private EventDao eventDao;


    public Object add(String event,String eventIntro){

        EventList eventList = new EventList();
        eventList.setEvent(event);
        eventList.setEventIntro(eventIntro);
        eventList.setDone(false);
        eventDao.save(eventList);
        return  eventList;
    }

    public Object hadDone(long eventId){


        EventList eventList = eventDao.findOne(eventId);

        if(eventList.isDone()){

            return  "你已经做完了";

        }

        else {
            eventList.setDone(true);
        }

        return "你已经做完了";
    }

    public Object deleteOne(  long eventId){

      EventList eventList= eventDao.findOne(eventId);
      if(eventList==null){
          return "没有该事项";
      }
      else {
          eventDao.delete(eventList);
      }
      return " 已删除该事项";
    }


    public Object findAll(){
        return  eventDao.findAll();
    }
    public Object findIsDone(){
        return  eventDao.findAllByDoneIs(true);
    }

    public Object findNotDone(){
        return eventDao.findAllByDoneIs(false);
    }

    public Object deleteAll(){
         eventDao.deleteAll();
         return "你已经删除完毕";
    }
}
