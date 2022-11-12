package codeonedigest.javadesignpattern.structural.flyweight;

public class FlyweightTest {
    public static void main(String args[]) {
        ClsVisitingCard visitingCardRamesh = new ClsVisitingCard("Ramesh");
        ClsVisitingCard visitingCardSuresh = new ClsVisitingCard("Suresh");
        ClsVisitingCard visitingCardVijay = new ClsVisitingCard("Vijay");

        System.out.println(visitingCardRamesh.getName() + " - " + visitingCardRamesh.getAddress() + " - (hascode #" + visitingCardRamesh.getAddress().hashCode() + ")");
        System.out.println(visitingCardSuresh.getName() + " - " + visitingCardSuresh.getAddress() + " - (hascode #" + visitingCardRamesh.getAddress().hashCode() + ")");
        System.out.println(visitingCardVijay.getName() + " - " + visitingCardVijay.getAddress() + " - (hashcode #" + visitingCardRamesh.getAddress().hashCode() + ")");

    }
}
