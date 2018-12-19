
package brief.sql.repo;

import brief.sql.repo.dao.SQLClientRepository;
import brief.sql.repo.model.IClientRepository;

public class App {

	
	public static void main(String[] args) {
		
		IClientRepository clients = new SQLClientRepository();
	}
}
