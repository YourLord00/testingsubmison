package WhiteBox;

import BlackBox.CycleSort;
import Utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class BinaryTreeSerializerTest {

    @Test
    public void serializeTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = null;
        String ret = bs.serialize(root);
        assertEquals("[null]",ret);
    }

    @Test
    public void deserializeTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[null]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    //@TODO: Create more tests
    //try update

    ///11112331
    @Test
    public void serializeStringTest(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String str = "0";
        TreeNode root = bs.deserialize(str);
        assertEquals(null ,root);
    }
    
    @Test
    public void deserializeTest2(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String str = "[0,null,null]";
        TreeNode root = new TreeNode(0);
        TreeNode ret = bs.deserialize(str);
        assertEquals(root,ret);
    }
    
    @Test
    public void serializeTest3(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(1);
        String ret = bs.serialize(root);
        assertEquals("[0,null,1,null,null]",ret);
    }
    
    @Test
    public void deserializeTest3(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String str = "[0,null,1,null,null]";
        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(1);
        TreeNode ret = bs.deserialize(str);
        assertEquals(root,ret);
    }
    
//	@Test
//	public void serializeMultipleNodeTest(){
//	    BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
//	    TreeNode root = new TreeNode(1);
//	    root.left = new TreeNode(2);
//	    root.right = new TreeNode(3);
//	    root.left.left = new TreeNode(4);
//	    root.left.right = new TreeNode(5);
//	    root.right.left = new TreeNode(6);
//	    root.right.right = new TreeNode(7);
//	    root.left.right.left = new TreeNode(8);
//	    root.left.right.left.left = new TreeNode(9);
//	    root.left.right.left.right = new TreeNode(10);
//	    root.left.right.left.left.right = new TreeNode(11);
//	    root.left.right.left.left.right.left = new (12);
//	    String ret = bs.serialize(root);
//	    //System.out.println(ret);
//	    assertEquals("[1,2,3,4,5,6,7,null,null,8,null,null,null,null,null,9,10,null,11,null,null,12,null,null]",ret);
//	}
    
    
    @Test
    public void serializeTest4(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        String ret = bs.serialize(root);
        assertEquals("[0,1,2,3,4,5,6,null,null,null,null,null,null,null,null]",ret);
        
    }
    
    
<<<<<<< HEAD
    
    
    
=======
>>>>>>> branch 'main' of https://github.com/YourLord00/testingsubmison.git
    @Test
    public void deserializeTest4(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String str = "[0,1,2,3,4,5,6,null,null,null,null,null,null,null,null]";
        
        
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        TreeNode ret = bs.deserialize(str);
        assertEquals(root,ret);
    }
    
    
}
