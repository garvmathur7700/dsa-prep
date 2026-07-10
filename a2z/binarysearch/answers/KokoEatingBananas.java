package binarysearch.answers;

class KokoEatingBananas {
  public int minEatingSpeed(int[] piles, int maximumHours) {
    int start = 1, end = max(piles);
    int minEatingSpeedAnswer = 0;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      long bananasPerHour = calculateEatingVelocity(piles, mid);

      if (bananasPerHour <= maximumHours) {
        minEatingSpeedAnswer = mid;
        end = mid - 1;
      } else
        start = mid + 1;
    }

    return minEatingSpeedAnswer;
  }

  private long calculateEatingVelocity(int[] piles, int speed) {
    long velocity = 0;

    for (int pile : piles)
      velocity += Math.ceilDiv(pile, speed);

    return velocity;
  }

  private int max(int[] piles) {
    int max = -1;
    for (int pile : piles)
      if (pile > max)
        max = pile;

    return max;
  }
}
