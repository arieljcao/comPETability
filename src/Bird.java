
public class Bird extends Animal{
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    int wingSpan;
    String colour;
    
    public Bird(String name, int age,double height,String gender, String breed,
            String eyeColour,String hobby, int wingSpan, String colour){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.wingSpan=wingSpan;
       this.colour=colour;
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", wing span? "+wingSpan+
                ", colour? "+colour);
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("bird");
    }
    
    public String getBreed(){
        return(breed);
    }
    
    public String getEyeColour(){
        return(eyeColour);
    }
    
    public String getHobby(){
        return(hobby);
    }
    
    public int getWingSpan() {
        return(wingSpan);
    }
    
    public String getColour(){
        return(colour);
    }
}
