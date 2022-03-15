// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.mediapackage.inputs.PackagingGroupAuthorizationArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingGroupLogConfigurationArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PackagingGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingGroupArgs Empty = new PackagingGroupArgs();

    /**
     * CDN Authorization
     * 
     */
    @Import(name="authorization")
      private final @Nullable Output<PackagingGroupAuthorizationArgs> authorization;

    public Output<PackagingGroupAuthorizationArgs> getAuthorization() {
        return this.authorization == null ? Output.empty() : this.authorization;
    }

    /**
     * The configuration parameters for egress access logging.
     * 
     */
    @Import(name="egressAccessLogs")
      private final @Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs;

    public Output<PackagingGroupLogConfigurationArgs> getEgressAccessLogs() {
        return this.egressAccessLogs == null ? Output.empty() : this.egressAccessLogs;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<PackagingGroupTagArgs>> tags;

    public Output<List<PackagingGroupTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PackagingGroupArgs(
        @Nullable Output<PackagingGroupAuthorizationArgs> authorization,
        @Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs,
        @Nullable Output<List<PackagingGroupTagArgs>> tags) {
        this.authorization = authorization;
        this.egressAccessLogs = egressAccessLogs;
        this.tags = tags;
    }

    private PackagingGroupArgs() {
        this.authorization = Output.empty();
        this.egressAccessLogs = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PackagingGroupAuthorizationArgs> authorization;
        private @Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs;
        private @Nullable Output<List<PackagingGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.egressAccessLogs = defaults.egressAccessLogs;
    	      this.tags = defaults.tags;
        }

        public Builder authorization(@Nullable Output<PackagingGroupAuthorizationArgs> authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder authorization(@Nullable PackagingGroupAuthorizationArgs authorization) {
            this.authorization = Output.ofNullable(authorization);
            return this;
        }

        public Builder egressAccessLogs(@Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs) {
            this.egressAccessLogs = egressAccessLogs;
            return this;
        }

        public Builder egressAccessLogs(@Nullable PackagingGroupLogConfigurationArgs egressAccessLogs) {
            this.egressAccessLogs = Output.ofNullable(egressAccessLogs);
            return this;
        }

        public Builder tags(@Nullable Output<List<PackagingGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<PackagingGroupTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PackagingGroupArgs build() {
            return new PackagingGroupArgs(authorization, egressAccessLogs, tags);
        }
    }
}
