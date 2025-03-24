public class Main {
  public static void main(String[] args) {
      BST<Integer> lab5Tree = new BST<>();
      
      // Insert values into BST
      int[] values = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
      for (int value : values) {
          lab5Tree.insert(value);
      }
      
      // Delete value 17
      lab5Tree.delete(17);
      
      // Inorder traversal (sorted)
      System.out.print("Inorder traversal: ");
      lab5Tree.inorder();
      System.out.println();
      
      // Postorder traversal
      System.out.print("Postorder traversal: ");
      lab5Tree.postorder();
      System.out.println();
      
      // Preorder traversal
      System.out.print("Preorder traversal: ");
      lab5Tree.preorder();
      System.out.println();
      
      // Search for values 36 and 37
      System.out.println("Search for 36: " + lab5Tree.search(36));
      System.out.println("Search for 37: " + lab5Tree.search(37));
      
      // Display the path from root to 2
      System.out.print("Path to 2: ");
      printPath(lab5Tree.path(2));
      
      // Display the path from root to 34
      System.out.print("Path to 34: ");
      printPath(lab5Tree.path(34));
  }
  
  // Helper method to print the path
  private static void printPath(java.util.ArrayList<BST.TreeNode<Integer>> path) {
      for (BST.TreeNode<Integer> node : path) {
          System.out.print(node.element + " ");
      }
      System.out.println();
  }
}
