package leetCode;

public class PlusOne {

    public static void main(String[] args) {
        int[] sol = plusOne(new int[]{1,2,3});
        for (int i : sol) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int takeover = 1;
        for (int i = digits.length - 1; i >=0; i--){
            int sum = digits[i] + takeover;
            if(sum < 10){
                digits[i] = sum;
                break;
            }
            if(i == 0){
                digits = copyValueToNewArray(digits);
                break;
            }
            digits[i] = sum - 10;
        }

        return digits;
    }

    public static int[] copyValueToNewArray(int[] digits){
        int[] temp = new int[digits.length +1];
        temp[0] = 1;
        temp[1] = 0;
        for (int i = 1; i < digits.length; i++) {
            temp[i + 1] = digits[i];
        }
        return temp;
    }

}
