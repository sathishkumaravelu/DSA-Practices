package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.*;

public class TopKFreqElement {


    @Test
    public void test(){
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent1(nums1, k)));
    }

    private int[] topKFrequent(int[] nums1, int k) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int i:nums1) {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        Map<Integer,List<Integer>> reverseMap = new HashMap<>();
        for (int num : freqMap.keySet()) {
            int count = freqMap.get(num);
            if(!reverseMap.containsKey(count)){
                reverseMap.put(count,new ArrayList<>());
            }
            reverseMap.get(count).add(num);
        }

        System.out.println(reverseMap);
        int index =0;
        int[] result = new int[k];
        for(int i = nums1.length;i>=1;i--){
            if(reverseMap.containsKey(i)){
                for(int n : reverseMap.get(i)){
                    if(index<k){
                        result[index++] = n;
                    }else {
                        break;
                    }
                }
            }
            if(index>=k){
                break;
            }
        }
        return result;
    }

    private int[] topKFrequent1(int[] nums1, int k){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int i:nums1) {
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }

        ArrayList[] buckets = new ArrayList[nums1.length + 1];
        for (int num:frequencyMap.keySet()) {
            int freq = frequencyMap.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
