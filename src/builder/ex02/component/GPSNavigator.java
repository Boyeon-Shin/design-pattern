package builder.ex02.component;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "21b, Baker Street, London  to Scotland Yard, 8-10 Broadway, Londo";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
