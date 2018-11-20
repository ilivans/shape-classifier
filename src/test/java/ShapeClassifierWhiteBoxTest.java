//import org.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeClassifierWhiteBoxTest extends Assert {

    private ShapeClassifier classifier;

    @Before
    public void init() {
        classifier = new ShapeClassifier();
    }

    @Test
    public void whiteBox01() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,100,100,100"));
    }
    @Test
    public void whiteBox02() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Large,Yes,150,100,100"));
    }
    @Test
    public void whiteBox03() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Large,No,100,100,100"));
    }
//    @Test
//    public void whiteBox04() {
//        assertEquals("Yes", classifier.evaluateGuess("Scalene,Large,No,150,100,100"));
//    }
    @Test
    public void whiteBox05() {
        assertEquals("Yes", classifier.evaluateGuess("Isosceles,Large,Yes,150,100,100"));
    }
//    @Test
//    public void whiteBox06() {
//        assertEquals("Yes", classifier.evaluateGuess("Isosceles,Large,Yes,150,120,100"));
//    }
//
//    // Line
//    @Test
//    public void whiteBox07() {
//        assertEquals("Yes", classifier.evaluateGuess("Line,Small,Yes,100"));
//    }
    @Test
    public void whiteBox08() {
        assertEquals("No", classifier.evaluateGuess("Square,Small,Yes,100"));
    }
    @Test
    public void whiteBox09() {
        assertEquals("Yes", classifier.evaluateGuess("Line,Large,Yes,250"));
    }
//    @Test
//    public void whiteBox10() {
//        assertEquals("Yes", classifier.evaluateGuess("Line,Large,Yes,110"));
//    }
    @Test
    public void whiteBox11() {
        assertEquals("No", classifier.evaluateGuess("Line,Small,Yes,110"));
    }
    @Test
    public void whiteBox12() {
        assertEquals("Yes", classifier.evaluateGuess("Line,Small,Yes,8"));
    }

//    @Test
//    public void whiteBox13() {
//        assertEquals("Yes", classifier.evaluateGuess("Circle,Small,Yes,2,2"));
//    }
    @Test
    public void whiteBox14() {
        assertEquals("No", classifier.evaluateGuess("Circle,Small,Yes,2,3"));
    }
//    @Test
//    public void whiteBox15() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Small,Yes,1,2"));
//    }
//    @Test
//    public void whiteBox16() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Small,Yes,4,2"));
//    }
//    @Test
//    public void whiteBox17() {
//        assertEquals("Yes", classifier.evaluateGuess("Rectangle,Small,Yes,1,1,2,2"));
//    }
    @Test
    public void whiteBox18() {
        assertEquals("No", classifier.evaluateGuess("Rectangle,Small,Yes,1,1,2,3"));
    }
//    @Test
//    public void whiteBox19() {
//        assertEquals("Yes", classifier.evaluateGuess("Square,Large,Yes,100,100,100,100"));
//    }
//    @Test
//    public void whiteBox20() {
//        assertEquals("No", classifier.evaluateGuess("Square,Large,Yes,100,100,200,200"));
//    }

    // Scalene
    @Test
    public void whiteBo21() {
        assertEquals("Yes", classifier.evaluateGuess("Rectangle,Small,Yes,1,2,1,2"));
    }
    @Test
    public void whiteBox22() {
        assertEquals("No", classifier.evaluateGuess("Rectangle,Small,Yes,1,2,1,1"));
    }
    @Test
    public void whiteBox23() {
        assertEquals("No", classifier.evaluateGuess("Rectangle,Small,Yes,1,2,2,2"));
    }
    @Test
    public void whiteBox24() {
        assertEquals("Yes", classifier.evaluateGuess("Rectangle,Small,Yes,1,2,2,1"));
    }
    @Test
    public void whiteBox25() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,0,10"));
    }
//    @Test
//    public void whiteBox26() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Small,Yes,1,10"));
//    }

    @Test
    public void whiteBox27() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,0,0"));
    }
    @Test
    public void whiteBox28() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,0,1"));
    }
//    @Test
//    public void whiteBox29() {
//        assertEquals("Yes", classifier.evaluateGuess("Rectangle,Large,Yes,1,1,50,50"));
//    }
    @Test
    public void whiteBox30() {
        assertEquals("No", classifier.evaluateGuess("Rectangle,Large,Yes,24,24,24,24"));
    }
    @Test
    public void whiteBox31() {
        assertEquals("No", classifier.evaluateGuess("Square,Large,Yes,24,24,24,24"));
    }
//    @Test
//    public void whiteBox32() {
//        assertEquals("Yes", classifier.evaluateGuess("Square,Large,Yes,26,26,26,26"));
//    }

}
