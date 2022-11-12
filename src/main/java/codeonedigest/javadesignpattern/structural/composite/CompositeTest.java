package codeonedigest.javadesignpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {

    public static void main(String args[]) {
        List<IUserInterface> list = new ArrayList<>();

        IUserInterface cirle = new ClsCircle();
        IUserInterface line = new ClsLine();
        IUserInterface square = new ClsSquare();

        list.add(cirle);
        list.add(line);
        list.add(square);


        for (IUserInterface obj : list) {
            obj.draw();
        }
    }
}
