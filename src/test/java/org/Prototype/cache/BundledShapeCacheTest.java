package org.Prototype.cache;

import org.Prototype.shapes.Rectangle;
import org.Prototype.shapes.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BundledShapeCacheTest {

    private BundledShapeCache cache;

    @BeforeEach
    void setUp() {
        cache = new BundledShapeCache();
    }

    @Test
    void testGetClone() {
        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Big green circle");

        assertNotSame(shape1, shape2, "Cloned objects should be different instances.");
        assertEquals(shape1, shape2, "Cloned objects should be equal.");
    }

    @Test
    void testPutAndGet() {
        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 15;
        rectangle.width = 20;
        rectangle.height = 25;
        rectangle.color = "Red";

        cache.put("Large red rectangle", rectangle);
        Shape retrievedShape = cache.get("Large red rectangle");

        assertNotSame(rectangle, retrievedShape, "Retrieved shape should be a different instance.");
        assertEquals(rectangle, retrievedShape, "Retrieved shape should be equal to the original.");
    }

    @Test
    void testDifferentObjects() {
        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");

        assertNotEquals(shape1, shape2, "Different shapes should not be equal.");
    }
}
