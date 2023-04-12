package Programmers.Lv2.Q131127;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hyunho {
    //0.25ms, 75.6MB - 137.87ms, 104MB
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int buyCount = 0;

        Map<String, Integer> productMap = new HashMap<>();
        //product data initialize
        for (int i = 0; i < want.length; i++) {
            productMap.put(want[i], number[i]);
            buyCount += number[i];
        }
        Product product = new Product(productMap);

        int caseCount = discount.length - buyCount + 1;

        for (int i = 0; i < caseCount; i++) {
            String[] arr = Arrays.copyOfRange(discount, i, i + buyCount);

            if (product.possibleDiscount(arr)){
                answer++;
            }
        }

        return answer;
    }

    static class Product {
        private final Map<String, Integer> map;

        public Product(Map<String, Integer> map) {
            this.map = map;
        }

        public boolean possibleDiscount(String[] discountProducts) {
            Map<String, Integer> tempProductMap = new HashMap<>();

            for (String productName : discountProducts) {
                tempProductMap.put(
                    productName,
                    tempProductMap.getOrDefault(productName, 0) + 1);
            }

            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                String key = pair.getKey();
                if (!Objects.equals(map.get(key), tempProductMap.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }
}
