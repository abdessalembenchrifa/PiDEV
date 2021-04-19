/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.entities;

/**
 *
 * @author abdes
 */
public class ChatMember {
    
    private int chat_member_id,chatroom_id,user_id;

    public ChatMember() {
    }

    public ChatMember(int chat_member_id, int chatroom_id, int user_id) {
        this.chat_member_id = chat_member_id;
        this.chatroom_id = chatroom_id;
        this.user_id = user_id;
    }

    public int getChat_member_id() {
        return chat_member_id;
    }

    public void setChat_member_id(int chat_member_id) {
        this.chat_member_id = chat_member_id;
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

    @Override
    public String toString() {
        return "chat_member{" + "chat_member_id=" + chat_member_id + ", chatroom_id=" + chatroom_id + ", user_id=" + user_id + '}';
    }
    
    
    
    
}
