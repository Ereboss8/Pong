import java.awt.*;

public class Paddle {

    private int height, x, y, speed;
    private int vel = 0;
    private Color color;

    static final int paddle_width = 15;

    public Paddle(int x, int y, int height, int speed, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
        this.color = color;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, paddle_width, height);
    }
    public void moveTowards(int moveToY) {
        int centerY = y + height / 2;

        if(Math.abs(centerY - moveToY) > speed) {
            if (centerY > moveToY) {
                y -= speed;
            }
            if (centerY < moveToY) {
                y += speed;
            }
        }
    }

    public void switchDirection(int dir) {
        vel = speed * dir;
    }
    public void stop() {
        vel = 0;
    }

}
