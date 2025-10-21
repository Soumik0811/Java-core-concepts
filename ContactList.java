import java.util.*;

public class SampleHashMap {
    public static Map<String, String> contactList = new HashMap<>();

    public static void addContact(String name, String number) {
        contactList.put(name, number);
        System.out.println("Contact added successfully!");
    }

    public static void viewAll() {
        if (contactList.isEmpty()) {
            System.out.println("The contact list is empty.");
        } else {
            System.out.println("\n Contact List:");
            for (Map.Entry<String, String> entry : contactList.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static String searchContact(String name) {
        if (contactList.containsKey(name)) {
            return name + "'s number is: " + contactList.get(name);
        } else {
            return "Number not present for " + name;
        }
    }

    public static void updateContact(String updateName, String updateNumber) {
        if (contactList.containsKey(updateName)) {
            contactList.put(updateName, updateNumber);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("No contact named '" + updateName + "' found.");
        }
    }

    public static void deleteContact(String name) {
        if (contactList.containsKey(name)) {
            contactList.remove(name);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("No contact named '" + name + "' found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Contact List Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    addContact(name, number);
                    break;

                case 2:
                    viewAll();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    System.out.println(searchContact(searchName));
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String delName = sc.nextLine();
                    deleteContact(delName);
                    break;

                case 5:
                    System.out.print("Enter name to update: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter new phone number: ");
                    String updateNumber = sc.nextLine();
                    updateContact(updateName, updateNumber);
                    break;

                case 6:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
