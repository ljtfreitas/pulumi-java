// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.StatusResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.TraceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Results of the configuration analysis from the last run of the test.
 * 
 */
public final class ReachabilityDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReachabilityDetailsResponse Empty = new ReachabilityDetailsResponse();

    /**
     * The details of a failure or a cancellation of reachability analysis.
     * 
     */
    @InputImport(name="error", required=true)
      private final StatusResponse error;

    public StatusResponse getError() {
        return this.error;
    }

    /**
     * The overall result of the test's configuration analysis.
     * 
     */
    @InputImport(name="result", required=true)
      private final String result;

    public String getResult() {
        return this.result;
    }

    /**
     * Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
     */
    @InputImport(name="traces", required=true)
      private final List<TraceResponse> traces;

    public List<TraceResponse> getTraces() {
        return this.traces;
    }

    /**
     * The time of the configuration analysis.
     * 
     */
    @InputImport(name="verifyTime", required=true)
      private final String verifyTime;

    public String getVerifyTime() {
        return this.verifyTime;
    }

    public ReachabilityDetailsResponse(
        StatusResponse error,
        String result,
        List<TraceResponse> traces,
        String verifyTime) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.result = Objects.requireNonNull(result, "expected parameter 'result' to be non-null");
        this.traces = Objects.requireNonNull(traces, "expected parameter 'traces' to be non-null");
        this.verifyTime = Objects.requireNonNull(verifyTime, "expected parameter 'verifyTime' to be non-null");
    }

    private ReachabilityDetailsResponse() {
        this.error = null;
        this.result = null;
        this.traces = List.of();
        this.verifyTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReachabilityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse error;
        private String result;
        private List<TraceResponse> traces;
        private String verifyTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ReachabilityDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.result = defaults.result;
    	      this.traces = defaults.traces;
    	      this.verifyTime = defaults.verifyTime;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setTraces(List<TraceResponse> traces) {
            this.traces = Objects.requireNonNull(traces);
            return this;
        }

        public Builder setVerifyTime(String verifyTime) {
            this.verifyTime = Objects.requireNonNull(verifyTime);
            return this;
        }
        public ReachabilityDetailsResponse build() {
            return new ReachabilityDetailsResponse(error, result, traces, verifyTime);
        }
    }
}
