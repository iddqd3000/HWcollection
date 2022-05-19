public class MyLinkedList<E> {
    private int size = 0;
    private transient Node<E> first;
    private transient Node<E> last;
    private transient Node<E> linkFirst;
    private transient Node<E> linkLast;


    public void add(E elem) {
        if (size == 0) {
            first = new Node<>(first, elem, last);
            linkFirst(first);
        } else {

            Node<E> nextNode = new Node<>(first, elem, null);
            last = nextNode;
            first.setNext(last);
            first = nextNode;
            linkLast(last);
        }
        size++;
    }

    public void clear() {
        if (size != 0) {
            Node<E> elem = linkFirst;
            Node<E> elem2;
            for (int buff = 0; buff < size; buff++) {
                elem2 = elem.getNext();
                elem.prev = null;
                elem.next = null;
                elem.item = null;
                elem = elem2;
            }
            size = 0;
            linkFirst = null;
            linkLast = null;
        }
    }

    public void addAll(E[] elem) {
        for (E element : elem) {
            add(element);
        }
    }
    public void getSize() {
        System.out.println(size);
    }

    private void linkFirst(Node<E> firstLink) {
        linkFirst = firstLink;
    }


    private void linkLast(Node<E> lastLink) {
        linkLast = lastLink;
    }

    @SuppressWarnings({"ConstantConditions"})
    public void get(int index) {
        int buff = size;
        Node<E> item;
        do {
            if (index < 0) {
                System.out.println("Index cant be a negative");
                break;
            }

            if (buff / 2 >= index) {
                item = linkFirst;
                for (buff = 0; buff != index; buff++) {
                    item = item.getNext();
                }
                System.out.println(item.getItem().toString());
                break;
            }

            if (buff / 2 < index && index <= size) {
                item = linkLast;
                for (; buff - 1 != index; buff--) {
                    item = item.getPrev();
                }
                System.out.println(item.getItem().toString());
            } else {
                System.out.println("Out of bonds");
            }

        } while (false);
    }

    public void remove(int index) {
        Node<E> prevNode;
        Node<E> nextNode;
        if (index < size && index >= 0) {
            if (index > size / 2) {
                if (index != size - 1) {
                    Node<E> lastNode = linkLast;
                    for (int buff = size; index != (buff - 1); buff--) {
                        lastNode = lastNode.getPrev();
                    }
                    prevNode = lastNode.getPrev();
                    nextNode = lastNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                    size--;
                } else {
                    prevNode = linkLast.getPrev();
                    prevNode.setNext(null);
                    linkLast = prevNode;
                    size--;
                }

            } else {
                if (index != 0) {
                    Node<E> firstNode = linkFirst;
                    for (int buff = 0; index != buff; buff++) {
                        firstNode = firstNode.getNext();
                    }
                    prevNode = firstNode.getPrev();
                    nextNode = firstNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                    size--;
                } else {
                    if (index != size - 1) {
                        nextNode = linkFirst.getNext();
                        nextNode.setPrev(null);
                        linkFirst = nextNode;
                        size--;
                    } else {
                        size--;
                    }
                }

            }
        }
    }


    private static class Node<E> {

        private E item;
        private Node<E> next;
        private Node<E> prev;

        private Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        private void setNext(Node<E> next) {
            this.next = next;
        }



        private void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        private Node<E> getPrev() {
            return prev;
        }

        private Node<E> getNext() {
            return next;
        }

        private E getItem() {
            return item;
        }

    }
}