package BlackBox;

import BlackBox.Setups.LruCacheSetup;
import Utils.LruCacheMethod;
import org.junit.Test;

public class LruCacheBlackBoxTest extends LruCacheSetup {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }


    //@TODO: Create more tests
    
    
    //create first my own test
    @Test
    public void myTest(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }
    @Test
    public void fillFull(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);
        int[] functionParameters3 = new int[]{2,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        //get key = 1
        int[] functionParameters4 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters4,
                2);
        int[] functionParameters5 = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters5,
                3);
        
    }
    
    @Test
    public void donotExist(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{0,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                -1);
    }
    
    @Test
    public void nullGet(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                -1);
    }
    
    @Test
    public void dummyTest5(){
        //@TODO: Delete/modify me
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }
    
    @Test
    public void LargeInputTest() {
        int[] functionParameters = new int[]{1000};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters, null);
        for (int i = 0; i <= 1000; i++) {
            int[] functionParameters1 = new int[]{i, i + 1};
            lruCachePUT.run(LruCacheMethod.Put,
                    functionParameters1, null);
        }

        int[] functionParameters2 = new int[]{0};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters2, -1);
    }
    
  //test3 capacity equals to 1
    @Test
    public void eQualsTo1test() {
        int[]functionParameters = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);
        
        int[] functionParametersx = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get, functionParametersx, 2);
        
        //put key=2, value = 3
        int[] functionParameters3 = new int[]{2,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        int[] functionParametersT = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get, functionParametersT, -1);

        //put key=-1, value = 3
        int[] functionParameters5 = new int[]{-1,10};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters5,
                null);

        int[] functionParameters6 = new int[]{-1};
        lruCachePUT.run(LruCacheMethod.Get, functionParameters6, 10);
    }

    
  //test4 update old key with new val
    @Test
    public void testReplace() {
        int[]functionParameters = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key = 1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key = 1, value = 3
        int[] functionParameters3 = new int[]{1,10};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters3,
                null);

        //get key = 1
        int[] functionParameters4 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters4,
                10);
    }
    
  //test6 null pointer
    @Test(expected = NullPointerException.class)
    public void testPutCapacityZero() {
        // constructor size = 0
    	
        int[] capacity = new int[]{0};
        
        lruCachePUT.run(LruCacheMethod.Constructor,
                capacity, null);

        // put key = 1, val = 1
        
        
        int[] keyValPair1 = new int[]{10,0};
        lruCachePUT.run(LruCacheMethod.Put,
                keyValPair1, null);
    }
    
    
  //test big cache
    @Test
    public void testCache() {
        int[]functionParameters = new int[]{100};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key = 1, value = 2
        for (int i = -10; i < 50; i++) {
            int[] functionParameters2 = new int[]{i, i + 1};
            lruCachePUT.run(LruCacheMethod.Put,
                    functionParameters2,
                    null);
        }

        //get key = 1
        int[] functionParameters4 = new int[]{-10};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters4,
                -9);
    }
    
    
}
