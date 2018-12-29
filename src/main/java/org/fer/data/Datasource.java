package org.fer.data;

import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static List<Message> list = new ArrayList<>();
    public Datasource(){
        list.add(new Message("1","Example Message"));
        list.add(new Message("2","Another Example Message"));
        list.add(new Message("3","Example Message Again"));
    }

    public static List<Message> getMessages(){
        return list;
    }

    public static void addMessage(Message message){
        list.add(message);
    }

    public static void removeMessage(Message message){
        if(message!=null && message.getId()!= null){
            list.remove(message);
        }
    }

    public static void updateMessage(Message message){
        if(message!=null && message.getId()!= null){
            int index = list.indexOf(message);
            if(index>0) {
                list.set(index, message);
            }
            else
            {
                list.add(message);
            }
        }
    }

}
