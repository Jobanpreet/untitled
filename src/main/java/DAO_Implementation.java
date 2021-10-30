import jdk.jfr.Category;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO_Implementation implements DAOInterface {
    public Connection con3;

    public DAO_Implementation(Connection con3)throws SQLException{
        this.con3 = con3;
    }

    @Override
    public void add(category cat) throws ClassNotFoundException, SQLException {

        String quer1 = "INSERT INTO Category VALUES(?,?)";
        PreparedStatement query = con3.connect().prepareStatement(quer1);

        query.setString( 1,cat.getCatcode());
        query.setString(2, cat.getCatcode());

        query.executeUpdate();

        System.out.println("One Record added");

    }

    @Override
    public Category edit(Category cat, String ccat) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public void delete(String catcode) throws SQLException {

    }

    @Override
    public void display() throws ClassNotFoundException, SQLException {

    }

    @Override
    public Category search(String catcode) throws SQLException {
        String quer1 = "Select * from category where catcode = ?";
        PreparedStatement query = con3.prepareStatement(quer1, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        query.set
        return null;
    }
}
