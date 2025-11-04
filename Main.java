import java.util.HashMap;
import java.util.Map;

public class Main {

    static private Map<String, String> users;

    static String name1 = "person01";
    static String name2 = "person02";
    static String name1Role = "ADMIN";
    static String name2Role = "USER";

    public static void main(String[] args) {

    users = new HashMap<>();

    users.put("person01", "ADMIN") ;
    users.put("person02", "USER") ;


    System.out.println(adminAccess(name1));
    System.out.println(adminAccess(name2));
    System.out.println(userAccess(name1));
    System.out.println(userAccess(name2));


    }

    public static String adminAccess(String name) {

    
        String message = "";
        if (users.get(name) != null && users.get(name).equals("ADMIN")) {

            message = "Successfully logged in.";

        }

        else {
            message = "Either username is not registered or you are not authorized access to Admin.";
        }

        

        return message;

        }

    public static String userAccess(String name) {

    
        String message = "";
        if (users.get(name) != null && users.get(name).equals("USER")) {
    
            message = "Successfully logged in.";
    
        }
    
        else {
            message = "Either username is not registered or you are not authorized access to Admin.";
            }
    
            
    
        return message;
    
            }

    }
        


    

            
    




    