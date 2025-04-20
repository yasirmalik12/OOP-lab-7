class Animal{
    
   int age ;
   String name;
   Animal(String name,int age ){
       
       this.age= age;
       this.name= name;

          }
    }

class  Dog extends Animal{
    
   Dog (String name,int age){
       
       super(name,age);
       
       } 
}

class  Cat extends Animal{
    
  Cat(String name,int age){
       
       super(name,age);
           
    } 
}
    
public class Main {
  public static void main(String[] args) {

        Animal a1= new  Dog("Russion",9);
         Animal a2= new  Cat (" persion",13);
         
         
         System.out.println(a1.age);
         System.out.println(a1.name);
         
         System.out.println(a2.age);
         System.out.println(a2.name);
    }
    
}