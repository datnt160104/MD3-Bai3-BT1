package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Enter the element to delete: ");
        int x = sc.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không.
        int index_del = -1; // Khởi tạo index_del = -1 để đánh dấu không tìm thấy X trong mảng
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        // Nếu X không xuất hiện trong mảng, hiển thị thông báo và kết thúc chương trình
        if (index_del == -1) {
            System.out.println("The element " + x + " does not exist in the array.");
            return;
        }

        // Bước 4: Thực hiện xoá phần tử X khỏi mảng
        for (int i = index_del; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // Giảm số phần tử của mảng đi 1

        // Bước 5: Kết thúc duyệt mảng. In ra mảng.
        System.out.print("The updated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
