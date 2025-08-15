package info.emami;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() { // Returns the next node in the list/tree
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) { // Sets the next node in the list/tree
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() { // Returns the previous node in the list/tree
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) { // Sets the previous node in the list/tree
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) { // Compares this node's value with another node's value for sorting

        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue()); // Assuming values are Strings for comparison
        }else{
            return -1;
        }
    }


}
