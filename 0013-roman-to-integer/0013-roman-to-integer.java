class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i + 1 == s.length()) {
                if (c == 'I') {
                    answer += 1;
                } if (c == 'V') {
                    answer += 5;
                } if (c == 'X') {
                    answer += 10;
                } if (c == 'L') {
                    answer += 50;
                } if (c == 'C') {
                    answer += 100;
                } if (c == 'D') {
                    answer += 500;
                } if (c == 'M') {
                    answer += 1000;
                }

                break;
            }
            
            char c2 = s.charAt(i + 1);
            if (c == 'I') {
                if (c2 == 'V') {
                    answer += 4;
                    i++;
                } else if (c2 == 'X') {
                    answer += 9;
                    i++;
                } else {
                    answer += 1;
                }
            }


            if (c == 'X') {
                if (c2 == 'L') {
                    answer += 40;
                    i++;
                } else if (c2 == 'C') {
                    answer += 90;
                    i++;
                } else {
                    answer += 10;
                }
            }
            if (c == 'C') {
                if (c2 == 'D') {
                    answer += 400;
                    i++;
                } else if (c2 == 'M') {
                    answer += 900;
                    i++;
                } else {
                    answer += 100;
                }
            }
                 if (c == 'V') {
                    answer += 5;
                } if (c == 'L') {
                    answer += 50;
                } if (c == 'D') {
                    answer += 500;
                } if (c == 'M') {
                    answer += 1000;
                }
        }
        return answer;
    }
}