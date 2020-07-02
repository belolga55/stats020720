package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        System.out.println("Сумма всех продаж = " + sum);
        return sum;
    }

    public long averageSalesAmountMonth(long[] sales) {
        long avg = sumSales(sales) / sales.length;
        System.out.println(" Средние продажи в месяц = " + avg);
        return avg;

    }

    public int indexMonthMaxSale(long[] sales) {
        long MaxSale = sales[0];
        int month = 0;
        int MounthMax = 1;
        for (long sale : sales) {
            month++;
            if (MaxSale <= sale) {
                MaxSale = sale;
                MounthMax = month;
            }
        }
        System.out.println(" Месяц с максимальными продажами = " + MounthMax);
        return MounthMax;
    }


    public int indexMonthMinSale(long[] sales) {
        long MinSale = sales[0];
        int month = 0;
        int MounthMin = 1;
        for (long sale : sales) {
            month++;
            if (MinSale >= sale) {
                MinSale = sale;
                MounthMin = month;
            }
        }
        System.out.println(" Месяц с минимальными продажами = " + MounthMin);
        return MounthMin;
    }

    public long numberMonthsSalesUnderAverage(long[] sales) {
        long numberMonthUnderAverage = 0;
        long avr = averageSalesAmountMonth(sales);
        long numberMonth = 0;
        for (long sale : sales) {
            if (avr > sale) {
                numberMonth++;
                numberMonthUnderAverage = numberMonth;
            }

        }
        System.out.println(" Количество месяцев ниже среднего  = " + numberMonthUnderAverage);
        return numberMonthUnderAverage;
    }


    public long numberMonthsSalesOverAverage(long[] sales) {
        long numberMonthOverAverage = 0;
        long avr = averageSalesAmountMonth(sales);
        long numberMonth = 0;
        for (long sale : sales) {
            if (avr > sale) {
                numberMonth++;
                numberMonthOverAverage = numberMonth;
            }
        }
        System.out.println(" Количество месяцев выше среднего  = " + numberMonthOverAverage);
        return numberMonthOverAverage;
    }

}


