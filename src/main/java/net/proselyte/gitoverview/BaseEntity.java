package net.proselyte.gitoverview;

public class BaseEntity {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
