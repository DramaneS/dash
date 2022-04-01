package com.DashboardApprenants.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApprenantsApplication {

	@Autowired
	//private UtilisateurRepository utilisateurRepository;

	public static void main(String[] args) {
		SpringApplication.run(DashboardApprenantsApplication.class, args);
	}

	/*@Bean
	CommandLineRunner start(ApprenantRepository apprenantRepository){
		return args -> {
			apprenantRepository.save(new Utilisateur("Doumbia" ,"Yacouba",3,75900085, "Yacoubadoumbia@gmail.com",
					"Yacouba01", "azerty","Homme", UtilisateurStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Samake" ,"Modibo",3,75900085, "modibosamake@gmail.com",
					"Diarra", "azerty","Homme", UtilisateurStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Sanogo" ,"Allassan",3,75900085, "sanogoallassa@gmail.com",
					"Jumeau", "azerty","Homme", UtilisateurStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("N'Djim" ,"Fatoumata",3,75900085, "ndjim@gmail.com",
					"N'djim", "azerty","Femme", UtilisateurStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Maiga" ,"Abdoul",3,75900085, "abdoulmaiga@gmail.com",
					"Abdoul", "azerty","Femme", UtilisateurStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Konate" ,"Diakalia",3,75900085, "diakaliakonate@gmail.com",
					"Diakalia", "azerty","Homme", UtilisateurStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Sanogo" ,"Ibrahima",3,75900085, "ibrahimsanogo@gmail.com",
					"IB", "azerty","Homme", UtilisateurStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Cisse" ,"Thomas",3,75900085, "thomascisse@gmail.com",
					"Thomas", "azerty","Femme", UtilisateurStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Utilisateur("Bagayoko" ,"Mamoutou",3,75900085, "mamoutoubagayoko@gmail.com",
					"Mamoutou", "azerty","Femme", UtilisateurStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.findAll().forEach(apprenant -> {
				System.out.println(apprenant.toString());
			});
		};
	}*/
	/*@Override
	public void run(String... args) throws Exception {
		apprenantRepository.save(new Apprenant(1,"Doumbia" ,"Yacouba",3,75900085 ));
		apprenantRepository.save(new Apprenant(2,"Sanogo" ,"Allassan",4,75900000 ));
		apprenantRepository.save(new Apprenant(3,"Bagayoko" ,"Mamoutou",6,65900085 ));
		apprenantRepository.save(new Apprenant(4,"N'Djim" ,"Fatoumata",7,55900085 ));
		apprenantRepository.save(new Apprenant(5,"Cisse" ,"Thomad",8,85900085 ));
		apprenantRepository.save(new Apprenant(6,"Samake" ,"Modibo",9,95900085 ));
		apprenantRepository.save(new Apprenant(7,"Maiga" ,"Abdoul",10,15900085 ));
		apprenantRepository.save(new Apprenant(8,"Sanogo" ,"Ibrahima",11,25900085 ));*/
		


}
