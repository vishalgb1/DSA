import java.util.HashMap;
import java.util.LinkedList;

public class HashMapInLRU {
	
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	int capacity;
	
	public HashMapInLRU(int capacity){
		this.capacity = capacity;
	}
	
	public String get(int key) {
		if(hashMap.containsKey(key)) {
			return hashMap.get(key);
		}
		return null;
	}
	
	public void put(int key, String value) {
		if(hashMap.size() >= capacity) {
			int firstElement = linkedList.getFirst();
			linkedList.remove(firstElement);
			hashMap.remove(firstElement);
		}
		linkedList.add(key);
		hashMap.put(key, value);
	}
	
	public void print() {
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}
	
	public static void main(String args[]) {
		HashMapInLRU lru = new HashMapInLRU(3);
		lru.put(1, "Vishal");
		lru.put(2, "Vishal2");
		lru.put(3, "Vishal3");
		lru.put(1, "Vishal4");
		lru.put(7, "Vishal");
		lru.put(2, "Vishal");
		lru.print();
	}
}
