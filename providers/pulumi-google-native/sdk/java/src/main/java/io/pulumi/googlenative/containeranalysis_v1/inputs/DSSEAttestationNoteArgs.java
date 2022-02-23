// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DSSEHintArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DSSEAttestationNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final DSSEAttestationNoteArgs Empty = new DSSEAttestationNoteArgs();

    /**
     * DSSEHint hints at the purpose of the attestation authority.
     * 
     */
    @InputImport(name="hint")
      private final @Nullable Input<DSSEHintArgs> hint;

    public Input<DSSEHintArgs> getHint() {
        return this.hint == null ? Input.empty() : this.hint;
    }

    public DSSEAttestationNoteArgs(@Nullable Input<DSSEHintArgs> hint) {
        this.hint = hint;
    }

    private DSSEAttestationNoteArgs() {
        this.hint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DSSEHintArgs> hint;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder setHint(@Nullable Input<DSSEHintArgs> hint) {
            this.hint = hint;
            return this;
        }

        public Builder setHint(@Nullable DSSEHintArgs hint) {
            this.hint = Input.ofNullable(hint);
            return this;
        }
        public DSSEAttestationNoteArgs build() {
            return new DSSEAttestationNoteArgs(hint);
        }
    }
}
