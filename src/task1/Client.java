package task1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner consoleInput = new Scanner(System.in)) {

            while (true) {
                System.out.println("Enter 3D object name, 'Q' to quit: ");
                String shapeType = consoleInput.nextLine();

                if ("Q".equalsIgnoreCase(shapeType)) {
                    output.println("Q");
                    break;
                }

                if ("Circle".equalsIgnoreCase(shapeType)) {
                    System.out.println("Enter radius : ");
                    String radius = consoleInput.nextLine();
                    output.println(shapeType);
                    output.println(radius);
                } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
                    System.out.println("Enter width : ");
                    String width = consoleInput.nextLine();
                    System.out.println("Enter height : ");
                    String height = consoleInput.nextLine();
                    output.println(shapeType);
                    output.println(width);
                    output.println(height);}
                else {
                    System.out.println("Unknown, try again.");
                    continue;
                }

                String serverResponse = input.readLine();
                System.out.println("Server message: " + serverResponse);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


