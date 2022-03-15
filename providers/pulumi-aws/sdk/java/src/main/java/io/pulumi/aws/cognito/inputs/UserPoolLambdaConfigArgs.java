// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomEmailSenderArgs;
import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomSmsSenderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolLambdaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigArgs Empty = new UserPoolLambdaConfigArgs();

    /**
     * ARN of the lambda creating an authentication challenge.
     * 
     */
    @Import(name="createAuthChallenge")
      private final @Nullable Output<String> createAuthChallenge;

    public Output<String> getCreateAuthChallenge() {
        return this.createAuthChallenge == null ? Output.empty() : this.createAuthChallenge;
    }

    /**
     * A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
     */
    @Import(name="customEmailSender")
      private final @Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender;

    public Output<UserPoolLambdaConfigCustomEmailSenderArgs> getCustomEmailSender() {
        return this.customEmailSender == null ? Output.empty() : this.customEmailSender;
    }

    /**
     * Custom Message AWS Lambda trigger.
     * 
     */
    @Import(name="customMessage")
      private final @Nullable Output<String> customMessage;

    public Output<String> getCustomMessage() {
        return this.customMessage == null ? Output.empty() : this.customMessage;
    }

    /**
     * A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
     */
    @Import(name="customSmsSender")
      private final @Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender;

    public Output<UserPoolLambdaConfigCustomSmsSenderArgs> getCustomSmsSender() {
        return this.customSmsSender == null ? Output.empty() : this.customSmsSender;
    }

    /**
     * Defines the authentication challenge.
     * 
     */
    @Import(name="defineAuthChallenge")
      private final @Nullable Output<String> defineAuthChallenge;

    public Output<String> getDefineAuthChallenge() {
        return this.defineAuthChallenge == null ? Output.empty() : this.defineAuthChallenge;
    }

    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Post-authentication AWS Lambda trigger.
     * 
     */
    @Import(name="postAuthentication")
      private final @Nullable Output<String> postAuthentication;

    public Output<String> getPostAuthentication() {
        return this.postAuthentication == null ? Output.empty() : this.postAuthentication;
    }

    /**
     * Post-confirmation AWS Lambda trigger.
     * 
     */
    @Import(name="postConfirmation")
      private final @Nullable Output<String> postConfirmation;

    public Output<String> getPostConfirmation() {
        return this.postConfirmation == null ? Output.empty() : this.postConfirmation;
    }

    /**
     * Pre-authentication AWS Lambda trigger.
     * 
     */
    @Import(name="preAuthentication")
      private final @Nullable Output<String> preAuthentication;

    public Output<String> getPreAuthentication() {
        return this.preAuthentication == null ? Output.empty() : this.preAuthentication;
    }

    /**
     * Pre-registration AWS Lambda trigger.
     * 
     */
    @Import(name="preSignUp")
      private final @Nullable Output<String> preSignUp;

    public Output<String> getPreSignUp() {
        return this.preSignUp == null ? Output.empty() : this.preSignUp;
    }

    /**
     * Allow to customize identity token claims before token generation.
     * 
     */
    @Import(name="preTokenGeneration")
      private final @Nullable Output<String> preTokenGeneration;

    public Output<String> getPreTokenGeneration() {
        return this.preTokenGeneration == null ? Output.empty() : this.preTokenGeneration;
    }

    /**
     * User migration Lambda config type.
     * 
     */
    @Import(name="userMigration")
      private final @Nullable Output<String> userMigration;

    public Output<String> getUserMigration() {
        return this.userMigration == null ? Output.empty() : this.userMigration;
    }

    /**
     * Verifies the authentication challenge response.
     * 
     */
    @Import(name="verifyAuthChallengeResponse")
      private final @Nullable Output<String> verifyAuthChallengeResponse;

    public Output<String> getVerifyAuthChallengeResponse() {
        return this.verifyAuthChallengeResponse == null ? Output.empty() : this.verifyAuthChallengeResponse;
    }

    public UserPoolLambdaConfigArgs(
        @Nullable Output<String> createAuthChallenge,
        @Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender,
        @Nullable Output<String> customMessage,
        @Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender,
        @Nullable Output<String> defineAuthChallenge,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> postAuthentication,
        @Nullable Output<String> postConfirmation,
        @Nullable Output<String> preAuthentication,
        @Nullable Output<String> preSignUp,
        @Nullable Output<String> preTokenGeneration,
        @Nullable Output<String> userMigration,
        @Nullable Output<String> verifyAuthChallengeResponse) {
        this.createAuthChallenge = createAuthChallenge;
        this.customEmailSender = customEmailSender;
        this.customMessage = customMessage;
        this.customSmsSender = customSmsSender;
        this.defineAuthChallenge = defineAuthChallenge;
        this.kmsKeyId = kmsKeyId;
        this.postAuthentication = postAuthentication;
        this.postConfirmation = postConfirmation;
        this.preAuthentication = preAuthentication;
        this.preSignUp = preSignUp;
        this.preTokenGeneration = preTokenGeneration;
        this.userMigration = userMigration;
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    private UserPoolLambdaConfigArgs() {
        this.createAuthChallenge = Output.empty();
        this.customEmailSender = Output.empty();
        this.customMessage = Output.empty();
        this.customSmsSender = Output.empty();
        this.defineAuthChallenge = Output.empty();
        this.kmsKeyId = Output.empty();
        this.postAuthentication = Output.empty();
        this.postConfirmation = Output.empty();
        this.preAuthentication = Output.empty();
        this.preSignUp = Output.empty();
        this.preTokenGeneration = Output.empty();
        this.userMigration = Output.empty();
        this.verifyAuthChallengeResponse = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createAuthChallenge;
        private @Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender;
        private @Nullable Output<String> customMessage;
        private @Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender;
        private @Nullable Output<String> defineAuthChallenge;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> postAuthentication;
        private @Nullable Output<String> postConfirmation;
        private @Nullable Output<String> preAuthentication;
        private @Nullable Output<String> preSignUp;
        private @Nullable Output<String> preTokenGeneration;
        private @Nullable Output<String> userMigration;
        private @Nullable Output<String> verifyAuthChallengeResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createAuthChallenge = defaults.createAuthChallenge;
    	      this.customEmailSender = defaults.customEmailSender;
    	      this.customMessage = defaults.customMessage;
    	      this.customSmsSender = defaults.customSmsSender;
    	      this.defineAuthChallenge = defaults.defineAuthChallenge;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.postAuthentication = defaults.postAuthentication;
    	      this.postConfirmation = defaults.postConfirmation;
    	      this.preAuthentication = defaults.preAuthentication;
    	      this.preSignUp = defaults.preSignUp;
    	      this.preTokenGeneration = defaults.preTokenGeneration;
    	      this.userMigration = defaults.userMigration;
    	      this.verifyAuthChallengeResponse = defaults.verifyAuthChallengeResponse;
        }

        public Builder createAuthChallenge(@Nullable Output<String> createAuthChallenge) {
            this.createAuthChallenge = createAuthChallenge;
            return this;
        }

        public Builder createAuthChallenge(@Nullable String createAuthChallenge) {
            this.createAuthChallenge = Output.ofNullable(createAuthChallenge);
            return this;
        }

        public Builder customEmailSender(@Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender) {
            this.customEmailSender = customEmailSender;
            return this;
        }

        public Builder customEmailSender(@Nullable UserPoolLambdaConfigCustomEmailSenderArgs customEmailSender) {
            this.customEmailSender = Output.ofNullable(customEmailSender);
            return this;
        }

        public Builder customMessage(@Nullable Output<String> customMessage) {
            this.customMessage = customMessage;
            return this;
        }

        public Builder customMessage(@Nullable String customMessage) {
            this.customMessage = Output.ofNullable(customMessage);
            return this;
        }

        public Builder customSmsSender(@Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender) {
            this.customSmsSender = customSmsSender;
            return this;
        }

        public Builder customSmsSender(@Nullable UserPoolLambdaConfigCustomSmsSenderArgs customSmsSender) {
            this.customSmsSender = Output.ofNullable(customSmsSender);
            return this;
        }

        public Builder defineAuthChallenge(@Nullable Output<String> defineAuthChallenge) {
            this.defineAuthChallenge = defineAuthChallenge;
            return this;
        }

        public Builder defineAuthChallenge(@Nullable String defineAuthChallenge) {
            this.defineAuthChallenge = Output.ofNullable(defineAuthChallenge);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder postAuthentication(@Nullable Output<String> postAuthentication) {
            this.postAuthentication = postAuthentication;
            return this;
        }

        public Builder postAuthentication(@Nullable String postAuthentication) {
            this.postAuthentication = Output.ofNullable(postAuthentication);
            return this;
        }

        public Builder postConfirmation(@Nullable Output<String> postConfirmation) {
            this.postConfirmation = postConfirmation;
            return this;
        }

        public Builder postConfirmation(@Nullable String postConfirmation) {
            this.postConfirmation = Output.ofNullable(postConfirmation);
            return this;
        }

        public Builder preAuthentication(@Nullable Output<String> preAuthentication) {
            this.preAuthentication = preAuthentication;
            return this;
        }

        public Builder preAuthentication(@Nullable String preAuthentication) {
            this.preAuthentication = Output.ofNullable(preAuthentication);
            return this;
        }

        public Builder preSignUp(@Nullable Output<String> preSignUp) {
            this.preSignUp = preSignUp;
            return this;
        }

        public Builder preSignUp(@Nullable String preSignUp) {
            this.preSignUp = Output.ofNullable(preSignUp);
            return this;
        }

        public Builder preTokenGeneration(@Nullable Output<String> preTokenGeneration) {
            this.preTokenGeneration = preTokenGeneration;
            return this;
        }

        public Builder preTokenGeneration(@Nullable String preTokenGeneration) {
            this.preTokenGeneration = Output.ofNullable(preTokenGeneration);
            return this;
        }

        public Builder userMigration(@Nullable Output<String> userMigration) {
            this.userMigration = userMigration;
            return this;
        }

        public Builder userMigration(@Nullable String userMigration) {
            this.userMigration = Output.ofNullable(userMigration);
            return this;
        }

        public Builder verifyAuthChallengeResponse(@Nullable Output<String> verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }

        public Builder verifyAuthChallengeResponse(@Nullable String verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = Output.ofNullable(verifyAuthChallengeResponse);
            return this;
        }
        public UserPoolLambdaConfigArgs build() {
            return new UserPoolLambdaConfigArgs(createAuthChallenge, customEmailSender, customMessage, customSmsSender, defineAuthChallenge, kmsKeyId, postAuthentication, postConfirmation, preAuthentication, preSignUp, preTokenGeneration, userMigration, verifyAuthChallengeResponse);
        }
    }
}
