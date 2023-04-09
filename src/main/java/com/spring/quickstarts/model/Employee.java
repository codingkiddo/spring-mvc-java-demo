//package com.spring.quickstarts.model;
//
//import java.math.BigDecimal;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
// 
//import org.hibernate.annotations.Type;
//import org.hibernate.validator.constraints.NotEmpty;
//import org.joda.time.LocalDate;
//import org.springframework.format.annotation.DateTimeFormat;
// 
//@Entity
//@Table(name="EMPLOYEE")
//public class Employee {
// 
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
// 
//    @Size(min=3, max=50)
//    @Column(name = "NAME", nullable = false)
//    private String name;
// 
//    @NotNull
//    @DateTimeFormat(pattern="dd/MM/yyyy") 
//    @Column(name = "JOINING_DATE", nullable = false)
//    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
//    private LocalDate joiningDate;
// 
//    @NotNull
//    @Digits(integer=8, fraction=2)
//    @Column(name = "SALARY", nullable = false)
//    private BigDecimal salary;
//     
//    @NotEmpty
//    @Column(name = "SSN", unique=true, nullable = false)
//    private String ssn;
// 
//    public int getId() {
//        return id;
//    }
// 
//    public void setId(int id) {
//        this.id = id;
//    }
// 
//    public String getName() {
//        return name;
//    }
// 
//    public void setName(String name) {
//        this.name = name;
//    }
// 
//    public LocalDate getJoiningDate() {
//        return joiningDate;
//    }
// 
//    public void setJoiningDate(LocalDate joiningDate) {
//        this.joiningDate = joiningDate;
//    }
// 
//    public BigDecimal getSalary() {
//        return salary;
//    }
// 
//    public void setSalary(BigDecimal salary) {
//        this.salary = salary;
//    }
// 
//    public String getSsn() {
//        return ssn;
//    }
// 
//    public void setSsn(String ssn) {
//        this.ssn = ssn;
//    }
// 
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
//        return result;
//    }
// 
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof Employee))
//            return false;
//        Employee other = (Employee) obj;
//        if (id != other.id)
//            return false;
//        if (ssn == null) {
//            if (other.ssn != null)
//                return false;
//        } else if (!ssn.equals(other.ssn))
//            return false;
//        return true;
//    }
// 
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + ", joiningDate="
//                + joiningDate + ", salary=" + salary + ", ssn=" + ssn + "]";
//    }
//     
//}




package com.spring.quickstarts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
 
@Entity
@Table(name="employees")
public class Employee {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_no", nullable = false)
    private int emp_no;
 
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd") 
    @Column(name = "birth_date", nullable = false)
//    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private Date birth_date;
    
    @Column(name = "first_name", nullable = false)
    private String first_name;
    
    @Column(name = "last_name", nullable = false)
    private String last_name;
 
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd") 
    @Column(name = "hire_date", nullable = false)
//    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private Date hire_date;
 
    @NotEmpty
    @Column(name = "gender", nullable = false)
    private Character gender;

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
}