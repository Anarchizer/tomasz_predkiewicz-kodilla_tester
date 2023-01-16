public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 400) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 400 && this.price <= 1000) {
            System.out.println("This notebook is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This item is lightweight");
        } else if (this.weight >= 600 && this.weight <= 1200) {
            System.out.println("This item is of avarage weight");
        } else {
            System.out.println("This item is heavy");
        }
    }

    public void checkYearAndWeight() {
        if (this.price >= 400 && this.price < 1000) {       //assuming there are no cheaper notebooks than 400. If there are leave only this.price<1000
            if (this.year >= 1990 && this.year < 2000) {
                System.out.println("This one is OLD, CHEAP notebook");
            } else if (this.year >= 2000 && this.year <= 2020) {
                System.out.println("This one is MEDIUM AGE, CHEAP notebook");
            } else {
                System.out.println("This one is NEW, CHEAP notebook");
            }
        } else if (this.price >= 1000 && this.price < 1500) {
            if (this.year >= 1990 && this.year < 2000) {
                System.out.println("This one is OLD, MEDIUM PRICE notebook");
            } else if (this.year >= 2000 && this.year <= 2020) {
                System.out.println("This one is AVARAGE AGE, MEDIUM PRICE priced notebook");
            } else {
                System.out.println("This one is a NEW, MEDIUM PRICE notebook");
            }
        } else if (this.price >= 1500) {
            if (this.year >= 1990 && this.year < 2000) {
                System.out.println("This one is OLD, HIGH PRICE notebook");
            } else if (this.year >= 2000 && this.year <= 2020) {
                System.out.println("This one is AVARAGE AGE, HIGH PRICE notebook");
            } else {
                System.out.println("This one is a NEW, HIGH PRICE notebook");
            }
        } else {
            System.out.println("No data");
        }
    }
}
