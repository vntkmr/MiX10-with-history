package natlab.backends.x10.IRx10.ast;

import natlab.backends.x10.IRx10.ast.List;
import natlab.backends.x10.IRx10.ast.PPHelper;
import natlab.backends.x10.IRx10.ast.Stmt;
import java.util.*;


/**
 * @ast node
 * @declaredat irx10.ast:64
 */
public class LEExp extends RelationalExp implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LEExp clone() throws CloneNotSupportedException {
    LEExp node = (LEExp)super.clone();
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LEExp copy() {
      try {
        LEExp node = (LEExp)clone();
        if(children != null) node.children = (ASTNode[])children.clone();
        return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
  }
  /**
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LEExp fullCopy() {
    LEExp res = (LEExp)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect PrettyPrinter
   * @declaredat ./astgen/pretty.jadd:392
   */
  String pp(String indent)
{
	return(indent+"("+getLeftOp().pp("")+" <= "+getRightOp().pp("")+")");
}
  /**
   * @ast method 
   * @declaredat irx10.ast:1
   */
  public LEExp() {
    super();


  }
  /**
   * @ast method 
   * @declaredat irx10.ast:7
   */
  public LEExp(Exp p0, Exp p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:14
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * Setter for LeftOp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setLeftOp(Exp node) {
    setChild(node, 0);
  }
  /**
   * Getter for LeftOp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public Exp getLeftOp() {
    return (Exp)getChild(0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:18
   */
  public Exp getLeftOpNoTransform() {
    return (Exp)getChildNoTransform(0);
  }
  /**
   * Setter for RightOp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setRightOp(Exp node) {
    setChild(node, 1);
  }
  /**
   * Getter for RightOp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public Exp getRightOp() {
    return (Exp)getChild(1);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:18
   */
  public Exp getRightOpNoTransform() {
    return (Exp)getChildNoTransform(1);
  }
}