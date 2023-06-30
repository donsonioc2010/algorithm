class Solution {
  public int[] solution(String[] wallpaper) {
    String[][] wallPaperMap = new String[wallpaper.length][wallpaper[0].length()];
    int lux = Integer.MAX_VALUE;
    int luy = Integer.MAX_VALUE;
    int rdx = Integer.MIN_VALUE;
    int rdy = Integer.MIN_VALUE;

    for (int i = 0; i < wallpaper.length; i++) {
      wallPaperMap[i] = wallpaper[i].split("");
    }

    for (int i = 0; i < wallPaperMap.length; i++) {
      for (int j = 0; j < wallPaperMap[i].length; j++) {
        if ("#".equals(wallPaperMap[i][j])) {
          lux = Math.min(lux, i);
          luy = Math.min(luy, j);
          rdx = Math.max(rdx, i);
          rdy = Math.max(rdy, j);
        }
      }
    }

    rdx++;
    rdy++;

    return new int[] { lux, luy, rdx, rdy };
  }
}