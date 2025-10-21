import java.util.*;
public class ContactList{
    public static Map<String, String> contactList = new HashMap<String, String>();

  
    // function to add contact
    public static void addContact(String name, String number){
        contactList.put(name,number);    
    }
    // function to view all contact
    public static void viewAll(){
        if(contactList.isEmpty()){
            System.out.println("the contact list is empty..");
        }
        else{
       for(Map.Entry<String, String> entry : contactList.entrySet()){
        System.out.println(entry.getKey() + ":" + entry.getValue());
       }
        }
    }
    // function to search for a specific contact
    public static String searchContact(String name){
        if(contactList.containsKey(name)){
        return name+ "'s number is: " + contactList.get(name);
        }
        else{
            return "Number not present";
        }
    }

    // function to update a specific contact
    public static void updateContact(String updateName, String updateNumber){
        if(contactList.containsKey(updateName)){
            contactList.put(updateName, updateNumber);
        }
        else{
            System.out.println("No name "+ updateName+" present in the contactList");
        }
    }

    // function to delete a contact
    public static void deleteContact(String name){
        contactList.remove(name);
    }

    public static void main(String[] args){
        addContact("Soniya","9823456723");
        addContact("Ram","9878672361");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name whose number you want: ");
        String name = sc.nextLine();
        System.out.println(name + "'s number is: " + searchContact(name));

        deleteContact("Soniya");
        viewAll();
    }
}
