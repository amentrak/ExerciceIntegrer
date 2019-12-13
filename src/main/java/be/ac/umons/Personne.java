package be.ac.umons;
import java.util.Observer;
public abstract class Personne implements Observer{
    private int id;
    private String name;
    public Personne(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
}
