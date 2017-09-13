
public abstract class Animal {
    public static void main(String[]args){
        System.out.println("hello world");
    }
    
    public String eyeColour="";
    
    abstract String getName();
    abstract String getType();
    abstract String getBreed();
    abstract String getEyeColour();
    abstract String getHobby();
    
    String name;
    int age=0;
    double height=0;
    String gender;
    
    public Animal(String name, int age, double height, String gender){
        this.name=name;
        this.age=age;
        this.height=height;
        this.gender=gender;
    }
    
}
