// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayProtocol;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayProbeHealthResponseMatch;
import io.pulumi.azurenative.network.inputs.SubResource;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationGatewayBackendHealthOnDemandArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationGatewayBackendHealthOnDemandArgs Empty = new GetApplicationGatewayBackendHealthOnDemandArgs();

    /**
     * The name of the application gateway.
     * 
     */
    @Import(name="applicationGatewayName", required=true)
      private final String applicationGatewayName;

    public String getApplicationGatewayName() {
        return this.applicationGatewayName;
    }

    /**
     * Reference to backend pool of application gateway to which probe request will be sent.
     * 
     */
    @Import(name="backendAddressPool")
      private final @Nullable SubResource backendAddressPool;

    public Optional<SubResource> getBackendAddressPool() {
        return this.backendAddressPool == null ? Optional.empty() : Optional.ofNullable(this.backendAddressPool);
    }

    /**
     * Reference to backend http setting of application gateway to be used for test probe.
     * 
     */
    @Import(name="backendHttpSettings")
      private final @Nullable SubResource backendHttpSettings;

    public Optional<SubResource> getBackendHttpSettings() {
        return this.backendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.backendHttpSettings);
    }

    /**
     * Expands BackendAddressPool and BackendHttpSettings referenced in backend health.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * Host name to send the probe to.
     * 
     */
    @Import(name="host")
      private final @Nullable String host;

    public Optional<String> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    /**
     * Criterion for classifying a healthy probe response.
     * 
     */
    @Import(name="match")
      private final @Nullable ApplicationGatewayProbeHealthResponseMatch match;

    public Optional<ApplicationGatewayProbeHealthResponseMatch> getMatch() {
        return this.match == null ? Optional.empty() : Optional.ofNullable(this.match);
    }

    /**
     * Relative path of probe. Valid path starts from '/'. Probe is sent to <Protocol>://<host>:<port><path>.
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Whether the host header should be picked from the backend http settings. Default value is false.
     * 
     */
    @Import(name="pickHostNameFromBackendHttpSettings")
      private final @Nullable Boolean pickHostNameFromBackendHttpSettings;

    public Optional<Boolean> getPickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.pickHostNameFromBackendHttpSettings);
    }

    /**
     * The protocol used for the probe.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Either<String,ApplicationGatewayProtocol> protocol;

    public Either<String,ApplicationGatewayProtocol> getProtocol() {
        return this.protocol == null ? null : this.protocol;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Integer timeout;

    public Optional<Integer> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public GetApplicationGatewayBackendHealthOnDemandArgs(
        String applicationGatewayName,
        @Nullable SubResource backendAddressPool,
        @Nullable SubResource backendHttpSettings,
        @Nullable String expand,
        @Nullable String host,
        @Nullable ApplicationGatewayProbeHealthResponseMatch match,
        @Nullable String path,
        @Nullable Boolean pickHostNameFromBackendHttpSettings,
        @Nullable Either<String,ApplicationGatewayProtocol> protocol,
        String resourceGroupName,
        @Nullable Integer timeout) {
        this.applicationGatewayName = Objects.requireNonNull(applicationGatewayName, "expected parameter 'applicationGatewayName' to be non-null");
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.expand = expand;
        this.host = host;
        this.match = match;
        this.path = path;
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        this.protocol = protocol;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.timeout = timeout;
    }

    private GetApplicationGatewayBackendHealthOnDemandArgs() {
        this.applicationGatewayName = null;
        this.backendAddressPool = null;
        this.backendHttpSettings = null;
        this.expand = null;
        this.host = null;
        this.match = null;
        this.path = null;
        this.pickHostNameFromBackendHttpSettings = null;
        this.protocol = null;
        this.resourceGroupName = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewayBackendHealthOnDemandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationGatewayName;
        private @Nullable SubResource backendAddressPool;
        private @Nullable SubResource backendHttpSettings;
        private @Nullable String expand;
        private @Nullable String host;
        private @Nullable ApplicationGatewayProbeHealthResponseMatch match;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendHttpSettings;
        private @Nullable Either<String,ApplicationGatewayProtocol> protocol;
        private String resourceGroupName;
        private @Nullable Integer timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationGatewayBackendHealthOnDemandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayName = defaults.applicationGatewayName;
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.expand = defaults.expand;
    	      this.host = defaults.host;
    	      this.match = defaults.match;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendHttpSettings = defaults.pickHostNameFromBackendHttpSettings;
    	      this.protocol = defaults.protocol;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.timeout = defaults.timeout;
        }

        public Builder applicationGatewayName(String applicationGatewayName) {
            this.applicationGatewayName = Objects.requireNonNull(applicationGatewayName);
            return this;
        }

        public Builder backendAddressPool(@Nullable SubResource backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder backendHttpSettings(@Nullable SubResource backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder match(@Nullable ApplicationGatewayProbeHealthResponseMatch match) {
            this.match = match;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder pickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }

        public Builder protocol(@Nullable Either<String,ApplicationGatewayProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public GetApplicationGatewayBackendHealthOnDemandArgs build() {
            return new GetApplicationGatewayBackendHealthOnDemandArgs(applicationGatewayName, backendAddressPool, backendHttpSettings, expand, host, match, path, pickHostNameFromBackendHttpSettings, protocol, resourceGroupName, timeout);
        }
    }
}
