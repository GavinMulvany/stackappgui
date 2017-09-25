/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackappgui;
import java.util.*;

/**
 *
 * @author x15448892
 */
public class MyStack implements StackInterface {
    
 private ArrayList<String> theStack;
 /** Creates a new instance of Stack */
 public MyStack()
 {
 theStack = new ArrayList<String>();
 }
 public boolean isEmpty()
 {
 return theStack.isEmpty();
 }

 /** always false as there is no limit on the size of this
ArrayList based stack */
 public boolean isFull()
 {
 return false;
 }
 /** removes the item from the top of the stack and returns it
*/
 public Object pop()
 {
 if (!(theStack.isEmpty()))
 {
 return theStack.remove(0);
 }
 else
return null;
 }
 /** puts an item onto the top of the stack */
 public void push(Object newItem)
 {
 theStack.add(0, (String)newItem);
 }
 
 public int size(){
     return theStack.size();
 }
 
 public String display(){
     return theStack.toString();
 }

    
}
