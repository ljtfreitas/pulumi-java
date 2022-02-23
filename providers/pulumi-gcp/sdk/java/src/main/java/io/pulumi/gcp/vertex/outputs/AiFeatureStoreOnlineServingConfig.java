// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AiFeatureStoreOnlineServingConfig {
    /**
     * The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    private final Integer fixedNodeCount;

    @OutputCustomType.Constructor({"fixedNodeCount"})
    private AiFeatureStoreOnlineServingConfig(Integer fixedNodeCount) {
        this.fixedNodeCount = Objects.requireNonNull(fixedNodeCount);
    }

    /**
     * The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    public Integer getFixedNodeCount() {
        return this.fixedNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreOnlineServingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fixedNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreOnlineServingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedNodeCount = defaults.fixedNodeCount;
        }

        public Builder setFixedNodeCount(Integer fixedNodeCount) {
            this.fixedNodeCount = Objects.requireNonNull(fixedNodeCount);
            return this;
        }
        public AiFeatureStoreOnlineServingConfig build() {
            return new AiFeatureStoreOnlineServingConfig(fixedNodeCount);
        }
    }
}
