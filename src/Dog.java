
public class Dog extends Animal{
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    boolean shed=true;
    boolean barkALot=true;
    
    public Dog(String name, int age,double height,String gender, String breed,
            String eyeColour,String hobby, boolean shed, boolean barkALot){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.shed=shed;
       this.barkALot=barkALot;
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", shed? "+shed+", bark a lot? "+barkALot);
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("dog");
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
    
    public boolean getShed(){
        return(shed);
    }
    
    public boolean getBarkALot(){
        return(barkALot);
    }
}
