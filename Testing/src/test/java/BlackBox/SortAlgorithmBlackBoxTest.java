package BlackBox;

import BlackBox.Setups.SortSetup;
import org.junit.Test;

public class SortAlgorithmBlackBoxTest extends SortSetup {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        int[] input = new int[]{2,1};
        int[] expectedOutput = new int[]{1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    //@TODO: Create more tests
    @Test
    public void dummyTest1(){
        int[] input = new int[]{-1,2,1};
        int[] expectedOutput = new int[]{-1,1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest2(){
        int[] input = new int[]{2,3};
        int[] expectedOutput = new int[]{2,3};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest3(){
        int[] input = new int[]{8,3,10,5,1,100};
        int[] expectedOutput = new int[]{1,3,5,8,10,100};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest4(){
        int[] input = new int[]{100,0};
        int[] expectedOutput = new int[]{0,100};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest5(){
        int[] input = new int[]{2,2,1,1,1,100,0};
        int[] expectedOutput = new int[]{0,1,1,1,2,2,100};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest6(){
        int[] input = new int[]{-500,-500,-100,-100,0,0,100,0,200,200};
        int[] expectedOutput = new int[]{-500,-500,-100,-100,0,0,0,100,200,200};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest7(){
        int[] input = new int[]{0,0,0,0,0,0,0};
        int[] expectedOutput = new int[]{0,0,0,0,0,0,0};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void dummyTest8(){
        int[] input = new int[0];
        int[] expectedOutput = new int[0];
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void singleInputTest() {
        int[] input = new int[]{999};
        int[] expectedOutput = new int[]{999};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void nullInPutTest() {
        int[] input = null;
        int[] expectedOutput = null;
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void newTest2() {
        int[] input = new int[]{-2, -2, 9,9,8, 8, 7, 6, -1, 4, 5, 1, -1, 4, 4, 4, 4, 4, 3, 2, 1, -1, -1};
        int[] expectedOutput = new int[] {-2, -2, -1, -1, -1, -1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8,9,9};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void maxValueInputTest() {
        int[] input = new int[]{0,1,1,Integer.MAX_VALUE,5};
        int[] expectedOutput = new int[]{0,1,1,5,Integer.MAX_VALUE};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void minValueInputTest() {
        int[] input = new int[]{0,1,Integer.MIN_VALUE,1};
        int[] expectedOutput = new int[]{Integer.MIN_VALUE,0,1,1};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
    @Test
    public void duochongTest() {
        int[] input = new int[]{5,5,5,9,9,9,-1,-1,-1};
        int[] expectedOutput = new int[] {-1,-1,-1,5,5,5,9,9,9};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void sorted() {
        int[] input = new int[]{-9,-1,0,2,8};
        int[] expectedOutput = new int[]{-9,-1,0,2,8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void leftToRight() {
        int[] input = new int[]{9, 8, 7, 6, 5, 1, -1, 4, 3, 2, 1};
        int[] expectedOutput = new int[] {-1, 1, 1, 2, 3, 4, 5, 6, 7, 8,9};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void rightToLeft() {
        int[] input = new int[]{-100,-10,-1,0,-999,-998,-997,-996,-995,-994};
        int[] expectedOutput = new int[] {-999,-998,-997,-996,-995,-994,-100,-10,-1,0};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void newTestforRL() {
        int[] input = new int[]{8, -1,7, 6, -1, 5, 1, -1, 4, 3,-1, 2, 1, -1, -1};
        int[] expectedOutput = new int[] {-1,-1, -1,-1, -1, -1, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
    @Test
    public void newSorted() {
        int[] input = new int[]{-100,-50,-25,-1, 0, 1, 2, 3};
        int[] expectedOutput = new int[]{-100,-50,-25,-1, 0, 1, 2, 3};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
}
