class BookNode {
    String title, author, genre;
    int id;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

class LibraryList {
    BookNode head, tail;

    void addBook(BookNode book) {
        if (head == null) {
            head = tail = book;
            return;
        }
        tail.next = book;
        book.prev = tail;
        tail = book;
    }

    void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
