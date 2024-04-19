import java.util.Arrays;
//z-array?
public class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] res = new char[n];
        Arrays.fill(res, '$');
        char ch = 'a';
        int add = 1;
        res[0] = 'a';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j && lcp[i][j] != n - i){
                    return "";
                }
                if(lcp[i][j] > n - i || lcp[i][j] > n - j){
                    return "";
                }
                if(lcp[i][j] > 0){
                    res[j] = res[i];
                    int c = lcp[i][j];
                    int it = i;
                    int jt = j;
                    while(c != 0){
                        res[jt] = res[it];
                        c--;
                    }
                }else {
                    ch += add;
                    res[j] = ch;

                }

            }
        }

        return new String(res);
    }
}

