
public class Cat extends Animal{
    String name;
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    
    String coatColour;
    String coatPattern;
    
    
    public Cat(String name, int age, double height, String gender, 
            String breed, String eyeColour, String hobby, String coatColour, 
            String coatPattern){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.coatColour=coatColour;
       this.coatPattern = coatPattern;
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", coat colour? "+coatColour+
                ", coat pattern? "+coatPattern);
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("cat");
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
    
    public String getCoatColour(){
        return(coatColour);
    }
    
    public String getCoatPattern(){
        return(coatPattern);
    }
    
}
    









