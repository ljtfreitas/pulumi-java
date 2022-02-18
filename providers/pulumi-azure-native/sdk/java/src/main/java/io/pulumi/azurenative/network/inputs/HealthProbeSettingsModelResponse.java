// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Load balancing settings for a backend pool
 * 
 */
public final class HealthProbeSettingsModelResponse extends io.pulumi.resources.InvokeArgs {

    public static final HealthProbeSettingsModelResponse Empty = new HealthProbeSettingsModelResponse();

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable String enabledState;

    public Optional<String> getEnabledState() {
        return this.enabledState == null ? Optional.empty() : Optional.ofNullable(this.enabledState);
    }

    /**
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     */
    @InputImport(name="healthProbeMethod")
    private final @Nullable String healthProbeMethod;

    public Optional<String> getHealthProbeMethod() {
        return this.healthProbeMethod == null ? Optional.empty() : Optional.ofNullable(this.healthProbeMethod);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The number of seconds between health probes.
     * 
     */
    @InputImport(name="intervalInSeconds")
    private final @Nullable Integer intervalInSeconds;

    public Optional<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The path to use for the health probe. Default is /
     * 
     */
    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Protocol scheme to use for this probe
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * Resource status.
     * 
     */
    @InputImport(name="resourceState", required=true)
    private final String resourceState;

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public HealthProbeSettingsModelResponse(
        @Nullable String enabledState,
        @Nullable String healthProbeMethod,
        @Nullable String id,
        @Nullable Integer intervalInSeconds,
        @Nullable String name,
        @Nullable String path,
        @Nullable String protocol,
        String resourceState,
        String type) {
        this.enabledState = enabledState;
        this.healthProbeMethod = healthProbeMethod == null ? "HEAD" : healthProbeMethod;
        this.id = id;
        this.intervalInSeconds = intervalInSeconds;
        this.name = name;
        this.path = path;
        this.protocol = protocol;
        this.resourceState = Objects.requireNonNull(resourceState, "expected parameter 'resourceState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HealthProbeSettingsModelResponse() {
        this.enabledState = null;
        this.healthProbeMethod = null;
        this.id = null;
        this.intervalInSeconds = null;
        this.name = null;
        this.path = null;
        this.protocol = null;
        this.resourceState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthProbeSettingsModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabledState;
        private @Nullable String healthProbeMethod;
        private @Nullable String id;
        private @Nullable Integer intervalInSeconds;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable String protocol;
        private String resourceState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthProbeSettingsModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.healthProbeMethod = defaults.healthProbeMethod;
    	      this.id = defaults.id;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.resourceState = defaults.resourceState;
    	      this.type = defaults.type;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setHealthProbeMethod(@Nullable String healthProbeMethod) {
            this.healthProbeMethod = healthProbeMethod;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
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

        public HealthProbeSettingsModelResponse build() {
            return new HealthProbeSettingsModelResponse(enabledState, healthProbeMethod, id, intervalInSeconds, name, path, protocol, resourceState, type);
        }
    }
}
