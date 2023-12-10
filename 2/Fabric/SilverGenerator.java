package Fabric;

import Interfaces.iGameItem;
import Product.Silver;

public class SilverGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Silver();
    }

}