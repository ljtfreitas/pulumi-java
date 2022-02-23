// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs();

    /**
     * Prior to forwarding the request to the selected service, the request's host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    @InputImport(name="hostRewrite")
        private final @Nullable Input<String> hostRewrite;

    public Input<String> getHostRewrite() {
        return this.hostRewrite == null ? Input.empty() : this.hostRewrite;
    }

    /**
     * Prior to forwarding the request to the selected backend service, the matching portion of the
     * request's path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    @InputImport(name="pathPrefixRewrite")
        private final @Nullable Input<String> pathPrefixRewrite;

    public Input<String> getPathPrefixRewrite() {
        return this.pathPrefixRewrite == null ? Input.empty() : this.pathPrefixRewrite;
    }

    public URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(
        @Nullable Input<String> hostRewrite,
        @Nullable Input<String> pathPrefixRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
    }

    private URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs() {
        this.hostRewrite = Input.empty();
        this.pathPrefixRewrite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostRewrite;
        private @Nullable Input<String> pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder setHostRewrite(@Nullable Input<String> hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }

        public Builder setHostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = Input.ofNullable(hostRewrite);
            return this;
        }

        public Builder setPathPrefixRewrite(@Nullable Input<String> pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        public Builder setPathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = Input.ofNullable(pathPrefixRewrite);
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(hostRewrite, pathPrefixRewrite);
        }
    }
}
