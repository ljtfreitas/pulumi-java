// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AlarmsProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPortalResult {
    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * 
     */
    private final @Nullable AlarmsProperties alarms;
    /**
     * The email address that sends alarm notifications.
     * 
     */
    private final @Nullable String notificationSenderEmail;
    /**
     * The ARN of the portal, which has the following format.
     * 
     */
    private final @Nullable String portalArn;
    /**
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
     */
    private final @Nullable String portalClientId;
    /**
     * The AWS administrator's contact email address.
     * 
     */
    private final @Nullable String portalContactEmail;
    /**
     * A description for the portal.
     * 
     */
    private final @Nullable String portalDescription;
    /**
     * The ID of the portal.
     * 
     */
    private final @Nullable String portalId;
    /**
     * A friendly name for the portal.
     * 
     */
    private final @Nullable String portalName;
    /**
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * 
     */
    private final @Nullable String portalStartUrl;
    /**
     * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf.
     * 
     */
    private final @Nullable String roleArn;

    @OutputCustomType.Constructor
    private GetPortalResult(
        @OutputCustomType.Parameter("alarms") @Nullable AlarmsProperties alarms,
        @OutputCustomType.Parameter("notificationSenderEmail") @Nullable String notificationSenderEmail,
        @OutputCustomType.Parameter("portalArn") @Nullable String portalArn,
        @OutputCustomType.Parameter("portalClientId") @Nullable String portalClientId,
        @OutputCustomType.Parameter("portalContactEmail") @Nullable String portalContactEmail,
        @OutputCustomType.Parameter("portalDescription") @Nullable String portalDescription,
        @OutputCustomType.Parameter("portalId") @Nullable String portalId,
        @OutputCustomType.Parameter("portalName") @Nullable String portalName,
        @OutputCustomType.Parameter("portalStartUrl") @Nullable String portalStartUrl,
        @OutputCustomType.Parameter("roleArn") @Nullable String roleArn) {
        this.alarms = alarms;
        this.notificationSenderEmail = notificationSenderEmail;
        this.portalArn = portalArn;
        this.portalClientId = portalClientId;
        this.portalContactEmail = portalContactEmail;
        this.portalDescription = portalDescription;
        this.portalId = portalId;
        this.portalName = portalName;
        this.portalStartUrl = portalStartUrl;
        this.roleArn = roleArn;
    }

    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * 
    */
    public Optional<AlarmsProperties> getAlarms() {
        return Optional.ofNullable(this.alarms);
    }
    /**
     * The email address that sends alarm notifications.
     * 
    */
    public Optional<String> getNotificationSenderEmail() {
        return Optional.ofNullable(this.notificationSenderEmail);
    }
    /**
     * The ARN of the portal, which has the following format.
     * 
    */
    public Optional<String> getPortalArn() {
        return Optional.ofNullable(this.portalArn);
    }
    /**
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
    */
    public Optional<String> getPortalClientId() {
        return Optional.ofNullable(this.portalClientId);
    }
    /**
     * The AWS administrator's contact email address.
     * 
    */
    public Optional<String> getPortalContactEmail() {
        return Optional.ofNullable(this.portalContactEmail);
    }
    /**
     * A description for the portal.
     * 
    */
    public Optional<String> getPortalDescription() {
        return Optional.ofNullable(this.portalDescription);
    }
    /**
     * The ID of the portal.
     * 
    */
    public Optional<String> getPortalId() {
        return Optional.ofNullable(this.portalId);
    }
    /**
     * A friendly name for the portal.
     * 
    */
    public Optional<String> getPortalName() {
        return Optional.ofNullable(this.portalName);
    }
    /**
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * 
    */
    public Optional<String> getPortalStartUrl() {
        return Optional.ofNullable(this.portalStartUrl);
    }
    /**
     * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortalResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlarmsProperties alarms;
        private @Nullable String notificationSenderEmail;
        private @Nullable String portalArn;
        private @Nullable String portalClientId;
        private @Nullable String portalContactEmail;
        private @Nullable String portalDescription;
        private @Nullable String portalId;
        private @Nullable String portalName;
        private @Nullable String portalStartUrl;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortalResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
    	      this.notificationSenderEmail = defaults.notificationSenderEmail;
    	      this.portalArn = defaults.portalArn;
    	      this.portalClientId = defaults.portalClientId;
    	      this.portalContactEmail = defaults.portalContactEmail;
    	      this.portalDescription = defaults.portalDescription;
    	      this.portalId = defaults.portalId;
    	      this.portalName = defaults.portalName;
    	      this.portalStartUrl = defaults.portalStartUrl;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAlarms(@Nullable AlarmsProperties alarms) {
            this.alarms = alarms;
            return this;
        }

        public Builder setNotificationSenderEmail(@Nullable String notificationSenderEmail) {
            this.notificationSenderEmail = notificationSenderEmail;
            return this;
        }

        public Builder setPortalArn(@Nullable String portalArn) {
            this.portalArn = portalArn;
            return this;
        }

        public Builder setPortalClientId(@Nullable String portalClientId) {
            this.portalClientId = portalClientId;
            return this;
        }

        public Builder setPortalContactEmail(@Nullable String portalContactEmail) {
            this.portalContactEmail = portalContactEmail;
            return this;
        }

        public Builder setPortalDescription(@Nullable String portalDescription) {
            this.portalDescription = portalDescription;
            return this;
        }

        public Builder setPortalId(@Nullable String portalId) {
            this.portalId = portalId;
            return this;
        }

        public Builder setPortalName(@Nullable String portalName) {
            this.portalName = portalName;
            return this;
        }

        public Builder setPortalStartUrl(@Nullable String portalStartUrl) {
            this.portalStartUrl = portalStartUrl;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public GetPortalResult build() {
            return new GetPortalResult(alarms, notificationSenderEmail, portalArn, portalClientId, portalContactEmail, portalDescription, portalId, portalName, portalStartUrl, roleArn);
        }
    }
}
