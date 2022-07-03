import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache{
	private Set<Integer> cache;
	private int capacity;
	
	public LRUCache(int capacity) {;
		this.capacity = capacity;
		this.cache = new LinkedHashSet<Integer>(capacity);
	}
	
	public boolean get(int key) {
		if(!cache.contains(key))
			return false;
		cache.remove(key);
		cache.add(key);
		return true;
	}
	
	public void put(int key) {
		if(cache.size() == capacity) {
			int firstElement = cache.iterator().next();
			cache.remove(firstElement);
		}
		cache.add(key);
	}
	
	public void refer(int key) {
		if(get(key) == false)
			put(key);
	}
	
	public void display() {
		LinkedList<Integer> list = new LinkedList<Integer>(cache);
		Iterator<Integer> iterator = list.descendingIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	
	public static void main (String args[]) {
		LRUCache lruCache = new LRUCache(3);
		lruCache.refer(1);
		lruCache.refer(2);
		lruCache.refer(3);
		lruCache.refer(5);
		lruCache.refer(6);
		lruCache.refer(1);
		lruCache.refer(13);
		lruCache.display();
	}
	
}