package org.example.codingquestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestExample {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(countNumberOfWordInString("Hello world hello"));
        System.out.println(isPalindrom(12321));
    }

    private static boolean isPrime(int number) {
//       if(number<=1) return false;
//       for(int i=2;i<=number/2;i++){
//           if(number%i==0)
//               return false;
//       }
//       return true;
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, number / 2).noneMatch(n -> number % n == 0);
    }

    private static int countNumberOfWordInString(String s) {
        String[] words = s.split("\\s+");
        HashMap<String, Integer> count = new HashMap<>();
        for (String w : words) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        return count.size();
    }

    private static boolean isPalindrom(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            temp.append(s.charAt(i));
        }
//        return s.contentEquals(temp);

        // optimized solution
        if (s == null)
            return false;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrom(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0))
            return false;

        int reverse = 0;
        int original = number;
        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }

        return reverse == original;
    }

    private static int secondHighestNumberInArray(int[] ar) {
        if (ar == null || ar.length < 2)
            return 0;
        int secondHighest = Integer.MIN_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int number : ar) {
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest && number != highest) {
                secondHighest = number;
            }

        }
        if (secondHighest == Integer.MIN_VALUE)
            return highest;

        return secondHighest;
    }

    private static char findDuplicateCharacters(String s) {
        if (s.length() == 0 || s == null)
            return '\0';
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }
        return characterCount.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().get();
    }

    private static String removeAllWhiteSpace(String s) {
        s = s.replace("\\s+", "");
        return s;
    }

    //3. Write a java program to find the first non repeated character in the String?

    private static char findFirstNonRepeatingChar(String str) {
        if (str.isEmpty() || str == null)
            return '\0';
        Map<Character, Integer> un = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            un.put(c, un.getOrDefault(c, 0) + 1);
        }

        return un.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse('\0');
    }

    private static boolean findStringHasUniqueCharacter(String str) {
        if (str.isEmpty() || str == null)
            return false;
        Set<Character> un = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (un.contains(c))
                return false;
            un.add(c);
        }
        return true;
    }


    private static int countNumberOfWordsInString(String wordString) {
        if (wordString.isEmpty() || wordString == null)
            return 0;
        String[] words = wordString.trim().split(" ");
        return words.length;
    }

    private static void findAllPermutationsOfString(String prefix, String given, Set<String> result) {
        if (given.isEmpty()) {
            result.add(prefix);
            return;
        }
        for (int i=0;i<given.length();i++){
            char ch=given.charAt(i);
            String newRem= given.substring(0,i)+given.substring(i+1);
            findAllPermutationsOfString(prefix+ch,newRem,result);
        }
    }
    private  static int highestRepeatedNumberFromArray(int[] arr){
//      Map<Integer,Integer> count=new HashMap<>();
//      for (int num:arr){
//          count.put(num,count.getOrDefault(num,0)+1);
//      }
//      return  count.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(0);
        if(arr.length==0||arr==null)
                return 0;
        if(arr.length==1)
            return arr[0];
        Arrays.sort(arr);
        int crr=0;
        int max=0;
        int result=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
                crr++;
            else {
                if(crr>max){
                    max=crr;
                    result=arr[i-1];
                }
                crr=0;
            }
        }
        if (crr>max){
            result=arr[arr.length-1];
        }
        return result;
    }

    private  static boolean isAnagram(String k, String t){
        if(k.length()==t.length())
            return true;
        String kS= k.replace("\\s","").toLowerCase();
        String tS=k.replace("\\s","").toLowerCase();
        Map<Character,Integer> sMap=new LinkedHashMap<>();
        for (char c:kS.toCharArray()){
            sMap.put(c,sMap.getOrDefault(c,0)+1);
        }
        for( char c:tS.toCharArray()){
            if(!sMap.containsKey(c) || sMap.get(c)==0)
                return false;
            sMap.put(c,sMap.get(c)-1);
        }
        return true;
    }


    private  static boolean isAnagram(int k, int t){
      if(String.valueOf(k).length()!=String.valueOf(t).length())
          return  false;
      int num1 = Math.abs(k);
      int num2=Math.abs(t);
      int[] freq=new int[10];
      while (num1<0){
          freq[num1%10]++;
          num1/=10;
      }
      while (num2>0){
          int digit=num2%10;
          freq[digit]--;
          if(freq[digit]<0)
              return false;
          num2/=10;

      }
      return true;
    }
}
