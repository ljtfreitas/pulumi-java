// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.MinimalSeverity;
import io.pulumi.azurenative.security.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications about new security alerts
 * 
 */
public final class SecurityContactPropertiesAlertNotificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContactPropertiesAlertNotificationsArgs Empty = new SecurityContactPropertiesAlertNotificationsArgs();

    /**
     * Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    @InputImport(name="minimalSeverity")
    private final @Nullable Input<Either<String,MinimalSeverity>> minimalSeverity;

    public Input<Either<String,MinimalSeverity>> getMinimalSeverity() {
        return this.minimalSeverity == null ? Input.empty() : this.minimalSeverity;
    }

    /**
     * Defines if email notifications will be sent about new security alerts
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,State>> state;

    public Input<Either<String,State>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public SecurityContactPropertiesAlertNotificationsArgs(
        @Nullable Input<Either<String,MinimalSeverity>> minimalSeverity,
        @Nullable Input<Either<String,State>> state) {
        this.minimalSeverity = minimalSeverity;
        this.state = state;
    }

    private SecurityContactPropertiesAlertNotificationsArgs() {
        this.minimalSeverity = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,MinimalSeverity>> minimalSeverity;
        private @Nullable Input<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimalSeverity = defaults.minimalSeverity;
    	      this.state = defaults.state;
        }

        public Builder setMinimalSeverity(@Nullable Input<Either<String,MinimalSeverity>> minimalSeverity) {
            this.minimalSeverity = minimalSeverity;
            return this;
        }

        public Builder setMinimalSeverity(@Nullable Either<String,MinimalSeverity> minimalSeverity) {
            this.minimalSeverity = Input.ofNullable(minimalSeverity);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,State>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,State> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public SecurityContactPropertiesAlertNotificationsArgs build() {
            return new SecurityContactPropertiesAlertNotificationsArgs(minimalSeverity, state);
        }
    }
}
