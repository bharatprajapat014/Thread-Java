public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the new thread
        System.out.println("New thread running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Start the new thread
        System.out.println("Main thread running");
    }
}
In this example, we define a class MyThread that extends the Thread class and overrides its run() method. The run() method contains the code to be executed in the new thread.

In the Main class, we create a new instance of MyThread and start it by calling its start() method. This will execute the run() method in a new thread. Meanwhile, the main thread continues to execute the rest of the code.

When you run this program, you should see the following output:
+---------------------+
| Main thread running |
| New thread running  |
+---------------------+  
This indicates that the main thread and the new thread are both running concurrently.




