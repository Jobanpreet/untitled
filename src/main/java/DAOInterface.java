import jdk.jfr.Category;

import java.sql.SQLException;

public interface DAOInterface {
    public void add (category cat)throws ClassNotFoundException, SQLException;
    public Category edit (Category cat,String ccat) throws SQLException,ClassNotFoundException;
    public void delete(String catcode) throws SQLException;
    public void display() throws ClassNotFoundException, SQLException;
    public Category search (String catcode) throws SQLException;

}
