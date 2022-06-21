package BaiTap12;

import java.util.*;

public class ProductManager  {
        static List<Product> productList = new ArrayList<>();

//    public ProductManager() {
//        productList =new ArrayList<>();
//    }

        public static void addProduct(Scanner scanner){
            System.out.println("Nhap id: ");
            int id = scanner.nextInt();

            if (checkId(id)) {
                System.out.print("Nhap ten: ");
                String ten = scanner.next();
                System.out.print("Nhap gia: ");
                double gia = scanner.nextDouble();

                Product product =new Product(id,gia,ten);
                productList.add(product);
            }else System.out.println("ko the them vao");

        }

        public static boolean checkId(int id){
            for (Product product : productList) {
                if (product.getId() == id){
                    return false;
                }
            }
            return true;
        }
        public static void editProductByID(Scanner scanner){
            System.out.print("nhap id: ");
            int id = scanner.nextInt();
            if (!checkId(id)){
                for (Product product : productList) {
                    if (product.getId() == id){
                        System.out.println("nhap ten moi:");
                        String ten = scanner.next();
                        product.setTen(ten);
                        System.out.println("nhap gia moi: ");
                        double gia = scanner.nextDouble();
                        product.setGia(gia);
                    }
                }

            }else {
                System.out.println("ko ton tai san pham");
            }
        }

        public static void deleteProductByID(Scanner scanner){
            System.out.print("nhap id: ");
            int id = scanner.nextInt();
            if (checkId(id)) {
                productList.removeIf(product -> product.getId() == id);
            }else System.out.println("ko ton tai san pham");
        }

        public static void displayAll(){
            for (Product product : productList) {
                System.out.println(product);
            }
        }

        public static Product findProductByName(Scanner scanner){
            System.out.println("nhap ten sp muon tim: ");
            String name = scanner.next();
            for (Product product : productList) {
                if (product.getTen().equals(name)){
                    return product;
                }
            }
            return null;
        }

        public static void Sort1() {
            Collections.sort(productList) ;

            for (Product product : productList) {
                System.out.println(product.toString());
            }
        }

        public static void Sort2() {
            Collections.sort(productList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o2.getGia() - o1.getGia());
                }
            }) ;

            for (Product product : productList) {
                System.out.println(product.toString());
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                System.out.println("-----Menu-----");
                System.out.println("--------------");
                System.out.println("1.Them sp");
                System.out.println("2.Sua sp");
                System.out.println("3.Xoa sp theo id");
                System.out.println("4.Hien thi sp");
                System.out.println("5.Tim kiem sp theo ten");
                System.out.println("6.Sap xep sp tang dan theo gia");
                System.out.println("7.Sap xep sp giam dan theo gia");
                System.out.println("0.Thoat");
                System.out.println("Nhap lua chon cua ban");
                choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        addProduct(scanner);
                        break;
                    case 2:
                        editProductByID(scanner);
                        break;
                    case 3:
                        deleteProductByID(scanner);
                        break;
                    case 4:
                        displayAll();
                        break;
                    case 5:
                        System.out.println(findProductByName(scanner));
                        break;
                    case 6:
                        Sort1();
                        break;
                    case 7:
                        Sort2();
                        break;
                }
            } while (choice!=0);
        }
    }
