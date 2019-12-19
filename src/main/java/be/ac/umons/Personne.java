package be.ac.umons;
import java.util.Observer;
public abstract class Personne implements Observer{
    private int id;
    private String Name;
    public Personne(String Name, int id){
        this.Name=Name;
        this.id=id;
    }
    public String getName() {
        return Name;
    }
    public int getId(){ return id; }

    public String toString(){
        return this.toString();
    }
}
