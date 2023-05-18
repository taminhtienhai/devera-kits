public class DeclareVariable {
    public static void main(String[] args) {

        /// 1. Khai báo biến mutable
        // int a = 2;
        // String address = "";

        // a += 1;
        // address = address.concat("Ly Thai To");


        /// 2. Khai báo biến final
        // final int a = 2;
        // final String address = "";

        /// Error!!!
        // a += 1;
        // address = address.concat("Ly Thai To");


        // final int a  =  2;
        //   ^    ^  ^  ^  ^
        //   |    |  |  |  |
        //  (1)  (2)(3)(4)(5)

        /// (1): Khả năng thay đổi của biến 
        /// (2): Kiểu dữ liệu
        /// (3): Tên biến
        /// (4): Dấu '=' dùng để gán giá trị cho biến
        /// (5): Giá trị của biến 
    }

    public void test() {
        assert 1 == 1;
    }
}
