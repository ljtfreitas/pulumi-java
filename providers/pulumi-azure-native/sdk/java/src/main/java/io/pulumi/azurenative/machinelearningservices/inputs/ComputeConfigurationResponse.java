// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for compute binding.
 * 
 */
public final class ComputeConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeConfigurationResponse Empty = new ComputeConfigurationResponse();

    /**
     * Number of instances or nodes.
     * 
     */
    @InputImport(name="instanceCount")
    private final @Nullable Integer instanceCount;

    public Optional<Integer> getInstanceCount() {
        return this.instanceCount == null ? Optional.empty() : Optional.ofNullable(this.instanceCount);
    }

    /**
     * SKU type to run on.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable String instanceType;

    public Optional<String> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    /**
     * Set to true for jobs running on local compute.
     * 
     */
    @InputImport(name="isLocal")
    private final @Nullable Boolean isLocal;

    public Optional<Boolean> getIsLocal() {
        return this.isLocal == null ? Optional.empty() : Optional.ofNullable(this.isLocal);
    }

    /**
     * Location for virtual cluster run.
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Additional properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * ARM resource ID of the compute resource.
     * 
     */
    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ComputeConfigurationResponse(
        @Nullable Integer instanceCount,
        @Nullable String instanceType,
        @Nullable Boolean isLocal,
        @Nullable String location,
        @Nullable Map<String,String> properties,
        @Nullable String target) {
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.isLocal = isLocal;
        this.location = location;
        this.properties = properties;
        this.target = target;
    }

    private ComputeConfigurationResponse() {
        this.instanceCount = null;
        this.instanceType = null;
        this.isLocal = null;
        this.location = null;
        this.properties = Map.of();
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Boolean isLocal;
        private @Nullable String location;
        private @Nullable Map<String,String> properties;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.isLocal = defaults.isLocal;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.target = defaults.target;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setIsLocal(@Nullable Boolean isLocal) {
            this.isLocal = isLocal;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public ComputeConfigurationResponse build() {
            return new ComputeConfigurationResponse(instanceCount, instanceType, isLocal, location, properties, target);
        }
    }
}
