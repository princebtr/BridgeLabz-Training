class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieDoublyList {
    MovieNode head, tail;

    // Add at end
    void addMovie(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Remove by title
    void removeMovie(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title + " - " + temp.rating);
            temp = temp.next;
        }
    }

    // Update rating
    void updateRating(String title, double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " (" + temp.rating + ")");
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " (" + temp.rating + ")");
            temp = temp.prev;
        }
    }
}
