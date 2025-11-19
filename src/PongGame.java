import javax.swing.*;
import java.awt.*;

public class PongGame extends JPanel {
    static final int window_width = 640, window_height = 480;
    private Ball gameBall;
    private Paddle userPaddle, pcPaddle;

    public PongGame(){
        gameBall = new Ball(300, 200, 3, 3, 3, Color.YELLOW, 10);
        userPaddle = new Paddle(10, 200, 75, 3, Color.BLUE);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.RED);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, window_width, window_height);

        gameBall.paint(g);

        userPaddle.paint(g);
        pcPaddle.paint(g);
    }
    public void gameLogic(){
        gameBall.moveBall();
        gameBall.bounceOffEdges(0,window_height);

    }
}
