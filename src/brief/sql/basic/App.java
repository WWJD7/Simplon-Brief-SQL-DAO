package brief.sql.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws SQLException {
		/*
		 * CREATE TABLE simplon.produits ( id INT NOT NULL AUTO_INCREMENT, nom
		 * varchar(100) NOT NULL, CONSTRAINT produits_PK PRIMARY KEY (id) )
		 */

		// remplacer avec vos paramètres
		// Connection con =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/simplon",
		// "sarcelles", "sarcelles");

		
		//Requetes d'insertion (executeUpdate)
		Connection cnx = DriverManager.getConnection("jdbc:mysql://192.168.2.107:3306/simplon", "root", "root");

		Statement stmt = cnx.createStatement();

		String insertSql = "INSERT INTO produits(nom) VALUES('vélo'),('Skateboard'),('Trotinette')";

		stmt.executeUpdate(insertSql);
		
		
		//requete e select
		String selectSql = "SELECT * FROM simplon.produits";
		ResultSet resultSet = stmt.executeQuery(selectSql);
		
		
		//On cree une classe de Model, Produit, pour stocker les Produit dans un tableau de peoduit
		//On se retrouve ensuite dans un etat classique d'objet et de tableau d'objet, on oublie SQL !!
		List<Produit> produits = new ArrayList<>();
        
		while (resultSet.next()) {
		    Produit produit = new Produit();
		    produit.setId(resultSet.getInt("id"));
		    produit.setNom(resultSet.getString("nom"));		  
		    produits.add(produit);
		}
		
		for(Produit p : produits)
		{
			System.out.println(p);
		}
		
		
		///Maintenant il faut découpler ce spaghetti avoir avoir Model et repository à leur place :)
		

	}

}
