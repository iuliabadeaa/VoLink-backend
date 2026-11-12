
package ro.iuliab.voluntari.dto;

import ro.iuliab.voluntari.model.enums.UserRole;

import java.time.OffsetDateTime;

public class UserResponse {

    private Long id;
    private String email;
    private UserRole role;
    private OffsetDateTime createdAt;

    public UserResponse(Long id, String email,
                        UserRole role, OffsetDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }
}
