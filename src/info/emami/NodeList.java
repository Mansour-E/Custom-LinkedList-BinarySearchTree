package info.emami;

public interface NodeList {

    ListItem getRoot(); // Returns the root node of the list/tree
    boolean addItem(ListItem newItem); // Adds a new item to the list/tree
    boolean removeItem(ListItem item); // Removes an item from the list/tree
    void traverse(ListItem root); // Traverses the list/tree starting from the given root node


}
