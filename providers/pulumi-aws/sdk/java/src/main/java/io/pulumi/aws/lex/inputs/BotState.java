// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.BotAbortStatementGetArgs;
import io.pulumi.aws.lex.inputs.BotClarificationPromptGetArgs;
import io.pulumi.aws.lex.inputs.BotIntentGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotState extends io.pulumi.resources.ResourceArgs {

    public static final BotState Empty = new BotState();

    /**
     * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    @InputImport(name="abortStatement")
    private final @Nullable Input<BotAbortStatementGetArgs> abortStatement;

    public Input<BotAbortStatementGetArgs> getAbortStatement() {
        return this.abortStatement == null ? Input.empty() : this.abortStatement;
    }

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Checksum identifying the version of the bot that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the bot.
     * 
     */
    @InputImport(name="checksum")
    private final @Nullable Input<String> checksum;

    public Input<String> getChecksum() {
        return this.checksum == null ? Input.empty() : this.checksum;
    }

    /**
     * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    @InputImport(name="childDirected")
    private final @Nullable Input<Boolean> childDirected;

    public Input<Boolean> getChildDirected() {
        return this.childDirected == null ? Input.empty() : this.childDirected;
    }

    /**
     * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
     * 
     */
    @InputImport(name="clarificationPrompt")
    private final @Nullable Input<BotClarificationPromptGetArgs> clarificationPrompt;

    public Input<BotClarificationPromptGetArgs> getClarificationPrompt() {
        return this.clarificationPrompt == null ? Input.empty() : this.clarificationPrompt;
    }

    /**
     * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    @InputImport(name="createVersion")
    private final @Nullable Input<Boolean> createVersion;

    public Input<Boolean> getCreateVersion() {
        return this.createVersion == null ? Input.empty() : this.createVersion;
    }

    /**
     * The date when the bot version was created.
     * 
     */
    @InputImport(name="createdDate")
    private final @Nullable Input<String> createdDate;

    public Input<String> getCreatedDate() {
        return this.createdDate == null ? Input.empty() : this.createdDate;
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
     * 
     */
    @InputImport(name="detectSentiment")
    private final @Nullable Input<Boolean> detectSentiment;

    public Input<Boolean> getDetectSentiment() {
        return this.detectSentiment == null ? Input.empty() : this.detectSentiment;
    }

    /**
     * Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    @InputImport(name="enableModelImprovements")
    private final @Nullable Input<Boolean> enableModelImprovements;

    public Input<Boolean> getEnableModelImprovements() {
        return this.enableModelImprovements == null ? Input.empty() : this.enableModelImprovements;
    }

    /**
     * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
     * 
     */
    @InputImport(name="failureReason")
    private final @Nullable Input<String> failureReason;

    public Input<String> getFailureReason() {
        return this.failureReason == null ? Input.empty() : this.failureReason;
    }

    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    @InputImport(name="idleSessionTtlInSeconds")
    private final @Nullable Input<Integer> idleSessionTtlInSeconds;

    public Input<Integer> getIdleSessionTtlInSeconds() {
        return this.idleSessionTtlInSeconds == null ? Input.empty() : this.idleSessionTtlInSeconds;
    }

    /**
     * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
     * 
     */
    @InputImport(name="intents")
    private final @Nullable Input<List<BotIntentGetArgs>> intents;

    public Input<List<BotIntentGetArgs>> getIntents() {
        return this.intents == null ? Input.empty() : this.intents;
    }

    /**
     * The date when the $LATEST version of this bot was updated.
     * 
     */
    @InputImport(name="lastUpdatedDate")
    private final @Nullable Input<String> lastUpdatedDate;

    public Input<String> getLastUpdatedDate() {
        return this.lastUpdatedDate == null ? Input.empty() : this.lastUpdatedDate;
    }

    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    @InputImport(name="locale")
    private final @Nullable Input<String> locale;

    public Input<String> getLocale() {
        return this.locale == null ? Input.empty() : this.locale;
    }

    /**
     * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    @InputImport(name="nluIntentConfidenceThreshold")
    private final @Nullable Input<Double> nluIntentConfidenceThreshold;

    public Input<Double> getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold == null ? Input.empty() : this.nluIntentConfidenceThreshold;
    }

    /**
     * If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
     * 
     */
    @InputImport(name="processBehavior")
    private final @Nullable Input<String> processBehavior;

    public Input<String> getProcessBehavior() {
        return this.processBehavior == null ? Input.empty() : this.processBehavior;
    }

    /**
     * When you send a request to create or update a bot, Amazon Lex sets the status response
     * element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't
     * build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the
     * failure_reason response element.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The version of the bot.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    @InputImport(name="voiceId")
    private final @Nullable Input<String> voiceId;

    public Input<String> getVoiceId() {
        return this.voiceId == null ? Input.empty() : this.voiceId;
    }

    public BotState(
        @Nullable Input<BotAbortStatementGetArgs> abortStatement,
        @Nullable Input<String> arn,
        @Nullable Input<String> checksum,
        @Nullable Input<Boolean> childDirected,
        @Nullable Input<BotClarificationPromptGetArgs> clarificationPrompt,
        @Nullable Input<Boolean> createVersion,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> detectSentiment,
        @Nullable Input<Boolean> enableModelImprovements,
        @Nullable Input<String> failureReason,
        @Nullable Input<Integer> idleSessionTtlInSeconds,
        @Nullable Input<List<BotIntentGetArgs>> intents,
        @Nullable Input<String> lastUpdatedDate,
        @Nullable Input<String> locale,
        @Nullable Input<String> name,
        @Nullable Input<Double> nluIntentConfidenceThreshold,
        @Nullable Input<String> processBehavior,
        @Nullable Input<String> status,
        @Nullable Input<String> version,
        @Nullable Input<String> voiceId) {
        this.abortStatement = abortStatement;
        this.arn = arn;
        this.checksum = checksum;
        this.childDirected = childDirected;
        this.clarificationPrompt = clarificationPrompt;
        this.createVersion = createVersion;
        this.createdDate = createdDate;
        this.description = description;
        this.detectSentiment = detectSentiment;
        this.enableModelImprovements = enableModelImprovements;
        this.failureReason = failureReason;
        this.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
        this.intents = intents;
        this.lastUpdatedDate = lastUpdatedDate;
        this.locale = locale;
        this.name = name;
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
        this.processBehavior = processBehavior;
        this.status = status;
        this.version = version;
        this.voiceId = voiceId;
    }

    private BotState() {
        this.abortStatement = Input.empty();
        this.arn = Input.empty();
        this.checksum = Input.empty();
        this.childDirected = Input.empty();
        this.clarificationPrompt = Input.empty();
        this.createVersion = Input.empty();
        this.createdDate = Input.empty();
        this.description = Input.empty();
        this.detectSentiment = Input.empty();
        this.enableModelImprovements = Input.empty();
        this.failureReason = Input.empty();
        this.idleSessionTtlInSeconds = Input.empty();
        this.intents = Input.empty();
        this.lastUpdatedDate = Input.empty();
        this.locale = Input.empty();
        this.name = Input.empty();
        this.nluIntentConfidenceThreshold = Input.empty();
        this.processBehavior = Input.empty();
        this.status = Input.empty();
        this.version = Input.empty();
        this.voiceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotAbortStatementGetArgs> abortStatement;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> checksum;
        private @Nullable Input<Boolean> childDirected;
        private @Nullable Input<BotClarificationPromptGetArgs> clarificationPrompt;
        private @Nullable Input<Boolean> createVersion;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> detectSentiment;
        private @Nullable Input<Boolean> enableModelImprovements;
        private @Nullable Input<String> failureReason;
        private @Nullable Input<Integer> idleSessionTtlInSeconds;
        private @Nullable Input<List<BotIntentGetArgs>> intents;
        private @Nullable Input<String> lastUpdatedDate;
        private @Nullable Input<String> locale;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> nluIntentConfidenceThreshold;
        private @Nullable Input<String> processBehavior;
        private @Nullable Input<String> status;
        private @Nullable Input<String> version;
        private @Nullable Input<String> voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortStatement = defaults.abortStatement;
    	      this.arn = defaults.arn;
    	      this.checksum = defaults.checksum;
    	      this.childDirected = defaults.childDirected;
    	      this.clarificationPrompt = defaults.clarificationPrompt;
    	      this.createVersion = defaults.createVersion;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.detectSentiment = defaults.detectSentiment;
    	      this.enableModelImprovements = defaults.enableModelImprovements;
    	      this.failureReason = defaults.failureReason;
    	      this.idleSessionTtlInSeconds = defaults.idleSessionTtlInSeconds;
    	      this.intents = defaults.intents;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.locale = defaults.locale;
    	      this.name = defaults.name;
    	      this.nluIntentConfidenceThreshold = defaults.nluIntentConfidenceThreshold;
    	      this.processBehavior = defaults.processBehavior;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
    	      this.voiceId = defaults.voiceId;
        }

        public Builder setAbortStatement(@Nullable Input<BotAbortStatementGetArgs> abortStatement) {
            this.abortStatement = abortStatement;
            return this;
        }

        public Builder setAbortStatement(@Nullable BotAbortStatementGetArgs abortStatement) {
            this.abortStatement = Input.ofNullable(abortStatement);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setChecksum(@Nullable Input<String> checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder setChecksum(@Nullable String checksum) {
            this.checksum = Input.ofNullable(checksum);
            return this;
        }

        public Builder setChildDirected(@Nullable Input<Boolean> childDirected) {
            this.childDirected = childDirected;
            return this;
        }

        public Builder setChildDirected(@Nullable Boolean childDirected) {
            this.childDirected = Input.ofNullable(childDirected);
            return this;
        }

        public Builder setClarificationPrompt(@Nullable Input<BotClarificationPromptGetArgs> clarificationPrompt) {
            this.clarificationPrompt = clarificationPrompt;
            return this;
        }

        public Builder setClarificationPrompt(@Nullable BotClarificationPromptGetArgs clarificationPrompt) {
            this.clarificationPrompt = Input.ofNullable(clarificationPrompt);
            return this;
        }

        public Builder setCreateVersion(@Nullable Input<Boolean> createVersion) {
            this.createVersion = createVersion;
            return this;
        }

        public Builder setCreateVersion(@Nullable Boolean createVersion) {
            this.createVersion = Input.ofNullable(createVersion);
            return this;
        }

        public Builder setCreatedDate(@Nullable Input<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = Input.ofNullable(createdDate);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDetectSentiment(@Nullable Input<Boolean> detectSentiment) {
            this.detectSentiment = detectSentiment;
            return this;
        }

        public Builder setDetectSentiment(@Nullable Boolean detectSentiment) {
            this.detectSentiment = Input.ofNullable(detectSentiment);
            return this;
        }

        public Builder setEnableModelImprovements(@Nullable Input<Boolean> enableModelImprovements) {
            this.enableModelImprovements = enableModelImprovements;
            return this;
        }

        public Builder setEnableModelImprovements(@Nullable Boolean enableModelImprovements) {
            this.enableModelImprovements = Input.ofNullable(enableModelImprovements);
            return this;
        }

        public Builder setFailureReason(@Nullable Input<String> failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder setFailureReason(@Nullable String failureReason) {
            this.failureReason = Input.ofNullable(failureReason);
            return this;
        }

        public Builder setIdleSessionTtlInSeconds(@Nullable Input<Integer> idleSessionTtlInSeconds) {
            this.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
            return this;
        }

        public Builder setIdleSessionTtlInSeconds(@Nullable Integer idleSessionTtlInSeconds) {
            this.idleSessionTtlInSeconds = Input.ofNullable(idleSessionTtlInSeconds);
            return this;
        }

        public Builder setIntents(@Nullable Input<List<BotIntentGetArgs>> intents) {
            this.intents = intents;
            return this;
        }

        public Builder setIntents(@Nullable List<BotIntentGetArgs> intents) {
            this.intents = Input.ofNullable(intents);
            return this;
        }

        public Builder setLastUpdatedDate(@Nullable Input<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public Builder setLastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Input.ofNullable(lastUpdatedDate);
            return this;
        }

        public Builder setLocale(@Nullable Input<String> locale) {
            this.locale = locale;
            return this;
        }

        public Builder setLocale(@Nullable String locale) {
            this.locale = Input.ofNullable(locale);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNluIntentConfidenceThreshold(@Nullable Input<Double> nluIntentConfidenceThreshold) {
            this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
            return this;
        }

        public Builder setNluIntentConfidenceThreshold(@Nullable Double nluIntentConfidenceThreshold) {
            this.nluIntentConfidenceThreshold = Input.ofNullable(nluIntentConfidenceThreshold);
            return this;
        }

        public Builder setProcessBehavior(@Nullable Input<String> processBehavior) {
            this.processBehavior = processBehavior;
            return this;
        }

        public Builder setProcessBehavior(@Nullable String processBehavior) {
            this.processBehavior = Input.ofNullable(processBehavior);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVoiceId(@Nullable Input<String> voiceId) {
            this.voiceId = voiceId;
            return this;
        }

        public Builder setVoiceId(@Nullable String voiceId) {
            this.voiceId = Input.ofNullable(voiceId);
            return this;
        }
        public BotState build() {
            return new BotState(abortStatement, arn, checksum, childDirected, clarificationPrompt, createVersion, createdDate, description, detectSentiment, enableModelImprovements, failureReason, idleSessionTtlInSeconds, intents, lastUpdatedDate, locale, name, nluIntentConfidenceThreshold, processBehavior, status, version, voiceId);
        }
    }
}
