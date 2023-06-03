

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

  private static final int DNA_ALPHABET_NUM = 4;
  private static int[] CHKARY = new int[DNA_ALPHABET_NUM];
  private static int[] MYARY = new int[DNA_ALPHABET_NUM];
  private static int CHECK_COUNT;

  private static int RESULT;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int S = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());

    char[] sentenceAry = br.readLine().toCharArray();

    CHECK_COUNT = 0;

    // 확인해야 할 카운트 배열로 생성
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < DNA_ALPHABET_NUM; i++) {
      CHKARY[i] = Integer.parseInt(st.nextToken());
      if (CHKARY[i] == 0) {
        CHECK_COUNT++;
      }
    }

    //초기값 셋팅
    for (int i = 0; i < P; i++) {
      Add(sentenceAry[i]);
    }
    RESULT = 0;

    ChkResult();

    for (int i = P; i < S; i++) {
      int j = i - P;
      Add(sentenceAry[i]);
      Minus(sentenceAry[j]);
      ChkResult();
    }
    System.out.println(RESULT);
    br.close();
  }

  private static void ChkResult() {
    if (CHECK_COUNT == 4) {
      RESULT++;
    }
  }


  /*
  0: A
  1: C
  2: G
  3: T
   */

  private static void Add(char c) {
    switch (c) {
      case 'A':
        AryCompareAndAddCount(0);
        break;
      case 'C':
        AryCompareAndAddCount(1);
        break;
      case 'G':
        AryCompareAndAddCount(2);
        break;
      case 'T':
        AryCompareAndAddCount(3);
        break;

    }
  }

  private static void AryCompareAndAddCount(int idx) {
    MYARY[idx]++;
    if (MYARY[idx] == CHKARY[idx]) {
      CHECK_COUNT++;
    }
  }

  private static void Minus(char c) {
    switch (c) {
      case 'A':
        AryCompareAndMinusCount(0);
        break;
      case 'C':
        AryCompareAndMinusCount(1);
        break;
      case 'G':
        AryCompareAndMinusCount(2);
        break;
      case 'T':
        AryCompareAndMinusCount(3);
        break;
    }
  }

  private static void AryCompareAndMinusCount(int idx) {
    if (MYARY[idx] == CHKARY[idx]) {
      CHECK_COUNT--;
    }
    MYARY[idx]--;
  }
}
