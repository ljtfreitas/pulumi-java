// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A specification of the type and number of accelerator cards attached to the instance.
 * 
 */
public final class AcceleratorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final AcceleratorConfigResponse Empty = new AcceleratorConfigResponse();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="acceleratorCount", required=true)
      private final Integer acceleratorCount;

    public Integer getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final String acceleratorType;

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public AcceleratorConfigResponse(
        Integer acceleratorCount,
        String acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private AcceleratorConfigResponse() {
        this.acceleratorCount = null;
        this.acceleratorType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(acceleratorCount, acceleratorType);
        }
    }
}
