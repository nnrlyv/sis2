package task2_0;

import java.util.Scanner;

class Player {
    private int position; // incap hide details from changing and можно сделать их доступными через гет и сет

    public Player() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void moveRight() {
        position++;
    }

    public void moveLeft() {
        position--;
    }

    public int getAnswer() {
        Scanner scanner = new Scanner(System.in);
        int playerAns = 0;

        try {
            System.out.println("Write your answer:");
            playerAns = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("wrongg.. ");
            playerAns = -1;
        }
        return playerAns;
    }
}
