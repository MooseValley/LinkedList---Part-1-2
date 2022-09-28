/*
 Author: Moose OMalley
 Source: Node.java
Descrtn: Simple Node class to go along with the LinkedList.java class.


UML Class Diagram

Singularly Linked List:

-----------------------------
Node
-----------------------------
-name: String
-nextNode: Node
-----------------------------
+<<constructor>> Node ()
+<<constructor>> Node (String name)
+hasNextNode (): boolean
+getNextNode (): Node
+getName (): String
+setNextNode (Node nextNode): void
-----------------------------

Doubly Linked List changes:

-----------------------------
-priorNode: Node
-----------------------------
+hasPriorNode (): boolean
+getPriorNode (): Node
+setPriorNode (Node priorNode): void
-----------------------------

Further notes:
* hasNextNode () returns true if the nextNode is not null, otherwise returns false (if nextNode is null).


*/
public class Node
{
   private String name;
   private Node   nextNode;
   private Node   priorNode;


   public Node ()
   {
      this ("");
   }

   public Node (String name)
   {
      this.name = name;
      nextNode  = null;
      priorNode = null;
   }

   public void setNextNode (Node nextNode)
   {
      this.nextNode  = nextNode;
   }

   public void setPriorNode (Node priorNode)
   {
      this.priorNode  = priorNode;
   }

   public Node getNextNode ()
   {
      return nextNode;
   }

   public Node getPriorNode ()
   {
      return priorNode;
   }

   public boolean hasNextNode ()
   {
      return nextNode  != null;
   }

   public String getName ()
   {
      return name;
   }
}