package zh.sze14.feladat2;

public class StringUtilsTest {

    public void testCountVowelsAndConsonants(){
        //Given
        String testInput = "kutya";
        //When
        int[] result = StringUtils.countVowelsAndConsonants(testInput);
        //Then
        assert result[0] == 2 && result[1] == 3 : "Hiba";
    }

    public static void main(String[] args) {
        StringUtilsTest test = new StringUtilsTest();
        test.testCountVowelsAndConsonants();
    }
}
