package VongLapFor;

public class VongLapForCaiTien {
    //sử dụng khi muốn lặp 1 phần tử trong mảng hoặc 1 collection
    //duyệt lần lượt giá trị từ đầu đến cuối trong mảng
    public static void main(String[] args) {
        int arr[] = {12, 23, 44, 56, 78}; // Mảng: chứa nhiều giá trị cùng kiểu dữ liệu
        for (int i : arr){
            System.out.println(i);
        }

        for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
}