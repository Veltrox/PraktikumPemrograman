package Manak;

public class Interface {
    interface totalGaji {
        public double totalGaji();
    }
    class totalpendapatan implements totalGaji {
         @Override
        public double totalGaji() {
            return 0;
        }
    }
}