package org.example.stringquestion;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class IsAnangram {
    public static void main(String[] args) {
        String str1 = "top";
        String str2 = "pott";

        boolean result = isAnagram(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
        String fancyString = makeFancyString("aaabaaaa");
        System.out.println("Fancy String: " + fancyString);
        printList();
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : str1.toCharArray()) {
            charSet.add(c);
        }
        Stream.of(str2.toCharArray()).filter(charSet::contains).forEach(charSet::remove);
        return charSet.isEmpty();
    }

    public static String makeFancyString(String s) {
        if (s == null || s.length() < 3) return s;
        StringBuilder builder = new StringBuilder();
        int count = 1;
        builder.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count < 3) {
                builder.append(s.charAt(i));
            }

        }
        return builder.toString();
    }

    private static void printList() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        for (String s : list) {
            System.out.print(s + " ");
            list.add("orange"); // This will cause ConcurrentModificationException
        }
        System.out.println();
    }
}
