// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelBiasJobDefinitionClusterConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionMonitoringResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionMonitoringResourcesArgs Empty = new ModelBiasJobDefinitionMonitoringResourcesArgs();

    @InputImport(name="clusterConfig", required=true)
        private final Input<ModelBiasJobDefinitionClusterConfigArgs> clusterConfig;

    public Input<ModelBiasJobDefinitionClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig;
    }

    public ModelBiasJobDefinitionMonitoringResourcesArgs(Input<ModelBiasJobDefinitionClusterConfigArgs> clusterConfig) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig, "expected parameter 'clusterConfig' to be non-null");
    }

    private ModelBiasJobDefinitionMonitoringResourcesArgs() {
        this.clusterConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ModelBiasJobDefinitionClusterConfigArgs> clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionMonitoringResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder setClusterConfig(Input<ModelBiasJobDefinitionClusterConfigArgs> clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }

        public Builder setClusterConfig(ModelBiasJobDefinitionClusterConfigArgs clusterConfig) {
            this.clusterConfig = Input.of(Objects.requireNonNull(clusterConfig));
            return this;
        }
        public ModelBiasJobDefinitionMonitoringResourcesArgs build() {
            return new ModelBiasJobDefinitionMonitoringResourcesArgs(clusterConfig);
        }
    }
}
