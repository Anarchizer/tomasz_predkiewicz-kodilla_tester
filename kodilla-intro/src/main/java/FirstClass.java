public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(500, 400, 1990);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2000);
        Notebook oldNotebook = new Notebook(1200, 1000, 2021);

        displayNotebookParameters("Weight of light notebook: ", notebook, " Price of light notebook: ");
        displayNotebookParameters("Weight of heavy notebook: ", heavyNotebook, " Price of heavy notebook: ");
        displayNotebookParameters("Weight of avarage notebook: ", oldNotebook, " Price of avarage notebook: ");
    }

    private static void displayNotebookParameters(String x, Notebook notebook, String x1) {
        System.out.println(x + notebook.weight + x1 + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndWeight();
    }
}