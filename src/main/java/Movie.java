package main;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;
    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        this.setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return this.price.getPriceCode();
    }
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                this.price = new RegularPrice();
                break;

            case CHILDRENS:
                this.price = new ChildrenPrice();
                break;

            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;

            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public String getTitle() {
        return title;
    }

    public double getCharge(int days) {
        return price.getCharge(days);
    }

    public int getFrequentRenterPoints(int days) {
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && days > 1) {
            return 2;
        }

        return 1;
    }
}
