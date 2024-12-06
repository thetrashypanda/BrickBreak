//
// Class author: Ari McIntosh
// Date created: 12.06.24
// General description: Represents the ball in the game. Deals with movement, collision, and rendering.
//

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x, y; // Ball position
    private int size; // Diameter of the ball
    private int xVelocity, yVelocity; // Ball movement velocity along X and Y axes

    // Constructor
    //
    // Pre-condition: x, y, and size are valid integers greater than or equal to 0.
    // Post-condition: A Ball object is created with the specified position and size. Initial velocities are set.
    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xVelocity = 1; // Initial velocity
        this.yVelocity = -2;
    }

    // Getters
    //
    // Pre-condition: None
    // Post-condition: Returns the current x-coordinate of the ball.
    public int getXpos() {
        return x;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the current y-coordinate of the ball.
    public int getYpos() {
        return y;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the size (diameter) of the ball.
    public int getSize() {
        return size;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the current horizontal velocity of the ball.
    public int getXVelocity() {
        return xVelocity;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the current vertical velocity of the ball.
    public int getYVelocity() {
        return yVelocity;
    }

    // Setters
    //
    // Pre-condition: x is a valid integer representing the new x-coordinate of the ball.
    // Post-condition: Updates the ball's x-coordinate.
    public void setX(int x) {
        this.x = x;
    }

    //
    // Pre-condition: y is a valid integer representing the new y-coordinate of the ball.
    // Post-condition: Updates the ball's y-coordinate.
    public void setY(int y) {
        this.y = y;
    }

    //
    // Pre-condition: xVelocity is a valid integer representing the new horizontal velocity.
    // Post-condition: Updates the ball's horizontal velocity.
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    //
    // Pre-condition: yVelocity is a valid integer representing the new vertical velocity.
    // Post-condition: Updates the ball's vertical velocity.
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    // Reverse direction
    //
    // Pre-condition: None
    // Post-condition: The ball's horizontal velocity is reversed.
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    //
    // Pre-condition: None
    // Post-condition: The ball's vertical velocity is reversed.
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Move the ball
    //
    // Pre-condition: None
    // Post-condition: Updates the ball's position based on its velocity.
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    // Draw the ball
    // Pre-condition: g is a valid Graphics object.
    // Post-condition: The ball is drawn on the screen as a red oval.
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}

