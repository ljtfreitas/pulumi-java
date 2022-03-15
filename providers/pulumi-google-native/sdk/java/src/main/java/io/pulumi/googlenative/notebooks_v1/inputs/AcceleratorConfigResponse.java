// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of a hardware accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute Engine](/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
 * 
 */
public final class AcceleratorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final AcceleratorConfigResponse Empty = new AcceleratorConfigResponse();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount", required=true)
      private final String coreCount;

    public String getCoreCount() {
        return this.coreCount;
    }

    /**
     * Type of this accelerator.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AcceleratorConfigResponse(
        String coreCount,
        String type) {
        this.coreCount = Objects.requireNonNull(coreCount, "expected parameter 'coreCount' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AcceleratorConfigResponse() {
        this.coreCount = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coreCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(String coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(coreCount, type);
        }
    }
}
