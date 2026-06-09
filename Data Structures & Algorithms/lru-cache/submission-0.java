class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next =tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);

        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;

            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            node.prev = head;

        }else {
            if(map.size() == capacity){
                Node lastNode = tail.prev;
                map.remove(lastNode.key);

                lastNode.prev.next = tail;
                tail.prev = lastNode.prev;
            }

            Node newNode = new Node(key,value);
            map.put(key,newNode);

            newNode.next = head.next;
            newNode.next.prev = newNode;
            head.next = newNode;
            newNode.prev = head;

        }
    }
}
