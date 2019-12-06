class QueueArray
{
  static int SIZE=10;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];

  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if (rear == SIZE)   // Queue is full
      return;
    if(front == -1 && rear == -1){
      front++;
      rear++;
    }
    else
      rear++;
    array[rear] = item;
    System.out.println(item+" enqueued to queue.");
  }

  // Method to remove an item from queue.
  int dequeue()
  {
    if (front > rear)
    {
      System.out.println("Queue is Empty.");
      return -1;
    }
    int item = array[front];
    front++;
    System.out.println(item+" dequeued from queue.");
    return item;
  }

  public static void main(String args[])
  {
    QueueArray ob1=new QueueArray();
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.enqueue(10);
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.enqueue(20);
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.enqueue(30);
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.enqueue(40);
    System.out.println("Front = "+front+ ", Rear = "+rear);

    ob1.dequeue();
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.dequeue();
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.dequeue();
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.dequeue();
    System.out.println("Front = "+front+ ", Rear = "+rear);
    ob1.dequeue();
    System.out.println("Front = "+front+ ", Rear = "+rear);

    ob1.enqueue(50);
    System.out.println("Front = "+front+ ", Rear = "+rear);
  }
}
