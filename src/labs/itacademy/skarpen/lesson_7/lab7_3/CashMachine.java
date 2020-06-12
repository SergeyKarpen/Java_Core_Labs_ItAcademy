package labs.itacademy.skarpen.lesson_7.lab7_3;

public class CashMachine {

    private int twenty;
    private int fifty;
    private int hundred;

    public CashMachine(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int allMoney() {
        return +getTwenty() * Constants.GREENBACKTWENTY + getFifty() * Constants.GREENBACKFIFTY + getHundred() * Constants.GREENBACKHUNDRED;
    }

}


