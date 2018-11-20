//import org.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeClassifierBlackBoxTest extends Assert {

    private ShapeClassifier classifier;

    @Before
    public void init() {
        classifier = new ShapeClassifier();
    }

    // Equilateral
    @Test
    public void blackBox01() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,100,100,100"));
    }
    @Test
    public void blackBox02() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Small,Yes,100,100,100"));
    }
    @Test
    public void blackBox03() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Large,No,100,100,100"));
    }
    @Test
    public void blackBox04() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Small,No,100,100,100"));
    }
    @Test
    public void blackBox05() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Large,Yes,200,100,100"));
    }
    @Test
    public void blackBox06() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Large,Yes,100,100"));
    }

    // Line
//    @Test
//    public void blackBox07() {
//        assertEquals("Yes", classifier.evaluateGuess("Line,Small,Yes,100"));
//    }
    @Test
    public void blackBox08() {
        assertEquals("No", classifier.evaluateGuess("Line,Large,Yes,100"));
    }
    @Test
    public void blackBox09() {
        assertEquals("No", classifier.evaluateGuess("Line,Small,No,100"));
    }
    @Test
    public void blackBox10() {
        assertEquals("No", classifier.evaluateGuess("Line,Large,No,100"));
    }
    @Test
    public void blackBox11() {
        assertEquals("No", classifier.evaluateGuess("Line,Small,Yes,200"));
    }
    @Test
    public void blackBox12() {
        assertEquals("No", classifier.evaluateGuess("Line,Small,Yes,100,100"));
    }

    // Ellipse
//    @Test
//    public void blackBox13() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Small,Yes,10,10"));
//    }
    @Test
    public void blackBox14() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Large,Yes,10,10"));
    }
    @Test
    public void blackBox15() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,No,10,10"));
    }
    @Test
    public void blackBox16() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,9,9"));
    }
    @Test
    public void blackBox17() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,10"));
    }
    @Test
    public void blackBox18() {
        assertEquals("No", classifier.evaluateGuess("Ellipse,Small,Yes,100,100"));
    }
//    @Test
//    public void blackBox19() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Large,Yes,100,100"));
//    }
//    @Test
//    public void blackBox20() {
//        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Large,No,101,101"));
//    }
//
    // Scalene
    @Test
    public void blackBo21() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Large,Yes,100,100,100"));
    }
    @Test
    public void blackBox22() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Small,Yes,100,100,100"));
    }
    @Test
    public void blackBox23() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Large,No,100,100,100"));
    }
    @Test
    public void blackBox24() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Small,No,100,100,100"));
    }
    @Test
    public void blackBox25() {
        assertEquals("Yes", classifier.evaluateGuess("Scalene,Large,Yes,200,150,100"));
    }
    @Test
    public void blackBox26() {
        assertEquals("No", classifier.evaluateGuess("Scalene,Large,Yes,100,100"));
    }

    // Isosceles
    @Test
    public void blackBox27() {
        assertEquals("Yes", classifier.evaluateGuess("Isosceles,Large,Yes,100,100,150"));
    }
    @Test
    public void blackBox28() {
        assertEquals("No", classifier.evaluateGuess("Isosceles,Small,Yes,100,100,150"));
    }
    @Test
    public void blackBox29() {
        assertEquals("No", classifier.evaluateGuess("Isosceles,Large,No,100,100,150"));
    }
    @Test
    public void blackBox30() {
        assertEquals("No", classifier.evaluateGuess("Isosceles,Small,No,100,100,150"));
    }
//    @Test
//    public void blackBox31() {
//        assertEquals("Yes", classifier.evaluateGuess("Isosceles,Large,Yes,200,100,100"));
//    }
    @Test
    public void blackBox32() {
        assertEquals("No", classifier.evaluateGuess("Isosceles,Large,Yes,100,100"));
    }

}
