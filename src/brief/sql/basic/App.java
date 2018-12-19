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
			
		//Requetes d'insertion (executeUpdate)
		//si pbm avec le format horaire genre The server time zone value 'Paris, Madrid' is unrecognized
		//ajouter cela juste apres le nom de la bases de données dans l'url jdbc
		//?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC
		
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplon", "sarcelles", "sarcelles");

		Statement stmt = cnx.createStatement();

		String insertSql = "INSERT INTO pays(nom) VALUES('Roumanie'),('Algérie'),('Turquie')";

		stmt.executeUpdate(insertSql);
		
		
		//requete e select
		String selectSql = "SELECT * FROM simplon.pays";
		ResultSet resultSet = stmt.executeQuery(selectSql);
		
		
		//On cree une classe de Model, Pays, pour stocker les pays dans un tableau de pays
		//On se retrouve ensuite dans un etat classique d'objet et de tableau d'objet, on oublie SQL !!
		List<Pays> pays = new ArrayList<>();
        
		while (resultSet.next()) {
			Pays produit = new Pays();
		    produit.setId(resultSet.getInt("id"));
		    produit.setNom(resultSet.getString("nom"));		  
		    pays.add(produit);
		}
		
		for(Pays p : pays)
		{
			System.out.println(p);
		}
		
		
		///Maintenant il faut découpler ce spaghetti avoir avoir Model et repository à leur place :)
		

	}

}
