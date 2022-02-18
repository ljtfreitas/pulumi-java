// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NotificationPreferenceResponse {
    /**
     * Notification is required or not.
     * 
     */
    private final Boolean sendNotification;
    /**
     * Name of the stage.
     * 
     */
    private final String stageName;

    @OutputCustomType.Constructor({"sendNotification","stageName"})
    private NotificationPreferenceResponse(
        Boolean sendNotification,
        String stageName) {
        this.sendNotification = Objects.requireNonNull(sendNotification);
        this.stageName = Objects.requireNonNull(stageName);
    }

    /**
     * Notification is required or not.
     * 
     */
    public Boolean getSendNotification() {
        return this.sendNotification;
    }
    /**
     * Name of the stage.
     * 
     */
    public String getStageName() {
        return this.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean sendNotification;
        private String stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPreferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sendNotification = defaults.sendNotification;
    	      this.stageName = defaults.stageName;
        }

        public Builder setSendNotification(Boolean sendNotification) {
            this.sendNotification = Objects.requireNonNull(sendNotification);
            return this;
        }

        public Builder setStageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }

        public NotificationPreferenceResponse build() {
            return new NotificationPreferenceResponse(sendNotification, stageName);
        }
    }
}
