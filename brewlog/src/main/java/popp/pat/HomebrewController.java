package popp.pat;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.hibernate.Transaction;

import popp.pat.model.Recipe;
 
@Path("/hello")
public class HomebrewController {
 
	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name) {
 
		String output = "Welcome   : " + name;
		//SQLiteJDBCDriverConnection.connect();
		Session session = null;
		Transaction tx = null;
		
		try {
			session = App.getSessionFactory().openSession();
			
			List<Recipe> recipes = session.createQuery("from Recipe").list();
			
			for(Recipe recipe : recipes) {
				System.out.println(recipe.getName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		
		return Response.status(200).entity(output).build();
 
	}
}
