package BrowserBuddy;

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
