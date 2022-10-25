package Stocks;

public class Stock {
    private String stockId;
    private String name;
    private int qty;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getTicker() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public Stock(String stockId, String name, int qty){
        this.stockId = stockId;
        this.name = name;
        this.qty = qty;
    }
}
