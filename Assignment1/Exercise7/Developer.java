public class Developer implements AccessControl {
    public String getRole() { return "Developer"; }
    public int getAccessLevel() { return 1; }

    public boolean canAccess(int requiredLevel) {
        return getAccessLevel() >= requiredLevel;
    }
}
