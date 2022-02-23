// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGlobalUserOperationStatusResult {
    /**
     * status of the long running operation for an environment
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"status"})
    private GetGlobalUserOperationStatusResult(String status) {
        this.status = Objects.requireNonNull(status);
    }

    /**
     * status of the long running operation for an environment
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserOperationStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserOperationStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetGlobalUserOperationStatusResult build() {
            return new GetGlobalUserOperationStatusResult(status);
        }
    }
}
