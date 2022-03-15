// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1IntotoSignatureResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LinkResponse;
import java.util.List;
import java.util.Objects;


/**
 * This corresponds to a signed in-toto link - it is made up of one or more signatures and the in-toto link itself. This is used for occurrences of a Grafeas in-toto note.
 * 
 */
public final class GrafeasV1beta1IntotoDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1IntotoDetailsResponse Empty = new GrafeasV1beta1IntotoDetailsResponse();

    @Import(name="signatures", required=true)
      private final List<GrafeasV1beta1IntotoSignatureResponse> signatures;

    public List<GrafeasV1beta1IntotoSignatureResponse> getSignatures() {
        return this.signatures;
    }

    @Import(name="signed", required=true)
      private final LinkResponse signed;

    public LinkResponse getSigned() {
        return this.signed;
    }

    public GrafeasV1beta1IntotoDetailsResponse(
        List<GrafeasV1beta1IntotoSignatureResponse> signatures,
        LinkResponse signed) {
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
        this.signed = Objects.requireNonNull(signed, "expected parameter 'signed' to be non-null");
    }

    private GrafeasV1beta1IntotoDetailsResponse() {
        this.signatures = List.of();
        this.signed = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1IntotoDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GrafeasV1beta1IntotoSignatureResponse> signatures;
        private LinkResponse signed;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1IntotoDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatures = defaults.signatures;
    	      this.signed = defaults.signed;
        }

        public Builder signatures(List<GrafeasV1beta1IntotoSignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }

        public Builder signed(LinkResponse signed) {
            this.signed = Objects.requireNonNull(signed);
            return this;
        }
        public GrafeasV1beta1IntotoDetailsResponse build() {
            return new GrafeasV1beta1IntotoDetailsResponse(signatures, signed);
        }
    }
}
