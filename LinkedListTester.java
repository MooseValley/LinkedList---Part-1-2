public class LinkedListTester
{
   public static void main (String[] args)
   {
      /*
      // Create a bunch of nodes:
      Node n1 = new Node ("Bella");
      Node n2 = new Node ("Sam");
      Node n3 = new Node ("Teenie");
      Node n4 = new Node ("Frankie");

      // Manually linked them together:
      n1.setNextNode (n2);
      n2.setNextNode (n3);
      n3.setNextNode (n4);

      // Keep a record of the first node:
      Node firstNode = n1;


      // Traverse all nodes and display the value of each:
      Node currNode = firstNode;

      while (currNode != null)
      {
         // Display the value of the node:
         System.out.println (currNode.getName () );

         // Move to the next node in the list:
         currNode = currNode.getNextNode ();
      }

      /*
      n101    <-- Programming
      n1 Bella
      n2 Sam
      n100    <--  Java
      n3 Teenie
      n4 Frankie
      */

      /*
      // Add new Node to the start of the Linked List:

      // Create a new Node:
      Node n100 = new Node ("Hankel");

      // Keep track of the current first node”:
      Node tempNode = firstNode;

      // Make out new node the new “first node”:
      firstNode     = n100;

      // Fix up the links - make the node next to our
      // new "first node" our original "first node":
      firstNode.setNextNode (tempNode);


      // Create a new Node:
      Node n101 = new Node ("Boogle");

      // Insert a new Node between n2 and n3:
      tempNode = n2.getNextNode ();
      n2.setNextNode (n101);
      n101.setNextNode (tempNode);

      currNode = firstNode;

      System.out.println ();
      //while (currNode.hasNextNode() == true)
      while (currNode != null)
      {
         System.out.println (currNode.getName () );
         currNode = currNode.getNextNode ();
      }

      /*
      n100    <-- Hankel
      n1 Bella
      n2 Sam
      n101    <--  Boogle
      n3 Teenie
      n4 Frankie
      */

      /*
      n4.setPriorNode   (n3);
      n3.setPriorNode   (n100);
      n100.setPriorNode (n2);
      n2.setPriorNode   (n1);
      n1.setPriorNode   (n101);

      Node lastNode = n4;

      currNode = lastNode;

      System.out.println ();
      //while (currNode.hasNextNode() == true)
      while (currNode != null)
      {
         System.out.println (currNode.getName () );
         currNode = currNode.getPriorNode ();
      }
      */

      LinkedList list = new LinkedList ();
      list.add ("Bella");
      list.add ("Sam");
      list.add ("Teenie");
      list.add ("Frankie");

      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (0); // Remove Bella
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (1); // Remove Teenie
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (1); // Remove Frankie
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (1); // Error
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (0); // Null
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

      list.remove (0); // Null
      System.out.println (list.toString() );
      System.out.println (list.toStringReverse() );

   }
}