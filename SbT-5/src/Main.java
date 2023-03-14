public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair(12, " Oleg");
        Pair<String, String> pair2 = new Pair("Oleg ", "Olegovich");
        Pair<Integer, Integer> pair3 = new Pair<>();
        pair3.setValue(19);
        pair3.setKey(84);
        System.out.println(pair1.getValue() + " " + pair1.getKey());
        System.out.println(pair2.getValue() + " " + pair2.getKey());
        System.out.println(pair3.getValue() + " " + pair3.getKey());
    }
}