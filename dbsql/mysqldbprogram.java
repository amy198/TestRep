package dbsql;

import java.sql.*;



public class mysqldbprogram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demosql", "root", "mili3030");
		System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        //create table
       // String query = "create table automation(id integer, name varchar(30))";
       // int status = stmt.executeUpdate(query);
    	//System.out.println("status of execution is :" + status);
        
        
        //update table
    	//String alterQuery = "alter table automation modify name varchar(20)";
    	//int status = stmt.executeUpdate(alterQuery);
    	//System.out.println("status of execution is :" + status);
        
        
       // insert query
       /* String insertQuery = "insert into automation values(1,'amita'), (2,'neha')";
        int status = stmt.executeUpdate(insertQuery);
        System.out.println("status of execution is :" + status);*/
        
        //update query
       /* String updateQuery = "update automation set id = 3 where name ='neha'";
        int status = stmt.executeUpdate(updateQuery);
        System.out.println("status of execution is :" + status);*/
        
        
        //select query
       /* String selectQuery="Select * from automation order by id";
       ResultSet rs =  stmt.executeQuery(selectQuery);
       while(rs.next()) {
    	   System.out.print("id: "+rs.getInt("id"));
    	   System.out.println("  name: "+rs.getString("name"));
       }
       */
    
       
       //	select join query
       String joinQuery="select e.firstname, e.lastname,e.salary,d.DeptName,d.DepId from employee e"
       + " inner join department d on e.DepId=d.DepId";
       ResultSet rs =  stmt.executeQuery(joinQuery);
       while(rs.next()) {
    	   System.out.print("firstname: "+rs.getString("firstname"));
    	   System.out.println("  lastname: "+rs.getString("lastname"));
    	   System.out.println("  salary: "+rs.getString("salary"));
    	   System.out.println("  DeptName: "+rs.getString("DeptName"));
       }
       
       stmt.close();
       
       
       
       
       
        
        
        
        
        
        
    	  
	}

}
