package com.zeeveener.crypto.exchange.api.binance.service;

import com.zeeveener.crypto.exchange.api.service.ConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Optional;
import java.util.Properties;

@Named
public class BinanceConfigService implements ConfigService {

    private static final String CONFIG_FILE = "binance.properties";

    private static final Logger LOGGER = LoggerFactory.getLogger(BinanceConfigService.class);
    private Instant lastReload = Instant.EPOCH;
    private Properties properties;

    @Override
    public Optional<String> getProperty(final String identifier) {
        if (this.lastReload.equals(Instant.EPOCH)) {
            this.reload();
        }
        return Optional.ofNullable(this.properties.getProperty(identifier));
    }

    @Override
    public void reload() {
        final Properties newlyRead = new Properties();
        try (final BufferedReader reader = this.getConfigFileReader()) {
            newlyRead.load(reader);
        } catch (IOException ioe) {
            LOGGER.error("Unable to reload configuration.", ioe);
        } catch (NullPointerException npe) {
            LOGGER.error("Unable to locate the properties file.", npe);
        }
        this.properties = newlyRead;
        this.lastReload = Instant.now();
    }

    @Override
    public Instant getLastReloadTime() {
        return this.lastReload;
    }

    BufferedReader getConfigFileReader() {
        return new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(CONFIG_FILE)));
    }
}
