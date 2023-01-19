// https://leetcode.com/problems/hand-of-straights/



class Solution {
  public boolean isNStraightHand(int[] hand, int groupSize) {
    if (hand.length % groupSize != 0) {
      return false;
    }

    HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
    for (int i = 0; i < hand.length; i++) {
      if (map.containsKey(hand[i])) {
        map.put(hand[i], map.get(hand[i]) + 1);
      } else {
        map.put(hand[i], 1);
      }
    }
    for (int x: hand) {
      int temp = x;
      int count = groupSize;
      if (map.get(temp) > 0) {

        while (map.containsKey(temp - 1) && map.get(temp - 1) > 0) {
          temp--;
        }
        while (count != 0) {
          if (map.containsKey(temp) && map.get(temp) > 0) {
            map.put(temp, map.get(temp) - 1);
            temp++;
          } else {
            break;
          }
          count--;
        }
        if (count != 0) {
          return false;
        }
      }
    }
    return true;

  }
}
