package com.javacodegeeks.snippets.enterprise;

public interface EmployeeDAO {
	public void insert(employee employee);
    public employee findById(int id);

}
