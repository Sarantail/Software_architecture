package Fabric;

import Interfaces.iGameItem;
import Product.Crown;

public class CrownGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Crown();
    }

}