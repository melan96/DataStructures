import java.util.Scanner;
class Main extends Thread {

    //QueueX printerQueue = new QueueX(5);

    QueueX evenQueue = new QueueX(5);
    QueueX oddQueue = new QueueX(5);
    public static void main(String[] args) {







        Main myThread = new Main();
        myThread.start();
    }
    public void run() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Transaction ID  " + (i + 1));
            int intVal = scan.nextInt();
            if (intVal % 2 == 0) {
                evenQueue.insert(intVal);
            } else {
                oddQueue.insert(intVal);
            }
        }
        try {
            //show removing order PC1
            try {
                System.out.println("PC 1 Removing Order  ");
                while (!evenQueue.isEmpty()) {
                    System.out.println("Transaction  : " + evenQueue.remove());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                //show removing order PC2
                System.out.println("PC 2 Removing Order  ");
                while (!oddQueue.isEmpty()) {
                    System.out.println("Transaction  : " + oddQueue.remove());
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}