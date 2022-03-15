// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.SuppressionAlertsScopeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertsSuppressionRuleResult {
    /**
     * Type of the alert to automatically suppress. For all alert types, use '*'
     * 
     */
    private final String alertType;
    /**
     * Any comment regarding the rule
     * 
     */
    private final @Nullable String comment;
    /**
     * Expiration date of the rule, if value is not provided or provided as null this field will default to the maximum allowed expiration date.
     * 
     */
    private final @Nullable String expirationDateUtc;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The last time this rule was modified
     * 
     */
    private final String lastModifiedUtc;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The reason for dismissing the alert
     * 
     */
    private final String reason;
    /**
     * Possible states of the rule
     * 
     */
    private final String state;
    /**
     * The suppression conditions
     * 
     */
    private final @Nullable SuppressionAlertsScopeResponse suppressionAlertsScope;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAlertsSuppressionRuleResult(
        @CustomType.Parameter("alertType") String alertType,
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("expirationDateUtc") @Nullable String expirationDateUtc,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedUtc") String lastModifiedUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("suppressionAlertsScope") @Nullable SuppressionAlertsScopeResponse suppressionAlertsScope,
        @CustomType.Parameter("type") String type) {
        this.alertType = alertType;
        this.comment = comment;
        this.expirationDateUtc = expirationDateUtc;
        this.id = id;
        this.lastModifiedUtc = lastModifiedUtc;
        this.name = name;
        this.reason = reason;
        this.state = state;
        this.suppressionAlertsScope = suppressionAlertsScope;
        this.type = type;
    }

    /**
     * Type of the alert to automatically suppress. For all alert types, use '*'
     * 
    */
    public String getAlertType() {
        return this.alertType;
    }
    /**
     * Any comment regarding the rule
     * 
    */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * Expiration date of the rule, if value is not provided or provided as null this field will default to the maximum allowed expiration date.
     * 
    */
    public Optional<String> getExpirationDateUtc() {
        return Optional.ofNullable(this.expirationDateUtc);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last time this rule was modified
     * 
    */
    public String getLastModifiedUtc() {
        return this.lastModifiedUtc;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The reason for dismissing the alert
     * 
    */
    public String getReason() {
        return this.reason;
    }
    /**
     * Possible states of the rule
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The suppression conditions
     * 
    */
    public Optional<SuppressionAlertsScopeResponse> getSuppressionAlertsScope() {
        return Optional.ofNullable(this.suppressionAlertsScope);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertsSuppressionRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alertType;
        private @Nullable String comment;
        private @Nullable String expirationDateUtc;
        private String id;
        private String lastModifiedUtc;
        private String name;
        private String reason;
        private String state;
        private @Nullable SuppressionAlertsScopeResponse suppressionAlertsScope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertsSuppressionRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertType = defaults.alertType;
    	      this.comment = defaults.comment;
    	      this.expirationDateUtc = defaults.expirationDateUtc;
    	      this.id = defaults.id;
    	      this.lastModifiedUtc = defaults.lastModifiedUtc;
    	      this.name = defaults.name;
    	      this.reason = defaults.reason;
    	      this.state = defaults.state;
    	      this.suppressionAlertsScope = defaults.suppressionAlertsScope;
    	      this.type = defaults.type;
        }

        public Builder alertType(String alertType) {
            this.alertType = Objects.requireNonNull(alertType);
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder expirationDateUtc(@Nullable String expirationDateUtc) {
            this.expirationDateUtc = expirationDateUtc;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lastModifiedUtc(String lastModifiedUtc) {
            this.lastModifiedUtc = Objects.requireNonNull(lastModifiedUtc);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder suppressionAlertsScope(@Nullable SuppressionAlertsScopeResponse suppressionAlertsScope) {
            this.suppressionAlertsScope = suppressionAlertsScope;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAlertsSuppressionRuleResult build() {
            return new GetAlertsSuppressionRuleResult(alertType, comment, expirationDateUtc, id, lastModifiedUtc, name, reason, state, suppressionAlertsScope, type);
        }
    }
}
