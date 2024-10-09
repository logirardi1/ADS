/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_chat_client;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmichat.Client;
import rmichat.RMIChat;


/**
 *
 * @author Jean Negrão
 */
public class RMIChatClient {
    private final Client client;

    public RMIChatClient(String name, String IP, int port) {
        client = new Client(name, IP, port);
    }
   
   public void connectServer(String serverName, String IP, int port) {
        Scanner in = new Scanner(System.in);        
        int sair;
        Registry registry;
        
        try {
            registry = LocateRegistry.getRegistry(IP, port);
            RMIChat rmi = (RMIChat) registry.lookup(serverName);
            System.out.println("Connect to Server");
            System.out.println(rmi.getServerName());
            rmi.addClient(client);
        
            Client destinatario = new Client();
            String msg;            
            do{ 
                System.out.println("digite '0' para sair:");
                sair = in.nextInt();
                System.out.println(rmi.getMSG(client));
                System.out.println("entre com o nome do destinatario:");                
                destinatario.setName(in.next());
                System.out.println("entre com msg:");
                msg = in.next();
                rmi.sendMSG(client, destinatario, msg);
            }while(sair == 0);
        } catch (RemoteException ex) {
            Logger.getLogger(RMIChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

