// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ErrorResponseResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ServiceResponseBaseResponseError {
    /**
     * The error response.
     * 
     */
    private final ErrorResponseResponse error;

    @OutputCustomType.Constructor({"error"})
    private ServiceResponseBaseResponseError(ErrorResponseResponse error) {
        this.error = Objects.requireNonNull(error);
    }

    /**
     * The error response.
     * 
     */
    public ErrorResponseResponse getError() {
        return this.error;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResponseBaseResponseError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorResponseResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResponseBaseResponseError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder setError(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public ServiceResponseBaseResponseError build() {
            return new ServiceResponseBaseResponseError(error);
        }
    }
}
