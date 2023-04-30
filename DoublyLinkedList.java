public class DoublyLinkedList
{
    private Node head;
    private Node tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(Node addNode)
    {
        Node currNode = this.head;
        if (currNode == null)
        {
            this.head = addNode;
            this.tail = addNode;
            return;
        }

        addNode.setNext(currNode);
        currNode.setPrev(addNode);
        this.head = addNode;
    }

    public void addLast(Node addNode)
    {
        Node currNode = this.tail;
        if (currNode == null)
        {
            this.head = addNode;
            this.tail = addNode;
            return;
        }
        currNode.setNext(addNode);
        addNode.setPrev(currNode);
        this.tail = addNode;
    }

    public void reverse()
    {
        Node temp = null;
        Node current = this.head;
        while (current != null)
        {
            temp = current.getPrev();
            current.setPrev(current.getNext());
            current.setNext(temp);
            current = current.getPrev();
        }

        if (temp != null)
        {
            this.head = temp.getPrev();
        }
    }

    public void print_DLL()
    {
        Node currNode = this.head;
        System.out.print("[ ");
        while (currNode != null)
        {
            System.out.print(currNode.getValue());
            currNode = currNode.getNext();
            if (currNode != null)
            {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

    public void bubbleSort()
    {
        Node currNode = this.head;
        Node prevNode = null;
        Node nextNode = null;
        int tmp;
        boolean swap = false;

        if (this.head == null)
        {
            return;
        }

        do
        {
            swap = false;
            currNode = this.head;
            while (currNode.getNext() != prevNode)
            {
                nextNode = currNode.getNext();
                if (currNode.getValue() > nextNode.getValue())
                {
                    tmp = currNode.getValue();
                    currNode.setValue(nextNode.getValue());
                    nextNode.setValue(tmp);
                    swap = true;
                }
                currNode = currNode.getNext();
            }
            prevNode = currNode;
        }
        while (swap);
    }
}