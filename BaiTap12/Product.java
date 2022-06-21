package BaiTap12;

    public class Product implements Comparable<Product>{
        private  int id;
        private double gia;
        private String ten;

        public Product() {
        }

        public Product(int id, double gia, String ten) {
            this.id = id;
            this.gia = gia;
            this.ten = ten;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getGia() {
            return gia;
        }

        public void setGia(double gia) {
            this.gia = gia;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", gia=" + gia +
                    ", ten='" + ten + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Product o) {
            return (int) (this.getGia() - o.getGia());
        }
    }

