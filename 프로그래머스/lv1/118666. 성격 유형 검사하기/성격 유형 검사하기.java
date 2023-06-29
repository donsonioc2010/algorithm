/*
1: R, T
2: C, F
3: J, M
4: A, N

Math.abs(4-Score);
choices
Survey[0]  : [1:매우 비동의], [2:비동의], [3:약간 비동의]
[4:모르겠다]
Survey[1] : [5:약간 동의], [6:동의], [7: 매우 동의]
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
  List<String> mapList = new ArrayList<>(List.of("RT", "CF", "JM", "AN"));
  HashMap<String, Map<String, Integer>> map = new HashMap<>() {
    {
      put("RT", new HashMap<>() {
        {
          put("R", 0);
          put("T", 0);
        }
      });
      put("CF", new HashMap<>() {
        {
          put("C", 0);
          put("F", 0);
        }
      });
      put("JM", new HashMap<>() {
        {
          put("J", 0);
          put("M", 0);
        }
      });
      put("AN", new HashMap<>() {
        {
          put("A", 0);
          put("N", 0);
        }
      });
    }
  };

  public String solution(String[] survey, int[] choices) {
    for (int i = 0; i < survey.length; i++) {
      String[] tempSurv = survey[i].split("");
      String mapKey = "";
      int score = 4 - choices[i];
      for (String tempListKey : mapList) {
        if (tempListKey.equals(tempSurv[0] + tempSurv[1]) || tempListKey.equals(tempSurv[1] + tempSurv[0])) {
          mapKey = tempListKey;
          break;
        }
      }

      if (score == 0) {
        continue;
      }

      if (score >= 0) {
        map.get(mapKey).put(tempSurv[0], map.get(mapKey).get(tempSurv[0]) + score);
      } else {
        map.get(mapKey).put(tempSurv[1], map.get(mapKey).get(tempSurv[1]) + Math.abs(score));
      }
    }
    StringBuilder sb = new StringBuilder();
    for (String key : mapList) {
      String[] inputKey = key.split("");

      Map<String, Integer> tempMap = map.get(key);

      if (tempMap.get(inputKey[0]) == tempMap.get(inputKey[1])) {
        sb.append(inputKey[0].charAt(0) - inputKey[1].charAt(0) > 0 ? inputKey[1] : inputKey[0]);
      } else {
        sb.append(tempMap.get(inputKey[0]) > tempMap.get(inputKey[1]) ? inputKey[0] : inputKey[1]);
      }
    }

    return sb.toString();
  }
}