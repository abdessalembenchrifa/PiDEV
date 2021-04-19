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
public class Chat {
    
    private int chat_id,user_id,chatroom_id;
    private String message;
    private Date chat_date;

    public Chat() {
    }

    public Chat(int chat_id, int user_id, int chatroom_id, String message, Date chat_date) {
        this.chat_id = chat_id;
        this.user_id = user_id;
        this.chatroom_id = chatroom_id;
        this.message = message;
        this.chat_date = chat_date;
    }

    public int getChat_id() {
        return chat_id;
    }

    public void setChat_id(int chat_id) {
        this.chat_id = chat_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getChatroom_id() {
        return chatroom_id;
    }

    public void setChatroom_id(int chatroom_id) {
        this.chatroom_id = chatroom_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getChat_date() {
        return chat_date;
    }

    public void setChat_date(Date chat_date) {
        this.chat_date = chat_date;
    }

    @Override
    public String toString() {
        return "chat{" + "chat_id=" + chat_id + ", user_id=" + user_id + ", chatroom_id=" + chatroom_id + ", message=" + message + ", chat_date=" + chat_date + '}';
    }
    
    
    
}
