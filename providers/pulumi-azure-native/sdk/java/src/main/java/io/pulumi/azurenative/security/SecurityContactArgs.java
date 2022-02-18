// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.SecurityContactPropertiesAlertNotificationsArgs;
import io.pulumi.azurenative.security.inputs.SecurityContactPropertiesNotificationsByRoleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContactArgs Empty = new SecurityContactArgs();

    /**
     * Defines whether to send email notifications about new security alerts
     * 
     */
    @InputImport(name="alertNotifications")
    private final @Nullable Input<SecurityContactPropertiesAlertNotificationsArgs> alertNotifications;

    public Input<SecurityContactPropertiesAlertNotificationsArgs> getAlertNotifications() {
        return this.alertNotifications == null ? Input.empty() : this.alertNotifications;
    }

    /**
     * List of email addresses which will get notifications from Azure Security Center by the configurations defined in this security contact.
     * 
     */
    @InputImport(name="emails")
    private final @Nullable Input<String> emails;

    public Input<String> getEmails() {
        return this.emails == null ? Input.empty() : this.emails;
    }

    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    @InputImport(name="notificationsByRole")
    private final @Nullable Input<SecurityContactPropertiesNotificationsByRoleArgs> notificationsByRole;

    public Input<SecurityContactPropertiesNotificationsByRoleArgs> getNotificationsByRole() {
        return this.notificationsByRole == null ? Input.empty() : this.notificationsByRole;
    }

    /**
     * The security contact's phone number
     * 
     */
    @InputImport(name="phone")
    private final @Nullable Input<String> phone;

    public Input<String> getPhone() {
        return this.phone == null ? Input.empty() : this.phone;
    }

    /**
     * Name of the security contact object
     * 
     */
    @InputImport(name="securityContactName")
    private final @Nullable Input<String> securityContactName;

    public Input<String> getSecurityContactName() {
        return this.securityContactName == null ? Input.empty() : this.securityContactName;
    }

    public SecurityContactArgs(
        @Nullable Input<SecurityContactPropertiesAlertNotificationsArgs> alertNotifications,
        @Nullable Input<String> emails,
        @Nullable Input<SecurityContactPropertiesNotificationsByRoleArgs> notificationsByRole,
        @Nullable Input<String> phone,
        @Nullable Input<String> securityContactName) {
        this.alertNotifications = alertNotifications;
        this.emails = emails;
        this.notificationsByRole = notificationsByRole;
        this.phone = phone;
        this.securityContactName = securityContactName;
    }

    private SecurityContactArgs() {
        this.alertNotifications = Input.empty();
        this.emails = Input.empty();
        this.notificationsByRole = Input.empty();
        this.phone = Input.empty();
        this.securityContactName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityContactPropertiesAlertNotificationsArgs> alertNotifications;
        private @Nullable Input<String> emails;
        private @Nullable Input<SecurityContactPropertiesNotificationsByRoleArgs> notificationsByRole;
        private @Nullable Input<String> phone;
        private @Nullable Input<String> securityContactName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertNotifications = defaults.alertNotifications;
    	      this.emails = defaults.emails;
    	      this.notificationsByRole = defaults.notificationsByRole;
    	      this.phone = defaults.phone;
    	      this.securityContactName = defaults.securityContactName;
        }

        public Builder setAlertNotifications(@Nullable Input<SecurityContactPropertiesAlertNotificationsArgs> alertNotifications) {
            this.alertNotifications = alertNotifications;
            return this;
        }

        public Builder setAlertNotifications(@Nullable SecurityContactPropertiesAlertNotificationsArgs alertNotifications) {
            this.alertNotifications = Input.ofNullable(alertNotifications);
            return this;
        }

        public Builder setEmails(@Nullable Input<String> emails) {
            this.emails = emails;
            return this;
        }

        public Builder setEmails(@Nullable String emails) {
            this.emails = Input.ofNullable(emails);
            return this;
        }

        public Builder setNotificationsByRole(@Nullable Input<SecurityContactPropertiesNotificationsByRoleArgs> notificationsByRole) {
            this.notificationsByRole = notificationsByRole;
            return this;
        }

        public Builder setNotificationsByRole(@Nullable SecurityContactPropertiesNotificationsByRoleArgs notificationsByRole) {
            this.notificationsByRole = Input.ofNullable(notificationsByRole);
            return this;
        }

        public Builder setPhone(@Nullable Input<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPhone(@Nullable String phone) {
            this.phone = Input.ofNullable(phone);
            return this;
        }

        public Builder setSecurityContactName(@Nullable Input<String> securityContactName) {
            this.securityContactName = securityContactName;
            return this;
        }

        public Builder setSecurityContactName(@Nullable String securityContactName) {
            this.securityContactName = Input.ofNullable(securityContactName);
            return this;
        }

        public SecurityContactArgs build() {
            return new SecurityContactArgs(alertNotifications, emails, notificationsByRole, phone, securityContactName);
        }
    }
}
