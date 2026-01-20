package BrowserBuddy;
import java.util.Stack;

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
