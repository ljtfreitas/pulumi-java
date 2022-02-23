// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DSSEHintResponse;
import java.util.Objects;


public final class DSSEAttestationNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final DSSEAttestationNoteResponse Empty = new DSSEAttestationNoteResponse();

    /**
     * DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    @InputImport(name="hint", required=true)
      private final DSSEHintResponse hint;

    public DSSEHintResponse getHint() {
        return this.hint;
    }

    public DSSEAttestationNoteResponse(DSSEHintResponse hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private DSSEAttestationNoteResponse() {
        this.hint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DSSEHintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(DSSEHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public DSSEAttestationNoteResponse build() {
            return new DSSEAttestationNoteResponse(hint);
        }
    }
}
