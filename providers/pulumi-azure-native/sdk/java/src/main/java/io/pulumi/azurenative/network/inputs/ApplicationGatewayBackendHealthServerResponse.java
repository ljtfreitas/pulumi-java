// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway backendhealth http settings.
 * 
 */
public final class ApplicationGatewayBackendHealthServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayBackendHealthServerResponse Empty = new ApplicationGatewayBackendHealthServerResponse();

    /**
     * IP address or FQDN of backend server.
     * 
     */
    @InputImport(name="address")
    private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    /**
     * Health of backend server.
     * 
     */
    @InputImport(name="health")
    private final @Nullable String health;

    public Optional<String> getHealth() {
        return this.health == null ? Optional.empty() : Optional.ofNullable(this.health);
    }

    /**
     * Health Probe Log.
     * 
     */
    @InputImport(name="healthProbeLog")
    private final @Nullable String healthProbeLog;

    public Optional<String> getHealthProbeLog() {
        return this.healthProbeLog == null ? Optional.empty() : Optional.ofNullable(this.healthProbeLog);
    }

    /**
     * Reference to IP configuration of backend server.
     * 
     */
    @InputImport(name="ipConfiguration")
    private final @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration;

    public Optional<NetworkInterfaceIPConfigurationResponse> getIpConfiguration() {
        return this.ipConfiguration == null ? Optional.empty() : Optional.ofNullable(this.ipConfiguration);
    }

    public ApplicationGatewayBackendHealthServerResponse(
        @Nullable String address,
        @Nullable String health,
        @Nullable String healthProbeLog,
        @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration) {
        this.address = address;
        this.health = health;
        this.healthProbeLog = healthProbeLog;
        this.ipConfiguration = ipConfiguration;
    }

    private ApplicationGatewayBackendHealthServerResponse() {
        this.address = null;
        this.health = null;
        this.healthProbeLog = null;
        this.ipConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHealthServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String health;
        private @Nullable String healthProbeLog;
        private @Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHealthServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.health = defaults.health;
    	      this.healthProbeLog = defaults.healthProbeLog;
    	      this.ipConfiguration = defaults.ipConfiguration;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setHealth(@Nullable String health) {
            this.health = health;
            return this;
        }

        public Builder setHealthProbeLog(@Nullable String healthProbeLog) {
            this.healthProbeLog = healthProbeLog;
            return this;
        }

        public Builder setIpConfiguration(@Nullable NetworkInterfaceIPConfigurationResponse ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public ApplicationGatewayBackendHealthServerResponse build() {
            return new ApplicationGatewayBackendHealthServerResponse(address, health, healthProbeLog, ipConfiguration);
        }
    }
}
