// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The client access policy.
 * 
 */
public final class CrossSiteAccessPoliciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CrossSiteAccessPoliciesResponse Empty = new CrossSiteAccessPoliciesResponse();

    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    @InputImport(name="clientAccessPolicy")
        private final @Nullable String clientAccessPolicy;

    public Optional<String> getClientAccessPolicy() {
        return this.clientAccessPolicy == null ? Optional.empty() : Optional.ofNullable(this.clientAccessPolicy);
    }

    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
     */
    @InputImport(name="crossDomainPolicy")
        private final @Nullable String crossDomainPolicy;

    public Optional<String> getCrossDomainPolicy() {
        return this.crossDomainPolicy == null ? Optional.empty() : Optional.ofNullable(this.crossDomainPolicy);
    }

    public CrossSiteAccessPoliciesResponse(
        @Nullable String clientAccessPolicy,
        @Nullable String crossDomainPolicy) {
        this.clientAccessPolicy = clientAccessPolicy;
        this.crossDomainPolicy = crossDomainPolicy;
    }

    private CrossSiteAccessPoliciesResponse() {
        this.clientAccessPolicy = null;
        this.crossDomainPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossSiteAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientAccessPolicy;
        private @Nullable String crossDomainPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(CrossSiteAccessPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAccessPolicy = defaults.clientAccessPolicy;
    	      this.crossDomainPolicy = defaults.crossDomainPolicy;
        }

        public Builder setClientAccessPolicy(@Nullable String clientAccessPolicy) {
            this.clientAccessPolicy = clientAccessPolicy;
            return this;
        }

        public Builder setCrossDomainPolicy(@Nullable String crossDomainPolicy) {
            this.crossDomainPolicy = crossDomainPolicy;
            return this;
        }
        public CrossSiteAccessPoliciesResponse build() {
            return new CrossSiteAccessPoliciesResponse(clientAccessPolicy, crossDomainPolicy);
        }
    }
}
