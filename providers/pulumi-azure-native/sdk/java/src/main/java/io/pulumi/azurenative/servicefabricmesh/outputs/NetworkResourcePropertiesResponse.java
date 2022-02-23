// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkResourcePropertiesResponse {
    /**
     * User readable description of the network.
     * 
     */
    private final @Nullable String description;
    /**
     * The type of a Service Fabric container network.
     * Expected value is 'NetworkResourceProperties'.
     * 
     */
    private final String kind;
    /**
     * State of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Status of the network.
     * 
     */
    private final String status;
    /**
     * Gives additional information about the current status of the network.
     * 
     */
    private final String statusDetails;

    @OutputCustomType.Constructor({"description","kind","provisioningState","status","statusDetails"})
    private NetworkResourcePropertiesResponse(
        @Nullable String description,
        String kind,
        String provisioningState,
        String status,
        String statusDetails) {
        this.description = description;
        this.kind = Objects.requireNonNull(kind);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = Objects.requireNonNull(status);
        this.statusDetails = Objects.requireNonNull(statusDetails);
    }

    /**
     * User readable description of the network.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The type of a Service Fabric container network.
     * Expected value is 'NetworkResourceProperties'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * State of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Status of the network.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the network.
     * 
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String kind;
        private String provisioningState;
        private String status;
        private String statusDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public NetworkResourcePropertiesResponse build() {
            return new NetworkResourcePropertiesResponse(description, kind, provisioningState, status, statusDetails);
        }
    }
}
