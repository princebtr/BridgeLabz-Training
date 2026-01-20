package BrowserBuddy;

//  Doubly Linked List Node
class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    HistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
