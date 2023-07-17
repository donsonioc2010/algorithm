import java.util.*;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    System.out
        .println(Arrays.toString(new Solution().solution(new String[] { "classic", "pop", "classic", "classic", "pop" },
            new int[] { 500, 600, 150, 800, 2500 })));
    ;
  }

  public int[] solution(String[] genres, int[] plays) {
    Map<String, Genres> genresMap = new HashMap<>();
    for (int i = 0; i < genres.length; i++) {
      if (genresMap.containsKey(genres[i])) {
        Genres temp = genresMap.get(genres[i]);
        temp.addSum(plays[i]);
        temp.addMap(new Music(i, plays[i]));
      } else {
        genresMap.put(genres[i], new Genres(genres[i], plays[i], new Music(i, plays[i])));
      }
    }
    List<Genres> keySet = genresMap.entrySet().stream()
        .sorted((o1, o2) -> o2.getValue().totalSum - o1.getValue().totalSum)
        .map(o -> o.getValue())
        .collect(Collectors.toList());

    List<Integer> answer = new ArrayList<>();
    for (Genres g : keySet) {
      for (int i = 0; i < 2; i++) {
        if (!g.list.isEmpty())
          answer.add(g.list.poll().idx);
      }
    }

    return answer.stream().mapToInt(Integer::valueOf).toArray();
  }

  static class Genres {
    String genre;
    int totalSum = 0;
    PriorityQueue<Music> list = new PriorityQueue<>();

    Genres(String genre, int total, Music o) {
      this.genre = genre;
      this.totalSum = total;
      this.list.add(o);
    }

    void addSum(int num) {
      this.totalSum += num;
    }

    void addMap(Music o) {
      this.list.add(o);
    }
  }

  static class Music implements Comparable<Music> {

    int idx;
    int plays;

    Music(int idx, int plays) {
      this.idx = idx;
      this.plays = plays;
    }

    @Override
    public int compareTo(Music o) {
      return o.plays - this.plays;
    }

  }
}