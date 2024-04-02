package model;

public class Type {
    String typeName;

    public Type(String typeName) {
        this.typeName = typeName;
    }
    public String getString() {
        return this.typeName;
    }

    /*G&S*/

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


}
