

package login;

import openSAPdto.cheque.ChequeEntryBook;

/**
 *
 * @author GhostMachine
 */
public class exp1 {
    public static void main(String args[]){
        new LoginSystem().add(new Account("pankaj", "pankaj", RightLevel.Administrator));
     //   new ChequeEntryBook().cheque_audit_data();
        
    }
    
}
