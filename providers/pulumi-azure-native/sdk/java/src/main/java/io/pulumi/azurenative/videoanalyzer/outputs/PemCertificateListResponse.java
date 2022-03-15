// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PemCertificateListResponse {
    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
     */
    private final List<String> certificates;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.PemCertificateList'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PemCertificateListResponse(
        @CustomType.Parameter("certificates") List<String> certificates,
        @CustomType.Parameter("type") String type) {
        this.certificates = certificates;
        this.type = type;
    }

    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
    */
    public List<String> getCertificates() {
        return this.certificates;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.PemCertificateList'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PemCertificateListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PemCertificateListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.type = defaults.type;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PemCertificateListResponse build() {
            return new PemCertificateListResponse(certificates, type);
        }
    }
}
