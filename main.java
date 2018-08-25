package mingquanjia;

import LinkedList.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkInterface me = new NetworkInterface();
		
		me.createUserProfile("Jespher", 22);
		//me.createUserProfile("Mina", 20);
		me.createCorporateProfile("COCO");
		
		me.postMessage("message1", "bigbang1", 0, 18, 2010);
		me.postMessage("message2", "bigbang2", 0, 18, 2013);
		me.postMessage("message3", "bigbang3", 0, 18, 2010);
		me.postMessage("message4", "bigbang4", 0, 18, 2012);
		me.postMessage("message5", "bigbang5", 0, 18, 2010);
		me.postMessage("message6", "bigbang6", 0, 18, 2014);
		me.postMessage("message7", "bigbang7", 0, 18, 2014);
		me.postMessage("message8", "bigbang8", 0, 18, 2016);
		me.postMessage("message9", "bigbang9", 0, 18, 2011);
		me.rate("Jespher", "COCO", 5);
		me.rate("Jespher", "SOSO", 1);
		me.postAd("COCO", "advartisement2", 1,false, 2011);
		me.postAd("COCO", "advertisement4", 1,false,2000);
		me.postAd("COCO", "advertisement3", 1, false,2000);
		me.postAd("COCO", "advertisement1", 1, false,2017);
		me.postAd("SOSO", "advartisement2", 1,true, 2011);
		me.postAd("SOSO", "advertisement4", 1, true,2000);
		me.postAd("SOSO", "advertisement3", 1, true,2000);
		me.postAd("SOSO", "advertisement1", 1, false,2017);
		me.connect("Jespher", "Mina");
		me.connect("Jespher", "Tina");
		me.connect("Jespher", "Louise");
		me.printFriendlist("Jespher");
		
		me.printWall("Jespher");
	
		me.printWall("Mina");
		
	//	LinkedList aa = new LinkedList();
		

	}

}
