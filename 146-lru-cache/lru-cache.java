class LRUCache {
    Map<Integer, ListNode> map;
    ListNode head, tail;
    int capacity;

    public LRUCache(int capacity) {
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        ListNode node = map.get(key);
        update(node.key,node.value);
        return map.get(key).value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) // updating
        {
            update(key,value);
        } else if (map.size() < capacity) // adding
        {
            insert(key, value);

        } else {
            deleteLRU(key,value);
        }
    }

    void insert(int key, int value) {
        ListNode node = new ListNode(key, value);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
        map.put(key, node);
    }

    void update(int key, int value) {
        // removing the existing node
        ListNode node = map.get(key);
        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        // adding the node back at front
        insert(key, value);
    }

    void deleteLRU (int key , int val)
    {
        // deleting last recent used -> which is stored at last

        ListNode previous = tail.prev;
        previous.prev.next = tail;
        tail.prev = previous.prev;
        map.remove(previous.key);

        insert(key,val);
    }
}

class ListNode {
    ListNode prev, next;
    int key, value;

    ListNode(int key, int value) {
        this.key = key;
        this.value = value;
        prev = next = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */