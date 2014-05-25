package home;

import java.util.HashMap;

public class ModuleRegistry {

    HashMap modules;

    public ModuleRegistry() {
        modules = new HashMap();
    }

    public HashMap getModules() {
        init();
        return modules;
    }

    public void setModules(HashMap modules) {
        this.modules = modules;
    }

    public void init() {
        this.modules.put("Cheque", "cheque");
        this.modules.put("PaySlip", "payslip");
        this.modules.put("Invoice Registry", "invoice");
        this.modules.put("Product Entry", "product_entry");
        this.modules.put("Purchase", "purchase");
    }

}
