package ru.netology;

import java.util.Map;

public class Purchase {
    // Изменил Purchase[] на статический, чтобы он относился к классу, а не к объекту
    protected static Purchase[] purchases;
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
    //Добавляем сеттер размера для Purchase[] purchases;
    public static void setSizePurchases(int size) {
        purchases = new Purchase[size];
    }
    // Изменил метод на статический, чтобы он относился к классу, а не к объекту
    public static void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }
    // Изменил метод на статический, чтобы он относился к классу, а не к объекту
    public static long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
