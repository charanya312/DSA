class MyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head,tail;
    private int size;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head == null){
            head = tail = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node nn = new Node(val);
        if(tail == null){
            head = tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        Node nn = new Node(val);
        Node temp = head;
        if(index == 0){
            nn .next = head;
            head = nn;
        }
        else if(index == size){
            tail.next = nn;
            tail = nn;
        }
        else {
           for(int i=0;i<index-1;i++){    
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)return;
        if(index==0){
            head=head.next;
            if(size==1)
            tail=null;
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1) tail=temp;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */