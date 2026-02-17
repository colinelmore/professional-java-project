// package com.professional.frontend;

// import com.professional.business.BusinessLogic;
// import com.professional.models.Entity;

// import java.util.Scanner;

// public class ConsoleApp {
//     private BusinessLogic businessLogic;
//     private Scanner scanner;

//     public ConsoleApp() {
//         this.businessLogic = new BusinessLogic();
//         this.scanner = new Scanner(System.in);
//     }

//     public void start() {
//         int choice;
//         do {
//             System.out.println("1. Add Entity");
//             System.out.println("2. Get Entity");
//             System.out.println("3. Update Entity");
//             System.out.println("4. Delete Entity");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();
//             scanner.nextLine(); // Consume newline

//             switch (choice) {
//                 case 1:
//                     addEntity();
//                     break;
//                 case 2:
//                     getEntity();
//                     break;
//                 case 3:
//                     updateEntity();
//                     break;
//                 case 4:
//                     deleteEntity();
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         } while (choice != 5);
//     }

//     private void addEntity() {
//         System.out.print("Enter entity name: ");
//         String name = scanner.nextLine();
//         System.out.print("Enter entity description: ");
//         String description = scanner.nextLine();
//         Entity entity = new Entity(name, description);
//         businessLogic.createEntity(entity);
//         System.out.println("Entity added successfully.");
//     }

//     private void getEntity() {
//         System.out.print("Enter entity ID: ");
//         int id = scanner.nextInt();
//         Entity entity = businessLogic.readEntity(id);
//         if (entity != null) {
//             System.out.println("Entity found: " + entity);
//         } else {
//             System.out.println("Entity not found.");
//         }
//     }

//     private void updateEntity() {
//         System.out.print("Enter entity ID to update: ");
//         int id = scanner.nextInt();
//         scanner.nextLine(); // Consume newline
//         System.out.print("Enter new entity name: ");
//         String name = scanner.nextLine();
//         System.out.print("Enter new entity description: ");
//         String description = scanner.nextLine();
//         Entity entity = new Entity(id, name, description);
//         businessLogic.updateEntity(entity);
//         System.out.println("Entity updated successfully.");
//     }

//     private void deleteEntity() {
//         System.out.print("Enter entity ID to delete: ");
//         int id = scanner.nextInt();
//         businessLogic.deleteEntity(id);
//         System.out.println("Entity deleted successfully.");
//     }

//     public static void main(String[] args) {
//         ConsoleApp app = new ConsoleApp();
//         app.start();
//     }
// }