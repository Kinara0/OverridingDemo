public class OverridingDemo {
    public static void main(String[] args) {
Animal A = new cat();//loosely coupled
        //typecast syntax (cat)A.sleep(); here it will not work
A.zombie(2);
A.zombie();// same method name different flavours overloading
        // Overloading is compile time Polymorphism
        A.speak();//override from child class
        // method always override from child class
        //Overriding is Run time Polymorphism
    }
}

class Animal{
    public void speak(){
        System.out.println("Animal sound");
    }
    public void zombie(){
        System.out.println("Be Zombie");
    }
    public void zombie(int a){
        System.out.println("Overloading");
    }
}

class cat extends Animal{
    @Override
    public void speak(){

        System.out.println("Mews");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class Z extends cat{
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}