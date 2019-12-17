package be.ac.umons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int nworker = 20;
        Worker[] tabworker = new Worker[nworker];
        for (int i = 0; i < nworker; i++) {
            tabworker[i] = new Worker("Worker", 1);
        }
        System.out.println(tabworker[1].getName());

        int nteam = 5;
        Team[] tabteam = new Team[nteam];
        for (int i = 0; i < nteam; i++) {
            tabteam[i] = new Team("Team"+i, tabworker[i]);
        }

        Manager Manager1 = new Manager("Manager1", 1,"1234");
        System.out.println(Manager1.getName());
    }
}
