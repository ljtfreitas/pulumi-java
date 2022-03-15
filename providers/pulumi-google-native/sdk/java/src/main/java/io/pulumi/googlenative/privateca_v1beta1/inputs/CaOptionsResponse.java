// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Describes values that are relevant in a CA certificate.
 * 
 */
public final class CaOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CaOptionsResponse Empty = new CaOptionsResponse();

    /**
     * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
     * 
     */
    @Import(name="isCa", required=true)
      private final Boolean isCa;

    public Boolean getIsCa() {
        return this.isCa;
    }

    /**
     * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
     * 
     */
    @Import(name="maxIssuerPathLength", required=true)
      private final Integer maxIssuerPathLength;

    public Integer getMaxIssuerPathLength() {
        return this.maxIssuerPathLength;
    }

    public CaOptionsResponse(
        Boolean isCa,
        Integer maxIssuerPathLength) {
        this.isCa = Objects.requireNonNull(isCa, "expected parameter 'isCa' to be non-null");
        this.maxIssuerPathLength = Objects.requireNonNull(maxIssuerPathLength, "expected parameter 'maxIssuerPathLength' to be non-null");
    }

    private CaOptionsResponse() {
        this.isCa = null;
        this.maxIssuerPathLength = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isCa;
        private Integer maxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(CaOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
        }

        public Builder isCa(Boolean isCa) {
            this.isCa = Objects.requireNonNull(isCa);
            return this;
        }

        public Builder maxIssuerPathLength(Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Objects.requireNonNull(maxIssuerPathLength);
            return this;
        }
        public CaOptionsResponse build() {
            return new CaOptionsResponse(isCa, maxIssuerPathLength);
        }
    }
}
