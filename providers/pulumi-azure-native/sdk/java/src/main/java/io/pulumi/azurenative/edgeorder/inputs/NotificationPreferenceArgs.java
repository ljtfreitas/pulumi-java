// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.NotificationStageName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Notification preference for a job stage.
 * 
 */
public final class NotificationPreferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationPreferenceArgs Empty = new NotificationPreferenceArgs();

    /**
     * Notification is required or not.
     * 
     */
    @InputImport(name="sendNotification", required=true)
        private final Input<Boolean> sendNotification;

    public Input<Boolean> getSendNotification() {
        return this.sendNotification;
    }

    /**
     * Name of the stage.
     * 
     */
    @InputImport(name="stageName", required=true)
        private final Input<Either<String,NotificationStageName>> stageName;

    public Input<Either<String,NotificationStageName>> getStageName() {
        return this.stageName;
    }

    public NotificationPreferenceArgs(
        Input<Boolean> sendNotification,
        Input<Either<String,NotificationStageName>> stageName) {
        this.sendNotification = Objects.requireNonNull(sendNotification, "expected parameter 'sendNotification' to be non-null");
        this.stageName = Objects.requireNonNull(stageName, "expected parameter 'stageName' to be non-null");
    }

    private NotificationPreferenceArgs() {
        this.sendNotification = Input.empty();
        this.stageName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> sendNotification;
        private Input<Either<String,NotificationStageName>> stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPreferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendNotification = defaults.sendNotification;
    	      this.stageName = defaults.stageName;
        }

        public Builder setSendNotification(Input<Boolean> sendNotification) {
            this.sendNotification = Objects.requireNonNull(sendNotification);
            return this;
        }

        public Builder setSendNotification(Boolean sendNotification) {
            this.sendNotification = Input.of(Objects.requireNonNull(sendNotification));
            return this;
        }

        public Builder setStageName(Input<Either<String,NotificationStageName>> stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public Builder setStageName(Either<String,NotificationStageName> stageName) {
            this.stageName = Input.of(Objects.requireNonNull(stageName));
            return this;
        }
        public NotificationPreferenceArgs build() {
            return new NotificationPreferenceArgs(sendNotification, stageName);
        }
    }
}
