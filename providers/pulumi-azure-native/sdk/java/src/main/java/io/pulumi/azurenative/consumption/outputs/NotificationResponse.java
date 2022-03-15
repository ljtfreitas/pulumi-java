// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationResponse {
    /**
     * Email addresses to send the budget notification to when the threshold is exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group scopes. All other scopes must have at least one contact email specified.
     * 
     */
    private final List<String> contactEmails;
    /**
     * Action groups to send the budget notification to when the threshold is exceeded. Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     * 
     */
    private final @Nullable List<String> contactGroups;
    /**
     * Contact roles to send the budget notification to when the threshold is exceeded.
     * 
     */
    private final @Nullable List<String> contactRoles;
    /**
     * The notification is enabled or not.
     * 
     */
    private final Boolean enabled;
    /**
     * Language in which the recipient will receive the notification
     * 
     */
    private final @Nullable String locale;
    /**
     * The comparison operator.
     * 
     */
    private final String operator;
    /**
     * Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
     */
    private final Double threshold;
    /**
     * The type of threshold
     * 
     */
    private final @Nullable String thresholdType;

    @CustomType.Constructor
    private NotificationResponse(
        @CustomType.Parameter("contactEmails") List<String> contactEmails,
        @CustomType.Parameter("contactGroups") @Nullable List<String> contactGroups,
        @CustomType.Parameter("contactRoles") @Nullable List<String> contactRoles,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("locale") @Nullable String locale,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("threshold") Double threshold,
        @CustomType.Parameter("thresholdType") @Nullable String thresholdType) {
        this.contactEmails = contactEmails;
        this.contactGroups = contactGroups;
        this.contactRoles = contactRoles;
        this.enabled = enabled;
        this.locale = locale;
        this.operator = operator;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
    }

    /**
     * Email addresses to send the budget notification to when the threshold is exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group scopes. All other scopes must have at least one contact email specified.
     * 
    */
    public List<String> getContactEmails() {
        return this.contactEmails;
    }
    /**
     * Action groups to send the budget notification to when the threshold is exceeded. Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     * 
    */
    public List<String> getContactGroups() {
        return this.contactGroups == null ? List.of() : this.contactGroups;
    }
    /**
     * Contact roles to send the budget notification to when the threshold is exceeded.
     * 
    */
    public List<String> getContactRoles() {
        return this.contactRoles == null ? List.of() : this.contactRoles;
    }
    /**
     * The notification is enabled or not.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Language in which the recipient will receive the notification
     * 
    */
    public Optional<String> getLocale() {
        return Optional.ofNullable(this.locale);
    }
    /**
     * The comparison operator.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Threshold value associated with a notification. Notification is sent when the cost exceeded the threshold. It is always percent and has to be between 0 and 1000.
     * 
    */
    public Double getThreshold() {
        return this.threshold;
    }
    /**
     * The type of threshold
     * 
    */
    public Optional<String> getThresholdType() {
        return Optional.ofNullable(this.thresholdType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contactEmails;
        private @Nullable List<String> contactGroups;
        private @Nullable List<String> contactRoles;
        private Boolean enabled;
        private @Nullable String locale;
        private String operator;
        private Double threshold;
        private @Nullable String thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactEmails = defaults.contactEmails;
    	      this.contactGroups = defaults.contactGroups;
    	      this.contactRoles = defaults.contactRoles;
    	      this.enabled = defaults.enabled;
    	      this.locale = defaults.locale;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder contactEmails(List<String> contactEmails) {
            this.contactEmails = Objects.requireNonNull(contactEmails);
            return this;
        }

        public Builder contactGroups(@Nullable List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        public Builder contactRoles(@Nullable List<String> contactRoles) {
            this.contactRoles = contactRoles;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder locale(@Nullable String locale) {
            this.locale = locale;
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder thresholdType(@Nullable String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public NotificationResponse build() {
            return new NotificationResponse(contactEmails, contactGroups, contactRoles, enabled, locale, operator, threshold, thresholdType);
        }
    }
}
