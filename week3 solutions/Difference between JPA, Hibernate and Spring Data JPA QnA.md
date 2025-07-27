

* JPA (Java Persistence API) -



JPA is a specification — it defines interfaces but doesn’t implement them.



It standardizes ORM (Object Relational Mapping) in Java.



Uses EntityManager to perform operations like persist, merge, remove.



Requires a JPA provider like Hibernate or EclipseLink to function.



Supports JPQL (Java Persistence Query Language) for writing queries.





* Hibernate -



Hibernate is a popular JPA implementation and full ORM framework.



Offers its own Session API in addition to JPA's EntityManager.



Provides advanced features like first/second-level caching.



Can execute HQL (Hibernate Query Language) and native SQL.



Needs more manual configuration if not used with Spring.



code-

&nbsp;  /\* Method to CREATE an employee in the database \*/

&nbsp;  public Integer addEmployee(Employee employee){

&nbsp;     Session session = factory.openSession();

&nbsp;     Transaction tx = null;

&nbsp;     Integer employeeID = null;

&nbsp;     

&nbsp;     try {

&nbsp;        tx = session.beginTransaction();

&nbsp;        employeeID = (Integer) session.save(employee); 

&nbsp;        tx.commit();

&nbsp;     } catch (HibernateException e) {

&nbsp;        if (tx != null) tx.rollback();

&nbsp;        e.printStackTrace(); 

&nbsp;     } finally {

&nbsp;        session.close(); 

&nbsp;     }

&nbsp;     return employeeID;

&nbsp;  }







* Spring Data JPA - 



Spring Data JPA is a high-level abstraction over JPA.



Removes boilerplate by using interfaces like JpaRepository.



Auto-generates query methods like findByName(), findAll(), etc.



Seamlessly integrates with Spring Boot for fast setup.



Handles dependency injection, transactions, and entity scanning automatically.



code-

EmployeeRespository.java-

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}

EmployeeService.java-

&nbsp;   @Autowire

&nbsp;   private EmployeeRepository employeeRepository;



&nbsp;   @Transactional

&nbsp;   public void addEmployee(Employee employee) {

&nbsp;       employeeRepository.save(employee);

&nbsp;   }















