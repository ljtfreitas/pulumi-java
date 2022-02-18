// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The cluster definition.
 * 
 */
public final class ClusterDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterDefinitionResponse Empty = new ClusterDefinitionResponse();

    /**
     * The link to the blueprint.
     * 
     */
    @InputImport(name="blueprint")
    private final @Nullable String blueprint;

    public Optional<String> getBlueprint() {
        return this.blueprint == null ? Optional.empty() : Optional.ofNullable(this.blueprint);
    }

    /**
     * The versions of different services in the cluster.
     * 
     */
    @InputImport(name="componentVersion")
    private final @Nullable Map<String,String> componentVersion;

    public Map<String,String> getComponentVersion() {
        return this.componentVersion == null ? Map.of() : this.componentVersion;
    }

    /**
     * The cluster configurations.
     * 
     */
    @InputImport(name="configurations")
    private final @Nullable Object configurations;

    public Optional<Object> getConfigurations() {
        return this.configurations == null ? Optional.empty() : Optional.ofNullable(this.configurations);
    }

    /**
     * The type of cluster.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    public ClusterDefinitionResponse(
        @Nullable String blueprint,
        @Nullable Map<String,String> componentVersion,
        @Nullable Object configurations,
        @Nullable String kind) {
        this.blueprint = blueprint;
        this.componentVersion = componentVersion;
        this.configurations = configurations;
        this.kind = kind;
    }

    private ClusterDefinitionResponse() {
        this.blueprint = null;
        this.componentVersion = Map.of();
        this.configurations = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blueprint;
        private @Nullable Map<String,String> componentVersion;
        private @Nullable Object configurations;
        private @Nullable String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprint = defaults.blueprint;
    	      this.componentVersion = defaults.componentVersion;
    	      this.configurations = defaults.configurations;
    	      this.kind = defaults.kind;
        }

        public Builder setBlueprint(@Nullable String blueprint) {
            this.blueprint = blueprint;
            return this;
        }

        public Builder setComponentVersion(@Nullable Map<String,String> componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }

        public Builder setConfigurations(@Nullable Object configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public ClusterDefinitionResponse build() {
            return new ClusterDefinitionResponse(blueprint, componentVersion, configurations, kind);
        }
    }
}
