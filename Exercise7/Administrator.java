public class Administrator implements AccessControl {
    public String getRole() { return "Administrator"; }
    public int getAccessLevel() { return 3; }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}
