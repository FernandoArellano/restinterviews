package org.fer.resources;

import org.fer.data.Datasource;
import org.fer.data.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
public class MessageResource {

    Datasource data = new Datasource();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void getMessager(){
        List<Message> list = Datasource.getMessages();
        System.out.println(list);

    }

    @POST
    public void addMessage(Message message){
        Datasource.addMessage(message);
        System.out.println(Datasource.getMessages());
    }


}
