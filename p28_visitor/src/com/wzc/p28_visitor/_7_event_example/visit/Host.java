package com.wzc.p28_visitor._7_event_example.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class Host {
    private List<Event> eventList = new ArrayList<>();

    public void attach(Event event) {
        eventList.add(event);
    }

    public void detach(Event event) {
        eventList.remove(event);
    }

    public void makeSpeech(Animal animal) {
        for (Event event : eventList) {
            event.accept(animal);
        }
    }

}
