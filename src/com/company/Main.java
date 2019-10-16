package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyCalendarThree {

    Map<Integer, Integer> map = new TreeMap<>();
    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);

        int cnt = 0, k = 0;
        for (int v : map.values()) {
            cnt += v;
            k = Math.max(k, cnt);
        }
        return k;
    }
}