package biblioj

class Auteur {
	
	String	nom
	String	prenom
	
	static hasMany = [auteurLivres : AuteurLivre]
		
    static constraints = {
		nom nullable : false, blank : false
		prenom nullable : false, blank : false
    }
}
