package Fabric;

import Interfaces.iGameItem;
import Product.Cup;

public class CupGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Cup();
    }

}