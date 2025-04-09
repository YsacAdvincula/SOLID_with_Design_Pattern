public class TestProgram {
    public static void main(String[] args) {
        
        StudentBook stud1 = new StudentBook("619", "Calimlim", 
                                            "Kenshin", "Math Book");
        BookProcessor process1 = new BookProcessor(stud1, new Book());
        process1.process();

        StudentBook stud2 = new StudentBook("321", "Mercado", 
                                            "Maria", "Science Journal");
        BookProcessor process2 = new BookProcessor(stud2, new Journal());
        process2.process();
    }
}