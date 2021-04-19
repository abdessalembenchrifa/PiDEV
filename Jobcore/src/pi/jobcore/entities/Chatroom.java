/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.entities;

import java.sql.Date;

/**
 *
 * @author abdes
 */
public class Chatroom {
    
    private int chatroom_id,user_id;
    private String chat_name;
    private Date chat_date;
    
    public Chatroom(){
        
    }

    public Chatroom(int chatroom_id, int user_id, String chat_name, Date chat_date) {
        this.chatroom_id = chatroom_id;
        this.user_id = user_id;
        this.chat_name = chat_name;
        this.chat_date = chat_date;
    }
    

    public int getChatroom_id() {
        return chatroom_id;
    }

    public void setChatroom_id(int chatroom_id) {
        this.chatroom_id = chatroom_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getChat_name() {
        return chat_name;
    }

    public void setChat_name(String chat_name) {
        this.chat_name = chat_name;
    }

    public Date getChat_date() {
        return chat_date;
    }

    public void setChat_date(Date chat_date) {
        this.chat_date = chat_date;
    }

    @Override
    public String toString() {
        return "chatroom{" + "chatroom_id=" + chatroom_id + ", user_id=" + user_id + ", chat_name=" + chat_name + ", chat_date=" + chat_date + '}';
    }
    
    
    
}
