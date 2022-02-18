// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The client access policy.
 * 
 */
public final class CrossSiteAccessPoliciesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrossSiteAccessPoliciesArgs Empty = new CrossSiteAccessPoliciesArgs();

    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    @InputImport(name="clientAccessPolicy")
    private final @Nullable Input<String> clientAccessPolicy;

    public Input<String> getClientAccessPolicy() {
        return this.clientAccessPolicy == null ? Input.empty() : this.clientAccessPolicy;
    }

    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
     */
    @InputImport(name="crossDomainPolicy")
    private final @Nullable Input<String> crossDomainPolicy;

    public Input<String> getCrossDomainPolicy() {
        return this.crossDomainPolicy == null ? Input.empty() : this.crossDomainPolicy;
    }

    public CrossSiteAccessPoliciesArgs(
        @Nullable Input<String> clientAccessPolicy,
        @Nullable Input<String> crossDomainPolicy) {
        this.clientAccessPolicy = clientAccessPolicy;
        this.crossDomainPolicy = crossDomainPolicy;
    }

    private CrossSiteAccessPoliciesArgs() {
        this.clientAccessPolicy = Input.empty();
        this.crossDomainPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossSiteAccessPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientAccessPolicy;
        private @Nullable Input<String> crossDomainPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(CrossSiteAccessPoliciesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAccessPolicy = defaults.clientAccessPolicy;
    	      this.crossDomainPolicy = defaults.crossDomainPolicy;
        }

        public Builder setClientAccessPolicy(@Nullable Input<String> clientAccessPolicy) {
            this.clientAccessPolicy = clientAccessPolicy;
            return this;
        }

        public Builder setClientAccessPolicy(@Nullable String clientAccessPolicy) {
            this.clientAccessPolicy = Input.ofNullable(clientAccessPolicy);
            return this;
        }

        public Builder setCrossDomainPolicy(@Nullable Input<String> crossDomainPolicy) {
            this.crossDomainPolicy = crossDomainPolicy;
            return this;
        }

        public Builder setCrossDomainPolicy(@Nullable String crossDomainPolicy) {
            this.crossDomainPolicy = Input.ofNullable(crossDomainPolicy);
            return this;
        }

        public CrossSiteAccessPoliciesArgs build() {
            return new CrossSiteAccessPoliciesArgs(clientAccessPolicy, crossDomainPolicy);
        }
    }
}
