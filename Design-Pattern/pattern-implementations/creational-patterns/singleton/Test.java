class Test{
	public static void main(String[] args){
		//match one
		int kills = 7;
		int revives = 4;
		int headshots = 7;
		Settings.getInstance(kills,revives,headshots).show();
		//match two
		kills = 3;
		revives = 5;
		headshots = 1;
		Settings.getInstance(kills,revives,headshots).show();
	}
}
