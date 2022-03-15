// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Settings for revision-level scaling settings.
 * 
 */
public final class GoogleCloudRunOpV2RevisionScalingResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2RevisionScalingResponse Empty = new GoogleCloudRunOpV2RevisionScalingResponse();

    /**
     * Maximum number of serving instances that this resource should have.
     * 
     */
    @Import(name="maxInstanceCount", required=true)
      private final Integer maxInstanceCount;

    public Integer getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * Minimum number of serving instances that this resource should have.
     * 
     */
    @Import(name="minInstanceCount", required=true)
      private final Integer minInstanceCount;

    public Integer getMinInstanceCount() {
        return this.minInstanceCount;
    }

    public GoogleCloudRunOpV2RevisionScalingResponse(
        Integer maxInstanceCount,
        Integer minInstanceCount) {
        this.maxInstanceCount = Objects.requireNonNull(maxInstanceCount, "expected parameter 'maxInstanceCount' to be non-null");
        this.minInstanceCount = Objects.requireNonNull(minInstanceCount, "expected parameter 'minInstanceCount' to be non-null");
    }

    private GoogleCloudRunOpV2RevisionScalingResponse() {
        this.maxInstanceCount = null;
        this.minInstanceCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2RevisionScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxInstanceCount;
        private Integer minInstanceCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2RevisionScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        public Builder maxInstanceCount(Integer maxInstanceCount) {
            this.maxInstanceCount = Objects.requireNonNull(maxInstanceCount);
            return this;
        }

        public Builder minInstanceCount(Integer minInstanceCount) {
            this.minInstanceCount = Objects.requireNonNull(minInstanceCount);
            return this;
        }
        public GoogleCloudRunOpV2RevisionScalingResponse build() {
            return new GoogleCloudRunOpV2RevisionScalingResponse(maxInstanceCount, minInstanceCount);
        }
    }
}
