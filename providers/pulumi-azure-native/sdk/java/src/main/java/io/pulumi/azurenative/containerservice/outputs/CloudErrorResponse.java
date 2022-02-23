// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.CloudErrorBodyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudErrorResponse {
    /**
     * Details about the error.
     * 
     */
    private final @Nullable CloudErrorBodyResponse error;

    @OutputCustomType.Constructor({"error"})
    private CloudErrorResponse(@Nullable CloudErrorBodyResponse error) {
        this.error = error;
    }

    /**
     * Details about the error.
     * 
     */
    public Optional<CloudErrorBodyResponse> getError() {
        return Optional.ofNullable(this.error);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudErrorBodyResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder setError(@Nullable CloudErrorBodyResponse error) {
            this.error = error;
            return this;
        }
        public CloudErrorResponse build() {
            return new CloudErrorResponse(error);
        }
    }
}
