// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OccurenceAttestationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationArgs Empty = new OccurenceAttestationArgs();

    /**
     * The serialized payload that is verified by one or
     * more signatures. A base64-encoded string.
     * 
     */
    @Import(name="serializedPayload", required=true)
      private final Output<String> serializedPayload;

    public Output<String> getSerializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * 
     */
    @Import(name="signatures", required=true)
      private final Output<List<OccurenceAttestationSignatureArgs>> signatures;

    public Output<List<OccurenceAttestationSignatureArgs>> getSignatures() {
        return this.signatures;
    }

    public OccurenceAttestationArgs(
        Output<String> serializedPayload,
        Output<List<OccurenceAttestationSignatureArgs>> signatures) {
        this.serializedPayload = Objects.requireNonNull(serializedPayload, "expected parameter 'serializedPayload' to be non-null");
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
    }

    private OccurenceAttestationArgs() {
        this.serializedPayload = Output.empty();
        this.signatures = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> serializedPayload;
        private Output<List<OccurenceAttestationSignatureArgs>> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceAttestationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder serializedPayload(Output<String> serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }

        public Builder serializedPayload(String serializedPayload) {
            this.serializedPayload = Output.of(Objects.requireNonNull(serializedPayload));
            return this;
        }

        public Builder signatures(Output<List<OccurenceAttestationSignatureArgs>> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }

        public Builder signatures(List<OccurenceAttestationSignatureArgs> signatures) {
            this.signatures = Output.of(Objects.requireNonNull(signatures));
            return this;
        }
        public OccurenceAttestationArgs build() {
            return new OccurenceAttestationArgs(serializedPayload, signatures);
        }
    }
}
