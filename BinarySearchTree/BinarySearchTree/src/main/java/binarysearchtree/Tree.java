
package binarysearchtree;

public interface Tree<D extends Comparable> { // extends Comparable para poder comparar los valores y que deben ser del mismo tipo
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
