package Day_5;

class Locker {
    private String lockerId;
    private boolean isLocked;
    private String passcode;


    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true; // Initially locked
    }


    private class SecurityManager {
        private boolean verifyPasscode(String inputCode) {
            return passcode.equals(inputCode);
        }
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locker " + lockerId + " is now locked.");
    }


    public boolean unlock(String code) {
        SecurityManager securityManager = new SecurityManager();
        if (securityManager.verifyPasscode(code)) {
            isLocked = false;
            System.out.println("Locker " + lockerId + " is now unlocked.");
            return true;
        } else {
            System.out.println("Incorrect passcode. Access denied.");
            return false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }


    public void displayStatus() {
        System.out.println("Locker ID: " + lockerId + " | Status: " + (isLocked ? "Locked" : "Unlocked"));
    }
}


public class LockerTest {
    public static void main(String[] args) {
        Locker myLocker = new Locker("L001", "1234");

        myLocker.displayStatus();
        myLocker.unlock("0000"); 
        myLocker.unlock("1234"); 
        myLocker.displayStatus();
        myLocker.lock();
        myLocker.displayStatus();
    }
}
