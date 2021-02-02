package process;

import java.io.File;

import data.Map;
import data.Zone;

public class MapBuiler {

	
	public MapBuiler(Map map) {
		
	}
	
	
	public void  mapCreation(Map map) {
		Zone[][] zonesForMap=new Zone[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				File image=new File("src/img/segment/"+i+"-"+j+".png");
				Zone temp = new Zone(i,j,image);
				zonesForMap[i][j]=temp;
				System.out.println("MAPBUILDER : Creation de la zone: ( "+i+", "+j+" ) avec l'adresse -> "+zonesForMap[i][j].getImg());
			}
		}
		//map.setZones(zonesForMap);
	}
	
	
}
