package be.ac.umons;

import java.util.Observable;
import java.util.Observer;

public class Manager extends Personne {
    private String Name;
    private int id;
    private String password;

    public Manager(String Name, int id, String password) {
        super(Name, id);
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Tache) {
            if (o == "Tache.setName") {
                System.out.println("Tache.setName : " + ((Tache) observable).getName());
            }
            if (o == "Tache.setListRessource") {
                System.out.println("Tache.setListRessource : " + ((Tache) observable).getListRessources());
            }
            if (o == "Tache.setListSkill") {
                System.out.println("Task.setListSkill : " + ((Tache) observable).getListSkill());
            }
        }
    }

    public String toString(){
        return this.toString();
    }
}
