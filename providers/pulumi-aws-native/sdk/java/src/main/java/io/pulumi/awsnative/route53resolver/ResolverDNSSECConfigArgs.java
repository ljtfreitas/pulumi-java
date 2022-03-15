// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverDNSSECConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverDNSSECConfigArgs Empty = new ResolverDNSSECConfigArgs();

    /**
     * ResourceId
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public ResolverDNSSECConfigArgs(@Nullable Output<String> resourceId) {
        this.resourceId = resourceId;
    }

    private ResolverDNSSECConfigArgs() {
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverDNSSECConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverDNSSECConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public ResolverDNSSECConfigArgs build() {
            return new ResolverDNSSECConfigArgs(resourceId);
        }
    }
}
