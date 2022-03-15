// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.FabricCreationInputPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationFabricArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationFabricArgs Empty = new ReplicationFabricArgs();

    /**
     * Name of the ASR fabric.
     * 
     */
    @Import(name="fabricName")
      private final @Nullable Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName == null ? Output.empty() : this.fabricName;
    }

    /**
     * Fabric creation input.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<FabricCreationInputPropertiesArgs> properties;

    public Output<FabricCreationInputPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationFabricArgs(
        @Nullable Output<String> fabricName,
        @Nullable Output<FabricCreationInputPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.fabricName = fabricName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationFabricArgs() {
        this.fabricName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationFabricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fabricName;
        private @Nullable Output<FabricCreationInputPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationFabricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder fabricName(@Nullable Output<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = Output.ofNullable(fabricName);
            return this;
        }

        public Builder properties(@Nullable Output<FabricCreationInputPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable FabricCreationInputPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ReplicationFabricArgs build() {
            return new ReplicationFabricArgs(fabricName, properties, resourceGroupName, resourceName);
        }
    }
}
