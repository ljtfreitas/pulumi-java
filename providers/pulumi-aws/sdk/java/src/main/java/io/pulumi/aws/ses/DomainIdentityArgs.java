// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DomainIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainIdentityArgs Empty = new DomainIdentityArgs();

    /**
     * The domain name to assign to SES
     * 
     */
    @InputImport(name="domain", required=true)
    private final Input<String> domain;

    public Input<String> getDomain() {
        return this.domain;
    }

    public DomainIdentityArgs(Input<String> domain) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
    }

    private DomainIdentityArgs() {
        this.domain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder setDomain(Input<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
            return this;
        }
        public DomainIdentityArgs build() {
            return new DomainIdentityArgs(domain);
        }
    }
}
