package com.securevault.core;

public class VaultManager {
    private VaultItem[] items;

    public VaultManager(VaultItem[]items){
        this.items = items;
    }

    public void selectionSort() {
        for (int i = 0; i < items.length; i++) {
            int smallest = i;

            for (int j = i + 1; j < items.length; j++) {
                if (items[j].getItemValue() < items[smallest].getItemValue()) {
                    smallest = j;
                }
            }

            VaultItem temp = items[i];
            items[i] = items[smallest];
            items[smallest] = temp;
        }
    }

}
