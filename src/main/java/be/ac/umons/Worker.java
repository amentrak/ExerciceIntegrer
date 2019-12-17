package be.ac.umons;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
public class Worker extends Personne {
    public int id;
    public String Name;
    private ArrayList<Skill> listSkill;

    public Worker(String name, int id) {
        super(name, id);
    }

    public String getName() {
        return Name;
    }
    public int getId(){ return id; }
    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }
    public void addSkill(Skill i){
        listSkill.add(i);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
