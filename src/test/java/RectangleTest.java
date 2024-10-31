import org.example.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    public void testConstructorOk() {
        Assertions.assertDoesNotThrow(() -> new Rectangle(4, 3));

    }

    @Test
    public void testConstructorBad1() {
        Assertions.assertThrows(Exception.class, () -> new Rectangle(-4, 3));
        Assertions.assertThrows(Exception.class, () -> new Rectangle(-4, -3));
        Assertions.assertThrows(Exception.class, () -> new Rectangle(4, -3));

    }

    @Test
    public void testConstructorBad2() {
        Assertions.assertThrows(Exception.class, () -> new Rectangle(0, 3));
        Assertions.assertThrows(Exception.class, () -> new Rectangle(0, -3));
        Assertions.assertThrows(Exception.class, () -> new Rectangle(4, 0));

    }

    @Test
    void testPerimeter1() throws Exception {
        Rectangle r = new Rectangle(4, 3);
        Assertions.assertEquals(14, r.perimeterRectangle());
    }

    @Test
    void testPerimeter2() throws Exception {
        Rectangle r = new Rectangle(100, 100);
        Assertions.assertEquals(400, r.perimeterRectangle());
    }


    @Test
    void testArea1() throws Exception {
        Rectangle r = new Rectangle(100, 100);
        Assertions.assertEquals(400, r.perimeterRectangle());
    }
    @Test
    void testArea2() throws Exception {
        Rectangle r = new Rectangle(4, 3);
        Assertions.assertEquals(14, r.perimeterRectangle());
    }

    @Test
    void testEqualsYes() throws Exception {
        Rectangle r1 = new Rectangle(4, 3);
        Rectangle r2 = new Rectangle(4, 3);
        Rectangle r3 = new Rectangle(3, 4);
        Assertions.assertTrue(r1.equals(r2));
        Assertions.assertTrue(r2.equals(r1));
        Assertions.assertTrue(r1.equals(r3));
        Assertions.assertTrue(r3.equals(r2));

    }

}