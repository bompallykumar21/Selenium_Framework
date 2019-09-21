package responses;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notes {

@SerializedName("endpoint")
@Expose
private String endpoint;

@SerializedName("organisation_uri")
@Expose
private String organisationUri;

@SerializedName("version")
@Expose
private String version;
@SerializedName("queue")
@Expose
private String queue;
@SerializedName("sanction_zones")
@Expose
private Integer sanctionZones;
@SerializedName("war_zones")
@Expose
private Integer warZones;
@SerializedName("last_position")
@Expose
private String lastPosition;
@SerializedName("position_type")
@Expose
private String positionType;

public String getEndpoint() {
return endpoint;
}

public void setEndpoint(String endpoint) {
this.endpoint = endpoint;
}

public String getOrganisationUri() {
return organisationUri;
}

public void setOrganisationUri(String organisationUri) {
this.organisationUri = organisationUri;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public String getQueue() {
return queue;
}

public void setQueue(String queue) {
this.queue = queue;
}

public Integer getSanctionZones() {
return sanctionZones;
}

public void setSanctionZones(Integer sanctionZones) {
this.sanctionZones = sanctionZones;
}

public Integer getWarZones() {
return warZones;
}

public void setWarZones(Integer warZones) {
this.warZones = warZones;
}

public String getLastPosition() {
return lastPosition;
}

public void setLastPosition(String lastPosition) {
this.lastPosition = lastPosition;
}

public String getPositionType() {
return positionType;
}

public void setPositionType(String positionType) {
this.positionType = positionType;
}

}