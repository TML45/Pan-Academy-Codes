package animais;

public class TesteAnimal {
	
	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero();
		cachorro.setComunicar("Latir");
		cachorro.setMovimentar("Caminhar");
		cachorro.setHabitat("Terreste");
		
		Ave curio = new Ave();
		curio.setComunicar("cantar");
		curio.setMovimentar("voar");
		curio.setSongQuality("really good");
		
//		System.out.println(p1.toString());
//		System.out.println(p1.bonusSalario());
//		
//		System.out.println("PTG:   ");
//		ProfissionalTIGestao ptg = new ProfissionalTIGestao();
//		ptg.setSalario(1000);
//		System.out.println(ptg.bonusSalario());
		
		System.out.println(cachorro.getComunicar());
		System.out.println(cachorro.getMovimentar());
		System.out.println(cachorro.getHabitat());
		System.out.println(curio.getComunicar());
		System.out.println(curio.getMovimentar());
		System.out.println(curio.getSongQuality());
	}

}
