
public class Main {
    
    public static void main(String[] args) {
        System.out.println("start app...");
        Builder b = new Builder("products");

        var query = b
                .where("id", ">", "20")
                .where("colour", "=", "blue")
                .orderBy("id", "desc")             
                .toString();
  
            
        System.out.println("query :" + query);
    }



}

