class TicketNode {
    int ticketId;
    String customer, movie, seat, time;
    TicketNode next;

    TicketNode(int id, String customer, String movie, String seat, String time) {
        this.ticketId = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

class TicketCircularList {
    TicketNode head;

    void addTicket(TicketNode node) {
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " - " + temp.customer);
            temp = temp.next;
        } while (temp != head);
    }
}
