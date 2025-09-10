package practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        String[] wordList = {"dot","dog","lot","log","cog", "hot"};
        System.out.println(ladderLength(beginWord, endWord, Arrays.asList(wordList)));
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> words = new HashSet<>(wordList);
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        int transformationCount = 1;

        if (!words.contains(endWord)) return 0;

        queue.add(beginWord);
        visited.add(beginWord);

        while(!queue.isEmpty()) {
            int size = queue.size();
            transformationCount++;
            while(size-- > 0) {
                String currentWord = queue.poll();
                if (Objects.equals(currentWord, endWord)) return transformationCount;
                for(String str: words) {
                    if (isNextWordPossible(currentWord, str) && !visited.contains(str)) {
                        queue.add(str);
                        visited.add(str);
                    }
                }
            }
        }
        return 0;
    }
    private static boolean isNextWordPossible(String word, String nextWord) {
        char[] wordA = word.toCharArray();
        char[] wordB = nextWord.toCharArray();
        int count = 0;
        for(int i = 0; i < wordA.length; i++) {
            if(wordA[i] != wordB[i]) {
                count++;
            }
        }
        return count == 1;
    }
}
