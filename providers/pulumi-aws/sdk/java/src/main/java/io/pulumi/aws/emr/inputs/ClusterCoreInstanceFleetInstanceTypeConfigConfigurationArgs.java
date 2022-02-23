// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs Empty = new ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs();

    /**
     * Classification within a configuration.
     * 
     */
    @InputImport(name="classification")
    private final @Nullable Input<String> classification;

    public Input<String> getClassification() {
        return this.classification == null ? Input.empty() : this.classification;
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,Object>> properties;

    public Input<Map<String,Object>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs(
        @Nullable Input<String> classification,
        @Nullable Input<Map<String,Object>> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    private ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs() {
        this.classification = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> classification;
        private @Nullable Input<Map<String,Object>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder setClassification(@Nullable Input<String> classification) {
            this.classification = classification;
            return this;
        }

        public Builder setClassification(@Nullable String classification) {
            this.classification = Input.ofNullable(classification);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,Object>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,Object> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs build() {
            return new ClusterCoreInstanceFleetInstanceTypeConfigConfigurationArgs(classification, properties);
        }
    }
}
