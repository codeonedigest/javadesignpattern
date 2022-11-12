package codeonedigest.javadesignpattern.structural.decorator;

public class RibbonBow extends FlowerBouquetDecorator{
    @Override
    public String getDescription() {
        return flowerBouquet.getDescription()+", ribbon bow";
    }

    @Override
    public double cost() {
        return 6.5+flowerBouquet.cost();
    }

    FlowerBouquet flowerBouquet;
    public RibbonBow(FlowerBouquet flowerBouquet){
        this.flowerBouquet=flowerBouquet;
    }


}
