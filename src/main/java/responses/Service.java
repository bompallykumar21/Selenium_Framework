package responses;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Service {

@SerializedName("errors")
@Expose
private List<Object> errors = null;

@SerializedName("notes")
@Expose
private Notes notes;

@SerializedName("service_type")
@Expose
private String serviceType;
@SerializedName("status")
@Expose
private String status;

public List<Object> getErrors() {
return errors;
}

public void setErrors(List<Object> errors) {
this.errors = errors;
}

public Notes getNotes() {
return notes;
}

public void setNotes(Notes notes) {
this.notes = notes;
}

public String getServiceType() {
return serviceType;
}

public void setServiceType(String serviceType) {
this.serviceType = serviceType;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

}