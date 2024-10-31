package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleLoader {

    public static List<Rectangle> load (String fname) throws FileNotFoundException {
        List<Rectangle> rectangles = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(fname))) {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] mas = s.split(" ");
                double x = Double.parseDouble(mas[0]);
                double y = Double.parseDouble(mas[1]);
                Rectangle r = new Rectangle(x, y);
                rectangles.add(r);
            }
        } catch (Exception e) {
            System.out.println("ошибка");
        }
        return rectangles;
    }
}

