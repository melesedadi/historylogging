public class Main {
    public static void main(String[] args) {
        String[] presidents = new String[10];
        presidents[0] = "Kennedy";
        presidents[1] = "Johnson";
        presidents[2] = "Nixon";
        presidents[3] = "Ford";
        presidents[4] = "Carter";
        presidents[5] = "Reagan";
        presidents[6] = "Bush";
        presidents[7] = "Clinton";
        presidents[8] = "Bush";
        presidents[9] = "Obama";
        String reverse = "";

        for (int i = 0; i < presidents.length; i++) {
//            presidents[i] = presidents[presidents.length - i - 1];
//            String arr = presidents[i];
//            presidents[presidents.length - i - 1] = arr;
//            System.out.println(arr);
        }
        {
            for (String num : presidents) {
                System.out.println(num);
            }
        }
    }
}


//Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama