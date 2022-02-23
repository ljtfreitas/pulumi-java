// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Data regarding 3rd party partner integration
 * 
 */
public final class SecurityAssessmentPartnerDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityAssessmentPartnerDataArgs Empty = new SecurityAssessmentPartnerDataArgs();

    /**
     * Name of the company of the partner
     * 
     */
    @InputImport(name="partnerName", required=true)
        private final Input<String> partnerName;

    public Input<String> getPartnerName() {
        return this.partnerName;
    }

    /**
     * secret to authenticate the partner - write only
     * 
     */
    @InputImport(name="secret", required=true)
        private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    public SecurityAssessmentPartnerDataArgs(
        Input<String> partnerName,
        Input<String> secret) {
        this.partnerName = Objects.requireNonNull(partnerName, "expected parameter 'partnerName' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private SecurityAssessmentPartnerDataArgs() {
        this.partnerName = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentPartnerDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> partnerName;
        private Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentPartnerDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerName = defaults.partnerName;
    	      this.secret = defaults.secret;
        }

        public Builder setPartnerName(Input<String> partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }

        public Builder setPartnerName(String partnerName) {
            this.partnerName = Input.of(Objects.requireNonNull(partnerName));
            return this;
        }

        public Builder setSecret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }
        public SecurityAssessmentPartnerDataArgs build() {
            return new SecurityAssessmentPartnerDataArgs(partnerName, secret);
        }
    }
}
