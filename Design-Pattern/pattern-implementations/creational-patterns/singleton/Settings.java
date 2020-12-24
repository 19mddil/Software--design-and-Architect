public class Settings{
	private static Settings settingsInstance = null;
	private static int totalKills;
	private static int totalRevives;
	private static int totalHeadshots;
	private Settings(){
		totalKills = 0;
		totalRevives = 0;
		totalHeadshots = 0;
	}
	public static Settings getInstance(int newKills,int newRevives,int newHeadshots){
		if(settingsInstance == null){
			settingsInstance = new Settings();
		}
		setStats(newKills,newRevives,newHeadshots);
		return settingsInstance;
	}
	public void show(){
		System.out.println("Kills : "+totalKills);
		System.out.println("Revives : "+totalRevives);
		System.out.println("totalHeadshots : "+totalHeadshots);
	}
	private static void setStats(int newKills,int newRevives,int newHeadshots){
		totalKills = totalKills + newKills;
		totalRevives = totalRevives + newRevives;
		totalHeadshots = totalHeadshots + newHeadshots;
	}
}
