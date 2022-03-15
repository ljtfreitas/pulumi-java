// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Provides information about the scan status of a discovered resource.
 * 
 */
public final class DiscoveredResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiscoveredResponse Empty = new DiscoveredResponse();

    /**
     * The status of discovery for the resource.
     * 
     */
    @Import(name="analysisStatus", required=true)
      private final String analysisStatus;

    public String getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    @Import(name="analysisStatusError", required=true)
      private final StatusResponse analysisStatusError;

    public StatusResponse getAnalysisStatusError() {
        return this.analysisStatusError;
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @Import(name="continuousAnalysis", required=true)
      private final String continuousAnalysis;

    public String getContinuousAnalysis() {
        return this.continuousAnalysis;
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @Import(name="cpe", required=true)
      private final String cpe;

    public String getCpe() {
        return this.cpe;
    }

    public DiscoveredResponse(
        String analysisStatus,
        StatusResponse analysisStatusError,
        String continuousAnalysis,
        String cpe) {
        this.analysisStatus = Objects.requireNonNull(analysisStatus, "expected parameter 'analysisStatus' to be non-null");
        this.analysisStatusError = Objects.requireNonNull(analysisStatusError, "expected parameter 'analysisStatusError' to be non-null");
        this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis, "expected parameter 'continuousAnalysis' to be non-null");
        this.cpe = Objects.requireNonNull(cpe, "expected parameter 'cpe' to be non-null");
    }

    private DiscoveredResponse() {
        this.analysisStatus = null;
        this.analysisStatusError = null;
        this.continuousAnalysis = null;
        this.cpe = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveredResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisStatus;
        private StatusResponse analysisStatusError;
        private String continuousAnalysis;
        private String cpe;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveredResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
        }

        public Builder analysisStatus(String analysisStatus) {
            this.analysisStatus = Objects.requireNonNull(analysisStatus);
            return this;
        }

        public Builder analysisStatusError(StatusResponse analysisStatusError) {
            this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
            return this;
        }

        public Builder continuousAnalysis(String continuousAnalysis) {
            this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
            return this;
        }

        public Builder cpe(String cpe) {
            this.cpe = Objects.requireNonNull(cpe);
            return this;
        }
        public DiscoveredResponse build() {
            return new DiscoveredResponse(analysisStatus, analysisStatusError, continuousAnalysis, cpe);
        }
    }
}
