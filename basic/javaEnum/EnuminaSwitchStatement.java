enum Level{
	BAJO,
	MEDIO,
	ALTO
}

class EnuminaSwitchStatement{
	public static void main(String[] args){
		Level myVar = Level.MEDIO;
		switch(myVar) {
			case BAJO:
    			System.out.println("Muy bajo");
			break;
			case MEDIO:
    			System.out.println("medio level");
			break;
			case ALTO:
    			System.out.println("alto level ");
			break;
		}

	}
}