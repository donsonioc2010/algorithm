class Solution {
  // N = i--, S = i++, W = j--, E = j++
  public int[] solution(String[] park, String[] routes) {
    int sX = 0, orgX = 0;
    int sY = 0, orgY = 0;
    String[][] parkMap = new String[park.length][park[0].length()];

    int xLeng = parkMap.length;
    int yLeng = parkMap[0].length;

    // Convert To Map
    for (int i = 0; i < park.length; i++) {
      parkMap[i] = park[i].split("");
    }
    // 시작위치 찾기
    for (int i = 0; i < parkMap.length; i++) {
      for (int j = 0; j < parkMap[i].length; j++) {
        if ("S".equals(parkMap[i][j])) {
          sX = orgX=i;
          sY = orgY=j;
          break;
        }
      }
    }

    // 이동
    for (int i = 0; i < routes.length; i++) {
      String[] tempRoute = routes[i].split(" ");
      int loopNum = Integer.parseInt(tempRoute[1]);

      boolean isAble = true;
      for (int j = 0; j < loopNum; j++) {
        int tX = sX;
        int tY = sY;
        if ("N".equals(tempRoute[0])) {
          tX--;
        } else if ("S".equals(tempRoute[0])) {
          tX++;
        } else if ("W".equals(tempRoute[0])) {
          tY--;
        } else if ("E".equals(tempRoute[0])) {
          tY++;
        }
        // Map을 벗어난다.
        if (tX < 0 || tY < 0 || tX >= xLeng || tY >= yLeng) {
          isAble = false;
          break;
        }
        if ("X".equals(parkMap[tX][tY])) {
          isAble = false;
          break;
        }
        sX = tX;
        sY = tY;
      }
        
      if(!isAble)  {
          sX = orgX;
          sY = orgY;
      }else{
          orgX = sX;
          orgY = sY;
      }
    }

    return new int[] { sX, sY };
  }
}