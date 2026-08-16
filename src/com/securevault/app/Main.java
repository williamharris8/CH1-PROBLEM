package com.securevault.app;

import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;

public class Main {

    public static void main(String[] args) {
        try {
            VaultItem valid = new VaultItem("Gold Coin", 500.0);
            System.out.println("Created: " + valid);
        } catch (InvalidItemValueException e) {
            System.out.println("Error: " + e.getMessage());

        }

        try {
            VaultItem invalid = new VaultItem("Emerald Necklace", 0.0);

        } catch (InvalidItemValueException e) {
            System.out.println("Error: " + e.getMessage());
        }

        VaultItem[] items = null;
        try {
            items = new VaultItem[] {
                    new VaultItem("Diamond Ring", 1500.0),
                    new FragileItem("Glass Vase", 500.0, true),
                    new VaultItem("Priceless Painting", 5000.0)
            };
        } catch (InvalidItemValueException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

}
