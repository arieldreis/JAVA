package arrays.entities;

import java.util.Arrays;

public class rent {
    private String name;
    private String email;

    public rent(String name, String email ){
        this.name = name;
        this.email = email;
    }

    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String  toString(){
        return "Nome: " + name + ", " + "Email: " + email;
    }

}
