package pattern.design;

public class Salary {

	private int employeeNo;
	private String name;
	private Long salaryAmt;
	
	
	public static class Builder {
		private int employeeNo;
		private String name;
		private Long salaryAmt;
		
		public Builder() {
			
		}
		
		public Builder employeeNo(int employeeNo) {
			this.employeeNo = employeeNo;
			return this;
		}
		
		public  Builder name(String name) {
			this.name = name;
			return this;
			
		}
		
		public  Builder salaryAmt(Long salaryAmt) {
			this.salaryAmt = salaryAmt;
			return this;
		}
		
		public  Salary build() {
			Salary s = new Salary();
			s.setEmployeeNo(employeeNo);
			s.setName(name);
			s.setSalaryAmt(salaryAmt);
			return s;
			
		}
		
		
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalaryAmt() {
		return salaryAmt;
	}

	public void setSalaryAmt(Long salaryAmt) {
		this.salaryAmt = salaryAmt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salaryAmt == null) ? 0 : salaryAmt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		if (employeeNo != other.employeeNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salaryAmt == null) {
			if (other.salaryAmt != null)
				return false;
		} else if (!salaryAmt.equals(other.salaryAmt))
			return false;
		return true;
	}

	/*
	 * @Override public String toString() { return "Salary [employeeNo=" +
	 * employeeNo + ", name=" + name + ", salaryAmt=" + salaryAmt + "]"; }
	 */}
