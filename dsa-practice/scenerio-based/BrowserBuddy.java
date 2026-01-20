import java.util.Stack;

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

//  Manages browsing history 
class BrowserHistory {
    private HistoryNode current;

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current != null ? current.url : "Empty Tab";
    }
}

//  Represents a browser tab 
class Tab {
    BrowserHistory history = new BrowserHistory();

    public void open(String url) {
        history.visit(url);
    }

    public void back() {
        history.back();
    }

    public void forward() {
        history.forward();
    }

    public String getCurrentPage() {
        return history.getCurrentPage();
    }
}

//  Manages tabs
class BrowserManager {
    private Tab activeTab;
    private Stack<Tab> closedTabs = new Stack<>();

    public BrowserManager() {
        activeTab = new Tab();
    }

    public void openPage(String url) {
        activeTab.open(url);
    }

    public void back() {
        activeTab.back();
    }

    public void forward() {
        activeTab.forward();
    }

    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new Tab();
        System.out.println("Tab closed");
    }

    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No tabs to restore");
            return;
        }
        activeTab = closedTabs.pop();
        System.out.println("Tab restored. Current page: " +
                activeTab.getCurrentPage());
    }

    public void showCurrentPage() {
        System.out.println("Current Page: " +
                activeTab.getCurrentPage());
    }
}

// Main Class 
public class BrowserBuddy {
    public static void main(String[] args) {

        BrowserManager browser = new BrowserManager();

        browser.openPage("google.com");
        browser.openPage("github.com");
        browser.openPage("stackoverflow.com");

        browser.back();
        browser.forward();

        browser.showCurrentPage();

        browser.closeTab();
        browser.restoreTab();

        browser.showCurrentPage();
    }
}
