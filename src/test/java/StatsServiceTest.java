import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.lesson_7.stats.StatsService;

public class StatsServiceTest {

    long[] arrayTest = {1, 15, 13, 30, 28, 8, 19, 24, 68, 10, 33, 77};

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long expected = 326;
        long actualSum = service.sumSales(arrayTest);
        Assertions.assertEquals(expected, actualSum);
    }

    @Test
    public void averageSum() {
        StatsService service = new StatsService();

        double expected = 27;
        double actualAverageSum = service.averageSum(arrayTest);
        Assertions.assertEquals(expected, actualAverageSum);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long expected = 12;
        long actualMaxSales = service.maxSales(arrayTest);
        Assertions.assertEquals(expected, actualMaxSales);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long expected = 1;
        long actualMinSales = service.minSales(arrayTest);
        Assertions.assertEquals(expected, actualMinSales);
    }

    @Test
    public void salesLesserAverage() {
        StatsService service = new StatsService();

        long expected = 7;
        long actualSalesLesserAverage = service.salesLesserAverage(arrayTest);
        Assertions.assertEquals(expected, actualSalesLesserAverage);
    }

    @Test
    public void salesBiggerAverage() {
        StatsService service = new StatsService();

        long expected = 5;
        long actualSalesBiggerAverage = service.salesBiggerAverage(arrayTest);
        Assertions.assertEquals(expected, actualSalesBiggerAverage);
    }
}
