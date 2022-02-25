import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MyArrayTest {
    private  MyArray x;

    @org.junit.Before
    public void setUp()  {
        x=new MyArray(new int[]{11,22,33,44,55});
    }

    @org.junit.After
    public void tearDown()  {
    }

    @Test
    public void getNElem(){
        int expRes=4;
        MyArray instance=new MyArray(new int []{1,2,3,4});
        int result = instance.lenghtReturn();
        assertEquals(expRes,result);
    }
    @Test
    public void getBiggestElem(){
        int expRes=4;
        MyArray instance=new MyArray(new int []{1,2,3,4});
        int result= instance.BiggestReturn();
        assertEquals(expRes,result);
    }
    @Test
    public void getNotNullElem(){
        int expRes=4;
        MyArray instance=new MyArray(new int []{1,2,3,4});
        int result= instance.NotNullReturn();
        assertEquals(expRes,result);
    }
    @Test
    public void calcMedia(){
        double expRes=2.5;
        MyArray instance=new MyArray(new int []{1,2,3,4});
        double result= instance.calcMedia();
        assertEquals(expRes,result,0.01);
    }
    @Test
    public void calcMediaMult(){
        double expRes=2;
        MyArray instance=new MyArray(new int []{1,2,3,4});
        double result= instance.calcMediaMult(2);
        assertEquals(expRes,result,0.01);
    }
    @Test
    public void isEmpty(){
        MyArray instance=new MyArray(new int []{1,2,3,4});
        assertFalse(instance.isEmpty());
    }
    @Test
    public void onlyPair(){
        MyArray instance=new MyArray(new int []{1,2,3,4});
        assertFalse(instance.onlyPair());
    }
    @Test
    public void onlyElemPair(){
        MyArray instance=new MyArray(new int []{1,2,3,4});
        assertFalse(instance.onlyPair());
    }
    @Test
    public void ElemPair(){
        MyArray instance=new MyArray(new int []{22,72,0,0});
        int [] y= new int[]{22,0,0,0};
        int[] x= instance.onlyElemPair();
        assertTrue(Arrays.equals(y,x));
    }
    @Test
    public void sameElem(){
        MyArray instance=new MyArray(new int []{11,23,32,44});
        int [] y= new int[]{11,0,0,44};
        int[] x= instance.sameElem();
        assertTrue(Arrays.equals(y,x));
    }
    @Test
    public void crescElem(){
        MyArray instance=new MyArray(new int []{11,23,32,44,35});
        int [] y= new int[]{11,23,32,44,0};
        int[] x= instance.crescElem();
        assertTrue(Arrays.equals(y,x));
    }
    @Test
    public void sameContent(){
        MyArray instance=new MyArray(new int []{11,22,33,44,55});
        assertTrue(instance.equals(x));
    }
}