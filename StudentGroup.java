public class StudentGroup {
    
    private Integer groupId;

    public StudentGroup(Integer groupId) {
        this.groupId = groupId;
    }


    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        
        return String.format("groupId: %d", groupId);
    }
}
