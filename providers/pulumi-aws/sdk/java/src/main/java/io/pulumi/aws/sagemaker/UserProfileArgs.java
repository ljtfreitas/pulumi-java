// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileArgs Empty = new UserProfileArgs();

    /**
     * The ID of the associated Domain.
     * 
     */
    @InputImport(name="domainId", required=true)
    private final Input<String> domainId;

    public Input<String> getDomainId() {
        return this.domainId;
    }

    /**
     * A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @InputImport(name="singleSignOnUserIdentifier")
    private final @Nullable Input<String> singleSignOnUserIdentifier;

    public Input<String> getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier == null ? Input.empty() : this.singleSignOnUserIdentifier;
    }

    /**
     * The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @InputImport(name="singleSignOnUserValue")
    private final @Nullable Input<String> singleSignOnUserValue;

    public Input<String> getSingleSignOnUserValue() {
        return this.singleSignOnUserValue == null ? Input.empty() : this.singleSignOnUserValue;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name for the User Profile.
     * 
     */
    @InputImport(name="userProfileName", required=true)
    private final Input<String> userProfileName;

    public Input<String> getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * The user settings. See User Settings below.
     * 
     */
    @InputImport(name="userSettings")
    private final @Nullable Input<UserProfileUserSettingsArgs> userSettings;

    public Input<UserProfileUserSettingsArgs> getUserSettings() {
        return this.userSettings == null ? Input.empty() : this.userSettings;
    }

    public UserProfileArgs(
        Input<String> domainId,
        @Nullable Input<String> singleSignOnUserIdentifier,
        @Nullable Input<String> singleSignOnUserValue,
        @Nullable Input<Map<String,String>> tags,
        Input<String> userProfileName,
        @Nullable Input<UserProfileUserSettingsArgs> userSettings) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
        this.singleSignOnUserValue = singleSignOnUserValue;
        this.tags = tags;
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
        this.userSettings = userSettings;
    }

    private UserProfileArgs() {
        this.domainId = Input.empty();
        this.singleSignOnUserIdentifier = Input.empty();
        this.singleSignOnUserValue = Input.empty();
        this.tags = Input.empty();
        this.userProfileName = Input.empty();
        this.userSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainId;
        private @Nullable Input<String> singleSignOnUserIdentifier;
        private @Nullable Input<String> singleSignOnUserValue;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> userProfileName;
        private @Nullable Input<UserProfileUserSettingsArgs> userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.singleSignOnUserIdentifier = defaults.singleSignOnUserIdentifier;
    	      this.singleSignOnUserValue = defaults.singleSignOnUserValue;
    	      this.tags = defaults.tags;
    	      this.userProfileName = defaults.userProfileName;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder setDomainId(Input<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Input.of(Objects.requireNonNull(domainId));
            return this;
        }

        public Builder setSingleSignOnUserIdentifier(@Nullable Input<String> singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
            return this;
        }

        public Builder setSingleSignOnUserIdentifier(@Nullable String singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = Input.ofNullable(singleSignOnUserIdentifier);
            return this;
        }

        public Builder setSingleSignOnUserValue(@Nullable Input<String> singleSignOnUserValue) {
            this.singleSignOnUserValue = singleSignOnUserValue;
            return this;
        }

        public Builder setSingleSignOnUserValue(@Nullable String singleSignOnUserValue) {
            this.singleSignOnUserValue = Input.ofNullable(singleSignOnUserValue);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserProfileName(Input<String> userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }

        public Builder setUserProfileName(String userProfileName) {
            this.userProfileName = Input.of(Objects.requireNonNull(userProfileName));
            return this;
        }

        public Builder setUserSettings(@Nullable Input<UserProfileUserSettingsArgs> userSettings) {
            this.userSettings = userSettings;
            return this;
        }

        public Builder setUserSettings(@Nullable UserProfileUserSettingsArgs userSettings) {
            this.userSettings = Input.ofNullable(userSettings);
            return this;
        }
        public UserProfileArgs build() {
            return new UserProfileArgs(domainId, singleSignOnUserIdentifier, singleSignOnUserValue, tags, userProfileName, userSettings);
        }
    }
}
