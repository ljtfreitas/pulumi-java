// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateAttachmentGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateGetArgs Empty = new FirewallFirewallStatusSyncStateGetArgs();

    /**
     * Nested list describing the attachment status of the firewall's association with a single VPC subnet.
     * 
     */
    @Import(name="attachments")
      private final @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentGetArgs>> attachments;

    public Output<List<FirewallFirewallStatusSyncStateAttachmentGetArgs>> getAttachments() {
        return this.attachments == null ? Output.empty() : this.attachments;
    }

    /**
     * The Availability Zone where the subnet is configured.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    public FirewallFirewallStatusSyncStateGetArgs(
        @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentGetArgs>> attachments,
        @Nullable Output<String> availabilityZone) {
        this.attachments = attachments;
        this.availabilityZone = availabilityZone;
    }

    private FirewallFirewallStatusSyncStateGetArgs() {
        this.attachments = Output.empty();
        this.availabilityZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentGetArgs>> attachments;
        private @Nullable Output<String> availabilityZone;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.availabilityZone = defaults.availabilityZone;
        }

        public Builder attachments(@Nullable Output<List<FirewallFirewallStatusSyncStateAttachmentGetArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder attachments(@Nullable List<FirewallFirewallStatusSyncStateAttachmentGetArgs> attachments) {
            this.attachments = Output.ofNullable(attachments);
            return this;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }
        public FirewallFirewallStatusSyncStateGetArgs build() {
            return new FirewallFirewallStatusSyncStateGetArgs(attachments, availabilityZone);
        }
    }
}
