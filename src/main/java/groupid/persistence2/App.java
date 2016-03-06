package groupid.persistence2;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("jpa_Example");
	EntityManager em = emf.createEntityManager();
	/*	
	 	User user1 = new User();
		user1.setAge("27");
		user1.setEmail("ditzjose@gmail.com");
		user1.setId(user1.hashCode()+"");
		user1.setName("Ditz Jose");
		User user3 = new User();
		user3.setAge("27");
		user3.setEmail("radhakrishna@gmail.com");
		user3.setId("34533432");
		user3.setName("Radha Krishna");
		
		em.getTransaction().begin();
		//em.persist(user1);
		//em.persist(user3);
		em.getTransaction().commit();
		
		// to find or query results
		
		User query = em.find(User .class,"34533432");
		System.out.println(query.getId()+" "+query.getEmail());
		
		
		// Update the table
		query.setEmail("change in emila done");
		em.getTransaction().begin();
		em.merge(query);
		em.getTransaction().commit();
		System.out.println("Updated list is :  "+query.getId()+" "+query.getEmail());
		
		// To remove
		
		em.getTransaction().begin();
		//em.remove(query);
		em.getTransaction().commit();
		
		// To find all values
		TypedQuery<User> query1 = em.createQuery("SELECT u FROM User u", User.class); // User is case sensitive
		List<User> users1 = query1.getResultList();
		
		System.out.println("List of all values: ");
		for(User val : users1)
		{
			System.out.println(val.getId()+"    :   "+val.getEmail());
		}
*/	
	User user1 = new User();
	user1.setAge("27");
	user1.setEmail("ditzjose@gmail.com");
	user1.setId(user1.hashCode()+"");
	user1.setName("Ditz Jose");
	User user3 = new User();
	user3.setAge("27");
	user3.setEmail("radhakrishna@gmail.com");
	user3.setId("34533432");
	user3.setName("Radha Krishna");
	Movie movie1 = new Movie();
	movie1.setmDescription("description");
	movie1.setmId("m1");
	movie1.setmLength("122");
	movie1.setmName("Shwashank Redemtion");
	movie1.setmUserOrderNum(null);
	em.getTransaction().begin();
	em.persist(user1);
	em.persist(user3);
	em.persist(movie1);
	em.getTransaction().commit();
		em.close();
		emf.close();

	}
}
