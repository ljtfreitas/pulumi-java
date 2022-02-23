// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserStackAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserStackAssociationArgs Empty = new UserStackAssociationArgs();

    /**
     * Authentication type for the user.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @InputImport(name="sendEmailNotification")
    private final @Nullable Input<Boolean> sendEmailNotification;

    public Input<Boolean> getSendEmailNotification() {
        return this.sendEmailNotification == null ? Input.empty() : this.sendEmailNotification;
    }

    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @InputImport(name="stackName", required=true)
    private final Input<String> stackName;

    public Input<String> getStackName() {
        return this.stackName;
    }

    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @InputImport(name="userName", required=true)
    private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public UserStackAssociationArgs(
        Input<String> authenticationType,
        @Nullable Input<Boolean> sendEmailNotification,
        Input<String> stackName,
        Input<String> userName) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.sendEmailNotification = sendEmailNotification;
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserStackAssociationArgs() {
        this.authenticationType = Input.empty();
        this.sendEmailNotification = Input.empty();
        this.stackName = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserStackAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authenticationType;
        private @Nullable Input<Boolean> sendEmailNotification;
        private Input<String> stackName;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserStackAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.stackName = defaults.stackName;
    	      this.userName = defaults.userName;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
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

        public Builder setStackName(Input<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }

        public Builder setStackName(String stackName) {
            this.stackName = Input.of(Objects.requireNonNull(stackName));
            return this;
        }

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public UserStackAssociationArgs build() {
            return new UserStackAssociationArgs(authenticationType, sendEmailNotification, stackName, userName);
        }
    }
}
