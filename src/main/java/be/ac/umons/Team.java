package be.ac.umons;

import java.util.ArrayList;

public class Team {
    public String name;
    public Worker namechef;
    ArrayList<Worker> listWorker;
    public Team(String name, Worker namechef){
        this.name=name;
        this.namechef=namechef;
    }
    public String getName() {
        return name;
    }

    public Worker getNamechef() {
        return namechef;
    }

    public ArrayList<Worker> getListWorker() {
        return listWorker;
    }
    public void addWorker(Worker i){
        listWorker.add(i);
    }

    public String toString(){
        return this.toString();
    }

}
