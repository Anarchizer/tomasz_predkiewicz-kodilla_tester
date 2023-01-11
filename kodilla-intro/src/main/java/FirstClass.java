public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 400, 1990);
        System.out.println("Weight of light notebook: " + notebook.weight + " Price of light notebook: " + notebook.price);
        notebook.CheckPrice();
        notebook.CheckWeight();
        notebook.CheckYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2000);
        System.out.println("Weight of heavy notebook: " + heavyNotebook.weight + " Price of heavy notebook: " + heavyNotebook.price);
        heavyNotebook.CheckPrice();
        heavyNotebook.CheckWeight();
        heavyNotebook.CheckYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 1000, 2021);
        System.out.println("Weight of avarage notebook: " + oldNotebook.weight + " Price of avarage notebook: " + oldNotebook.price);
        oldNotebook.CheckPrice();
        oldNotebook.CheckWeight();
        oldNotebook.CheckYearAndPrice();

    }
}