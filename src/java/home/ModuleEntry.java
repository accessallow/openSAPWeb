package home;

import java.util.HashMap;

public class ModuleEntry {

    String module_name;
    String module_url;
    HashMap operations;

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getModule_url() {
        return module_url;
    }

    public void setModule_url(String module_url) {
        this.module_url = module_url;
    }

    public ModuleEntry() {
        operations = new HashMap();
    }

    public HashMap getOperations() {
        return operations;
    }

    public void setOperations(HashMap operations) {
        this.operations = operations;
    }

    public ModuleEntry(HashMap operations) {
        this.operations = operations;
    }

}
