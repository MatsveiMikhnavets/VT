package main.tasks9to11.classes;

import java.util.ArrayList;

public class Basket {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.black));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.white));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.red));
        System.out.println("Size of basket : " + basket.getSize());
        System.out.println("Count of blue balls : " + basket.getCountByColor(Color.blue));
    }

    private ArrayList<Ball> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public boolean addBall(Ball ball) {
        basket.add(ball);
        return true;
    }

    public int getSize() {
        return basket.size();
    }

    public int getCountByColor(Color color) {
        int count = 0;
        for (int i = 0; i < basket.size(); i++) {
            if (color.equals(basket.get(i).getColor())) {
                count++;
            }
        }
        return count;
    }
}
