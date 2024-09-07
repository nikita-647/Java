package learnJava.interfaces;

 interface  Member {
    public void callback();
} 
class Store {
    Member members[] = new Member[10];
    int count = 0;

    public void register(Member m){
    members[count++] = m;
    }

    public void inviteSale(){
        for(int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}
    
class Customer implements Member {
    String name;

    public Customer(String n) {
        name = n;
    }

    public void callback(){
        System.out.println("OK, I will visit," + name);
    }
}

public class StudentQues1 {
    public static void main(String[] args) {
        
        Store Dukaan = new Store();
        Customer rahul = new Customer("Rahul");
        Customer vishal = new Customer("vishal");
        Customer mohit = new Customer("mohit");
        Dukaan.register(rahul);
        Dukaan.register(mohit);
        Dukaan.inviteSale();

    }
}
