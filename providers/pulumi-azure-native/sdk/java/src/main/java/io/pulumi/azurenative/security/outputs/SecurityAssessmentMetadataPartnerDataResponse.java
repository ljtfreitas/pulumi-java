// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityAssessmentMetadataPartnerDataResponse {
    /**
     * Name of the company of the partner
     * 
     */
    private final String partnerName;
    /**
     * Name of the product of the partner that created the assessment
     * 
     */
    private final @Nullable String productName;
    /**
     * Secret to authenticate the partner and verify it created the assessment - write only
     * 
     */
    private final String secret;

    @CustomType.Constructor
    private SecurityAssessmentMetadataPartnerDataResponse(
        @CustomType.Parameter("partnerName") String partnerName,
        @CustomType.Parameter("productName") @Nullable String productName,
        @CustomType.Parameter("secret") String secret) {
        this.partnerName = partnerName;
        this.productName = productName;
        this.secret = secret;
    }

    /**
     * Name of the company of the partner
     * 
    */
    public String getPartnerName() {
        return this.partnerName;
    }
    /**
     * Name of the product of the partner that created the assessment
     * 
    */
    public Optional<String> getProductName() {
        return Optional.ofNullable(this.productName);
    }
    /**
     * Secret to authenticate the partner and verify it created the assessment - write only
     * 
    */
    public String getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentMetadataPartnerDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partnerName;
        private @Nullable String productName;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentMetadataPartnerDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerName = defaults.partnerName;
    	      this.productName = defaults.productName;
    	      this.secret = defaults.secret;
        }

        public Builder partnerName(String partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }

        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public SecurityAssessmentMetadataPartnerDataResponse build() {
            return new SecurityAssessmentMetadataPartnerDataResponse(partnerName, productName, secret);
        }
    }
}
