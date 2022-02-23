// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointFilterResponse;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointScopeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint.
 * 
 */
public final class ConnectionMonitorEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorEndpointResponse Empty = new ConnectionMonitorEndpointResponse();

    /**
     * Address of the connection monitor endpoint (IP or domain name).
     * 
     */
    @InputImport(name="address")
        private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    /**
     * Test coverage for the endpoint.
     * 
     */
    @InputImport(name="coverageLevel")
        private final @Nullable String coverageLevel;

    public Optional<String> getCoverageLevel() {
        return this.coverageLevel == null ? Optional.empty() : Optional.ofNullable(this.coverageLevel);
    }

    /**
     * Filter for sub-items within the endpoint.
     * 
     */
    @InputImport(name="filter")
        private final @Nullable ConnectionMonitorEndpointFilterResponse filter;

    public Optional<ConnectionMonitorEndpointFilterResponse> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The name of the connection monitor endpoint.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Resource ID of the connection monitor endpoint.
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * Endpoint scope.
     * 
     */
    @InputImport(name="scope")
        private final @Nullable ConnectionMonitorEndpointScopeResponse scope;

    public Optional<ConnectionMonitorEndpointScopeResponse> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    /**
     * The endpoint type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ConnectionMonitorEndpointResponse(
        @Nullable String address,
        @Nullable String coverageLevel,
        @Nullable ConnectionMonitorEndpointFilterResponse filter,
        String name,
        @Nullable String resourceId,
        @Nullable ConnectionMonitorEndpointScopeResponse scope,
        @Nullable String type) {
        this.address = address;
        this.coverageLevel = coverageLevel;
        this.filter = filter;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceId = resourceId;
        this.scope = scope;
        this.type = type;
    }

    private ConnectionMonitorEndpointResponse() {
        this.address = null;
        this.coverageLevel = null;
        this.filter = null;
        this.name = null;
        this.resourceId = null;
        this.scope = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String coverageLevel;
        private @Nullable ConnectionMonitorEndpointFilterResponse filter;
        private String name;
        private @Nullable String resourceId;
        private @Nullable ConnectionMonitorEndpointScopeResponse scope;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.coverageLevel = defaults.coverageLevel;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setCoverageLevel(@Nullable String coverageLevel) {
            this.coverageLevel = coverageLevel;
            return this;
        }

        public Builder setFilter(@Nullable ConnectionMonitorEndpointFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setScope(@Nullable ConnectionMonitorEndpointScopeResponse scope) {
            this.scope = scope;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ConnectionMonitorEndpointResponse build() {
            return new ConnectionMonitorEndpointResponse(address, coverageLevel, filter, name, resourceId, scope, type);
        }
    }
}
