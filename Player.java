package proiect;
import java.util.concurrent.locks.Lock;
import java.util.Random; 

public class Player extends Thread {
    private Lock SoccerGame;
    private String nume;
    // GET si SET
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }

    // Constructor
    public Player(Lock SoccerGame, String nume){
        this.setNume(nume);
        this.SoccerGame=SoccerGame;
        this.start();
    }

    public void run(){
    	
        try{
            System.out.println(getNume());
            SoccerGame.lock();
            System.out.println("\n");
            System.out.println(getNume() + " pune mingea pe punctul cu var pentru a executa. ");
            Thread.sleep(1500); // Timpul necesar executiei unei lovituri de departajare.
        } catch (InterruptedException e){
            System.err.println(e);
        }
        finally{
        	Random rand = new Random();
        	int x=rand.nextInt(2);
        	String a=" ";

        	if(x==1) a=" a marcat";
        	else if(x==0) a=" a ratat";
        	
        	System.out.println(getNume() +a+".\n");
        	SoccerGame.unlock();
        }
     
    }
}


