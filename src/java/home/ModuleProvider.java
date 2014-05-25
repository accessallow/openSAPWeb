package home;

import java.util.HashMap;

public class ModuleProvider {
    ModuleEntry e1,e2;

    public ModuleProvider() {
        init();
    }
    

    public void init() {
        e1 = new ModuleEntry();
        e1.setModule_name("cheque");
        e1.setModule_url("cheque");
        HashMap h1 = new HashMap();
        h1.put("Add a cheque", "add");
        h1.put("List all cheques", "list");
       // h1.put("hjhjhjhj", "audit");
        e1.setOperations(h1);
        
        e2 = new ModuleEntry();
        e2.setModule_name("payslip");
        e2.setModule_url("payslip");
        HashMap h2 = new HashMap();
        h2.put("Add a payslip", "add");
        h2.put("List all payslip", "list");
        h2.put("Payslip Audit", "audit");
        e2.setOperations(h2);
        

    }
    public ModuleEntry get_module(String module_name){
        
        if(module_name.trim().equals("cheque")){ return e1;}
        if(module_name.trim().equals("payslip")){ return e2;}
        return null;
    }

}
