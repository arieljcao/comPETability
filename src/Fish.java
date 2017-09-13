
public class Fish extends Animal{
    int age=0;
    double height=0;
    String gender;
    String breed;
    String eyeColour;
    String hobby;
    String bodyColour;
    boolean isTropical=false;
    
    
    public Fish(String name, int age,double height,String gender, String breed,
            String eyeColour,String hobby, String bodyColour, boolean isTropical){
       super(name,age,height,gender); 
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;
       this.breed=breed;
       this.eyeColour=eyeColour;
       this.hobby=hobby;
       this.bodyColour=bodyColour;
       this.isTropical=isTropical; 
    }
    
    public String toString(){
        return(name+": age "+age+", "+height+"cm tall, "+gender+", "+breed+", "+
                eyeColour+" eyes, hobby - "+hobby+", body colour? "+bodyColour+
                ", tropical fish? "+isTropical);
    }
    
    public String getName(){
        return(name);
    }
    
    public String getType(){
        return("fish");
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
    
    public String getBodyColour(){
        return(bodyColour);
    }
    
    public boolean isTropical(){
        return(isTropical);
    }
}