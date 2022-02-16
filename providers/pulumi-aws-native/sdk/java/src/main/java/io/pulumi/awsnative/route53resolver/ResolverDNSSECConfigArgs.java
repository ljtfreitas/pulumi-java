// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverDNSSECConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverDNSSECConfigArgs Empty = new ResolverDNSSECConfigArgs();

    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public ResolverDNSSECConfigArgs(@Nullable Input<String> resourceId) {
        this.resourceId = resourceId;
    }

    private ResolverDNSSECConfigArgs() {
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverDNSSECConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverDNSSECConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public ResolverDNSSECConfigArgs build() {
            return new ResolverDNSSECConfigArgs(resourceId);
        }
    }
}