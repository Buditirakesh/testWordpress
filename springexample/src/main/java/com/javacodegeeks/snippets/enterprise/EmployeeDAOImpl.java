package com.javacodegeeks.snippets.enterprise;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDAOImpl implements EmployeeDAO
{
    private DataSource dataSource;
  
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
  
    public void insert(employee employee){
  
        String sql = "INSERT INTO employee " +
                "(ID, NAME, AGE) VALUES (?, ?, ?)";
        java.sql.Connection conn = null;
  
        try {
            conn = dataSource.getConnection();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setInt(3, employee.getAge());
            ps.executeUpdate();
            ps.close();
  
        } catch (SQLException e) {
            throw new RuntimeException(e);
  
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
  
    public employee findById(int id){
  
        String sql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
  
        java.sql.Connection conn = null;
  
        try {
            conn = dataSource.getConnection();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            employee employee = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employee = new employee(
                    rs.getInt("ID"),
                    rs.getString("NAME"), 
                    rs.getInt("AGE")
                );
            }
            rs.close();
            ps.close();
            return employee;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}