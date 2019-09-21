package responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Systems {

@SerializedName("ais")
@Expose
private String ais;

@SerializedName("commservice")
@Expose
private String commservice;

@SerializedName("commservice-api")
@Expose
private String commserviceApi;

@SerializedName("compliance")
@Expose
private String compliance;

@SerializedName("geoserver")
@Expose
private String geoserver;

@SerializedName("sis")
@Expose
private String sis;

public String getAis() {
return ais;
}

public void setAis(String ais) {
this.ais = ais;
}

public String getCommservice() {
return commservice;
}

public void setCommservice(String commservice) {
this.commservice = commservice;
}

public String getCommserviceApi() {
return commserviceApi;
}

public void setCommserviceApi(String commserviceApi) {
this.commserviceApi = commserviceApi;
}

public String getCompliance() {
return compliance;
}

public void setCompliance(String compliance) {
this.compliance = compliance;
}

public String getGeoserver() {
return geoserver;
}

public void setGeoserver(String geoserver) {
this.geoserver = geoserver;
}

public String getSis() {
return sis;
}

public void setSis(String sis) {
this.sis = sis;
}

}