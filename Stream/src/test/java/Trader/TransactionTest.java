package Trader;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        //1-Find all transactions is 2011 and sort by value
        System.out.println("****Task-1***********");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("****Task-2***********");
        //2-What are all the uniques cities where the traders work?

        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("****Task-3***********");
        //3-Find all traders from Cambridge sort the by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("****Task-4***********");
        //4-Return a string of all traders names sorted alphabeticaly

       String result= TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)->(name1+name2+" "));
        System.out.println("result = " + result);

        System.out.println("****Task-5***********");
        //5-are any traders based in milan

        boolean milanbased=TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader()
                        .getCity().equalsIgnoreCase("milan"));

        System.out.println("milanbased = " + milanbased);

        System.out.println("****Task-6***********");
        //6-print the value of all transaction from the traders living in Cambridge

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity()
                        .equalsIgnoreCase("cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("****Task-7***********");
        //7-what is the highest value of all the transactions

        Optional<Integer> highTransation=TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("highTransation = " + highTransation.get());

        System.out.println("****Task-8***********");
        //8-Find the transaction with the smallest value

        Optional<Transaction> smalValue=TransactionData.getAll().stream()
                .reduce((t1,t2)->t1.getValue()<t2.getValue()? t1 : t2);

        System.out.println("smalValue = " + smalValue.get());

        Optional<Transaction> small=TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println("small = " + small.get());


    }
}
