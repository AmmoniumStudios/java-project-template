package org.ammonium.example.api.model;

import java.util.UUID;

/**
 * A user of the system.
 */
public final class User {

    private final UUID uniqueId;
    private final String username;
    private final String emailAddress;

    public User(String username, String emailAddress) {
        this(UUID.randomUUID(), username, emailAddress);
    }

    public User(UUID uniqueId, String username, String emailAddress) {
        this.uniqueId = uniqueId;
        this.username = username;
        this.emailAddress = emailAddress;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
            "uniqueId=" + uniqueId +
            ", username='" + username + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            '}';
    }
}
