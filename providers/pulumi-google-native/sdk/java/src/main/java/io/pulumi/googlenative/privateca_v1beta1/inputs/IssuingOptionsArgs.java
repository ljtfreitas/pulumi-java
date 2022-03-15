// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Options that affect all certificates issued by a CertificateAuthority.
 * 
 */
public final class IssuingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final IssuingOptionsArgs Empty = new IssuingOptionsArgs();

    /**
     * When true, includes a URL to the issuing CA certificate in the "authority information access" X.509 extension.
     * 
     */
    @Import(name="includeCaCertUrl", required=true)
      private final Output<Boolean> includeCaCertUrl;

    public Output<Boolean> getIncludeCaCertUrl() {
        return this.includeCaCertUrl;
    }

    /**
     * When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    @Import(name="includeCrlAccessUrl", required=true)
      private final Output<Boolean> includeCrlAccessUrl;

    public Output<Boolean> getIncludeCrlAccessUrl() {
        return this.includeCrlAccessUrl;
    }

    public IssuingOptionsArgs(
        Output<Boolean> includeCaCertUrl,
        Output<Boolean> includeCrlAccessUrl) {
        this.includeCaCertUrl = Objects.requireNonNull(includeCaCertUrl, "expected parameter 'includeCaCertUrl' to be non-null");
        this.includeCrlAccessUrl = Objects.requireNonNull(includeCrlAccessUrl, "expected parameter 'includeCrlAccessUrl' to be non-null");
    }

    private IssuingOptionsArgs() {
        this.includeCaCertUrl = Output.empty();
        this.includeCrlAccessUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> includeCaCertUrl;
        private Output<Boolean> includeCrlAccessUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeCaCertUrl = defaults.includeCaCertUrl;
    	      this.includeCrlAccessUrl = defaults.includeCrlAccessUrl;
        }

        public Builder includeCaCertUrl(Output<Boolean> includeCaCertUrl) {
            this.includeCaCertUrl = Objects.requireNonNull(includeCaCertUrl);
            return this;
        }

        public Builder includeCaCertUrl(Boolean includeCaCertUrl) {
            this.includeCaCertUrl = Output.of(Objects.requireNonNull(includeCaCertUrl));
            return this;
        }

        public Builder includeCrlAccessUrl(Output<Boolean> includeCrlAccessUrl) {
            this.includeCrlAccessUrl = Objects.requireNonNull(includeCrlAccessUrl);
            return this;
        }

        public Builder includeCrlAccessUrl(Boolean includeCrlAccessUrl) {
            this.includeCrlAccessUrl = Output.of(Objects.requireNonNull(includeCrlAccessUrl));
            return this;
        }
        public IssuingOptionsArgs build() {
            return new IssuingOptionsArgs(includeCaCertUrl, includeCrlAccessUrl);
        }
    }
}
