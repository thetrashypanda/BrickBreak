//
// Class author: Ari McIntosh
// Date created: 12.06.24
// General description: Represents the paddle controlled by the player. Handles movement and rendering.
//

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
    private int x, y; // Paddle position
    private int width, height; // Paddle dimensions
    private int velocity; // Current velocity of the paddle (positive = right, negative = left)

    // Constructor
    //
    // Pre-condition: x, y, width, and height are valid integers greater than or equal to 0.
    // Post-condition: A Paddle object is created with the specified position and size. Initial velocity is set to 0.
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0; // Initial velocity
    }

    // Getters
    //
    // Pre-condition: None
    // Post-condition: Returns the current x-coordinate of the paddle.
    public int getX() {
        return x;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the current y-coordinate of the paddle.
    public int getY() {
        return y;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the width of the paddle.
    public int getWidth() {
        return width;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the height of the paddle.
    public int getHeight() {
        return height;
    }

    //
    // Pre-condition: None
    // Post-condition: Returns the current velocity of the paddle.
    public int getVelocity() {
        return velocity;
    }

    // Setters
    //
    // Pre-condition: x is a valid integer representing the new x-coordinate of the paddle.
    // Post-condition: Updates the paddle's x-coordinate.
    public void setX(int x) {
        this.x = x;
    }

    //
    // Pre-condition: velocity is a valid integer representing the new velocity.
    // Post-condition: Updates the paddle's velocity.
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    // Add to the current velocity
    //
    // Pre-condition: delta is a valid integer representing the change in velocity.
    // Post-condition: Updates the paddle's velocity by the given delta.
    public void addVelocity(int delta) {
        this.velocity += delta;
    }

    // Move the paddle
    //
    // Pre-condition: None
    // Post-condition: Updates the paddle's position based on its velocity. Ensures it stays within the game window.
    public void move() {
        x += velocity;

        // Prevent paddle from going out of bounds
        if (x < 0) {
            x = 0;
        }
        if (x + width > 682) { // 682 is the game window width
            x = 682 - width;
        }
    }

    // Draw the paddle
    //
    // Pre-condition: g is a valid Graphics object.
    // Post-condition: The paddle is drawn on the screen as a blue rectangle.
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}
