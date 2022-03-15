// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiscoveryNoteResponse {
    /**
     * Immutable. The kind of analysis that is handled by this discovery.
     * 
     */
    private final String analysisKind;

    @CustomType.Constructor
    private DiscoveryNoteResponse(@CustomType.Parameter("analysisKind") String analysisKind) {
        this.analysisKind = analysisKind;
    }

    /**
     * Immutable. The kind of analysis that is handled by this discovery.
     * 
    */
    public String getAnalysisKind() {
        return this.analysisKind;
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

        public Builder analysisKind(String analysisKind) {
            this.analysisKind = Objects.requireNonNull(analysisKind);
            return this;
        }
        public DiscoveryNoteResponse build() {
            return new DiscoveryNoteResponse(analysisKind);
        }
    }
}
