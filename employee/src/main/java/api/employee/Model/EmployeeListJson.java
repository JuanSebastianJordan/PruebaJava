package api.employee.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeListJson {

    private Data[] data;

    public EmployeeListJson() {
    }

    public EmployeeListJson(Data[] data) {
        this.data = data;
    }

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }


}
