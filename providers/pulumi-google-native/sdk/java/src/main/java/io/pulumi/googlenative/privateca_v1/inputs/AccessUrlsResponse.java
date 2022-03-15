// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * URLs where a CertificateAuthority will publish content.
 * 
 */
public final class AccessUrlsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessUrlsResponse Empty = new AccessUrlsResponse();

    /**
     * The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated.
     * 
     */
    @Import(name="caCertificateAccessUrl", required=true)
      private final String caCertificateAccessUrl;

    public String getCaCertificateAccessUrl() {
        return this.caCertificateAccessUrl;
    }

    /**
     * The URLs where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated.
     * 
     */
    @Import(name="crlAccessUrls", required=true)
      private final List<String> crlAccessUrls;

    public List<String> getCrlAccessUrls() {
        return this.crlAccessUrls;
    }

    public AccessUrlsResponse(
        String caCertificateAccessUrl,
        List<String> crlAccessUrls) {
        this.caCertificateAccessUrl = Objects.requireNonNull(caCertificateAccessUrl, "expected parameter 'caCertificateAccessUrl' to be non-null");
        this.crlAccessUrls = Objects.requireNonNull(crlAccessUrls, "expected parameter 'crlAccessUrls' to be non-null");
    }

    private AccessUrlsResponse() {
        this.caCertificateAccessUrl = null;
        this.crlAccessUrls = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessUrlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificateAccessUrl;
        private List<String> crlAccessUrls;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessUrlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificateAccessUrl = defaults.caCertificateAccessUrl;
    	      this.crlAccessUrls = defaults.crlAccessUrls;
        }

        public Builder caCertificateAccessUrl(String caCertificateAccessUrl) {
            this.caCertificateAccessUrl = Objects.requireNonNull(caCertificateAccessUrl);
            return this;
        }

        public Builder crlAccessUrls(List<String> crlAccessUrls) {
            this.crlAccessUrls = Objects.requireNonNull(crlAccessUrls);
            return this;
        }
        public AccessUrlsResponse build() {
            return new AccessUrlsResponse(caCertificateAccessUrl, crlAccessUrls);
        }
    }
}
