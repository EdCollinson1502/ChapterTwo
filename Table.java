
// ***************************************************************
//   Names.java
//
//   Prints a list of student names with their hometowns
//   and intended major
// ***************************************************************
    public class Table
    {
    public static void main() {
        makeTable();
    }
    
    public static void makeTable() {
        makeHeader();
        labelColumns();
        populateRows();
    }
    
    public static void makeHeader() {
        System.out.println("-------------------------------------------");
        System.out.println("===\t\tStudent Points\t\t===");
        System.out.println("-------------------------------------------");
    }
    
    public static void labelColumns() {
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
    }
    
    public static void populateRows() {
        populateOneRow("Joe", 40, 7);
        populateOneRow("Riley", 10, 1);
        populateOneRow("Edward", 56, 5);
        populateOneRow("Jesus", 60, 4);
        populateOneRow("Daniel", 100, 10);
    }
    
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }
    
}