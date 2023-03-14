public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("", "", 0.0);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер " + number);
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Телефон: номер - " + number + ", модель - " + model + ", вес - " + weight + " г.";
    }
}