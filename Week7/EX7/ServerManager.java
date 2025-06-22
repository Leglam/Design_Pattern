public class ServerManager {
  private ScheduleServer scheduleServer;

  public ServerManager() {
    this.scheduleServer = new ScheduleServer();
  }

  public void start() {
    scheduleServer.startBooting();
	  scheduleServer.readSystemConfigFile();
	  scheduleServer.init();
	  scheduleServer.initializeContext();
	  scheduleServer.initializeListeners();
	  scheduleServer.createSystemObjects();
  }

  public void stop() {
    scheduleServer.releaseProcesses();
    scheduleServer.destory();
    scheduleServer.destroySystemObjects();
    scheduleServer.destoryListeners();
    scheduleServer.destoryContext();
    scheduleServer.shutdown();
  }
}
