package be.ac.umons;

import java.util.ArrayList;
import java.util.Observable;
public class Tache extends Observable {
    private String name;
    private String description;
    ArrayList<Ressources> listRessources;
    ArrayList<Team> listTeam;
    ArrayList<Skill> listSkill;
    private AgendaEntry durée;
    public Tache(String name,String desciption, AgendaEntry durée){
        this.name =name;
        this.description=desciption;
        this.durée=durée;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Ressources> getListRessources() {
        return listRessources;
    }

    public ArrayList<Team> getListTeam() {
        return listTeam;
    }

    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }

    public AgendaEntry getDurée() {
        return durée;
    }

    public void addRessources(Ressources i){
        listRessources.add(i);
    }
    public void addSkills(Skill i){
        listSkill.add(i);
    }

    public String toString(){
        return this.toString();
    }

}
