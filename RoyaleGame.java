import java.util.ArrayList;
abstract class Karakter{
    public String name;
    public int level;

    public Karakter(String name, int level){
        this.name = name;
        this.level = level;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}
interface walkable{
    void walk();
}
interface fliable{
    void fly();
}
interface speakable{
    void speak();
}
interface attackable{
    void attack();
}

class King extends Karakter implements speakable, attackable{
    public King(String name, int level){
        super(name, level);
    }
    public void speak(){
        System.out.println(name + " says: 'I am the ruler of this land!'");
    }
    public void attack(){
        System.out.println(name + " attacks with a royal sword!");
    }
}
class Worker extends Karakter implements walkable, speakable{
    public Worker(String name, int level){
        super(name, level);
    }
    public void walk(){
        System.out.println(name + " is walking to the construction site.");
    }
    public void speak(){
        System.out.println(name + " says: 'Building is my passion!'");
    }
}
class Knight extends Karakter implements walkable, speakable, attackable{
    public Knight(String name, int level){
        super(name, level);
    }
    public void walk(){
        System.out.println(name + " is marching to the battlefield.");
    }
    public void speak(){
        System.out.println(name + " says: 'For honor and glory!'");
    }
    public void attack(){
        System.out.println(name + " attacks with a lance!");
    }
}
class Dragon extends Karakter implements fliable, attackable{
    public Dragon(String name, int level){
        super(name, level);
    }
    public void fly(){
        System.out.println(name + " is soaring through the skies.");
    }
    public void attack(){
        System.out.println(name + " breathes fire!");
    }
}

class Test_Royale{
    public static void main(String[] args){
        ArrayList<Karakter> characters = new ArrayList<>();

        King king = new King("Arthur", 10);
        Worker worker = new Worker("Bob", 5);
        Knight knight = new Knight("Lancelot", 7);
        Dragon dragon = new Dragon("Smaug", 15);

        characters.add(king);
        characters.add(worker);
        characters.add(knight);
        characters.add(dragon);

        for(Karakter character : characters){
            character.displayInfo();
            if(character instanceof speakable){
                ((speakable) character).speak();
            }
            if(character instanceof walkable){
                ((walkable) character).walk();
            }
            if(character instanceof fliable){
                ((fliable) character).fly();
            }
            if(character instanceof attackable){
                ((attackable) character).attack();
            }
            System.out.println();
        } 
    }
}