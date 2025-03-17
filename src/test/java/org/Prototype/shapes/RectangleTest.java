package org.Prototype.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testClone() {
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 20;
        rect1.x = 5;
        rect1.y = 10;
        rect1.color = "blue";

        Rectangle rect2 = (Rectangle) rect1.clone();

        assertNotSame(rect1, rect2, "The cloned object should be a different instance.");
        assertEquals(rect1, rect2, "The cloned object should be equal to the original.");
    }

    @Test
    void testEquals() {
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 20;
        rect1.x = 5;
        rect1.y = 10;
        rect1.color = "blue";

        Rectangle rect2 = new Rectangle();
        rect2.width = 10;
        rect2.height = 20;
        rect2.x = 5;
        rect2.y = 10;
        rect2.color = "blue";

        assertEquals(rect1, rect2, "Two rectangles with the same properties should be equal.");
    }

    @Test
    void testNotEquals() {
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 20;
        rect1.color = "blue";

        Rectangle rect2 = new Rectangle();
        rect2.width = 15;
        rect2.height = 25;
        rect2.color = "red";

        assertNotEquals(rect1, rect2, "Rectangles with different properties should not be equal.");
    }
}

