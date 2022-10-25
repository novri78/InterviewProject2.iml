package Stocks;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PortofolioTest extends TestCase {

    Portofolio portofolio;
    StockService stockService;

    public static void main(String[] args) {
        PortofolioTest tester = new PortofolioTest();
        tester.setUp();
        if (!tester.testMarketValue()) {
            System.out.println("fail");
        } else {
            System.out.println("pass");
        }
    }

    public void setUp(){
        //create Portofolio Object which is to be tested
        portofolio = new Portofolio();

        //create Mock Object of stock service
        stockService = mock(StockService.class);

        //set the stock service to the portofolio
        portofolio.setStockService(stockService);
    }

    public boolean testMarketValue() {
        //create a list of stock to be added to the portofolio
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google",10);
        Stock microsoftStock = new Stock("2","microsoft",100);

        stocks.add(googleStock);
        stocks.add(microsoftStock);

        //add stock to portofolio
        portofolio.setStocks(stocks);

        //mock the behaviour of stock services to return value of various stock
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);

        double marketValue = portofolio.getMarketValue();
        return marketValue == 100500.0;

    }

}