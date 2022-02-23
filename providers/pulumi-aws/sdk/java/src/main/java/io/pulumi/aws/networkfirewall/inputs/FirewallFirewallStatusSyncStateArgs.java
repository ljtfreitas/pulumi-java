// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateAttachmentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateArgs Empty = new FirewallFirewallStatusSyncStateArgs();

    /**
     * Nested list describing the attachment status of the firewall's association with a single VPC subnet.
     * 
     */
    @InputImport(name="attachments")
    private final @Nullable Input<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments;

    public Input<List<FirewallFirewallStatusSyncStateAttachmentArgs>> getAttachments() {
        return this.attachments == null ? Input.empty() : this.attachments;
    }

    /**
     * The Availability Zone where the subnet is configured.
     * 
     */
    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    public FirewallFirewallStatusSyncStateArgs(
        @Nullable Input<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments,
        @Nullable Input<String> availabilityZone) {
        this.attachments = attachments;
        this.availabilityZone = availabilityZone;
    }

    private FirewallFirewallStatusSyncStateArgs() {
        this.attachments = Input.empty();
        this.availabilityZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments;
        private @Nullable Input<String> availabilityZone;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.availabilityZone = defaults.availabilityZone;
        }

        public Builder setAttachments(@Nullable Input<List<FirewallFirewallStatusSyncStateAttachmentArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder setAttachments(@Nullable List<FirewallFirewallStatusSyncStateAttachmentArgs> attachments) {
            this.attachments = Input.ofNullable(attachments);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }
        public FirewallFirewallStatusSyncStateArgs build() {
            return new FirewallFirewallStatusSyncStateArgs(attachments, availabilityZone);
        }
    }
}
