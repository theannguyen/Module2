package ThucHanh5;
    //Xây dựng lớp Car, trong lớp Car khai báo thuộc tính static numberOfCars
    public class Car {
        private String name;
        private String engine;

        public static int numberOfCars;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }

        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }
    }
//Trong Java, nếu một thuộc tính được khai báo là static,
//thì một bản sao của thuộc tính đó được tạo
//và chia sẻ giữa tất cả các đối tượng của lớp đó.
//Không quan trọng chúng ta khởi tạo một lớp bao nhiêu lần,
//sẽ luôn chỉ có một bản sao của thuộc tính tĩnh.
//Giá trị của thuộc tính tĩnh này sẽ được chia sẻ
//trên tất cả các đối tượng của lớp.
