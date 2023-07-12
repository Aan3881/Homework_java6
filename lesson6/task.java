package lesson6;

import java.util.HashSet;

public class task {
     public static void main(String[] args) {

        HashSet<cat> hashSet = new HashSet<>();
        hashSet.add(new cat("Xiaomi", "POCO M4 Pro 5G", 256, "50 \u041C\u041F, f/1.8, 26mm"));
        hashSet.add(new cat("Xiaomi", "Xiaomi Redmi Note 12", 128, "48 \u041C\u041F, f/1.8"));
        hashSet.add(new cat("Samsung", "Galaxy S23 Ultra", 256, "200mm, f/1.7, 24"));
        hashSet.add(new cat("Apple", "iPhone 14 Pro", 512, "48 \u041C\u041F, f/1.8, 24 \u043C\u043C, 1.22\u00B5m"));
        hashSet.add(new cat("Samsung", "Galaxy Z Flip4", 128, "12 "));
        hashSet.add(new cat("Apple", "iPhone SE (2020)", 128, "12 \u041C\u041F"));
        hashSet.add(new cat("Xiaomi", "Mi 13", 256, "50 \u041C\u041F, f/1.8, 23"));
      
        System.out.println(hashSet);
    }
}
