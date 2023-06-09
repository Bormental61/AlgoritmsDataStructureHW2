// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkList list = new LinkList();
        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.last = node;
        }

        System.out.println("Созданный рандомно список:");
        System.out.println(list.toString());
        System.out.println("Развернутый список: ");
        System.out.println(list.reverse());
    }
}