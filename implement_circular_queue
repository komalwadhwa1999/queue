#include <stdio.h>

#define SIZE 10

int front=-1, rear=-1;
int array[SIZE];

// Method to add an item to the queue.
void enqueue(int item)
{
  if ((front == 0 && rear == SIZE-1) || (rear == (front-1)%(SIZE-1))) {  // Queue is full
    printf("Queue is FULL.\n");
    return;
  }
  if(front == -1)	  // Insert first element
    front = rear = 0;
  else if (rear == SIZE-1 && front != 0)	  // insert the element back at starting of queue.
    rear = 0;
  else		  // insert the element normally
    rear++;

  array[rear] = item;
  printf("%d enqueued to queue.\n",item);
}

// Method to remove an item from queue.
int dequeue()
{
  if (front == -1)
  {
    printf("Queue is Empty.\n");
    return -1;
  }
  int item = array[front];
  if (front == rear)
    front = rear = -1;
  else if (front == SIZE-1)
    front = 0;
  else
    front++;

  printf("%d dequeued from queue.\n",item);
  return item;
}

int main()
{
  printf("Front = %d, Rear = %d\n",front,rear);
  enqueue(10);
  printf("Front = %d, Rear = %d\n",front,rear);
  enqueue(20);
  printf("Front = %d, Rear = %d\n",front,rear);
  enqueue(30);
  printf("Front = %d, Rear = %d\n",front,rear);
  enqueue(40);
  printf("Front = %d, Rear = %d\n",front,rear);
  dequeue();
  printf("Front = %d, Rear = %d\n",front,rear);
  dequeue();
  printf("Front = %d, Rear = %d\n",front,rear);
  dequeue();
  printf("Front = %d, Rear = %d\n",front,rear);
  dequeue();
  printf("Front = %d, Rear = %d\n",front,rear);
  dequeue();
  printf("Front = %d, Rear = %d\n",front,rear);
  enqueue(50);
  printf("Front = %d, Rear = %d\n",front,rear);
  return 0;
}
