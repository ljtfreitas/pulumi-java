// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeSignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MUST match https://github.com/secure-systems-lab/dsse/blob/master/envelope.proto. An authenticated message of arbitrary type.
 * 
 */
public final class EnvelopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvelopeResponse Empty = new EnvelopeResponse();

    /**
     * The bytes being signed
     * 
     */
    @Import(name="payload", required=true)
      private final String payload;

    public String getPayload() {
        return this.payload;
    }

    /**
     * The type of payload being signed
     * 
     */
    @Import(name="payloadType", required=true)
      private final String payloadType;

    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * The signatures over the payload
     * 
     */
    @Import(name="signatures", required=true)
      private final List<EnvelopeSignatureResponse> signatures;

    public List<EnvelopeSignatureResponse> getSignatures() {
        return this.signatures;
    }

    public EnvelopeResponse(
        String payload,
        String payloadType,
        List<EnvelopeSignatureResponse> signatures) {
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.payloadType = Objects.requireNonNull(payloadType, "expected parameter 'payloadType' to be non-null");
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
    }

    private EnvelopeResponse() {
        this.payload = null;
        this.payloadType = null;
        this.signatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String payload;
        private String payloadType;
        private List<EnvelopeSignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.payloadType = defaults.payloadType;
    	      this.signatures = defaults.signatures;
        }

        public Builder payload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder payloadType(String payloadType) {
            this.payloadType = Objects.requireNonNull(payloadType);
            return this;
        }

        public Builder signatures(List<EnvelopeSignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }
        public EnvelopeResponse build() {
            return new EnvelopeResponse(payload, payloadType, signatures);
        }
    }
}
