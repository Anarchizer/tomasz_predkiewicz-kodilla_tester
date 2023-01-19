public class ShowGrades {
    public static void main(String[] args) {
        Grades myGrades = new Grades();


        myGrades.add(6);
        myGrades.add(1);
        myGrades.add(2);
        myGrades.add(1);
        myGrades.add(1);
        myGrades.add(4);
        myGrades.add(1);
        myGrades.add(6);
        myGrades.add(1);
        myGrades.add(2);


        System.out.println("Średnia to: " + myGrades.mean());
        System.out.println("Ostatnia ocena to: " + myGrades.getLastGrade());
    }
}
