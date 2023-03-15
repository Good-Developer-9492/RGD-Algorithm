package Programmers.Lv2.Q17680;

import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        CacheMaxSize cacheMaxSize = CacheMaxSize.of(cacheSize);
        if (cacheMaxSize.isZero()) {
            return cities.length * 5;
        }
        CityCache cityCache = CityCache.of(cacheMaxSize);
        for (String city : cities) {
            city = city.toLowerCase();
            answer += cityCache.verifyHit(city);
            cityCache.add(city);
        }
        return answer;
    }

    static class CityCache {
        private final CacheMaxSize cacheMaxSize;
        private final Queue<String> cityQueue;
        private final static int CACHE_HIT_PROCESSING_TIME = 1;
        private final static int CACHE_MISS_PROCESSING_TIME = 5;

        private CityCache(CacheMaxSize cacheMaxSize, Queue<String> queue) {
            this.cacheMaxSize = cacheMaxSize;
            this.cityQueue = queue;
        }

        public static CityCache of(CacheMaxSize cacheMaxSize) {
            return new CityCache(cacheMaxSize, new LinkedList<>());
        }

        public int verifyHit(String s) {
            if (!cityQueue.contains(s)) {
                return CACHE_MISS_PROCESSING_TIME;
            }
            cityQueue.remove(s);
            return CACHE_HIT_PROCESSING_TIME;
        }

        public void add(String s) {
            if (cacheMaxSize.isUnderOrSame(cityQueue.size())) {
                cityQueue.poll();
            }
            cityQueue.add(s);
        }
    }

    static class CacheMaxSize {
        private final int size;

        private CacheMaxSize(int size) {
            this.size = size;
        }

        public static CacheMaxSize of(int size) {
            return new CacheMaxSize(size);
        }

        public boolean isUnderOrSame(int queueSize) {
            return size <= queueSize;
        }

        public boolean isZero() {
            return size == 0;
        }
    }
}
