package com.zeeveener.crypto.exchange.api.service;

import java.time.Instant;
import java.util.Optional;

public interface ConfigService {
    Optional<String> getProperty(final String identifier);

    void reload();

    Instant getLastReloadTime();
}
