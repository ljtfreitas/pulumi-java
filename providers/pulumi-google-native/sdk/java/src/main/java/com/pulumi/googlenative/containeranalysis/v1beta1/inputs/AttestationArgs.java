// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.GenericSignedAttestationArgs;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.PgpSignedAttestationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Occurrence that represents a single &#34;attestation&#34;. The authenticity of an attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the authority to which this attestation is attached is primarily useful for look-up (how to find this attestation if you already know the authority and artifact to be verified) and intent (which authority was this attestation intended to sign for).
 * 
 */
public final class AttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestationArgs Empty = new AttestationArgs();

    @Import(name="genericSignedAttestation")
    private @Nullable Output<GenericSignedAttestationArgs> genericSignedAttestation;

    public Optional<Output<GenericSignedAttestationArgs>> genericSignedAttestation() {
        return Optional.ofNullable(this.genericSignedAttestation);
    }

    /**
     * A PGP signed attestation.
     * 
     */
    @Import(name="pgpSignedAttestation")
    private @Nullable Output<PgpSignedAttestationArgs> pgpSignedAttestation;

    /**
     * @return A PGP signed attestation.
     * 
     */
    public Optional<Output<PgpSignedAttestationArgs>> pgpSignedAttestation() {
        return Optional.ofNullable(this.pgpSignedAttestation);
    }

    private AttestationArgs() {}

    private AttestationArgs(AttestationArgs $) {
        this.genericSignedAttestation = $.genericSignedAttestation;
        this.pgpSignedAttestation = $.pgpSignedAttestation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationArgs $;

        public Builder() {
            $ = new AttestationArgs();
        }

        public Builder(AttestationArgs defaults) {
            $ = new AttestationArgs(Objects.requireNonNull(defaults));
        }

        public Builder genericSignedAttestation(@Nullable Output<GenericSignedAttestationArgs> genericSignedAttestation) {
            $.genericSignedAttestation = genericSignedAttestation;
            return this;
        }

        public Builder genericSignedAttestation(GenericSignedAttestationArgs genericSignedAttestation) {
            return genericSignedAttestation(Output.of(genericSignedAttestation));
        }

        /**
         * @param pgpSignedAttestation A PGP signed attestation.
         * 
         * @return builder
         * 
         */
        public Builder pgpSignedAttestation(@Nullable Output<PgpSignedAttestationArgs> pgpSignedAttestation) {
            $.pgpSignedAttestation = pgpSignedAttestation;
            return this;
        }

        /**
         * @param pgpSignedAttestation A PGP signed attestation.
         * 
         * @return builder
         * 
         */
        public Builder pgpSignedAttestation(PgpSignedAttestationArgs pgpSignedAttestation) {
            return pgpSignedAttestation(Output.of(pgpSignedAttestation));
        }

        public AttestationArgs build() {
            return $;
        }
    }

}
