// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class ModelQualityJobDefinitionNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionNetworkConfigArgs Empty = new ModelQualityJobDefinitionNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @Import(name="enableInterContainerTrafficEncryption")
      private final @Nullable Output<Boolean> enableInterContainerTrafficEncryption;

    public Output<Boolean> getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption == null ? Output.empty() : this.enableInterContainerTrafficEncryption;
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @Import(name="enableNetworkIsolation")
      private final @Nullable Output<Boolean> enableNetworkIsolation;

    public Output<Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Output.empty() : this.enableNetworkIsolation;
    }

    @Import(name="vpcConfig")
      private final @Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig;

    public Output<ModelQualityJobDefinitionVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public ModelQualityJobDefinitionNetworkConfigArgs(
        @Nullable Output<Boolean> enableInterContainerTrafficEncryption,
        @Nullable Output<Boolean> enableNetworkIsolation,
        @Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    private ModelQualityJobDefinitionNetworkConfigArgs() {
        this.enableInterContainerTrafficEncryption = Output.empty();
        this.enableNetworkIsolation = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableInterContainerTrafficEncryption;
        private @Nullable Output<Boolean> enableNetworkIsolation;
        private @Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Output<Boolean> enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = Output.ofNullable(enableInterContainerTrafficEncryption);
            return this;
        }

        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Output.ofNullable(enableNetworkIsolation);
            return this;
        }

        public Builder vpcConfig(@Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(@Nullable ModelQualityJobDefinitionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }
        public ModelQualityJobDefinitionNetworkConfigArgs build() {
            return new ModelQualityJobDefinitionNetworkConfigArgs(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
