public class App {
    public static void main(String[] args) {
        var myBrowser = new Browser();
        System.out.println(myBrowser.findIpAddress());
        var spike = new Dog("Spike", "dachsund");
        System.out.println(spike.getName() + " was a cool " + spike.getBreed());
        var stray = new Dog("Lefty");
        System.out.println(stray.getBreed());
    }
}