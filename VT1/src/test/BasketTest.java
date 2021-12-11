package test;

import org.junit.Before;
import org.junit.Test;
import main.tasks9to11.classes.Ball;
import main.tasks9to11.classes.Basket;
import main.tasks9to11.classes.Color;


public class BasketTest {
    private Basket basket;

    @Test
    @Before
    public void addBall() {
        basket = new Basket();
        basket.addBall(new Ball(Color.black));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.white));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.blue));
        basket.addBall(new Ball(Color.red));
    }

    @Test
    public void getSize() {
        System.out.println("Size of basket : " + basket.getSize());
    }

    @Test
    public void getCountByColor() {
        System.out.println("Count of blue balls : " + basket.getCountByColor(Color.blue));
    }
}