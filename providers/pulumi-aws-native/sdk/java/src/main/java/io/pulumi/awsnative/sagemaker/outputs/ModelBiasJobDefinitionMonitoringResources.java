// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionClusterConfig;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ModelBiasJobDefinitionMonitoringResources {
    private final ModelBiasJobDefinitionClusterConfig clusterConfig;

    @CustomType.Constructor
    private ModelBiasJobDefinitionMonitoringResources(@CustomType.Parameter("clusterConfig") ModelBiasJobDefinitionClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public ModelBiasJobDefinitionClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionMonitoringResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionClusterConfig clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionMonitoringResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(ModelBiasJobDefinitionClusterConfig clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public ModelBiasJobDefinitionMonitoringResources build() {
            return new ModelBiasJobDefinitionMonitoringResources(clusterConfig);
        }
    }
}
