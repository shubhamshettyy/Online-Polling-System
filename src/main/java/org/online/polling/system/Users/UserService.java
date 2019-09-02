package org.online.polling.system.Users;

import org.online.polling.system.DatabaseClass.DatabaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private DatabaseClass jdbcConnection = new DatabaseClass();

    public List<UserModel> getAllUsers()
    {

        UserModel user = new UserModel();
        List<UserModel> list=new ArrayList<>();
        try{
            Connection connection = jdbcConnection.getConnnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM user_info;");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user=new UserModel(rs.getLong("user_id"),rs.getString("firstname"),
                        rs.getString("lastname"),rs.getString("email"));
                list.add(user);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
