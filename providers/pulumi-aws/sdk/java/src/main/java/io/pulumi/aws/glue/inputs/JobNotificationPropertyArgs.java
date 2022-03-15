// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobNotificationPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobNotificationPropertyArgs Empty = new JobNotificationPropertyArgs();

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    @Import(name="notifyDelayAfter")
      private final @Nullable Output<Integer> notifyDelayAfter;

    public Output<Integer> getNotifyDelayAfter() {
        return this.notifyDelayAfter == null ? Output.empty() : this.notifyDelayAfter;
    }

    public JobNotificationPropertyArgs(@Nullable Output<Integer> notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    private JobNotificationPropertyArgs() {
        this.notifyDelayAfter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNotificationPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> notifyDelayAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(JobNotificationPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifyDelayAfter = defaults.notifyDelayAfter;
        }

        public Builder notifyDelayAfter(@Nullable Output<Integer> notifyDelayAfter) {
            this.notifyDelayAfter = notifyDelayAfter;
            return this;
        }

        public Builder notifyDelayAfter(@Nullable Integer notifyDelayAfter) {
            this.notifyDelayAfter = Output.ofNullable(notifyDelayAfter);
            return this;
        }
        public JobNotificationPropertyArgs build() {
            return new JobNotificationPropertyArgs(notifyDelayAfter);
        }
    }
}
