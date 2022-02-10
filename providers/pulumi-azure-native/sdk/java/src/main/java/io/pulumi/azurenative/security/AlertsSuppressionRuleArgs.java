// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.RuleState;
import io.pulumi.azurenative.security.inputs.SuppressionAlertsScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertsSuppressionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertsSuppressionRuleArgs Empty = new AlertsSuppressionRuleArgs();

    @InputImport(name="alertType", required=true)
    private final Input<String> alertType;

    public Input<String> getAlertType() {
        return this.alertType;
    }

    @InputImport(name="alertsSuppressionRuleName")
    private final @Nullable Input<String> alertsSuppressionRuleName;

    public Input<String> getAlertsSuppressionRuleName() {
        return this.alertsSuppressionRuleName == null ? Input.empty() : this.alertsSuppressionRuleName;
    }

    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    @InputImport(name="expirationDateUtc")
    private final @Nullable Input<String> expirationDateUtc;

    public Input<String> getExpirationDateUtc() {
        return this.expirationDateUtc == null ? Input.empty() : this.expirationDateUtc;
    }

    @InputImport(name="reason", required=true)
    private final Input<String> reason;

    public Input<String> getReason() {
        return this.reason;
    }

    @InputImport(name="state", required=true)
    private final Input<Either<String,RuleState>> state;

    public Input<Either<String,RuleState>> getState() {
        return this.state;
    }

    @InputImport(name="suppressionAlertsScope")
    private final @Nullable Input<SuppressionAlertsScopeArgs> suppressionAlertsScope;

    public Input<SuppressionAlertsScopeArgs> getSuppressionAlertsScope() {
        return this.suppressionAlertsScope == null ? Input.empty() : this.suppressionAlertsScope;
    }

    public AlertsSuppressionRuleArgs(
        Input<String> alertType,
        @Nullable Input<String> alertsSuppressionRuleName,
        @Nullable Input<String> comment,
        @Nullable Input<String> expirationDateUtc,
        Input<String> reason,
        Input<Either<String,RuleState>> state,
        @Nullable Input<SuppressionAlertsScopeArgs> suppressionAlertsScope) {
        this.alertType = Objects.requireNonNull(alertType, "expected parameter 'alertType' to be non-null");
        this.alertsSuppressionRuleName = alertsSuppressionRuleName;
        this.comment = comment;
        this.expirationDateUtc = expirationDateUtc;
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.suppressionAlertsScope = suppressionAlertsScope;
    }

    private AlertsSuppressionRuleArgs() {
        this.alertType = Input.empty();
        this.alertsSuppressionRuleName = Input.empty();
        this.comment = Input.empty();
        this.expirationDateUtc = Input.empty();
        this.reason = Input.empty();
        this.state = Input.empty();
        this.suppressionAlertsScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsSuppressionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alertType;
        private @Nullable Input<String> alertsSuppressionRuleName;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> expirationDateUtc;
        private Input<String> reason;
        private Input<Either<String,RuleState>> state;
        private @Nullable Input<SuppressionAlertsScopeArgs> suppressionAlertsScope;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertsSuppressionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertType = defaults.alertType;
    	      this.alertsSuppressionRuleName = defaults.alertsSuppressionRuleName;
    	      this.comment = defaults.comment;
    	      this.expirationDateUtc = defaults.expirationDateUtc;
    	      this.reason = defaults.reason;
    	      this.state = defaults.state;
    	      this.suppressionAlertsScope = defaults.suppressionAlertsScope;
        }

        public Builder setAlertType(Input<String> alertType) {
            this.alertType = Objects.requireNonNull(alertType);
            return this;
        }

        public Builder setAlertType(String alertType) {
            this.alertType = Input.of(Objects.requireNonNull(alertType));
            return this;
        }

        public Builder setAlertsSuppressionRuleName(@Nullable Input<String> alertsSuppressionRuleName) {
            this.alertsSuppressionRuleName = alertsSuppressionRuleName;
            return this;
        }

        public Builder setAlertsSuppressionRuleName(@Nullable String alertsSuppressionRuleName) {
            this.alertsSuppressionRuleName = Input.ofNullable(alertsSuppressionRuleName);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setExpirationDateUtc(@Nullable Input<String> expirationDateUtc) {
            this.expirationDateUtc = expirationDateUtc;
            return this;
        }

        public Builder setExpirationDateUtc(@Nullable String expirationDateUtc) {
            this.expirationDateUtc = Input.ofNullable(expirationDateUtc);
            return this;
        }

        public Builder setReason(Input<String> reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Input.of(Objects.requireNonNull(reason));
            return this;
        }

        public Builder setState(Input<Either<String,RuleState>> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(Either<String,RuleState> state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setSuppressionAlertsScope(@Nullable Input<SuppressionAlertsScopeArgs> suppressionAlertsScope) {
            this.suppressionAlertsScope = suppressionAlertsScope;
            return this;
        }

        public Builder setSuppressionAlertsScope(@Nullable SuppressionAlertsScopeArgs suppressionAlertsScope) {
            this.suppressionAlertsScope = Input.ofNullable(suppressionAlertsScope);
            return this;
        }

        public AlertsSuppressionRuleArgs build() {
            return new AlertsSuppressionRuleArgs(alertType, alertsSuppressionRuleName, comment, expirationDateUtc, reason, state, suppressionAlertsScope);
        }
    }
}