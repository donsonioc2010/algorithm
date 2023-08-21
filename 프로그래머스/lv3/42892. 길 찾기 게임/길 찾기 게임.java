import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
  public int[][] solution(int[][] nodeinfo) {
    List<Node> list = new ArrayList<>();
    IntStream.range(0, nodeinfo.length)
        .forEach(i -> list.add(new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1], null, null)));
    Collections.sort(list);

    Node root = list.get(0);
    for (int i = 1; i < list.size(); i++)
      insertNode(root, list.get(i));

    return new int[][] {
        preOrder(new ArrayList<Integer>(), root).stream().mapToInt(Integer::intValue).toArray(),
        postOrder(new ArrayList<Integer>(), root).stream().mapToInt(Integer::intValue).toArray()
    };
  }

  private static List<Integer> preOrder(List<Integer> orderList, Node node) {
    if (node != null) {
      orderList.add(node.num);
      preOrder(orderList, node.left);
      preOrder(orderList, node.right);
    }
    return orderList;
  }

  private static List<Integer> postOrder(List<Integer> orderList, Node node) {
    if (node != null) {
      postOrder(orderList, node.left);
      postOrder(orderList, node.right);
      orderList.add(node.num);
    }
    return orderList;
  }

  static void insertNode(Node parent, Node child) {
    if (parent.x > child.x) {
      if (parent.left == null)
        parent.left = child;
      else
        insertNode(parent.left, child);
    } else {
      if (parent.right == null)
        parent.right = child;
      else
        insertNode(parent.right, child);
    }
  }

  static class Node implements Comparable<Node> {
    int num;
    int x;
    int y;
    Node left;
    Node right;

    Node(int num, int x, int y, Node left, Node right) {
      this.num = num;
      this.x = x;
      this.y = y;
      this.left = left;
      this.right = right;
    }

    @Override
    public int compareTo(Node o) {
      if (this.y == o.y)
        return this.x - o.x;
      return o.y - this.y;
    }
  }
}