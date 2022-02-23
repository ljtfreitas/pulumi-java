// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolClientAnalyticsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolClientAnalyticsConfigurationArgs Empty = new UserPoolClientAnalyticsConfigurationArgs();

    /**
     * Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    @InputImport(name="applicationArn")
    private final @Nullable Input<String> applicationArn;

    public Input<String> getApplicationArn() {
        return this.applicationArn == null ? Input.empty() : this.applicationArn;
    }

    /**
     * Application ID for an Amazon Pinpoint application.
     * 
     */
    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    @InputImport(name="externalId")
    private final @Nullable Input<String> externalId;

    public Input<String> getExternalId() {
        return this.externalId == null ? Input.empty() : this.externalId;
    }

    /**
     * ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    @InputImport(name="userDataShared")
    private final @Nullable Input<Boolean> userDataShared;

    public Input<Boolean> getUserDataShared() {
        return this.userDataShared == null ? Input.empty() : this.userDataShared;
    }

    public UserPoolClientAnalyticsConfigurationArgs(
        @Nullable Input<String> applicationArn,
        @Nullable Input<String> applicationId,
        @Nullable Input<String> externalId,
        @Nullable Input<String> roleArn,
        @Nullable Input<Boolean> userDataShared) {
        this.applicationArn = applicationArn;
        this.applicationId = applicationId;
        this.externalId = externalId;
        this.roleArn = roleArn;
        this.userDataShared = userDataShared;
    }

    private UserPoolClientAnalyticsConfigurationArgs() {
        this.applicationArn = Input.empty();
        this.applicationId = Input.empty();
        this.externalId = Input.empty();
        this.roleArn = Input.empty();
        this.userDataShared = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationArn;
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> externalId;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<Boolean> userDataShared;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolClientAnalyticsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
    	      this.applicationId = defaults.applicationId;
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
    	      this.userDataShared = defaults.userDataShared;
        }

        public Builder setApplicationArn(@Nullable Input<String> applicationArn) {
            this.applicationArn = applicationArn;
            return this;
        }

        public Builder setApplicationArn(@Nullable String applicationArn) {
            this.applicationArn = Input.ofNullable(applicationArn);
            return this;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setExternalId(@Nullable Input<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setExternalId(@Nullable String externalId) {
            this.externalId = Input.ofNullable(externalId);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setUserDataShared(@Nullable Input<Boolean> userDataShared) {
            this.userDataShared = userDataShared;
            return this;
        }

        public Builder setUserDataShared(@Nullable Boolean userDataShared) {
            this.userDataShared = Input.ofNullable(userDataShared);
            return this;
        }
        public UserPoolClientAnalyticsConfigurationArgs build() {
            return new UserPoolClientAnalyticsConfigurationArgs(applicationArn, applicationId, externalId, roleArn, userDataShared);
        }
    }
}