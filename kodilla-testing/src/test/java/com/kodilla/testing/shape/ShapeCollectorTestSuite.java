package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigureCircle() {
        //Given
        Shape circle1 = new Circle(3.14, 7.49);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle1);

        //When
        Shape result = shapeCollector.shapes.get(0);

        //Then
        Assert.assertNotNull(circle1);
        Assert.assertEquals(circle1, result);
    }

    @Test
    public void testAddFigureSquare() {

        //Given
        Shape square1 = new Square(8.34);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square1);

        //When
        Shape result = shapeCollector.shapes.get(0);

        //Then
        Assert.assertNotNull(square1);
        Assert.assertEquals(square1, result);

    }

    @Test
    public void testAddFigureTriangle() {
        //Given
        Shape triangle1 = new Triangle(9.7, 13);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle1);

        //When
        Shape result = shapeCollector.shapes.get(0);

        //Then
        Assert.assertNotNull(triangle1);
        Assert.assertEquals(triangle1, result);
    }

    @Test
    public void testRemoveFigureCircle() {
        //Given
        Shape circle1 = new Circle(3.14, 7.49);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle1);

        //When
        boolean result = shapeCollector.removeFigure(circle1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapes.size());

    }

    @Test
    public void testRemoveFigureSquare() {
        //Given
        Shape square1 = new Square(8.34);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square1);

        //When
        boolean result = shapeCollector.removeFigure(square1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveFigureTriangle() {
        //Given
        Shape triangle1 = new Triangle(9.7, 13);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle1);

        //When
        boolean result = shapeCollector.removeFigure(triangle1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    public void testGetFigureCircle() {
        //Given

        Shape circle1 = new Circle(3.14, 7.49);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle1);

        //When
        Shape figureCircle = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle1, figureCircle);
    }

    @Test
    public void testGetFigureSquare() {
        //Given
        Shape square1 = new Square(8.34);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square1);

        //When
        Shape figureSquare = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square1, figureSquare);
    }

    @Test
    public void testGetFigureTriangle() {
        //Given
        Shape triangle1 = new Triangle(9.7, 13);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle1);

        //When
        Shape figureTriangle = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(triangle1, figureTriangle);

    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> expectedShapes = new ArrayList<Shape>();
        Shape circle1 = new Circle(3.14, 7.49);
        Shape square1 = new Square(8.34);
        Shape triangle1 = new Triangle(9.7, 13);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle1);
        expectedShapes.add(circle1);
        expectedShapes.add(square1);
        expectedShapes.add(triangle1);


        //When
        ArrayList<Shape> shapes = shapeCollector.shapes;

        //Then
        Assert.assertEquals(expectedShapes, shapes);
    }

    @Test
    public void testGetShapeNameCircle() {
        //Given
        Shape circle1 = new Circle(3.14, 7.49);

        //When
        String result = (String) circle1.getShapeName();

        //Then
        Assert.assertEquals("circle", result);
    }

    @Test
    public void testGetShapeNameTriangle() {
        //Given
        Shape triangle1 = new Triangle(9.7, 13);

        //When
        String result = (String) triangle1.getShapeName();

        //Then
        Assert.assertEquals("triangle", result);
    }

    @Test
    public void testGetShapeNameSquare() {
        //Given
        Shape square1 = new Square(8.34);

        //When
        String result = (String) square1.getShapeName();
        int number = 2;

        //Then
        Assert.assertEquals("square", result);
    }

    @Test
    public void testGetFieldCircle() {
        //Given
        Shape circle1 = new Circle(3.14, 7.49);

        //When
        Double field = circle1.getField();
        Double expectedField = 176.15431400000003;
        //Then
        Assert.assertEquals(expectedField, field);
    }

    @Test
    public void testGetFieldSquare() {
        //Given
        Shape square1 = new Square(8.34);

        //When
        Double field = square1.getField();
        Double expectedField = 69.5556;
        //Then
        Assert.assertEquals(expectedField, field);
    }

    @Test
    public void testGetFieldTriangle() {
        //Given
        Shape triangle1 = new Triangle(9.7, 13);

        //When
        Double field = triangle1.getField();
        System.out.println(field);
        Double expectedField = 63.05;
        //Then
        Assert.assertEquals(expectedField, field);
    }
}
