// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterCoreInstanceFleetInstanceTypeConfigConfiguration {
    /**
     * Classification within a configuration.
     * 
     */
    private final @Nullable String classification;
    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    private final @Nullable Map<String,Object> properties;

    @OutputCustomType.Constructor({"classification","properties"})
    private ClusterCoreInstanceFleetInstanceTypeConfigConfiguration(
        @Nullable String classification,
        @Nullable Map<String,Object> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    /**
     * Classification within a configuration.
     * 
     */
    public Optional<String> getClassification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    public Map<String,Object> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetInstanceTypeConfigConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable Map<String,Object> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetInstanceTypeConfigConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder setClassification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,Object> properties) {
            this.properties = properties;
            return this;
        }
        public ClusterCoreInstanceFleetInstanceTypeConfigConfiguration build() {
            return new ClusterCoreInstanceFleetInstanceTypeConfigConfiguration(classification, properties);
        }
    }
}
