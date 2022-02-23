// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.firebasehosting_v1beta1.enums.DomainRedirectType;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the behavior of a domain-level redirect. Domain redirects preserve the path of the redirect but replace the requested domain with the one specified in the redirect configuration.
 * 
 */
public final class DomainRedirectArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainRedirectArgs Empty = new DomainRedirectArgs();

    /**
     * The domain name to redirect to.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The redirect status code.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<DomainRedirectType> type;

    public Input<DomainRedirectType> getType() {
        return this.type;
    }

    public DomainRedirectArgs(
        Input<String> domainName,
        Input<DomainRedirectType> type) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DomainRedirectArgs() {
        this.domainName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private Input<DomainRedirectType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainRedirectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.type = defaults.type;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setType(Input<DomainRedirectType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(DomainRedirectType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DomainRedirectArgs build() {
            return new DomainRedirectArgs(domainName, type);
        }
    }
}
