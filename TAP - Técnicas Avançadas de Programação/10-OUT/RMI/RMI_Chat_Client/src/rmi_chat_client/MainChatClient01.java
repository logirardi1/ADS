/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_chat_client;

/**
 *
 * @author Jean Negrão
 */
public class MainChatClient01 {
    public static void main(String args[]){
       RMIChatClient client = new RMIChatClient("lorenzo", "192.168.0.87", 1099);//ip cliente
       client.connectServer("serverchat", "192.168.0.217", 1099);//ip servidor
    }
}

