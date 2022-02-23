// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.NotificationReceiverValueResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationEventReceiverResponse {
    /**
     * The type of the notification event receiver.
     * 
     */
    private final @Nullable String receiverType;
    /**
     * The notification event receiver value.
     * 
     */
    private final @Nullable NotificationReceiverValueResponse receiverValue;

    @OutputCustomType.Constructor({"receiverType","receiverValue"})
    private NotificationEventReceiverResponse(
        @Nullable String receiverType,
        @Nullable NotificationReceiverValueResponse receiverValue) {
        this.receiverType = receiverType;
        this.receiverValue = receiverValue;
    }

    /**
     * The type of the notification event receiver.
     * 
     */
    public Optional<String> getReceiverType() {
        return Optional.ofNullable(this.receiverType);
    }
    /**
     * The notification event receiver value.
     * 
     */
    public Optional<NotificationReceiverValueResponse> getReceiverValue() {
        return Optional.ofNullable(this.receiverValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEventReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String receiverType;
        private @Nullable NotificationReceiverValueResponse receiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEventReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiverType = defaults.receiverType;
    	      this.receiverValue = defaults.receiverValue;
        }

        public Builder setReceiverType(@Nullable String receiverType) {
            this.receiverType = receiverType;
            return this;
        }

        public Builder setReceiverValue(@Nullable NotificationReceiverValueResponse receiverValue) {
            this.receiverValue = receiverValue;
            return this;
        }
        public NotificationEventReceiverResponse build() {
            return new NotificationEventReceiverResponse(receiverType, receiverValue);
        }
    }
}
