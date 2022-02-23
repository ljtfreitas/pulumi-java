// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerActionNotificationProperty {
    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    private final @Nullable Integer notifyDelayAfter;

    @OutputCustomType.Constructor({"notifyDelayAfter"})
    private TriggerActionNotificationProperty(@Nullable Integer notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    public Optional<Integer> getNotifyDelayAfter() {
        return Optional.ofNullable(this.notifyDelayAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerActionNotificationProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer notifyDelayAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerActionNotificationProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifyDelayAfter = defaults.notifyDelayAfter;
        }

        public Builder setNotifyDelayAfter(@Nullable Integer notifyDelayAfter) {
            this.notifyDelayAfter = notifyDelayAfter;
            return this;
        }
        public TriggerActionNotificationProperty build() {
            return new TriggerActionNotificationProperty(notifyDelayAfter);
        }
    }
}
