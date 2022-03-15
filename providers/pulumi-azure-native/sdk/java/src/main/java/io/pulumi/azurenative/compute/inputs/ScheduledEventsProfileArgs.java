// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.TerminateNotificationProfileArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledEventsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledEventsProfileArgs Empty = new ScheduledEventsProfileArgs();

    /**
     * Specifies Terminate Scheduled Event related configurations.
     * 
     */
    @Import(name="terminateNotificationProfile")
      private final @Nullable Output<TerminateNotificationProfileArgs> terminateNotificationProfile;

    public Output<TerminateNotificationProfileArgs> getTerminateNotificationProfile() {
        return this.terminateNotificationProfile == null ? Output.empty() : this.terminateNotificationProfile;
    }

    public ScheduledEventsProfileArgs(@Nullable Output<TerminateNotificationProfileArgs> terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
    }

    private ScheduledEventsProfileArgs() {
        this.terminateNotificationProfile = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledEventsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TerminateNotificationProfileArgs> terminateNotificationProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledEventsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.terminateNotificationProfile = defaults.terminateNotificationProfile;
        }

        public Builder terminateNotificationProfile(@Nullable Output<TerminateNotificationProfileArgs> terminateNotificationProfile) {
            this.terminateNotificationProfile = terminateNotificationProfile;
            return this;
        }

        public Builder terminateNotificationProfile(@Nullable TerminateNotificationProfileArgs terminateNotificationProfile) {
            this.terminateNotificationProfile = Output.ofNullable(terminateNotificationProfile);
            return this;
        }
        public ScheduledEventsProfileArgs build() {
            return new ScheduledEventsProfileArgs(terminateNotificationProfile);
        }
    }
}
