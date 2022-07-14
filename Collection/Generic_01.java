class Basket<N> { // 제너릭으로 T를 선언했다.
    private N item;

    public Basket(N item) {
        this.item = item;
    }

    public N getItem() {
        return item;
    }

    public void setItem(N item) {
        this.item = item;
    }
}

public class Generic_01 {

    public static void main(String[] args) {
        Basket<String> basket1 = new Basket<String>("기타줄"); // Basket 클래스 내의 N을 String 으로 바꿔라
    }

}

