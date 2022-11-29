package com.example.insert_delete_getrandom;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

class RandomizedSet {

    private Set<Integer> myList;

    public RandomizedSet() {
        myList = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return myList.add(val);
    }
    
    public boolean remove(int val) {
        return myList.remove(val);
    }
    
    public int getRandom() {
        int size = myList.size();
        int randomNum = ThreadLocalRandom.current().nextInt(0, size);
        return (int)myList.toArray()[randomNum];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */