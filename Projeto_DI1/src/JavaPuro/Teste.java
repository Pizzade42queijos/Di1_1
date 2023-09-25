package JavaPuro;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Imprimindo um exemplo de tipo de padrão PURO:\nConstrutor: Singletons");
		SingletonLazy lento = SingletonLazy.getInstance();
		System.out.println(lento);
		lento = SingletonLazy.getInstance();
		System.out.println(lento);
		System.out.println("Comportamental: Strategy");
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		System.out.println("Estrutural: Facade");
		
		Facade facade = new Facade();
		facade.migrarCliente("Josias Mac-rosias", "1212121212");
		
	}

}
