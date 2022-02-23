// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiskResponse {
    /**
     * Unique Azure Resource ID of the Managed Disk.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"id"})
    private DiskResponse(String id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * Unique Azure Resource ID of the Managed Disk.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public DiskResponse build() {
            return new DiskResponse(id);
        }
    }
}
