// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupDataflowEndpointArgs;
import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupSecurityDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupEndpointDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupEndpointDetailsArgs Empty = new DataflowEndpointGroupEndpointDetailsArgs();

    @Import(name="endpoint")
      private final @Nullable Output<DataflowEndpointGroupDataflowEndpointArgs> endpoint;

    public Output<DataflowEndpointGroupDataflowEndpointArgs> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    @Import(name="securityDetails")
      private final @Nullable Output<DataflowEndpointGroupSecurityDetailsArgs> securityDetails;

    public Output<DataflowEndpointGroupSecurityDetailsArgs> getSecurityDetails() {
        return this.securityDetails == null ? Output.empty() : this.securityDetails;
    }

    public DataflowEndpointGroupEndpointDetailsArgs(
        @Nullable Output<DataflowEndpointGroupDataflowEndpointArgs> endpoint,
        @Nullable Output<DataflowEndpointGroupSecurityDetailsArgs> securityDetails) {
        this.endpoint = endpoint;
        this.securityDetails = securityDetails;
    }

    private DataflowEndpointGroupEndpointDetailsArgs() {
        this.endpoint = Output.empty();
        this.securityDetails = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupEndpointDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataflowEndpointGroupDataflowEndpointArgs> endpoint;
        private @Nullable Output<DataflowEndpointGroupSecurityDetailsArgs> securityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupEndpointDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.securityDetails = defaults.securityDetails;
        }

        public Builder endpoint(@Nullable Output<DataflowEndpointGroupDataflowEndpointArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable DataflowEndpointGroupDataflowEndpointArgs endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder securityDetails(@Nullable Output<DataflowEndpointGroupSecurityDetailsArgs> securityDetails) {
            this.securityDetails = securityDetails;
            return this;
        }

        public Builder securityDetails(@Nullable DataflowEndpointGroupSecurityDetailsArgs securityDetails) {
            this.securityDetails = Output.ofNullable(securityDetails);
            return this;
        }
        public DataflowEndpointGroupEndpointDetailsArgs build() {
            return new DataflowEndpointGroupEndpointDetailsArgs(endpoint, securityDetails);
        }
    }
}
