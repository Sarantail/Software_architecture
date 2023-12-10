package Fabric;

import Interfaces.iGameItem;
import Product.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gold();
    }

}