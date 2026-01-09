class ProcessNode {
    int pid, burst;
    ProcessNode next;

    ProcessNode(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
    }
}

class RoundRobin {
    ProcessNode head;

    void addProcess(int pid, int burst) {
        ProcessNode node = new ProcessNode(pid, burst);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void execute(int quantum) {
        ProcessNode curr = head;
        while (head != null) {
            if (curr.burst > quantum) {
                curr.burst -= quantum;
            } else {
                System.out.println("Process " + curr.pid + " completed");
                remove(curr.pid);
            }
            curr = curr.next;
        }
    }

    void remove(int pid) {
        ProcessNode curr = head, prev = null;
        do {
            if (curr.pid == pid) {
                if (prev != null) prev.next = curr.next;
                else head = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}
