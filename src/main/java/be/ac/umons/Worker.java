package be.ac.umons;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
public class Worker extends Personne {
    public int id;
    public String Name;
    private ArrayList<Skill> listSkill = new ArrayList<>();
    private ArrayList<Tache> taches = new ArrayList<>();

    public Worker(String name, int id, ArrayList<Skill> listSkill) {
        super(name, id);
        this.listSkill =listSkill;
    }

    public String getName() {
        return Name;
    }

    public int getId(){ return id; }

    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }

    public ArrayList<Tache> getTaches() {
        return taches;
    }

    public void addTache (Tache i){
        taches.add(i);
    }

    public void addSkill(Skill i){
        listSkill.add(i);
    }

    @Override
    public void update(Observable observable, Object o) {

    }

    public String toString(){
        return this.toString();
    }
}
