class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

class UndoRedo {
    TextState current;

    void addState(String content) {
        TextState node = new TextState(content);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void show() {
        if (current != null)
            System.out.println(current.content);
    }
}
