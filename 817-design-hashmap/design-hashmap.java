class MyHashMap {

    private int keySpace;
    private List<Bucket> map;
    
    public MyHashMap() {
        this.keySpace = 2069;
        this.map = new ArrayList<Bucket>();
        for(int i=0; i<this.keySpace; i++) {
            this.map.add(new Bucket());
        }
    }
    
    public void put(int key, int value) {
        int hashKey = key % this.keySpace;
        this.map.get(hashKey).update(key, value);
    }
    
    public int get(int key) {
        int hashKey = key % this.keySpace;
        Bucket bucket = this.map.get(hashKey);
        return bucket.get(key);
    }
    
    public void remove(int key) {
        int hashKey = key % this.keySpace;
        Bucket bucket = this.map.get(hashKey);
        bucket.remove(key);
    }
}

class Pair<K, V> {
    public K key;
    public V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class Bucket {
    protected List<Pair<Integer, Integer>> container;
    
    public Bucket() {
        this.container = new LinkedList<Pair<Integer,Integer>>();
    }
    
    public Integer get(Integer key) {
        for(Pair<Integer, Integer> pair : this.container) {
            if(pair.key.equals(key)) {
                return pair.value;
            }
        }
        return -1;
    }
    
    public void update(Integer key, Integer value) {
        boolean found = false;
        for(Pair<Integer, Integer> pair : this.container) {
            if(pair.key.equals(key)) {
                pair.value = value;
                found = true;
            }
        }
        if(!found) {
            Pair<Integer, Integer> pair = new Pair(key, value);
            this.container.add(pair);
        }
    }
    
    public void remove(Integer key) {
        for(Pair<Integer, Integer> pair : this.container) {
            if(pair.key.equals(key)) {
                this.container.remove(pair);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */