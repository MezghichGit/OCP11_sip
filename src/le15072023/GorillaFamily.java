package le15072023;

class GorillaFamily {
	 String walk = "walk";

	void everyonePlay(boolean baby) {
		String approach = "amble";
		 //approach = "run";
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}
	void play(Gorilla g) {
		System.out.println(g.move());
	}
}
