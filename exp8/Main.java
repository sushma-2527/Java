import java.util.Scanner;
import files.UserFileHandler;  // Import the UserFileHandler class from the files package

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("File Handler");
        System.out.println("************");
        System.out.println("Enter the file path:");
        String file_path = input.nextLine();  // Use nextLine() to support spaces in file path

        // Create UserFileHandler instance and display file details
        UserFileHandler handler = new UserFileHandler(file_path);
        handler.fileDetails();
    }
}
