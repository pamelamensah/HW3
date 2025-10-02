/*
 * *** Pamela Mensah / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
      Set<Integer> result = new TreeSet<>();

      for (Integer x : setA) {
          if (!setB.contains(x)) {
              result.add(x);
          }
      }

      for (Integer x : setB) {
          if (!setA.contains(x)) {
              result.add(x);
          }
      }

      return result;
    }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

      ArrayList<Integer> keys = new ArrayList<>(treeMap.keySet());

      for (Integer k : keys) {
          if (k % 2 == 0) {
              treeMap.remove(k);
          }
      }
  }

  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    if (tree1 == null && tree2 == null) return true;
        if (tree1 == null || tree2 == null) return false;
        if (tree1.size() != tree2.size()) return false;

        for (Integer k : tree1.keySet()) {
            if (!tree2.containsKey(k)) return false;
            String v1 = tree1.get(k);
            String v2 = tree2.get(k);
            if (v1 == null) {
                if (v2 != null) return false;
            } else {
                if (!v1.equals(v2)) return false;
            }
        }

        return true;
    }
  } // end treeProblems class
