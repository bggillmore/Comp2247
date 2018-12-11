
/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: EmptyQueueException
* Description: Exception for MyArrayListQueue that defines the exception for an empty queue
*/

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(String err) {
    super(err);
  }
}
