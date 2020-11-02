public class Browser {
  public void navigate(String address) {
    String ip = findIpAddress(address);
  }

  public String findIpAddress(String address) {
    return "127.0.0.1";
  }

  public String findIpAddress() {
    return "127.0.0.1";
  }

}
