import java.util.*;

class QueueNode
{
  int data;
  QueueNode next;

  public QueueNode(int data) 
  {
    this.data = data;
    this.next = null;
  }
}

class QueueLinkedList
{
  protected QueueNode front, rear;
  /*  Constructors  */
  public QueueLinkedList()
  {
    this.front = this.rear = null;
  }    

  /*  Function to EnQueue an element to the Queue */
  public void EnQueue(int data)
  {
    QueueNode temp = new QueueNode(data);
    System.out.println(data+" EnQueueed to Queue.");
    if (this.rear == null)
    {
      this.front = this.rear = temp;
      System.out.println("Front = "+this.front.data+", Rear = "+this.rear.data);
      return;
    }
    this.rear.next = temp;
    this.rear = temp;
    System.out.println("Front = "+this.front.data+", Rear = "+this.rear.data);
  }    

  /*  Function to DeQueue an element from the Queue */
  public int DeQueue()
  {
    // If queue is empty, return NULL.
    if (this.front == null)
      throw new NoSuchElementException("Underflow Exception") ;
    // Store previous front and move front one node ahead
    int temp = this.front.data;
    this.front = this.front.next;

    // If front becomes NULL, then change rear also as NULL
    if (this.front == null)
      this.rear = null;
    System.out.println(temp+" DeQueueped from Queue.");
    System.out.println("Front = "+this.front.data+", Rear = "+this.rear.data);
    return temp;
  }    
}

class LinkedQueue
{    
  public static void main(String[] args)
  {
    QueueLinkedList ls = new QueueLinkedList();
    ls.EnQueue(12);
    ls.EnQueue(23);
    try
    {
      ls.DeQueue();
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }    
    ls.EnQueue(54);
    try
    {
      ls.DeQueue();
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }    
    try
    {
      ls.DeQueue();
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }    
    try
    {
      ls.DeQueue();
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }    
  }
}
