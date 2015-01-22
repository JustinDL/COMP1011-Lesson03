package comp1011.lesson03;



/**
 *
 * @author Justin
 * Class description: creating a vehicle class to use as a
 * superclass for all oher vehicle subclasses
 * 
 */
public class Vehicle {
    protected int numWheels = 4;
    protected int numDoors = 2;
    protected String colour = "";
    protected String make ="";
    protected String model ="";
    protected String year ="";
    protected float speed = 0;
    protected final int MAX_SPEED = 40;
    
    // constructor
    
    public Vehicle(int wheels, int doors, String colour, String make, String model, String year){
          this.numWheels = wheels;
          this.numDoors = doors;
          this.colour = colour;
          this.make = make;
          this.model = model;
          this.year = year;
                  
    }
        public Vehicle(String colour, String make, String model, String year){
          this.colour = colour;
          this.make = make;
          this.model = model;
          this.year = year;
                  
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
