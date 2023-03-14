public class Main {
    public static void main(String[] args) {
        System.out.println("<=========================PHONE============================>");
        Phone phone1 = new Phone("555-1234", "Samsung", 150.0);
        Phone phone2 = new Phone("555-4321", "iPhone");

        phone1.receiveCall("Василий");
        phone2.receiveCall("Петр", "555-9876");

        String[] numbers = {"555-1111", "555-2222", "555-3333"};
        phone1.sendMessage(numbers);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println("<=========================CYRCLe============================>");
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle.toString());
        System.out.println("<=========================Matrix============================>");
        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 1);
        a.setValue(0, 1, 2);
        a.setValue(1, 0, 3);
        a.setValue(1, 1, 4);
        a.print();

        Matrix b = new Matrix(2, 2);
        b.setValue(0, 0, 5);
        b.setValue(0, 1, 6);
        b.setValue(1, 0, 7);
        b.setValue(1, 1, 8);
        b.print();

        a.add(b);
        a.print();

        a.multiply(2);
        a.print();

        Matrix c = a.multiply(b);
        c.print();
        System.out.println("<=========================BOOK============================>");
        Author author = new Author("John Smith", "Male", "john.smith@example.com");
        Book book = new Book("The Book Title", author, 2022);
        System.out.println(book.toString());
        System.out.println("<=========================PIZZA============================>");
        PizzaOrder order1 = new PizzaOrder("Маргарита", Size.BIG, true, "ул. Ленина, д. 10");
        PizzaOrder order2 = new PizzaOrder("Гавайская", Size.MEDIUM, false, "ул. Гагарина, д. 5");

        System.out.println(order1);
        order1.order();
        System.out.println(order1);
        order1.order();
        System.out.println(order1);
        order1.cancel();
        System.out.println(order1);

        System.out.println(order2);
        order2.order();
        System.out.println(order2);
        order2.cancel();
        System.out.println(order2);
    }
}