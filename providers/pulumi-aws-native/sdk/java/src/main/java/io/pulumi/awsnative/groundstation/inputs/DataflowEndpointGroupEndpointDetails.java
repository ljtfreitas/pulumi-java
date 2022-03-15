// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupDataflowEndpoint;
import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupSecurityDetails;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupEndpointDetails extends io.pulumi.resources.InvokeArgs {

    public static final DataflowEndpointGroupEndpointDetails Empty = new DataflowEndpointGroupEndpointDetails();

    @Import(name="endpoint")
      private final @Nullable DataflowEndpointGroupDataflowEndpoint endpoint;

    public Optional<DataflowEndpointGroupDataflowEndpoint> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    @Import(name="securityDetails")
      private final @Nullable DataflowEndpointGroupSecurityDetails securityDetails;

    public Optional<DataflowEndpointGroupSecurityDetails> getSecurityDetails() {
        return this.securityDetails == null ? Optional.empty() : Optional.ofNullable(this.securityDetails);
    }

    public DataflowEndpointGroupEndpointDetails(
        @Nullable DataflowEndpointGroupDataflowEndpoint endpoint,
        @Nullable DataflowEndpointGroupSecurityDetails securityDetails) {
        this.endpoint = endpoint;
        this.securityDetails = securityDetails;
    }

    private DataflowEndpointGroupEndpointDetails() {
        this.endpoint = null;
        this.securityDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupEndpointDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataflowEndpointGroupDataflowEndpoint endpoint;
        private @Nullable DataflowEndpointGroupSecurityDetails securityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupEndpointDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.securityDetails = defaults.securityDetails;
        }

        public Builder endpoint(@Nullable DataflowEndpointGroupDataflowEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder securityDetails(@Nullable DataflowEndpointGroupSecurityDetails securityDetails) {
            this.securityDetails = securityDetails;
            return this;
        }
        public DataflowEndpointGroupEndpointDetails build() {
            return new DataflowEndpointGroupEndpointDetails(endpoint, securityDetails);
        }
    }
}
