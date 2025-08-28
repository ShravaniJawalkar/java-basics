package org.example.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPiQue {
    public static void main(String[] args) {

        String examples = "This is a simple test";
        System.out.println(findLengthOfSecondHighest(examples));

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300)
        );

        Map<String, Long> transactionCountByDate = new StreamAPiQue().getTransactionCountByDate(transactions);
        transactionCountByDate.forEach((date, amount) ->
                System.out.println("Date: " + date + ", Total Amount: " + amount));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
                numbers.stream().filter(n->n%2==0).forEach(System.out::print);
                List<String> names = Arrays.asList("Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit");
                names.stream().filter(n->n.startsWith("A")).forEach(System.out::print);
                names.stream().sorted(Comparator.comparingInt(String::length)).findFirst().ifPresent(System.out::println);

                numbers.stream().filter(number -> number % 2==0).reduce(Integer::sum).ifPresent(System.out::println);


    }

    private static int findLengthOfSecondHighest(String s) {
        return Stream.of(s.split(" ")).sorted((a, b) -> Integer.compare(b.length(), a.length())).map(String::length).limit(2).skip(1).findFirst().get();
    }


    private Map<String, Long> getTransactionCountByDate(List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, TreeMap::new, Collectors.summingLong(Transaction::getAmount)));
    }
}
