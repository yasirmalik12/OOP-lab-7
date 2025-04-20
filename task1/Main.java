class Main {
    public static void main (String [] args){
        SMS s= new SMS ("hi how are you ", "03048664006");
    s.display();
    Email e =new Email("hi how are you", "abc", "xyz", "34534");
            
            e.display();
    }
    
} 
class message {

    String text;
    
    message(String text){
     this.text = text;
    }
    void display() {
        
    System.out.println(text);
    }
    void setMessage (String text){
    this.text=text;
    }
 }
class SMS extends message{
    String rec_contact;
    
    SMS(String text , String rec_contact) {
    super(text);
    this.rec_contact=rec_contact;
    }
    
    void display(){
    System.out.println(super.text);
     System.out.println(this.rec_contact);
    }
}

class Email extends message {
    
    String Sender;
    String Receiver;
    String subject;
    
    Email(String text, String Sender, String Recevier, String subject){
     super(text);
     this.Sender=Sender;
    this.Receiver=Receiver;
    this.subject=subject;
}
void display(){
System.out.println(super.text);
     System.out.println(this.Sender);
System.out.println(this.Receiver);
     System.out.println(this.subject);
}
}