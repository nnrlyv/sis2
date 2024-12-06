package task2_0;

import java.util.Random;
import java.util.Scanner;

class Game {
    private Player player;
    private Random random;

    public Game() {
        this.player = new Player();
        this.random = new Random();
    }

    public void start() {
        System.out.println("If u answered right (move right +1), if not (move left -1)");

        while (player.getPosition() > -3 && player.getPosition() < 3) {
            Question question = new Question(random.nextInt(10), random.nextInt(10));
            question.askQuestion();
            int playerAns = player.getAnswer();

            if (question.checkAnswer(playerAns)) {
                player.moveRight();
                System.out.println("RIGHT MOVE");
            } else {
                player.moveLeft();
                System.out.println("LEFT MOVE");
            }
            System.out.println("Now you are at position " + player.getPosition());
        }

        if (player.getPosition() == 3) {
            System.out.println("YOU WIN!!");
        } else {
            System.out.println("UNLUCKY... YOU LOST");
        }
    }
}
