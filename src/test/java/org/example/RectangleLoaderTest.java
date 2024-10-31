package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleLoaderTest {
    @Test
    public void loadOK1() throws Exception {

        String s = "src/test/Resourses/ok1";
        List<Rectangle> actual = RectangleLoader.load(s);
        List<Rectangle> expected = new ArrayList<>();
        expected.add(new Rectangle(4, 3));
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void loadOK2() throws Exception {

        String s = "src/test/Resourses/ok2.txt";
        List<Rectangle> actual = RectangleLoader.load(s);
        List<Rectangle> expected = new ArrayList<>();
        expected.add(new Rectangle(4, 3));
        expected.add(new Rectangle(6, 9));
        expected.add(new Rectangle(17, 18));
        expected.add(new Rectangle(25, 25));
        Assertions.assertIterableEquals(expected, actual);


    }

    @Test
    public void loadOK3() throws Exception {

        String s = "src/test/Resourses/ok0.txt";
        List<Rectangle> actual = RectangleLoader.load(s);
        List<Rectangle> expected = new ArrayList<>();
        Assertions.assertIterableEquals(expected, actual);
    }
}