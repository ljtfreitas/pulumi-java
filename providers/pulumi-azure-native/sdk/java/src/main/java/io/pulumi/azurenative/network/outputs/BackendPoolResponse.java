// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BackendResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendPoolResponse {
    /**
     * The set of backends for this pool
     * 
     */
    private final @Nullable List<BackendResponse> backends;
    /**
     * L7 health probe settings for a backend pool
     * 
     */
    private final @Nullable SubResourceResponse healthProbeSettings;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Load balancing settings for a backend pool
     * 
     */
    private final @Nullable SubResourceResponse loadBalancingSettings;
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * Resource status.
     * 
     */
    private final String resourceState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"backends","healthProbeSettings","id","loadBalancingSettings","name","resourceState","type"})
    private BackendPoolResponse(
        @Nullable List<BackendResponse> backends,
        @Nullable SubResourceResponse healthProbeSettings,
        @Nullable String id,
        @Nullable SubResourceResponse loadBalancingSettings,
        @Nullable String name,
        String resourceState,
        String type) {
        this.backends = backends;
        this.healthProbeSettings = healthProbeSettings;
        this.id = id;
        this.loadBalancingSettings = loadBalancingSettings;
        this.name = name;
        this.resourceState = Objects.requireNonNull(resourceState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The set of backends for this pool
     * 
     */
    public List<BackendResponse> getBackends() {
        return this.backends == null ? List.of() : this.backends;
    }
    /**
     * L7 health probe settings for a backend pool
     * 
     */
    public Optional<SubResourceResponse> getHealthProbeSettings() {
        return Optional.ofNullable(this.healthProbeSettings);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Load balancing settings for a backend pool
     * 
     */
    public Optional<SubResourceResponse> getLoadBalancingSettings() {
        return Optional.ofNullable(this.loadBalancingSettings);
    }
    /**
     * Resource name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Resource status.
     * 
     */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackendResponse> backends;
        private @Nullable SubResourceResponse healthProbeSettings;
        private @Nullable String id;
        private @Nullable SubResourceResponse loadBalancingSettings;
        private @Nullable String name;
        private String resourceState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backends = defaults.backends;
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.id = defaults.id;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.type = defaults.type;
        }

        public Builder setBackends(@Nullable List<BackendResponse> backends) {
            this.backends = backends;
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable SubResourceResponse healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLoadBalancingSettings(@Nullable SubResourceResponse loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BackendPoolResponse build() {
            return new BackendPoolResponse(backends, healthProbeSettings, id, loadBalancingSettings, name, resourceState, type);
        }
    }
}
