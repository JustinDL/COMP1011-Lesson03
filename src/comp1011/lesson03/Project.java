

package comp1011.lesson03;

/**
 *
 * @author Justin
 * Program description for comp1011 lesson 3
 */
public class Project {

    /**
     * Main method for the project
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle myHonda = new Vehicle(4, 4, "red", "honda", "civic", "2015" );
        Truck myFord = new Truck(6, 3, "white", "Ford", "FX", "2008");
        for (int i=0;i<5;i++){
            myHonda.accelerate();
            myFord.accelerate();
        }
        System.out.println("Vehicle Speed: " + myHonda.getSpeed());
        System.out.println("Truck Speed: " + myFord.getSpeed());
    }
    
}
