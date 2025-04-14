class MyRunnable implements Runnable {
    private int threadId;

    // 建構子，用於初始化執行緒的 ID
    public MyRunnable(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadId + ": Starting");
        try {
            Thread.sleep(1000); // 模擬一些工作（睡眠 1 秒）
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadId + ": Interrupted");
        }
        System.out.println("Thread " + threadId + ": Finishing");
    }
}

// 主類別
public class test2 {
    public static void main(String[] args) {
        int numThreads = 3; // 執行緒數量
        Thread[] threads = new Thread[numThreads];

        // 建立並啟動多個執行緒
        for (int i = 0; i < numThreads; i++) {
            System.out.println("Main: Creating thread " + (i + 1));
            threads[i] = new Thread(new MyRunnable(i + 1));
            threads[i].start();
        }

        // 等待所有執行緒完成
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Main: Interrupted while waiting for thread " + (i + 1));
            }
        }

        System.out.println("Main: All threads finished");
    }
}
