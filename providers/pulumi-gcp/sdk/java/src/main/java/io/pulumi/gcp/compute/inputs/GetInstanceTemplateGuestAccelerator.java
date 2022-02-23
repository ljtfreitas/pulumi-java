// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTemplateGuestAccelerator extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateGuestAccelerator Empty = new GetInstanceTemplateGuestAccelerator();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @InputImport(name="count", required=true)
        private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public GetInstanceTemplateGuestAccelerator(
        Integer count,
        String type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetInstanceTemplateGuestAccelerator() {
        this.count = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceTemplateGuestAccelerator build() {
            return new GetInstanceTemplateGuestAccelerator(count, type);
        }
    }
}
