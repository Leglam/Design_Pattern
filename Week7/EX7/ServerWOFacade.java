public class ServerWOFacade {
  public static void main(String[] args) {
		ServerManager Server = new ServerManager();
		Server.start();
		System.out.println("Start working......");
		System.out.println("After work done.........");
		Server.stop();
  }
}
