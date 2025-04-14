public class daemonthread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                // Perform background task
                System.out.println("Hii vivek");
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(daemonThread);
    }
}
