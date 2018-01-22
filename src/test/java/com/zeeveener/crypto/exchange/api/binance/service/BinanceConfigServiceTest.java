package com.zeeveener.crypto.exchange.api.binance.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

class BinanceConfigServiceTest {

    private BinanceConfigService configService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        this.configService = Mockito.spy(new BinanceConfigService());
    }

    @Test
    void getLastReloadTime_configHasNotYetBeenLoaded_expectInstantEpoch() {
        final Instant expected = Instant.EPOCH;

        final Instant actual = this.configService.getLastReloadTime();

        assertEquals(expected, actual);
    }

    @Test
    void getLastReloadTime_configHasBeenReloaded_expectTimeAfterInstantEpoch() {
        this.configService.reload();

        final Instant actual = this.configService.getLastReloadTime();

        assertTrue(Instant.EPOCH.isBefore(actual));
    }

    @Test
    void reload_gettingConfigFileThrowsIOException_expectEmptyProperties() throws Exception {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        when(reader.readLine()).thenThrow(new IOException());
        doReturn(reader).when(this.configService).getConfigFileReader();

        this.configService.reload();

        assertEquals(Optional.empty(), this.configService.getProperty("EXISTING_PROPERTY"));
    }

    @Test
    void reload_gettingConfigFileThrowsNullPointerException_expectEmptyProperties() throws Exception {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        when(reader.readLine()).thenThrow(new NullPointerException());
        doReturn(reader).when(this.configService).getConfigFileReader();

        this.configService.reload();

        assertEquals(Optional.empty(), this.configService.getProperty("EXISTING_PROPERTY"));
    }

    @Test
    void getProperty_nonExistantProperty_expectEmptyOptional() {
        assertEquals(Optional.empty(), this.configService.getProperty("UNKNOWN_PROPERTY"));
    }

    @Test
    void getProperty_existingProperty_expectEmptyOptional() {
        assertEquals(Optional.of("EXISTING_VALUE"), this.configService.getProperty("EXISTING_PROPERTY"));
    }
}