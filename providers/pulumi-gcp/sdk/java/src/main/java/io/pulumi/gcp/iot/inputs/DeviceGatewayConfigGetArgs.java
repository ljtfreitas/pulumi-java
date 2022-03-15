// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceGatewayConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceGatewayConfigGetArgs Empty = new DeviceGatewayConfigGetArgs();

    /**
     * Indicates whether the device is a gateway.
     * Possible values are `ASSOCIATION_ONLY`, `DEVICE_AUTH_TOKEN_ONLY`, and `ASSOCIATION_AND_DEVICE_AUTH_TOKEN`.
     * 
     */
    @Import(name="gatewayAuthMethod")
      private final @Nullable Output<String> gatewayAuthMethod;

    public Output<String> getGatewayAuthMethod() {
        return this.gatewayAuthMethod == null ? Output.empty() : this.gatewayAuthMethod;
    }

    /**
     * Indicates whether the device is a gateway.
     * Default value is `NON_GATEWAY`.
     * Possible values are `GATEWAY` and `NON_GATEWAY`.
     * 
     */
    @Import(name="gatewayType")
      private final @Nullable Output<String> gatewayType;

    public Output<String> getGatewayType() {
        return this.gatewayType == null ? Output.empty() : this.gatewayType;
    }

    /**
     * - 
     * The ID of the gateway the device accessed most recently.
     * 
     */
    @Import(name="lastAccessedGatewayId")
      private final @Nullable Output<String> lastAccessedGatewayId;

    public Output<String> getLastAccessedGatewayId() {
        return this.lastAccessedGatewayId == null ? Output.empty() : this.lastAccessedGatewayId;
    }

    /**
     * - 
     * The most recent time at which the device accessed the gateway specified in last_accessed_gateway.
     * 
     */
    @Import(name="lastAccessedGatewayTime")
      private final @Nullable Output<String> lastAccessedGatewayTime;

    public Output<String> getLastAccessedGatewayTime() {
        return this.lastAccessedGatewayTime == null ? Output.empty() : this.lastAccessedGatewayTime;
    }

    public DeviceGatewayConfigGetArgs(
        @Nullable Output<String> gatewayAuthMethod,
        @Nullable Output<String> gatewayType,
        @Nullable Output<String> lastAccessedGatewayId,
        @Nullable Output<String> lastAccessedGatewayTime) {
        this.gatewayAuthMethod = gatewayAuthMethod;
        this.gatewayType = gatewayType;
        this.lastAccessedGatewayId = lastAccessedGatewayId;
        this.lastAccessedGatewayTime = lastAccessedGatewayTime;
    }

    private DeviceGatewayConfigGetArgs() {
        this.gatewayAuthMethod = Output.empty();
        this.gatewayType = Output.empty();
        this.lastAccessedGatewayId = Output.empty();
        this.lastAccessedGatewayTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceGatewayConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gatewayAuthMethod;
        private @Nullable Output<String> gatewayType;
        private @Nullable Output<String> lastAccessedGatewayId;
        private @Nullable Output<String> lastAccessedGatewayTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceGatewayConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayAuthMethod = defaults.gatewayAuthMethod;
    	      this.gatewayType = defaults.gatewayType;
    	      this.lastAccessedGatewayId = defaults.lastAccessedGatewayId;
    	      this.lastAccessedGatewayTime = defaults.lastAccessedGatewayTime;
        }

        public Builder gatewayAuthMethod(@Nullable Output<String> gatewayAuthMethod) {
            this.gatewayAuthMethod = gatewayAuthMethod;
            return this;
        }

        public Builder gatewayAuthMethod(@Nullable String gatewayAuthMethod) {
            this.gatewayAuthMethod = Output.ofNullable(gatewayAuthMethod);
            return this;
        }

        public Builder gatewayType(@Nullable Output<String> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder gatewayType(@Nullable String gatewayType) {
            this.gatewayType = Output.ofNullable(gatewayType);
            return this;
        }

        public Builder lastAccessedGatewayId(@Nullable Output<String> lastAccessedGatewayId) {
            this.lastAccessedGatewayId = lastAccessedGatewayId;
            return this;
        }

        public Builder lastAccessedGatewayId(@Nullable String lastAccessedGatewayId) {
            this.lastAccessedGatewayId = Output.ofNullable(lastAccessedGatewayId);
            return this;
        }

        public Builder lastAccessedGatewayTime(@Nullable Output<String> lastAccessedGatewayTime) {
            this.lastAccessedGatewayTime = lastAccessedGatewayTime;
            return this;
        }

        public Builder lastAccessedGatewayTime(@Nullable String lastAccessedGatewayTime) {
            this.lastAccessedGatewayTime = Output.ofNullable(lastAccessedGatewayTime);
            return this;
        }
        public DeviceGatewayConfigGetArgs build() {
            return new DeviceGatewayConfigGetArgs(gatewayAuthMethod, gatewayType, lastAccessedGatewayId, lastAccessedGatewayTime);
        }
    }
}
