// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs();

    /**
     * The policy to use for defining caching and signed request behaviour for requests that match this route.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Output.empty() : this.cdnPolicy;
    }

    /**
     * CORSPolicy defines Cross-Origin-Resource-Sharing configuration, including which CORS response headers will be set.
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The URL rewrite configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs(
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
        this.cdnPolicy = cdnPolicy;
        this.corsPolicy = corsPolicy;
        this.urlRewrite = urlRewrite;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs() {
        this.cdnPolicy = Output.empty();
        this.corsPolicy = Output.empty();
        this.urlRewrite = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.urlRewrite = defaults.urlRewrite;
        }

        public Builder cdnPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs cdnPolicy) {
            this.cdnPolicy = Output.ofNullable(cdnPolicy);
            return this;
        }

        public Builder corsPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs(cdnPolicy, corsPolicy, urlRewrite);
        }
    }
}
