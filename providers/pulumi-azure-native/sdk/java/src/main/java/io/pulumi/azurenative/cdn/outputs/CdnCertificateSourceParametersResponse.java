// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CdnCertificateSourceParametersResponse {
    /**
     * Type of certificate used
     * 
     */
    private final String certificateType;
    private final String odataType;

    @OutputCustomType.Constructor({"certificateType","odataType"})
    private CdnCertificateSourceParametersResponse(
        String certificateType,
        String odataType) {
        this.certificateType = Objects.requireNonNull(certificateType);
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * Type of certificate used
     * 
     */
    public String getCertificateType() {
        return this.certificateType;
    }
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CdnCertificateSourceParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateType;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CdnCertificateSourceParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateType = defaults.certificateType;
    	      this.odataType = defaults.odataType;
        }

        public Builder setCertificateType(String certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public CdnCertificateSourceParametersResponse build() {
            return new CdnCertificateSourceParametersResponse(certificateType, odataType);
        }
    }
}
