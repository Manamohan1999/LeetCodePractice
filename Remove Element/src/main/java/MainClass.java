public class MainClass {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int num = new Solution().removeElement(arr, 3);
        for (int i = 0;i < num; i++){
            System.out.println(arr[i]);
        }
    }
}
