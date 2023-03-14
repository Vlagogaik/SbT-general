public class Pair <K, V>{
    private V value;
    private K key;
    public Pair(V value, K key){
        this.value = value;
        this.key = key;
    }
    public Pair(){
    }
    public <V> V getValue(){
        return (V) value;
    }
    public <K> K getKey(){
        return (K) key;
    }
    public void setValue(V value){
        this.value = value;
    }
    public void setKey(K key){
        this.key = key;
    }
}
