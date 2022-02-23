// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis.
 * 
 */
public final class DiscoveryNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiscoveryNoteResponse Empty = new DiscoveryNoteResponse();

    /**
     * Immutable. The kind of analysis that is handled by this discovery.
     * 
     */
    @InputImport(name="analysisKind", required=true)
      private final String analysisKind;

    public String getAnalysisKind() {
        return this.analysisKind;
    }

    public DiscoveryNoteResponse(String analysisKind) {
        this.analysisKind = Objects.requireNonNull(analysisKind, "expected parameter 'analysisKind' to be non-null");
    }

    private DiscoveryNoteResponse() {
        this.analysisKind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder setAnalysisKind(String analysisKind) {
            this.analysisKind = Objects.requireNonNull(analysisKind);
            return this;
        }
        public DiscoveryNoteResponse build() {
            return new DiscoveryNoteResponse(analysisKind);
        }
    }
}
