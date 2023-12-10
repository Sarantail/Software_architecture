package Fabric;

import Interfaces.iGameItem;

public abstract class ItemGenerator {

    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
