package be.ac.umons;

import java.util.Observable;

public class Manager extends Personne{
    private String Name;
    private int id;
    private String password;
    public Manager(String Name,int id,String password){
        super(Name,id);
        this.password = password;
    }
    public String getName() {
        return Name;
    }
    public int getId(){return id;}

    @Override
    public void update(Observable observable, Object o) {

    }
}
