/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmichat;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jean Negrão
 */
public class  Client implements Serializable{
    private String name;
    private final String IP;
    private final int port;

    public Client() {
        this.name = "";
        this.IP = "";
        this.port = 0;
    }
    
    public Client(String name) {
        this.name = name;
        this.IP = "";
        this.port = 0;
    }
    
    public Client(String name, String IP, int port) {
        this.name = name;
        this.IP = IP;
        this.port = port;
    }
    

    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", IP=" + IP + ", port=" + port + '}';
    }
    
    public void write() {
        System.out.println(this.toString());
    }

}
