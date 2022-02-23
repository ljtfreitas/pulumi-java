// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.EndpointRefResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRefResponse {
    /**
     * A list of endpoints that are exposed on this network.
     * 
     */
    private final @Nullable List<EndpointRefResponse> endpointRefs;
    /**
     * Name of the network
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"endpointRefs","name"})
    private NetworkRefResponse(
        @Nullable List<EndpointRefResponse> endpointRefs,
        @Nullable String name) {
        this.endpointRefs = endpointRefs;
        this.name = name;
    }

    /**
     * A list of endpoints that are exposed on this network.
     * 
     */
    public List<EndpointRefResponse> getEndpointRefs() {
        return this.endpointRefs == null ? List.of() : this.endpointRefs;
    }
    /**
     * Name of the network
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointRefResponse> endpointRefs;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointRefs = defaults.endpointRefs;
    	      this.name = defaults.name;
        }

        public Builder setEndpointRefs(@Nullable List<EndpointRefResponse> endpointRefs) {
            this.endpointRefs = endpointRefs;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public NetworkRefResponse build() {
            return new NetworkRefResponse(endpointRefs, name);
        }
    }
}
