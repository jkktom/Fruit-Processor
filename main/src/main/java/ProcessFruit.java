import model.Apple;
import model.Banana;
import model.Orange;
import model.ProcessingResult;
import service.FruitCutter;
import service.FruitPeeler;

public class ProcessFruit {
    public static void main(String[] args) {
        Apple apple = new Apple("사과", "빨간색", 5000.0);
        Banana banana = new Banana("바나나", 8, 3000.0);
        Orange orange = new Orange("오렌지", 7, 4000.0);
        
        FruitPeeler<Banana> bananaPeeler = new FruitPeeler<>(banana);
        FruitPeeler<Orange> orangePeeler = new FruitPeeler<>(orange);
        FruitCutter<Apple> appleCutter = new FruitCutter<>(apple);
        
        ProcessingResult<Banana> bananaResult = bananaPeeler.process();
        ProcessingResult<Orange> orangeResult = orangePeeler.process();
        ProcessingResult<Apple> appleResult = appleCutter.process();

        System.out.println(bananaResult.getResult());  // "바나나 껍질을 벗깁니다"
        System.out.println(orangeResult.getResult());  // "오렌지 껍질을 벗깁니다"
        System.out.println(appleResult.getResult());   // "사과 껍질을 깎습니다"
    }
}
