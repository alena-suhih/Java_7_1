import ru.netology.sqr.lesson_7.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        long salesSum = service.sumSales(sales);
        System.out.println("Сумма продаж за 12 месяцев " + salesSum);

        double averageSum = service.averageSum(sales);
        System.out.println("Средняя сумма продаж за 12 месяцев " + averageSum);

        long maxSalesMonth = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж " + maxSalesMonth);

        long minSalesMonth = service.minSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж " + minSalesMonth);

        long monthNumberLesserAverage = service.salesLesserAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + monthNumberLesserAverage);

        long monthNumberBiggerAverage = service.salesBiggerAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + monthNumberBiggerAverage);
    }
}
