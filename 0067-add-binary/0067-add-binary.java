class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = 0;

            if (i >= 0) {
                sum += Integer.parseInt(a.substring(i, i + 1));
            }
            if (j >= 0) {
                sum += Integer.parseInt(b.substring(j, j + 1));
            }

            sum += carry;
            carry = sum / 2;
            sb.insert(0, sum % 2);
            i--;
            j--;
        }

        return sb.toString();
    }
}