import java.util.Scanner;

public class StudentManagmentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maxStudents = 100; 

        int[] id = new int[maxStudents];
        String[] name = new String[maxStudents];
        String[] surname = new String[maxStudents];
        double[] grade = new double[maxStudents];

        int count = 0;
        int option = 0;

        while (option != 5) {

        System.out.println("\n===== SISTEMI I STUDENTËVE =====");
        System.out.println("1. Shto Student ");
        System.out.println("2. Shfaq të gjithë studentët ");
        System.out.println("3. Kërko student sipas ID ");
        System.out.println("4. Fshij student");
        System.out.println("5. Dalje ");
        System.out.print("Zgjidh opsionin: ");
        option = input.nextInt();
        
        switch (option) {

            case 1:
                if (count >= maxStudents) {
                    System.out.println("Nuk mund të shtohen më studentë.");
                } else {
                System.out.print("ID: ");
                id[count] = input.nextInt();
                input.nextLine();
                
                System.out.print("Emri: ");
                name[count] = input.nextLine();
                
                System.out.print("Mbiemri: ");
                surname[count] = input.nextLine();
                
                System.out.print("Nota: ");
                grade[count] = input.nextDouble();
                
                count++;
                System.out.println("Studenti u shtua me sukses.");
                }

            case 2:
                if (count == 0) {
                    System.out.println("Nuk ka studentë për të shfaqur.");
                } else {
                
                    for (int i = 0; i < count; i++) {
                    System.out.println("ID: " + id[i] + 
                                       ", Emri: " + name[i] + 
                                       ", Mbiemri: " + surname[i] + 
                                       ", Nota: " + grade[i]);
                    }
                }

            case 3:
                System.out.print("Shkruaj ID-në e studentit: ");
                int searchId = input.nextInt();
                boolean found = false;
            
                for (int i = 0; i < count; i++) {
                    if (id[i] == searchId) {
                        System.out.println("ID: " + id[i] + 
                                       ", | Emri: " + name[i] + 
                                       ", | Mbiemri: " + surname[i] + 
                                       ", | Nota: " + grade[i]);
                        found = true;
                    break;
                    }
                }
            
                if (!found) {
                    System.out.println("Studenti nuk u gjet.");
                }

            case 4:
                System.out.print("Shkruaj ID-në e studentit për fshirje: ");
                int deleteId = input.nextInt();
                boolean deleted = false;
            
                for (int i = 0; i < count; i++) {
                    if (id[i] == deleteId) {
                        for (int j = i; j < count - 1; j++) {
                            id[j] = id[j + 1];
                            name[j] = name[j + 1];
                            surname[j] = surname[j + 1];
                            grade[j] = grade[j + 1];
                     }
                        count--;
                        deleted = true;
                        System.out.println("Studenti me ID-në u fshi me sukses.");
                        break;
                    }
                }
            
                if (!deleted) {
                    System.out.println("Studenti me ID-në  nuk u gjet.");
                }
            case 5:
                System.out.println("Faleminderit qe përdorët sistemin!");
                break;
            
            default:
                System.out.println("Opsion i pavlefshëm.");
            }
        }
        input.close();
    }    
}