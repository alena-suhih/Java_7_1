package ru.netology.sqr.lesson_7.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return  sum;
    }

    public double averageSum(long[] sales) {
        long sum = sumSales(sales);
        double aSum = sum / sales.length;
        return  aSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesLesserAverage(long [] sales) {
        int monthNumber = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)){
                monthNumber = monthNumber + 1;
            }
        }
        return monthNumber;
    }

    public int salesBiggerAverage(long [] sales) {
        int monthNumber = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)){
                monthNumber = monthNumber + 1;
            }
        }
        return monthNumber;
    }
}
