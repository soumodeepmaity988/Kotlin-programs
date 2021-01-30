import java.util.*

internal class Node(var data: Int) {
    var next: Node? = null
}

internal class LinkedList {
    fun push(head: Node?, newNode: Node): Node {
        var head = head
        if (head == null) {
            head = newNode
        } else {
            val temp: Node = head
            head = newNode
            newNode.next = temp
        }
        return head
    }

    fun reverseList(head: Node?): Node? {
        var head = head
        var next: Node? = null
        var prev: Node? = null
        var current = head
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
        return head
    }

    fun printList(head: Node?) {
        var temp = head
        while (temp != null) {
            print(temp.data.toString() + " ")
            temp = temp.next
        }
    }
}

internal object Reverse_a_LinkedList {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val linkedList = LinkedList()
        var head: Node? = null
        //Node node=new Node(1);
        head = linkedList.push(head, Node(1))
        head = linkedList.push(head, Node(2))
        head = linkedList.push(head, Node(3))
        head = linkedList.push(head, Node(4))
        head = linkedList.push(head, Node(5))
        linkedList.printList(head)
        head = linkedList.reverseList(head)
        println()
        linkedList.printList(head)
        scanner.close()
    }
}