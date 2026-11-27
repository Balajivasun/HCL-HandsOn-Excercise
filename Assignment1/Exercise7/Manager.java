public class Manager implements AccessControl {
    public String getRole() { return "Manager"; }
    public int getAccessLevel() { return 2; }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}
