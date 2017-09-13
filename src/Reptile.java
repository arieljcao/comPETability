
public class Reptile extends Animal{
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    int legs;
    boolean killed=true;
    boolean dragon=false;
    
    public Reptile(String name, int age,double height,String gender, String breed,
            String eyeColour,String hobby, int legs, boolean killed, boolean dragon){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.legs=legs;
       this.killed=killed;
       this.dragon=dragon;
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", # legs? "+legs+
                ", killed people? "+killed+", is a dragon? "+dragon);
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("reptile");
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
    
    public int getLegs(){
        return(legs);
    }
    
    public boolean getKilled(){
        return(killed);
    }
    
    public boolean getDragon(){
        return(dragon);
    }
}
