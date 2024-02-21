import java.util.*;

public class temp {
  static class Hashmap<K, V> {
    public static final int DEFAULT_CAPACITY = 4; // default capacity
    public static final float LOAD_FACTOR = 0.75f; // load factor

    private class Node {
      K key;
      V value;

      Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private LinkedList<Node> buckets[];
    private int n; // record entries in map

    @SuppressWarnings("unchecked")
    public Hashmap() {
      buckets = new LinkedList[DEFAULT_CAPACITY];
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new LinkedList<Node>();
      }
    }

    private int hashFunc(K key) {
      int hc = key.hashCode();
      return Math.abs(hc) % buckets.length;
    }

    private int searchInBucket(K key, LinkedList<Node> list) {
      for (int i = 0; i < list.size(); i++) {
        if (Objects.equals(list.get(i).key, key)) {
          return i;
        }
      }
      return -1;
    }

    public int size() {
      return n;
    }

    private void init(int n) {
      buckets = new LinkedList[n];
      for (int i = 0; i < buckets.length; i++)
        buckets[i] = new LinkedList<Node>();
    }

    public void put(K key, V value) {
      int bi = hashFunc(key);
      LinkedList<Node> currBuc = buckets[bi];
      int ei = searchInBucket(key, currBuc);
      if (ei == -1) { // insertion case
        Node temp = new Node(key, value);
        currBuc.add(temp);
        n++;
      } else { // update case
        Node temp = currBuc.get(ei);
        temp.value = value;
      }
      if (n >= buckets.length * LOAD_FACTOR) {
        reshash();
      }
    }

    private void reshash() {
      LinkedList<Node> oldbucket[] = buckets;
      init(oldbucket.length * 2);
      n = 0;
      for (var bucket : oldbucket)
        for (var node : bucket)
          put(node.key, node.value);
    }

    public V get(K key) {
      int bi = hashFunc(key);
      LinkedList<Node> currBuc = buckets[bi];
      int ei = searchInBucket(key, currBuc);
      if (ei != -1) {
        Node temp = currBuc.get(ei);
        return temp.value;
      }
      return null;
    }

    public V remove(K key) {
      int bi = hashFunc(key);
      LinkedList<Node> currBuc = buckets[bi];
      int ei = searchInBucket(key, currBuc);
      if (ei != -1) {
        Node currNode = currBuc.remove(ei);
        n--;
        return currNode.value;
      }
      return null;
    }
  }

  public static void main(String[] args) {
    Hashmap<Integer, String> local = new Hashmap<>();
    local.put(1, "he");
    local.put(2, "hel");
    local.put(3, "hew");
    local.put(4, "pop");
    local.put(5, "pip");
    System.out.println(local.size());
    System.out.println(local.remove(2));
    System.out.println(local.size());
  }
}
