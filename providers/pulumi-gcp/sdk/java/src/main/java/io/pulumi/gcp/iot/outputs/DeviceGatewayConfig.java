// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeviceGatewayConfig {
    /**
     * Indicates whether the device is a gateway.
     * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
     * 
     */
    private final @Nullable String gatewayAuthMethod;
    /**
     * Indicates whether the device is a gateway.
     * Default value is `NON_GATEWAY`.
     * Possible values are `GATEWAY` and `NON_GATEWAY`.
     * 
     */
    private final @Nullable String gatewayType;
    /**
     * - 
     * The ID of the gateway the device accessed most recently.
     * 
     */
    private final @Nullable String lastAccessedGatewayId;
    /**
     * - 
     * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
     * 
     */
    private final @Nullable String lastAccessedGatewayTime;

    @OutputCustomType.Constructor({"gatewayAuthMethod","gatewayType","lastAccessedGatewayId","lastAccessedGatewayTime"})
    private DeviceGatewayConfig(
        @Nullable String gatewayAuthMethod,
        @Nullable String gatewayType,
        @Nullable String lastAccessedGatewayId,
        @Nullable String lastAccessedGatewayTime) {
        this.gatewayAuthMethod = gatewayAuthMethod;
        this.gatewayType = gatewayType;
        this.lastAccessedGatewayId = lastAccessedGatewayId;
        this.lastAccessedGatewayTime = lastAccessedGatewayTime;
    }

    /**
     * Indicates whether the device is a gateway.
     * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
     * 
     */
    public Optional<String> getGatewayAuthMethod() {
        return Optional.ofNullable(this.gatewayAuthMethod);
    }
    /**
     * Indicates whether the device is a gateway.
     * Default value is `NON_GATEWAY`.
     * Possible values are `GATEWAY` and `NON_GATEWAY`.
     * 
     */
    public Optional<String> getGatewayType() {
        return Optional.ofNullable(this.gatewayType);
    }
    /**
     * - 
     * The ID of the gateway the device accessed most recently.
     * 
     */
    public Optional<String> getLastAccessedGatewayId() {
        return Optional.ofNullable(this.lastAccessedGatewayId);
    }
    /**
     * - 
     * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
     * 
     */
    public Optional<String> getLastAccessedGatewayTime() {
        return Optional.ofNullable(this.lastAccessedGatewayTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceGatewayConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String gatewayAuthMethod;
        private @Nullable String gatewayType;
        private @Nullable String lastAccessedGatewayId;
        private @Nullable String lastAccessedGatewayTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceGatewayConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayAuthMethod = defaults.gatewayAuthMethod;
    	      this.gatewayType = defaults.gatewayType;
    	      this.lastAccessedGatewayId = defaults.lastAccessedGatewayId;
    	      this.lastAccessedGatewayTime = defaults.lastAccessedGatewayTime;
        }

        public Builder setGatewayAuthMethod(@Nullable String gatewayAuthMethod) {
            this.gatewayAuthMethod = gatewayAuthMethod;
            return this;
        }

        public Builder setGatewayType(@Nullable String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder setLastAccessedGatewayId(@Nullable String lastAccessedGatewayId) {
            this.lastAccessedGatewayId = lastAccessedGatewayId;
            return this;
        }

        public Builder setLastAccessedGatewayTime(@Nullable String lastAccessedGatewayTime) {
            this.lastAccessedGatewayTime = lastAccessedGatewayTime;
            return this;
        }
        public DeviceGatewayConfig build() {
            return new DeviceGatewayConfig(gatewayAuthMethod, gatewayType, lastAccessedGatewayId, lastAccessedGatewayTime);
        }
    }
}
