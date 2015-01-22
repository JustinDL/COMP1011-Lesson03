package comp1011.lesson03;



/**
 *
 * @author Justin
 * Class description: creating a vehicle class to use as a
 * superclass for all oher vehicle subclasses
 * 
 */
public class Vehicle {
    private int numWheels = 4;
    private int numDoors = 2;
    private String colour = "";
    private String make ="";
    private String model ="";
    private String year ="";
    private float speed = 0;
    private final int MAX_SPEED = 40;
    
    // constructor
    
    public Vehicle(){
          
    }
    
    
        // getters and setters
    public int getNumwheels(){
        return this.numWheels;
    }
    public int getNumDoors(){
        return this.numDoors;
    }
    public String getColour(){
        return this.colour;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getYear(){
        return this.year;
    }
    public float getSpeed(){
        return this.speed;
    }
    public int getMAXSPEED(){
        return this.MAX_SPEED;
    }
    
    // public methods
    public void accelerate(){
        this.speed += 4;
        if(this.speed >= this.MAX_SPEED){
            this.speed = this.MAX_SPEED;
        }
    }
    public void decelerate(){
        this.speed -= 6;
        if (this.speed < 0){
            this.speed = 0;
        }
    }
    public void turnLeft(){
        System.out.println("you are turning left");
    }
    public void turnRight(){
        System.out.println("you are tuning right");
    }
    

}
