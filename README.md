# 🧑‍💼 HRMS – Human Resource Management System (Spring Boot)

A **backend Human Resource Management System (HRMS)** built using **Spring Boot, Spring Data JPA, and MySQL**.  
This project manages employees, departments, leaves, payroll, meetings, projects, and work efforts using a **clean layered architecture**.

---

## 🚀 Tech Stack

- Java 21+ (Tested on Java 25)
- Spring Boot 4.x
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- REST APIs
- IntelliJ IDEA

---

## 🏗️ Project Architecture


com.HRMS.Tata.Strive.HRMS
├── controller → REST Controllers
├── service → Business Logic (@Service, constructor injection)
├── repository → JPA Repositories
├── entity → JPA Entities (Tables)
└── HrmsApplication.java



---

## 🗄️ Database Tables & Schema

### 1️⃣ Admin
Manages HR and Manager roles.

**Fields**
- admin_id (PK)
- name
- email
- phone
- admin_role

---

### 2️⃣ OrgUnit (Department / Project)
Represents departments or projects.

**Fields**
- org_unit_id (PK)
- dept_id
- dept_name
- unit_type (DEPARTMENT / PROJECT)
- description
- start_date
- end_date
- status

---

### 3️⃣ Employee
Stores employee details.

**Fields**
- employee_id (PK)
- name
- email
- phone
- role
- date_of_joining
- employment_status
- org_unit_id (FK → OrgUnit)

---

### 4️⃣ Login
Stores employee login credentials.

**Fields**
- login_id (PK)
- username
- password_hash
- last_login
- is_active
- employee_id (FK → Employee)

---

### 5️⃣ Employee Leave (`employee_leave`)
> ⚠️ `leave` is a reserved keyword in MySQL, so table name is changed.

**Fields**
- leave_id (PK)
- leave_type
- start_date
- end_date
- applied_date
- reason
- status
- employee_id (FK → Employee)

---

### 6️⃣ Payslip
Manages salary details.

**Fields**
- payslip_id (PK)
- month
- basic_salary
- deductions
- net_salary
- generated_date
- employee_id (FK → Employee)

---

### 7️⃣ Meeting
Stores meeting schedules.

**Fields**
- meeting_id (PK)
- meeting_title
- meeting_date
- start_time
- end_time
- meeting_link

---

### 8️⃣ Project Update
Tracks employee project progress.

**Fields**
- update_id (PK)
- update_date
- work_mode
- status_message
- progress_percentage
- employee_id (FK → Employee)
- org_unit_id (FK → OrgUnit)

---

### 9️⃣ Efforts
Tracks employee work hours.

**Fields**
- effort_id (PK)
- work_date
- hours_worked
- task_description
- employee_id (FK → Employee)
- org_unit_id (FK → OrgUnit)

---

## 🔗 Relationships Summary

- One OrgUnit → Many Employees  
- One Employee → One Login  
- One Employee → Many Leaves  
- One Employee → Many Payslips  
- One Employee → Many Project Updates  
- One Employee → Many Efforts  

---

## 🌐 Application Layers

### Controller Layer
- Handles HTTP requests
- Uses `@RestController`

### Service Layer
- Contains business logic
- Uses `@Service`
- Constructor injection (no `@Autowired`)

### Repository Layer
- Uses Spring Data JPA
- Extends `JpaRepository`

---

## ⚙️ application.properties (Sample)

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/HRMS
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



---

## 🗄️ Database Tables & Schema

### 1️⃣ Admin
Manages HR and Manager roles.

**Fields**
- admin_id (PK)
- name
- email
- phone
- admin_role

---

### 2️⃣ OrgUnit (Department / Project)
Represents departments or projects.

**Fields**
- org_unit_id (PK)
- dept_id
- dept_name
- unit_type (DEPARTMENT / PROJECT)
- description
- start_date
- end_date
- status

---

### 3️⃣ Employee
Stores employee details.

**Fields**
- employee_id (PK)
- name
- email
- phone
- role
- date_of_joining
- employment_status
- org_unit_id (FK → OrgUnit)

---

### 4️⃣ Login
Stores employee login credentials.

**Fields**
- login_id (PK)
- username
- password_hash
- last_login
- is_active
- employee_id (FK → Employee)

---

### 5️⃣ Employee Leave (`employee_leave`)
> ⚠️ `leave` is a reserved keyword in MySQL, so table name is changed.

**Fields**
- leave_id (PK)
- leave_type
- start_date
- end_date
- applied_date
- reason
- status
- employee_id (FK → Employee)

---

### 6️⃣ Payslip
Manages salary details.

**Fields**
- payslip_id (PK)
- month
- basic_salary
- deductions
- net_salary
- generated_date
- employee_id (FK → Employee)

---

### 7️⃣ Meeting
Stores meeting schedules.

**Fields**
- meeting_id (PK)
- meeting_title
- meeting_date
- start_time
- end_time
- meeting_link

---

### 8️⃣ Project Update
Tracks employee project progress.

**Fields**
- update_id (PK)
- update_date
- work_mode
- status_message
- progress_percentage
- employee_id (FK → Employee)
- org_unit_id (FK → OrgUnit)

---

### 9️⃣ Efforts
Tracks employee work hours.

**Fields**
- effort_id (PK)
- work_date
- hours_worked
- task_description
- employee_id (FK → Employee)
- org_unit_id (FK → OrgUnit)

---

## 🔗 Relationships Summary

- One OrgUnit → Many Employees  
- One Employee → One Login  
- One Employee → Many Leaves  
- One Employee → Many Payslips  
- One Employee → Many Project Updates  
- One Employee → Many Efforts  

---

## 🌐 Application Layers

### Controller Layer
- Handles HTTP requests
- Uses `@RestController`

### Service Layer
- Contains business logic
- Uses `@Service`
- Constructor injection (no `@Autowired`)

### Repository Layer
- Uses Spring Data JPA
- Extends `JpaRepository`

---

## ⚙️ application.properties (Sample)

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/HRMS
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


1. Clone the repository

git clone https://github.com/your-username/hrms.git

2️⃣ Create database

CREATE DATABASE HRMS;

4️⃣ Run application

mvn spring-boot:run

5️⃣ Access APIs

http://localhost:8080


**
---

If you want next, I can:
- Make this **resume-ready**
- Add **Swagger API docs**
- Add **JWT authentication**
- Create a **frontend-friendly API list**

Just tell me 👍**





