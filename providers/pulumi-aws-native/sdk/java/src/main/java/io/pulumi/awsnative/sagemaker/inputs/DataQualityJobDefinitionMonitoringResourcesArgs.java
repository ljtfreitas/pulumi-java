// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionClusterConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionMonitoringResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionMonitoringResourcesArgs Empty = new DataQualityJobDefinitionMonitoringResourcesArgs();

    @InputImport(name="clusterConfig", required=true)
        private final Input<DataQualityJobDefinitionClusterConfigArgs> clusterConfig;

    public Input<DataQualityJobDefinitionClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig;
    }

    public DataQualityJobDefinitionMonitoringResourcesArgs(Input<DataQualityJobDefinitionClusterConfigArgs> clusterConfig) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig, "expected parameter 'clusterConfig' to be non-null");
    }

    private DataQualityJobDefinitionMonitoringResourcesArgs() {
        this.clusterConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataQualityJobDefinitionClusterConfigArgs> clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionMonitoringResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder setClusterConfig(Input<DataQualityJobDefinitionClusterConfigArgs> clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }

        public Builder setClusterConfig(DataQualityJobDefinitionClusterConfigArgs clusterConfig) {
            this.clusterConfig = Input.of(Objects.requireNonNull(clusterConfig));
            return this;
        }
        public DataQualityJobDefinitionMonitoringResourcesArgs build() {
            return new DataQualityJobDefinitionMonitoringResourcesArgs(clusterConfig);
        }
    }
}
