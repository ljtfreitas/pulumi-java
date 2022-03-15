// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops;

import io.pulumi.azurenative.devops.enums.PipelineTypeEnum;
import io.pulumi.azurenative.devops.inputs.BootstrapConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * Configuration used to bootstrap the Pipeline.
     * 
     */
    @Import(name="bootstrapConfiguration", required=true)
      private final Output<BootstrapConfigurationArgs> bootstrapConfiguration;

    public Output<BootstrapConfigurationArgs> getBootstrapConfiguration() {
        return this.bootstrapConfiguration;
    }

    /**
     * Resource Location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the Pipeline resource in ARM.
     * 
     */
    @Import(name="pipelineName")
      private final @Nullable Output<String> pipelineName;

    public Output<String> getPipelineName() {
        return this.pipelineName == null ? Output.empty() : this.pipelineName;
    }

    /**
     * Specifies which CI/CD provider to use. Valid options are 'azurePipeline', 'githubWorkflow'.
     * 
     */
    @Import(name="pipelineType", required=true)
      private final Output<Either<String,PipelineTypeEnum>> pipelineType;

    public Output<Either<String,PipelineTypeEnum>> getPipelineType() {
        return this.pipelineType;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource Tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PipelineArgs(
        Output<BootstrapConfigurationArgs> bootstrapConfiguration,
        @Nullable Output<String> location,
        @Nullable Output<String> pipelineName,
        Output<Either<String,PipelineTypeEnum>> pipelineType,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.bootstrapConfiguration = Objects.requireNonNull(bootstrapConfiguration, "expected parameter 'bootstrapConfiguration' to be non-null");
        this.location = location;
        this.pipelineName = pipelineName;
        this.pipelineType = Objects.requireNonNull(pipelineType, "expected parameter 'pipelineType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PipelineArgs() {
        this.bootstrapConfiguration = Output.empty();
        this.location = Output.empty();
        this.pipelineName = Output.empty();
        this.pipelineType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BootstrapConfigurationArgs> bootstrapConfiguration;
        private @Nullable Output<String> location;
        private @Nullable Output<String> pipelineName;
        private Output<Either<String,PipelineTypeEnum>> pipelineType;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapConfiguration = defaults.bootstrapConfiguration;
    	      this.location = defaults.location;
    	      this.pipelineName = defaults.pipelineName;
    	      this.pipelineType = defaults.pipelineType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder bootstrapConfiguration(Output<BootstrapConfigurationArgs> bootstrapConfiguration) {
            this.bootstrapConfiguration = Objects.requireNonNull(bootstrapConfiguration);
            return this;
        }

        public Builder bootstrapConfiguration(BootstrapConfigurationArgs bootstrapConfiguration) {
            this.bootstrapConfiguration = Output.of(Objects.requireNonNull(bootstrapConfiguration));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder pipelineName(@Nullable String pipelineName) {
            this.pipelineName = Output.ofNullable(pipelineName);
            return this;
        }

        public Builder pipelineType(Output<Either<String,PipelineTypeEnum>> pipelineType) {
            this.pipelineType = Objects.requireNonNull(pipelineType);
            return this;
        }

        public Builder pipelineType(Either<String,PipelineTypeEnum> pipelineType) {
            this.pipelineType = Output.of(Objects.requireNonNull(pipelineType));
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(bootstrapConfiguration, location, pipelineName, pipelineType, resourceGroupName, tags);
        }
    }
}
