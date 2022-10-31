package codeonedigest.javadesignpattern.creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryTest {

    public static void main(String []args) {

        while (true) {
            int objectTypeInput = 0;

            InterfaceRenderer objectUiObject;

            System.out.println("Enter object type you want to render 0 for textbox & 1 for button ");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            try {
                objectTypeInput = Integer.parseInt(bf.readLine());
                System.out.println("Creating object for input - " + objectTypeInput);
            } catch (IOException e) {
                e.printStackTrace();
            }

            objectUiObject = ClsAbstractFactory.getUIObject(objectTypeInput);

            objectUiObject.render();
        }

    }
}
