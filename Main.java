package proiect;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String []args){
        Lock SoccerGame = new ReentrantLock(); // In cazul unui jucator ce va executa inca o data.

        // Lista cu cei ce vor executa loviturile de departajare
    	System.out.println("Pe lista pentru exectuarea loviturilor de departajare sunt: \n");
        new Player(SoccerGame,"Mbappe Coman(10)");
        new Player(SoccerGame,"Kai Havertz(8)");
        new Player(SoccerGame,"David Luiz(4)");
        new Player(SoccerGame,"Marco Reus(11)");
        new Player(SoccerGame,"Cristiano Ronaldo(7)");
    }
}
