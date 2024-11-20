package task1;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for a client connection...");

            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true)) {

                System.out.println("Client connected.");

                String shapeType;
                while ((shapeType = input.readLine()) != null) {

                    if ("Q".equalsIgnoreCase(shapeType)) {
                        System.out.println("Client requested Q. Shutting down server.");
                        break;
                    }

                    if ("Circle".equalsIgnoreCase(shapeType)) {
                        String radiusStr = input.readLine();
                        double radius = Double.parseDouble(radiusStr);
                        double area = Math.PI * radius * radius;

                        String response = "Answer is " + area;
                        System.out.println("1 client connected and requested the area of a Circle with params " + radius + ". " + response);
                        output.println(response);}
                    else if ("Rectangle".equalsIgnoreCase(shapeType)) {
                        String widthStr = input.readLine();
                        double width = Double.parseDouble(widthStr);
                        String heightStr = input.readLine();
                        double height = Double.parseDouble(heightStr);
                        double area = width * height;

                        String response ="Answer is "+ area;
                        System.out.println("1 client connected and requested the area of a Rectangle with params " + width + "x" + height + ". " + response);
                        output.println(response);
                    } else {
                        output.println("Unknown shape.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


