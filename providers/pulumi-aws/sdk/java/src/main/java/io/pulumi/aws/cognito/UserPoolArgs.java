// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs;
import io.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs;
import io.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs;
import io.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSchemaArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs;
import io.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolArgs Empty = new UserPoolArgs();

    /**
     * Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    @Import(name="accountRecoverySetting")
      private final @Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting;

    public Output<UserPoolAccountRecoverySettingArgs> getAccountRecoverySetting() {
        return this.accountRecoverySetting == null ? Output.empty() : this.accountRecoverySetting;
    }

    /**
     * Configuration block for creating a new user profile. Detailed below.
     * 
     */
    @Import(name="adminCreateUserConfig")
      private final @Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig;

    public Output<UserPoolAdminCreateUserConfigArgs> getAdminCreateUserConfig() {
        return this.adminCreateUserConfig == null ? Output.empty() : this.adminCreateUserConfig;
    }

    /**
     * Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    @Import(name="aliasAttributes")
      private final @Nullable Output<List<String>> aliasAttributes;

    public Output<List<String>> getAliasAttributes() {
        return this.aliasAttributes == null ? Output.empty() : this.aliasAttributes;
    }

    /**
     * Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    @Import(name="autoVerifiedAttributes")
      private final @Nullable Output<List<String>> autoVerifiedAttributes;

    public Output<List<String>> getAutoVerifiedAttributes() {
        return this.autoVerifiedAttributes == null ? Output.empty() : this.autoVerifiedAttributes;
    }

    /**
     * Configuration block for the user pool's device tracking. Detailed below.
     * 
     */
    @Import(name="deviceConfiguration")
      private final @Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration;

    public Output<UserPoolDeviceConfigurationArgs> getDeviceConfiguration() {
        return this.deviceConfiguration == null ? Output.empty() : this.deviceConfiguration;
    }

    /**
     * Configuration block for configuring email. Detailed below.
     * 
     */
    @Import(name="emailConfiguration")
      private final @Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration;

    public Output<UserPoolEmailConfigurationArgs> getEmailConfiguration() {
        return this.emailConfiguration == null ? Output.empty() : this.emailConfiguration;
    }

    /**
     * String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    @Import(name="emailVerificationMessage")
      private final @Nullable Output<String> emailVerificationMessage;

    public Output<String> getEmailVerificationMessage() {
        return this.emailVerificationMessage == null ? Output.empty() : this.emailVerificationMessage;
    }

    /**
     * String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    @Import(name="emailVerificationSubject")
      private final @Nullable Output<String> emailVerificationSubject;

    public Output<String> getEmailVerificationSubject() {
        return this.emailVerificationSubject == null ? Output.empty() : this.emailVerificationSubject;
    }

    /**
     * Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    @Import(name="lambdaConfig")
      private final @Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig;

    public Output<UserPoolLambdaConfigArgs> getLambdaConfig() {
        return this.lambdaConfig == null ? Output.empty() : this.lambdaConfig;
    }

    /**
     * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    @Import(name="mfaConfiguration")
      private final @Nullable Output<String> mfaConfiguration;

    public Output<String> getMfaConfiguration() {
        return this.mfaConfiguration == null ? Output.empty() : this.mfaConfiguration;
    }

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    @Import(name="passwordPolicy")
      private final @Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy;

    public Output<UserPoolPasswordPolicyArgs> getPasswordPolicy() {
        return this.passwordPolicy == null ? Output.empty() : this.passwordPolicy;
    }

    /**
     * Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    @Import(name="schemas")
      private final @Nullable Output<List<UserPoolSchemaArgs>> schemas;

    public Output<List<UserPoolSchemaArgs>> getSchemas() {
        return this.schemas == null ? Output.empty() : this.schemas;
    }

    /**
     * String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    @Import(name="smsAuthenticationMessage")
      private final @Nullable Output<String> smsAuthenticationMessage;

    public Output<String> getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage == null ? Output.empty() : this.smsAuthenticationMessage;
    }

    /**
     * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    @Import(name="smsConfiguration")
      private final @Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration;

    public Output<UserPoolSmsConfigurationArgs> getSmsConfiguration() {
        return this.smsConfiguration == null ? Output.empty() : this.smsConfiguration;
    }

    /**
     * String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    @Import(name="smsVerificationMessage")
      private final @Nullable Output<String> smsVerificationMessage;

    public Output<String> getSmsVerificationMessage() {
        return this.smsVerificationMessage == null ? Output.empty() : this.smsVerificationMessage;
    }

    /**
     * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    @Import(name="softwareTokenMfaConfiguration")
      private final @Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration;

    public Output<UserPoolSoftwareTokenMfaConfigurationArgs> getSoftwareTokenMfaConfiguration() {
        return this.softwareTokenMfaConfiguration == null ? Output.empty() : this.softwareTokenMfaConfiguration;
    }

    /**
     * Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    @Import(name="userPoolAddOns")
      private final @Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns;

    public Output<UserPoolUserPoolAddOnsArgs> getUserPoolAddOns() {
        return this.userPoolAddOns == null ? Output.empty() : this.userPoolAddOns;
    }

    /**
     * Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    @Import(name="usernameAttributes")
      private final @Nullable Output<List<String>> usernameAttributes;

    public Output<List<String>> getUsernameAttributes() {
        return this.usernameAttributes == null ? Output.empty() : this.usernameAttributes;
    }

    /**
     * Configuration block for username configuration. Detailed below.
     * 
     */
    @Import(name="usernameConfiguration")
      private final @Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration;

    public Output<UserPoolUsernameConfigurationArgs> getUsernameConfiguration() {
        return this.usernameConfiguration == null ? Output.empty() : this.usernameConfiguration;
    }

    /**
     * Configuration block for verification message templates. Detailed below.
     * 
     */
    @Import(name="verificationMessageTemplate")
      private final @Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate;

    public Output<UserPoolVerificationMessageTemplateArgs> getVerificationMessageTemplate() {
        return this.verificationMessageTemplate == null ? Output.empty() : this.verificationMessageTemplate;
    }

    public UserPoolArgs(
        @Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting,
        @Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig,
        @Nullable Output<List<String>> aliasAttributes,
        @Nullable Output<List<String>> autoVerifiedAttributes,
        @Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration,
        @Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration,
        @Nullable Output<String> emailVerificationMessage,
        @Nullable Output<String> emailVerificationSubject,
        @Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig,
        @Nullable Output<String> mfaConfiguration,
        @Nullable Output<String> name,
        @Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy,
        @Nullable Output<List<UserPoolSchemaArgs>> schemas,
        @Nullable Output<String> smsAuthenticationMessage,
        @Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration,
        @Nullable Output<String> smsVerificationMessage,
        @Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns,
        @Nullable Output<List<String>> usernameAttributes,
        @Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration,
        @Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate) {
        this.accountRecoverySetting = accountRecoverySetting;
        this.adminCreateUserConfig = adminCreateUserConfig;
        this.aliasAttributes = aliasAttributes;
        this.autoVerifiedAttributes = autoVerifiedAttributes;
        this.deviceConfiguration = deviceConfiguration;
        this.emailConfiguration = emailConfiguration;
        this.emailVerificationMessage = emailVerificationMessage;
        this.emailVerificationSubject = emailVerificationSubject;
        this.lambdaConfig = lambdaConfig;
        this.mfaConfiguration = mfaConfiguration;
        this.name = name;
        this.passwordPolicy = passwordPolicy;
        this.schemas = schemas;
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        this.smsConfiguration = smsConfiguration;
        this.smsVerificationMessage = smsVerificationMessage;
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
        this.tags = tags;
        this.userPoolAddOns = userPoolAddOns;
        this.usernameAttributes = usernameAttributes;
        this.usernameConfiguration = usernameConfiguration;
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    private UserPoolArgs() {
        this.accountRecoverySetting = Output.empty();
        this.adminCreateUserConfig = Output.empty();
        this.aliasAttributes = Output.empty();
        this.autoVerifiedAttributes = Output.empty();
        this.deviceConfiguration = Output.empty();
        this.emailConfiguration = Output.empty();
        this.emailVerificationMessage = Output.empty();
        this.emailVerificationSubject = Output.empty();
        this.lambdaConfig = Output.empty();
        this.mfaConfiguration = Output.empty();
        this.name = Output.empty();
        this.passwordPolicy = Output.empty();
        this.schemas = Output.empty();
        this.smsAuthenticationMessage = Output.empty();
        this.smsConfiguration = Output.empty();
        this.smsVerificationMessage = Output.empty();
        this.softwareTokenMfaConfiguration = Output.empty();
        this.tags = Output.empty();
        this.userPoolAddOns = Output.empty();
        this.usernameAttributes = Output.empty();
        this.usernameConfiguration = Output.empty();
        this.verificationMessageTemplate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting;
        private @Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig;
        private @Nullable Output<List<String>> aliasAttributes;
        private @Nullable Output<List<String>> autoVerifiedAttributes;
        private @Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration;
        private @Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration;
        private @Nullable Output<String> emailVerificationMessage;
        private @Nullable Output<String> emailVerificationSubject;
        private @Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig;
        private @Nullable Output<String> mfaConfiguration;
        private @Nullable Output<String> name;
        private @Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy;
        private @Nullable Output<List<UserPoolSchemaArgs>> schemas;
        private @Nullable Output<String> smsAuthenticationMessage;
        private @Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration;
        private @Nullable Output<String> smsVerificationMessage;
        private @Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns;
        private @Nullable Output<List<String>> usernameAttributes;
        private @Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration;
        private @Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountRecoverySetting = defaults.accountRecoverySetting;
    	      this.adminCreateUserConfig = defaults.adminCreateUserConfig;
    	      this.aliasAttributes = defaults.aliasAttributes;
    	      this.autoVerifiedAttributes = defaults.autoVerifiedAttributes;
    	      this.deviceConfiguration = defaults.deviceConfiguration;
    	      this.emailConfiguration = defaults.emailConfiguration;
    	      this.emailVerificationMessage = defaults.emailVerificationMessage;
    	      this.emailVerificationSubject = defaults.emailVerificationSubject;
    	      this.lambdaConfig = defaults.lambdaConfig;
    	      this.mfaConfiguration = defaults.mfaConfiguration;
    	      this.name = defaults.name;
    	      this.passwordPolicy = defaults.passwordPolicy;
    	      this.schemas = defaults.schemas;
    	      this.smsAuthenticationMessage = defaults.smsAuthenticationMessage;
    	      this.smsConfiguration = defaults.smsConfiguration;
    	      this.smsVerificationMessage = defaults.smsVerificationMessage;
    	      this.softwareTokenMfaConfiguration = defaults.softwareTokenMfaConfiguration;
    	      this.tags = defaults.tags;
    	      this.userPoolAddOns = defaults.userPoolAddOns;
    	      this.usernameAttributes = defaults.usernameAttributes;
    	      this.usernameConfiguration = defaults.usernameConfiguration;
    	      this.verificationMessageTemplate = defaults.verificationMessageTemplate;
        }

        public Builder accountRecoverySetting(@Nullable Output<UserPoolAccountRecoverySettingArgs> accountRecoverySetting) {
            this.accountRecoverySetting = accountRecoverySetting;
            return this;
        }

        public Builder accountRecoverySetting(@Nullable UserPoolAccountRecoverySettingArgs accountRecoverySetting) {
            this.accountRecoverySetting = Output.ofNullable(accountRecoverySetting);
            return this;
        }

        public Builder adminCreateUserConfig(@Nullable Output<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig) {
            this.adminCreateUserConfig = adminCreateUserConfig;
            return this;
        }

        public Builder adminCreateUserConfig(@Nullable UserPoolAdminCreateUserConfigArgs adminCreateUserConfig) {
            this.adminCreateUserConfig = Output.ofNullable(adminCreateUserConfig);
            return this;
        }

        public Builder aliasAttributes(@Nullable Output<List<String>> aliasAttributes) {
            this.aliasAttributes = aliasAttributes;
            return this;
        }

        public Builder aliasAttributes(@Nullable List<String> aliasAttributes) {
            this.aliasAttributes = Output.ofNullable(aliasAttributes);
            return this;
        }

        public Builder autoVerifiedAttributes(@Nullable Output<List<String>> autoVerifiedAttributes) {
            this.autoVerifiedAttributes = autoVerifiedAttributes;
            return this;
        }

        public Builder autoVerifiedAttributes(@Nullable List<String> autoVerifiedAttributes) {
            this.autoVerifiedAttributes = Output.ofNullable(autoVerifiedAttributes);
            return this;
        }

        public Builder deviceConfiguration(@Nullable Output<UserPoolDeviceConfigurationArgs> deviceConfiguration) {
            this.deviceConfiguration = deviceConfiguration;
            return this;
        }

        public Builder deviceConfiguration(@Nullable UserPoolDeviceConfigurationArgs deviceConfiguration) {
            this.deviceConfiguration = Output.ofNullable(deviceConfiguration);
            return this;
        }

        public Builder emailConfiguration(@Nullable Output<UserPoolEmailConfigurationArgs> emailConfiguration) {
            this.emailConfiguration = emailConfiguration;
            return this;
        }

        public Builder emailConfiguration(@Nullable UserPoolEmailConfigurationArgs emailConfiguration) {
            this.emailConfiguration = Output.ofNullable(emailConfiguration);
            return this;
        }

        public Builder emailVerificationMessage(@Nullable Output<String> emailVerificationMessage) {
            this.emailVerificationMessage = emailVerificationMessage;
            return this;
        }

        public Builder emailVerificationMessage(@Nullable String emailVerificationMessage) {
            this.emailVerificationMessage = Output.ofNullable(emailVerificationMessage);
            return this;
        }

        public Builder emailVerificationSubject(@Nullable Output<String> emailVerificationSubject) {
            this.emailVerificationSubject = emailVerificationSubject;
            return this;
        }

        public Builder emailVerificationSubject(@Nullable String emailVerificationSubject) {
            this.emailVerificationSubject = Output.ofNullable(emailVerificationSubject);
            return this;
        }

        public Builder lambdaConfig(@Nullable Output<UserPoolLambdaConfigArgs> lambdaConfig) {
            this.lambdaConfig = lambdaConfig;
            return this;
        }

        public Builder lambdaConfig(@Nullable UserPoolLambdaConfigArgs lambdaConfig) {
            this.lambdaConfig = Output.ofNullable(lambdaConfig);
            return this;
        }

        public Builder mfaConfiguration(@Nullable Output<String> mfaConfiguration) {
            this.mfaConfiguration = mfaConfiguration;
            return this;
        }

        public Builder mfaConfiguration(@Nullable String mfaConfiguration) {
            this.mfaConfiguration = Output.ofNullable(mfaConfiguration);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder passwordPolicy(@Nullable Output<UserPoolPasswordPolicyArgs> passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        public Builder passwordPolicy(@Nullable UserPoolPasswordPolicyArgs passwordPolicy) {
            this.passwordPolicy = Output.ofNullable(passwordPolicy);
            return this;
        }

        public Builder schemas(@Nullable Output<List<UserPoolSchemaArgs>> schemas) {
            this.schemas = schemas;
            return this;
        }

        public Builder schemas(@Nullable List<UserPoolSchemaArgs> schemas) {
            this.schemas = Output.ofNullable(schemas);
            return this;
        }

        public Builder smsAuthenticationMessage(@Nullable Output<String> smsAuthenticationMessage) {
            this.smsAuthenticationMessage = smsAuthenticationMessage;
            return this;
        }

        public Builder smsAuthenticationMessage(@Nullable String smsAuthenticationMessage) {
            this.smsAuthenticationMessage = Output.ofNullable(smsAuthenticationMessage);
            return this;
        }

        public Builder smsConfiguration(@Nullable Output<UserPoolSmsConfigurationArgs> smsConfiguration) {
            this.smsConfiguration = smsConfiguration;
            return this;
        }

        public Builder smsConfiguration(@Nullable UserPoolSmsConfigurationArgs smsConfiguration) {
            this.smsConfiguration = Output.ofNullable(smsConfiguration);
            return this;
        }

        public Builder smsVerificationMessage(@Nullable Output<String> smsVerificationMessage) {
            this.smsVerificationMessage = smsVerificationMessage;
            return this;
        }

        public Builder smsVerificationMessage(@Nullable String smsVerificationMessage) {
            this.smsVerificationMessage = Output.ofNullable(smsVerificationMessage);
            return this;
        }

        public Builder softwareTokenMfaConfiguration(@Nullable Output<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration) {
            this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
            return this;
        }

        public Builder softwareTokenMfaConfiguration(@Nullable UserPoolSoftwareTokenMfaConfigurationArgs softwareTokenMfaConfiguration) {
            this.softwareTokenMfaConfiguration = Output.ofNullable(softwareTokenMfaConfiguration);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder userPoolAddOns(@Nullable Output<UserPoolUserPoolAddOnsArgs> userPoolAddOns) {
            this.userPoolAddOns = userPoolAddOns;
            return this;
        }

        public Builder userPoolAddOns(@Nullable UserPoolUserPoolAddOnsArgs userPoolAddOns) {
            this.userPoolAddOns = Output.ofNullable(userPoolAddOns);
            return this;
        }

        public Builder usernameAttributes(@Nullable Output<List<String>> usernameAttributes) {
            this.usernameAttributes = usernameAttributes;
            return this;
        }

        public Builder usernameAttributes(@Nullable List<String> usernameAttributes) {
            this.usernameAttributes = Output.ofNullable(usernameAttributes);
            return this;
        }

        public Builder usernameConfiguration(@Nullable Output<UserPoolUsernameConfigurationArgs> usernameConfiguration) {
            this.usernameConfiguration = usernameConfiguration;
            return this;
        }

        public Builder usernameConfiguration(@Nullable UserPoolUsernameConfigurationArgs usernameConfiguration) {
            this.usernameConfiguration = Output.ofNullable(usernameConfiguration);
            return this;
        }

        public Builder verificationMessageTemplate(@Nullable Output<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate) {
            this.verificationMessageTemplate = verificationMessageTemplate;
            return this;
        }

        public Builder verificationMessageTemplate(@Nullable UserPoolVerificationMessageTemplateArgs verificationMessageTemplate) {
            this.verificationMessageTemplate = Output.ofNullable(verificationMessageTemplate);
            return this;
        }
        public UserPoolArgs build() {
            return new UserPoolArgs(accountRecoverySetting, adminCreateUserConfig, aliasAttributes, autoVerifiedAttributes, deviceConfiguration, emailConfiguration, emailVerificationMessage, emailVerificationSubject, lambdaConfig, mfaConfiguration, name, passwordPolicy, schemas, smsAuthenticationMessage, smsConfiguration, smsVerificationMessage, softwareTokenMfaConfiguration, tags, userPoolAddOns, usernameAttributes, usernameConfiguration, verificationMessageTemplate);
        }
    }
}
