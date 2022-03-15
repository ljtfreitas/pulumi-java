// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1AttemptResponse {
    private final String attemptTime;
    /**
     * Details of errors that occurred.
     * 
     */
    private final List<GoogleRpcStatusResponse> partialFailures;

    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1AttemptResponse(
        @CustomType.Parameter("attemptTime") String attemptTime,
        @CustomType.Parameter("partialFailures") List<GoogleRpcStatusResponse> partialFailures) {
        this.attemptTime = attemptTime;
        this.partialFailures = partialFailures;
    }

    public String getAttemptTime() {
        return this.attemptTime;
    }
    /**
     * Details of errors that occurred.
     * 
    */
    public List<GoogleRpcStatusResponse> getPartialFailures() {
        return this.partialFailures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AttemptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attemptTime;
        private List<GoogleRpcStatusResponse> partialFailures;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1AttemptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attemptTime = defaults.attemptTime;
    	      this.partialFailures = defaults.partialFailures;
        }

        public Builder attemptTime(String attemptTime) {
            this.attemptTime = Objects.requireNonNull(attemptTime);
            return this;
        }

        public Builder partialFailures(List<GoogleRpcStatusResponse> partialFailures) {
            this.partialFailures = Objects.requireNonNull(partialFailures);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1AttemptResponse build() {
            return new GoogleCloudDatalabelingV1beta1AttemptResponse(attemptTime, partialFailures);
        }
    }
}
