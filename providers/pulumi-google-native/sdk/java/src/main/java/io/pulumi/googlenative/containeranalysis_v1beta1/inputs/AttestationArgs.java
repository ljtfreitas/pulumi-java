// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GenericSignedAttestationArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.PgpSignedAttestationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Occurrence that represents a single "attestation". The authenticity of an attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the authority to which this attestation is attached is primarily useful for look-up (how to find this attestation if you already know the authority and artifact to be verified) and intent (which authority was this attestation intended to sign for).
 * 
 */
public final class AttestationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationArgs Empty = new AttestationArgs();

    @InputImport(name="genericSignedAttestation")
      private final @Nullable Input<GenericSignedAttestationArgs> genericSignedAttestation;

    public Input<GenericSignedAttestationArgs> getGenericSignedAttestation() {
        return this.genericSignedAttestation == null ? Input.empty() : this.genericSignedAttestation;
    }

    /**
     * A PGP signed attestation.
     * 
     */
    @InputImport(name="pgpSignedAttestation")
      private final @Nullable Input<PgpSignedAttestationArgs> pgpSignedAttestation;

    public Input<PgpSignedAttestationArgs> getPgpSignedAttestation() {
        return this.pgpSignedAttestation == null ? Input.empty() : this.pgpSignedAttestation;
    }

    public AttestationArgs(
        @Nullable Input<GenericSignedAttestationArgs> genericSignedAttestation,
        @Nullable Input<PgpSignedAttestationArgs> pgpSignedAttestation) {
        this.genericSignedAttestation = genericSignedAttestation;
        this.pgpSignedAttestation = pgpSignedAttestation;
    }

    private AttestationArgs() {
        this.genericSignedAttestation = Input.empty();
        this.pgpSignedAttestation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GenericSignedAttestationArgs> genericSignedAttestation;
        private @Nullable Input<PgpSignedAttestationArgs> pgpSignedAttestation;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.genericSignedAttestation = defaults.genericSignedAttestation;
    	      this.pgpSignedAttestation = defaults.pgpSignedAttestation;
        }

        public Builder setGenericSignedAttestation(@Nullable Input<GenericSignedAttestationArgs> genericSignedAttestation) {
            this.genericSignedAttestation = genericSignedAttestation;
            return this;
        }

        public Builder setGenericSignedAttestation(@Nullable GenericSignedAttestationArgs genericSignedAttestation) {
            this.genericSignedAttestation = Input.ofNullable(genericSignedAttestation);
            return this;
        }

        public Builder setPgpSignedAttestation(@Nullable Input<PgpSignedAttestationArgs> pgpSignedAttestation) {
            this.pgpSignedAttestation = pgpSignedAttestation;
            return this;
        }

        public Builder setPgpSignedAttestation(@Nullable PgpSignedAttestationArgs pgpSignedAttestation) {
            this.pgpSignedAttestation = Input.ofNullable(pgpSignedAttestation);
            return this;
        }
        public AttestationArgs build() {
            return new AttestationArgs(genericSignedAttestation, pgpSignedAttestation);
        }
    }
}
