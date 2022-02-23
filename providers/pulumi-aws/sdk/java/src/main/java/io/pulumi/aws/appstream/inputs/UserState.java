// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * ARN of the appstream user.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * Date and time, in UTC and extended RFC 3339 format, when the user was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * Specifies whether the user in the user pool is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * First name, or given name, of the user.
     * 
     */
    @InputImport(name="firstName")
    private final @Nullable Input<String> firstName;

    public Input<String> getFirstName() {
        return this.firstName == null ? Input.empty() : this.firstName;
    }

    /**
     * Last name, or surname, of the user.
     * 
     */
    @InputImport(name="lastName")
    private final @Nullable Input<String> lastName;

    public Input<String> getLastName() {
        return this.lastName == null ? Input.empty() : this.lastName;
    }

    /**
     * Send an email notification.
     * 
     */
    @InputImport(name="sendEmailNotification")
    private final @Nullable Input<Boolean> sendEmailNotification;

    public Input<Boolean> getSendEmailNotification() {
        return this.sendEmailNotification == null ? Input.empty() : this.sendEmailNotification;
    }

    /**
     * Email address of the user.
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserState(
        @Nullable Input<String> arn,
        @Nullable Input<String> authenticationType,
        @Nullable Input<String> createdTime,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> firstName,
        @Nullable Input<String> lastName,
        @Nullable Input<Boolean> sendEmailNotification,
        @Nullable Input<String> userName) {
        this.arn = arn;
        this.authenticationType = authenticationType;
        this.createdTime = createdTime;
        this.enabled = enabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sendEmailNotification = sendEmailNotification;
        this.userName = userName;
    }

    private UserState() {
        this.arn = Input.empty();
        this.authenticationType = Input.empty();
        this.createdTime = Input.empty();
        this.enabled = Input.empty();
        this.firstName = Input.empty();
        this.lastName = Input.empty();
        this.sendEmailNotification = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> authenticationType;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> firstName;
        private @Nullable Input<String> lastName;
        private @Nullable Input<Boolean> sendEmailNotification;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authenticationType = defaults.authenticationType;
    	      this.createdTime = defaults.createdTime;
    	      this.enabled = defaults.enabled;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.userName = defaults.userName;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setFirstName(@Nullable Input<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setFirstName(@Nullable String firstName) {
            this.firstName = Input.ofNullable(firstName);
            return this;
        }

        public Builder setLastName(@Nullable Input<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLastName(@Nullable String lastName) {
            this.lastName = Input.ofNullable(lastName);
            return this;
        }

        public Builder setSendEmailNotification(@Nullable Input<Boolean> sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }

        public Builder setSendEmailNotification(@Nullable Boolean sendEmailNotification) {
            this.sendEmailNotification = Input.ofNullable(sendEmailNotification);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public UserState build() {
            return new UserState(arn, authenticationType, createdTime, enabled, firstName, lastName, sendEmailNotification, userName);
        }
    }
}
