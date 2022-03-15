// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.FailureDetailResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.InconclusiveDetailResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.SkippedDetailResponse;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.SuccessDetailResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Interprets a result so that humans and machines can act on it.
 * 
 */
public final class OutcomeResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutcomeResponse Empty = new OutcomeResponse();

    /**
     * More information about a FAILURE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE. Optional
     * 
     */
    @Import(name="failureDetail", required=true)
      private final FailureDetailResponse failureDetail;

    public FailureDetailResponse getFailureDetail() {
        return this.failureDetail;
    }

    /**
     * More information about an INCONCLUSIVE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE. Optional
     * 
     */
    @Import(name="inconclusiveDetail", required=true)
      private final InconclusiveDetailResponse inconclusiveDetail;

    public InconclusiveDetailResponse getInconclusiveDetail() {
        return this.inconclusiveDetail;
    }

    /**
     * More information about a SKIPPED outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED. Optional
     * 
     */
    @Import(name="skippedDetail", required=true)
      private final SkippedDetailResponse skippedDetail;

    public SkippedDetailResponse getSkippedDetail() {
        return this.skippedDetail;
    }

    /**
     * More information about a SUCCESS outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS. Optional
     * 
     */
    @Import(name="successDetail", required=true)
      private final SuccessDetailResponse successDetail;

    public SuccessDetailResponse getSuccessDetail() {
        return this.successDetail;
    }

    /**
     * The simplest way to interpret a result. Required
     * 
     */
    @Import(name="summary", required=true)
      private final String summary;

    public String getSummary() {
        return this.summary;
    }

    public OutcomeResponse(
        FailureDetailResponse failureDetail,
        InconclusiveDetailResponse inconclusiveDetail,
        SkippedDetailResponse skippedDetail,
        SuccessDetailResponse successDetail,
        String summary) {
        this.failureDetail = Objects.requireNonNull(failureDetail, "expected parameter 'failureDetail' to be non-null");
        this.inconclusiveDetail = Objects.requireNonNull(inconclusiveDetail, "expected parameter 'inconclusiveDetail' to be non-null");
        this.skippedDetail = Objects.requireNonNull(skippedDetail, "expected parameter 'skippedDetail' to be non-null");
        this.successDetail = Objects.requireNonNull(successDetail, "expected parameter 'successDetail' to be non-null");
        this.summary = Objects.requireNonNull(summary, "expected parameter 'summary' to be non-null");
    }

    private OutcomeResponse() {
        this.failureDetail = null;
        this.inconclusiveDetail = null;
        this.skippedDetail = null;
        this.successDetail = null;
        this.summary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutcomeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailureDetailResponse failureDetail;
        private InconclusiveDetailResponse inconclusiveDetail;
        private SkippedDetailResponse skippedDetail;
        private SuccessDetailResponse successDetail;
        private String summary;

        public Builder() {
    	      // Empty
        }

        public Builder(OutcomeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureDetail = defaults.failureDetail;
    	      this.inconclusiveDetail = defaults.inconclusiveDetail;
    	      this.skippedDetail = defaults.skippedDetail;
    	      this.successDetail = defaults.successDetail;
    	      this.summary = defaults.summary;
        }

        public Builder failureDetail(FailureDetailResponse failureDetail) {
            this.failureDetail = Objects.requireNonNull(failureDetail);
            return this;
        }

        public Builder inconclusiveDetail(InconclusiveDetailResponse inconclusiveDetail) {
            this.inconclusiveDetail = Objects.requireNonNull(inconclusiveDetail);
            return this;
        }

        public Builder skippedDetail(SkippedDetailResponse skippedDetail) {
            this.skippedDetail = Objects.requireNonNull(skippedDetail);
            return this;
        }

        public Builder successDetail(SuccessDetailResponse successDetail) {
            this.successDetail = Objects.requireNonNull(successDetail);
            return this;
        }

        public Builder summary(String summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public OutcomeResponse build() {
            return new OutcomeResponse(failureDetail, inconclusiveDetail, skippedDetail, successDetail, summary);
        }
    }
}
