class TaskNode {
    int id;
    String name, priority, dueDate;
    TaskNode next;

    TaskNode(int id, String name, String priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskCircularList {
    TaskNode head = null;

    void addTask(int id, String name, String priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void removeTask(int id) {
        if (head == null) return;

        TaskNode curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " - " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}

