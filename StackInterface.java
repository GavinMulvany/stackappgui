/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackappgui;

/**
 *
 * @author x15448892
 */
public interface StackInterface {
    
 public boolean isEmpty();
 public boolean isFull();
 public void push(Object newItem);
 public Object pop();
 public int size();
 public String display();
    
}
