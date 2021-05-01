class Node:

    def __init__(self, data):
        self.data = None
        self.next = Node()

class LinkedList:

    def __init__(self):
        self.head = None

    def append(self,data):
        if self.head is None:
            self.head = Node(data)
            return
        current = self.head
        while current.next is not None:
            current = current.next
        current.next = Node(data)
        return current

    def prepend(self,data):
        if self.head is None:
            self.head = Node(data)
            return
        newHead = Node(data)
        newHead.next = self.head
        self.head = newHead
        return

    def delete_with_value(self,data):
        if self.head is None:
            return
        if self.head.data == data:
            self.head = self.head.next
            return
        current = self.head
        while current.head is not None:
            if current.next.data == data:
                current.next = current.next.next
            current = current.next
        return
        