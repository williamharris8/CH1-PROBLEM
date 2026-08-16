package com.securevault.specialty;

import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;

public class FragileItem extends VaultItem {

    private boolean isWrapped;

    public FragileItem(String itemName, double itemValue, boolean isWrapped) throws InvalidItemValueException {

        super(itemName, itemValue);
        this.isWrapped = isWrapped;
    }

    @Override
    public String toString() {
        return "Item: " + getItemName() + ", Value: $" + getItemValue() + ", Wrapped: " + isWrapped;

    }

}
