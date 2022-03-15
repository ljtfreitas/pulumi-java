// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainIdentityResult {
    /**
     * The ARN of the domain identity.
     * 
     */
    private final String arn;
    /**
     * The name of the domain
     * 
     */
    private final String domain;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A code which when added to the domain as a TXT record will signal to SES that the owner of the domain has authorized SES to act on their behalf.
     * 
     */
    private final String verificationToken;

    @CustomType.Constructor
    private GetDomainIdentityResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("verificationToken") String verificationToken) {
        this.arn = arn;
        this.domain = domain;
        this.id = id;
        this.verificationToken = verificationToken;
    }

    /**
     * The ARN of the domain identity.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The name of the domain
     * 
    */
    public String getDomain() {
        return this.domain;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A code which when added to the domain as a TXT record will signal to SES that the owner of the domain has authorized SES to act on their behalf.
     * 
    */
    public String getVerificationToken() {
        return this.verificationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainIdentityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String domain;
        private String id;
        private String verificationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.verificationToken = defaults.verificationToken;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder verificationToken(String verificationToken) {
            this.verificationToken = Objects.requireNonNull(verificationToken);
            return this;
        }
        public GetDomainIdentityResult build() {
            return new GetDomainIdentityResult(arn, domain, id, verificationToken);
        }
    }
}
