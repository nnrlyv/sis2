package task2_0;

class Question {
    private int num1;
    private int num2;
    private int correctAnswer;

    public Question(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.correctAnswer = num1 + num2;
    }
    //polymorphism
    public void askQuestion() {
        System.out.println(num1 + " + " + num2 + " = ?");
    }

    public boolean checkAnswer(int playerAns) {
        return playerAns == correctAnswer;
    }
}
