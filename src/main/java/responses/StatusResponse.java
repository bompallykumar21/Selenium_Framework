package responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusResponse {

@SerializedName("generated")
@Expose
private String generated;

@SerializedName("overall_status")
@Expose
private String overallStatus;

@SerializedName("services")
@Expose
private List<Service> services = null;

@SerializedName("systems")
@Expose
private Systems systems;

@SerializedName("version")
@Expose
private String version;

public String getGenerated() {
return generated;
}

public void setGenerated(String generated) {
this.generated = generated;
}

public String getOverallStatus() {
return overallStatus;
}

public void setOverallStatus(String overallStatus) {
this.overallStatus = overallStatus;
}

public List<Service> getServices() {
return services;
}

public void setServices(List<Service> services) {
this.services = services;
}

public Systems getSystems() {
return systems;
}

public void setSystems(Systems systems) {
this.systems = systems;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

}
