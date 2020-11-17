public class StoreManagement {
    public static void main(String[] args) {
        // 월화수목금토일(첫 비트 비워둠)
        byte storeA = 0b01011111;
        byte storeB = 0b01011110;
        byte storeC = 0b01111100;

        // 화요일에 오픈 하는 가게
        byte openedTue = 0b00100000;

        System.out.println("storeA: " + ((storeA & openedTue) > 0));
        System.out.println("storeB: " + ((storeB & openedTue) > 0));
        System.out.println("storeC: " + ((storeC & openedTue) > 0));
    }
}