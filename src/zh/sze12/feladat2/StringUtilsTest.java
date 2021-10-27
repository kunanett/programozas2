package zh.sze12.feladat2;

public class StringUtilsTest {

    public static void testHagrend(){
        //Given
        String testInput = "kutya";
        //When
        String result = StringUtils.hangrend(testInput);
        //Then
        assert result.equals("mély") : "A kutya mély hangrendű szó";
    }
    public static void main(String[] args) {
        testHagrend();
    }
}
