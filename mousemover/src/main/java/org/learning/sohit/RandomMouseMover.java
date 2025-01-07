package org.learning.sohit;

import java.awt.*;
import java.util.Random;

public class RandomMouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int) screenSize.getWidth();
            int screenHeight = (int) screenSize.getHeight();
            System.out.println("Moving mouse to random coordinates every 5 seconds...");
            while (true) {
                int x = random.nextInt(screenWidth);
                int y = random.nextInt(screenHeight);
                robot.mouseMove(x, y);
                System.out.printf("Moved mouse to: (%d, %d)%n", x, y);
                Thread.sleep(5000);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
