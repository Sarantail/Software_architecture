package Fabric;

import Interfaces.iGameItem;
import Product.Sword;

public class SwordGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Sword();
    }

}