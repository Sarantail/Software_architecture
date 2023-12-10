package Fabric;

import Interfaces.iGameItem;
import Product.Book;

public class BookGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Book();
    }

}