package Fabric;

import Interfaces.iGameItem;
import Product.Ring;

public class RingGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Ring();
    }
}