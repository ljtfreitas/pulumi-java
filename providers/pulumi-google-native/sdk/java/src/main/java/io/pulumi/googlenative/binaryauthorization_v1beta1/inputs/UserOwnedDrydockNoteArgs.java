// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.binaryauthorization_v1beta1.inputs.AttestorPublicKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An user owned drydock note references a Drydock ATTESTATION_AUTHORITY Note created by the user.
 * 
 */
public final class UserOwnedDrydockNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserOwnedDrydockNoteArgs Empty = new UserOwnedDrydockNoteArgs();

    /**
     * The Drydock resource name of a ATTESTATION_AUTHORITY Note, created by the user, in the format: `projects/*{@literal /}notes/*` (or the legacy `providers/*{@literal /}notes/*`). This field may not be updated. An attestation by this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence that names a container image and that links to this Note. Drydock is an external dependency.
     * 
     */
    @Import(name="noteReference", required=true)
      private final Output<String> noteReference;

    public Output<String> getNoteReference() {
        return this.noteReference;
    }

    /**
     * Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable Output<List<AttestorPublicKeyArgs>> publicKeys;

    public Output<List<AttestorPublicKeyArgs>> getPublicKeys() {
        return this.publicKeys == null ? Output.empty() : this.publicKeys;
    }

    public UserOwnedDrydockNoteArgs(
        Output<String> noteReference,
        @Nullable Output<List<AttestorPublicKeyArgs>> publicKeys) {
        this.noteReference = Objects.requireNonNull(noteReference, "expected parameter 'noteReference' to be non-null");
        this.publicKeys = publicKeys;
    }

    private UserOwnedDrydockNoteArgs() {
        this.noteReference = Output.empty();
        this.publicKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserOwnedDrydockNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> noteReference;
        private @Nullable Output<List<AttestorPublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(UserOwnedDrydockNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noteReference = defaults.noteReference;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder noteReference(Output<String> noteReference) {
            this.noteReference = Objects.requireNonNull(noteReference);
            return this;
        }

        public Builder noteReference(String noteReference) {
            this.noteReference = Output.of(Objects.requireNonNull(noteReference));
            return this;
        }

        public Builder publicKeys(@Nullable Output<List<AttestorPublicKeyArgs>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }

        public Builder publicKeys(@Nullable List<AttestorPublicKeyArgs> publicKeys) {
            this.publicKeys = Output.ofNullable(publicKeys);
            return this;
        }
        public UserOwnedDrydockNoteArgs build() {
            return new UserOwnedDrydockNoteArgs(noteReference, publicKeys);
        }
    }
}
