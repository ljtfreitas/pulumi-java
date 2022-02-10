// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.outputs;

import io.pulumi.azurenative.fluidrelay.outputs.FluidRelayEndpointsResponse;
import io.pulumi.azurenative.fluidrelay.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFluidRelayServerResult {
    private final FluidRelayEndpointsResponse fluidRelayEndpoints;
    private final String frsTenantId;
    private final String id;
    private final String location;
    private final String name;
    private final @Nullable String provisioningState;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"fluidRelayEndpoints","frsTenantId","id","location","name","provisioningState","systemData","tags","type"})
    private GetFluidRelayServerResult(
        FluidRelayEndpointsResponse fluidRelayEndpoints,
        String frsTenantId,
        String id,
        String location,
        String name,
        @Nullable String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.fluidRelayEndpoints = Objects.requireNonNull(fluidRelayEndpoints);
        this.frsTenantId = Objects.requireNonNull(frsTenantId);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public FluidRelayEndpointsResponse getFluidRelayEndpoints() {
        return this.fluidRelayEndpoints;
    }
    public String getFrsTenantId() {
        return this.frsTenantId;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluidRelayServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FluidRelayEndpointsResponse fluidRelayEndpoints;
        private String frsTenantId;
        private String id;
        private String location;
        private String name;
        private @Nullable String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fluidRelayEndpoints = defaults.fluidRelayEndpoints;
    	      this.frsTenantId = defaults.frsTenantId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setFluidRelayEndpoints(FluidRelayEndpointsResponse fluidRelayEndpoints) {
            this.fluidRelayEndpoints = Objects.requireNonNull(fluidRelayEndpoints);
            return this;
        }

        public Builder setFrsTenantId(String frsTenantId) {
            this.frsTenantId = Objects.requireNonNull(frsTenantId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFluidRelayServerResult build() {
            return new GetFluidRelayServerResult(fluidRelayEndpoints, frsTenantId, id, location, name, provisioningState, systemData, tags, type);
        }
    }
}