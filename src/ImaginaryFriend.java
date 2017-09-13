
public class ImaginaryFriend extends Animal{
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    double weight;
    boolean skinColour; 
    boolean isHuman= true;
    int numLegs=0; 
    
    public ImaginaryFriend(String name, int age,double height,String gender, 
            String breed,String eyeColour,String hobby, boolean skinColour, 
            boolean isHuman, int numLegs, double weight){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.weight=weight;
       this.skinColour=skinColour;
       this.isHuman=isHuman;
       this.numLegs=numLegs;
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", skin colour? "+skinColour+
                ", is a human? "+isHuman+", # legs? "+numLegs+", weight? "+weight+"kg");
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("imaginary friend");
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
    
    public double getWeight(){
        return(weight);
    }
    
    public boolean getSkinColour(){
        return(skinColour);
    }
    
    public int getNumLegs(){
        return(numLegs);
    }
    
    public boolean getIsHuman(){
        return(isHuman);
    }
}
