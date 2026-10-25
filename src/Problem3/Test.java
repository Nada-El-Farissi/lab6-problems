package Problem3;
import java.util.Scanner;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of documents in the library: ");
        int n=scan.nextInt();
        Library lib=new Library(n);
        lib.add(new Book("Le petit prince","umm",129));
        lib.add(new Magazine("M12","June",2004));
        System.out.println("Choose an option: ");
        System.out.println("1: add document");
        System.out.println("2: display");
        System.out.println("3: delete document");
        System.out.println("4: check document");
        int m=scan.nextInt();
        switch(m){
            case 1:
                System.out.println("Choose document type:");
                System.out.println("1: Book");
                System.out.println("2: Magazine");
                System.out.println("3: Dictionary");
                int type = scan.nextInt();
                scan.nextLine();
                switch (type) {
                    case 1:
                        System.out.println("Enter title:");
                        String title = scan.nextLine();
                        System.out.println("Enter author:");
                        String author = scan.nextLine();
                        System.out.println("Enter number of pages:");
                        int pages = scan.nextInt();
                        Book book = new Book(title, author, pages);
                        lib.add(book);
                        System.out.println("Book added");
                        break;
                    case 2:
                        System.out.println("Enter title:");
                        String magazineTitle = scan.nextLine();
                        System.out.println("Enter month:");
                        String month = scan.nextLine();
                        System.out.println("Enter year:");
                        int year = scan.nextInt();
                        Magazine magazine= new Magazine(magazineTitle,month, year);
                        lib.add(magazine);
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 2:
                lib.displayDocuments();
                break;
            case 3: {
                System.out.println("Enter document record number to delete:");
                int num = scan.nextInt();
                Document doc = lib.document(num);
                lib.delete(doc);
                break;
            }
            case 4: {
                System.out.println("Enter document record number to check:");
                int num = scan.nextInt();
                Document doc = lib.document(num);
                System.out.println(doc);
                }
                break;
            default:
                System.out.println("not valid option");
            }

        }




    }

