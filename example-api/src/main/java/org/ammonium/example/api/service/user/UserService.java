package org.ammonium.example.api.service.user;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.ammonium.example.api.model.User;
import org.ammonium.example.api.service.Service;

public final class UserService implements Service<UUID, User> {

    private final Map<UUID, User> cache;

    public UserService() {
        this.cache = new ConcurrentHashMap<>();
    }

    @Override
    public Map<UUID, User> getCache() {
        return this.cache;
    }

    @Override
    public User get(UUID uuid) {
        return this.cache.getOrDefault(uuid, null);
    }

    @Override
    public void save(User user) {
        this.cache.put(user.getUniqueId(), user);
    }

    @Override
    public void delete(UUID uuid) {
        this.cache.remove(uuid);
    }
}
