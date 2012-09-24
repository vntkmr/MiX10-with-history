package natlab.backends.x10.IRx10.ast;


/**
 * @ast node
 * @declaredat irx10.ast:10
 */
public class AssignStmt extends ExpStmt implements Cloneable {
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
  public AssignStmt clone() throws CloneNotSupportedException {
    AssignStmt node = (AssignStmt)super.clone();
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AssignStmt copy() {
      try {
        AssignStmt node = (AssignStmt)clone();
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
  public AssignStmt fullCopy() {
    AssignStmt res = (AssignStmt)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @declaredat irx10.ast:1
   */
  public AssignStmt() {
    super();

    setChild(new Opt(), 1);

  }
  /**
   * @ast method 
   * @declaredat irx10.ast:8
   */
  public AssignStmt(Exp p0, Opt<MultiAssignLHS> p1, IDInfo p2, Exp p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:17
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * Setter for Exp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setExp(Exp node) {
    setChild(node, 0);
  }
  /**
   * Getter for Exp
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public Exp getExp() {
    return (Exp)getChild(0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:18
   */
  public Exp getExpNoTransform() {
    return (Exp)getChildNoTransform(0);
  }
  /**
   * Setter for MultiAssignLHSOpt
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setMultiAssignLHSOpt(Opt<MultiAssignLHS> opt) {
    setChild(opt, 1);
  }
  /**
   * Does this node have a MultiAssignLHS child?
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public boolean hasMultiAssignLHS() {
    return getMultiAssignLHSOpt().getNumChild() != 0;
  }
  /**
   * Getter for optional child MultiAssignLHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MultiAssignLHS getMultiAssignLHS() {
    return (MultiAssignLHS)getMultiAssignLHSOpt().getChild(0);
  }
  /**
   * Setter for optional child MultiAssignLHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:27
   */
  public void setMultiAssignLHS(MultiAssignLHS node) {
    getMultiAssignLHSOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<MultiAssignLHS> getMultiAssignLHSOpt() {
    return (Opt<MultiAssignLHS>)getChild(1);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:44
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<MultiAssignLHS> getMultiAssignLHSOptNoTransform() {
    return (Opt<MultiAssignLHS>)getChildNoTransform(1);
  }
  /**
   * Setter for LHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setLHS(IDInfo node) {
    setChild(node, 2);
  }
  /**
   * Getter for LHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public IDInfo getLHS() {
    return (IDInfo)getChild(2);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:18
   */
  public IDInfo getLHSNoTransform() {
    return (IDInfo)getChildNoTransform(2);
  }
  /**
   * Setter for RHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:5
   */
  public void setRHS(Exp node) {
    setChild(node, 3);
  }
  /**
   * Getter for RHS
   * @apilevel high-level
   * @ast method 
   * @declaredat irx10.ast:12
   */
  public Exp getRHS() {
    return (Exp)getChild(3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * @declaredat irx10.ast:18
   */
  public Exp getRHSNoTransform() {
    return (Exp)getChildNoTransform(3);
  }
}