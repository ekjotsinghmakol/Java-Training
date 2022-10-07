package com.employee.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


	@Entity
	public class Employee {
		@Id
		int eId;
		String name;
		int salary;
		
		public Employee(int eId, String name, int salary) {
			super();
			this.eId = eId;
			this.name = name;
			this.salary = salary;
		}
		
		public Employee() {}

		public int geteId() {
			return eId;
		}

		public void seteId(int eId) {
			this.eId = eId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
		}
		
}
