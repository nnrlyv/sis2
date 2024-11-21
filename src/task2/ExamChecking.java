package task2;

import java.util.Date;

public class ExamChecking extends Thread {
    private static int examSheets = 500;
    public int maxIter;

    public ExamChecking(int maxIterations) {
        this.maxIter = maxIterations;
    }

    private void checkSheets() {
        if (examSheets <= 0) {
            System.out.println("There is no any exam sheet left. bla bla bla...");
            System.exit(0);
        }
        examSheets -= 50;
        System.out.println(getName() + " finished checking, at: " + new Date() + ", exam sheet count is now " + examSheets);
    }

    @Override
    public void run() {
        for (int i = 0; i < maxIter; i++) {
            synchronized (ExamChecking.class) {
                checkSheets();
            }
        }
    }
}
