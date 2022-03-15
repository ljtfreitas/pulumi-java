// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the partner that created the assessment
 * 
 */
public final class SecurityAssessmentMetadataPartnerDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityAssessmentMetadataPartnerDataArgs Empty = new SecurityAssessmentMetadataPartnerDataArgs();

    /**
     * Name of the company of the partner
     * 
     */
    @Import(name="partnerName", required=true)
      private final Output<String> partnerName;

    public Output<String> getPartnerName() {
        return this.partnerName;
    }

    /**
     * Name of the product of the partner that created the assessment
     * 
     */
    @Import(name="productName")
      private final @Nullable Output<String> productName;

    public Output<String> getProductName() {
        return this.productName == null ? Output.empty() : this.productName;
    }

    /**
     * Secret to authenticate the partner and verify it created the assessment - write only
     * 
     */
    @Import(name="secret", required=true)
      private final Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    public SecurityAssessmentMetadataPartnerDataArgs(
        Output<String> partnerName,
        @Nullable Output<String> productName,
        Output<String> secret) {
        this.partnerName = Objects.requireNonNull(partnerName, "expected parameter 'partnerName' to be non-null");
        this.productName = productName;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private SecurityAssessmentMetadataPartnerDataArgs() {
        this.partnerName = Output.empty();
        this.productName = Output.empty();
        this.secret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentMetadataPartnerDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> partnerName;
        private @Nullable Output<String> productName;
        private Output<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentMetadataPartnerDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerName = defaults.partnerName;
    	      this.productName = defaults.productName;
    	      this.secret = defaults.secret;
        }

        public Builder partnerName(Output<String> partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }

        public Builder partnerName(String partnerName) {
            this.partnerName = Output.of(Objects.requireNonNull(partnerName));
            return this;
        }

        public Builder productName(@Nullable Output<String> productName) {
            this.productName = productName;
            return this;
        }

        public Builder productName(@Nullable String productName) {
            this.productName = Output.ofNullable(productName);
            return this;
        }

        public Builder secret(Output<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Output.of(Objects.requireNonNull(secret));
            return this;
        }
        public SecurityAssessmentMetadataPartnerDataArgs build() {
            return new SecurityAssessmentMetadataPartnerDataArgs(partnerName, productName, secret);
        }
    }
}
