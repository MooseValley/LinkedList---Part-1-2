/*
 Author: Moose OMalley
 Source: LinkedList.java
Descrtn: Simple double LinkedList class.  Requires Node.java.


UML Class Diagram

-----------------------------
LinkedList
-----------------------------
-size: int
-firstNode: Node
-lastNode: Node
-----------------------------
+<<constructor>> LinkedList ()
+add (String name): boolean
+append (String name): boolean
+insert (int index, String name): boolean
+getValue (int index): String
+size(): int
+toString (): String
-----------------------------

Further notes:
* add() adds a new Node at the start of the Linked List.
* append() adds a new Node at the end of the Linked List.
* insert() inserts a new Node into the middle of the Linked List.
* getValue() retrieves the value of a particular Node.

*/

public class LinkedList
{
   private Node firstNode;
   private Node lastNode;
   private int  size;

   public LinkedList ()
   {
      firstNode = null;
      size      = 0;
   }



   public boolean add (String name)
   {
      Node newNode = new Node (name);

      /*
      Node currNode  = firstNode;
      Node priorNode = null;

      while (currNode != null)
      {
         //System.out.println (currNode.getName () );

         priorNode = currNode;
         currNode  = currNode.getNextNode ();
      }

      if (priorNode == null)
         firstNode = newNode;
      else
         priorNode.setNextNode (newNode);
      */

      if (firstNode == null)  // Is list empty ?
      {
         firstNode = newNode;
         lastNode  = newNode;
         size++;
      }
      else
      {
         lastNode.setNextNode (newNode);
         newNode.setPriorNode (lastNode);
         lastNode  = newNode;
         size++;
      }


      return true;
   }

   public int size()
   {
      return size;
   }

   // 0 = 1st node, 1 = 2nd node, etc ...
   public boolean remove (int nodeNum)
   {
      if ((nodeNum < 0) || (nodeNum > size - 1))
          return false; // ERROR

      int count = 0;
      Node removeNode = firstNode;
      while (count < nodeNum)
      {
         removeNode = removeNode.getNextNode ();
         count++;
      }

      if (removeNode != null)
      {
         //System.out.println ("removeNode: " + removeNode.getName() );
         size--;

         Node priorNode = removeNode.getPriorNode();
         Node nextNode  = removeNode.getNextNode();

         //System.out.println ("priorNode: " + priorNode);
         //System.out.println ("nextNode: "  + nextNode);

         if (priorNode != null)
         {
            //System.out.println ("priorNode: " + priorNode.getName() );
            priorNode.setNextNode (nextNode);
         }

         if (nextNode != null)
         {
            //System.out.println ("nextNode: " + nextNode.getName() );
            nextNode.setPriorNode (priorNode);
         }

         if (firstNode == removeNode)
            firstNode = nextNode;

         if (lastNode == removeNode)
            lastNode = priorNode;
      }

      return true; // All OK.
   }


   @Override
   public String toString ()
   {
      Node currNode  = firstNode;
      String results = "" + size + ": ";

      while (currNode != null)
      {
         results  += currNode.getName () + ", ";

         currNode  = currNode.getNextNode ();
      }

      return results;
   }

   public String toStringReverse ()
   {
      Node currNode  = lastNode;
      String results = "" + size + ": ";

      while (currNode != null)
      {
         results  += currNode.getName () + ", ";

         currNode  = currNode.getPriorNode ();
      }

      return results;
   }

}