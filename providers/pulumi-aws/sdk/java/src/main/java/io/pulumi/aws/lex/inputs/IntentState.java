// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentConclusionStatementGetArgs;
import io.pulumi.aws.lex.inputs.IntentConfirmationPromptGetArgs;
import io.pulumi.aws.lex.inputs.IntentDialogCodeHookGetArgs;
import io.pulumi.aws.lex.inputs.IntentFollowUpPromptGetArgs;
import io.pulumi.aws.lex.inputs.IntentFulfillmentActivityGetArgs;
import io.pulumi.aws.lex.inputs.IntentRejectionStatementGetArgs;
import io.pulumi.aws.lex.inputs.IntentSlotGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentState extends io.pulumi.resources.ResourceArgs {

    public static final IntentState Empty = new IntentState();

    /**
     * The ARN of the Lex intent.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Checksum identifying the version of the intent that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the intent.
     * 
     */
    @InputImport(name="checksum")
    private final @Nullable Input<String> checksum;

    public Input<String> getChecksum() {
        return this.checksum == null ? Input.empty() : this.checksum;
    }

    /**
     * The statement that you want Amazon Lex to convey to the user
     * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
     * application, you can't specify this element. The `follow_up_prompt` and `conclusion_statement` are
     * mutually exclusive. You can specify only one. Attributes are documented under statement.
     * 
     */
    @InputImport(name="conclusionStatement")
    private final @Nullable Input<IntentConclusionStatementGetArgs> conclusionStatement;

    public Input<IntentConclusionStatementGetArgs> getConclusionStatement() {
        return this.conclusionStatement == null ? Input.empty() : this.conclusionStatement;
    }

    /**
     * Prompts the user to confirm the intent. This question should
     * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
     * or neither. Attributes are documented under prompt.
     * 
     */
    @InputImport(name="confirmationPrompt")
    private final @Nullable Input<IntentConfirmationPromptGetArgs> confirmationPrompt;

    public Input<IntentConfirmationPromptGetArgs> getConfirmationPrompt() {
        return this.confirmationPrompt == null ? Input.empty() : this.confirmationPrompt;
    }

    /**
     * Determines if a new slot type version is created when the initial
     * resource is created and on each update. Defaults to `false`.
     * 
     */
    @InputImport(name="createVersion")
    private final @Nullable Input<Boolean> createVersion;

    public Input<Boolean> getCreateVersion() {
        return this.createVersion == null ? Input.empty() : this.createVersion;
    }

    /**
     * The date when the intent version was created.
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
     * Specifies a Lambda function to invoke for each user input. You can
     * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * 
     */
    @InputImport(name="dialogCodeHook")
    private final @Nullable Input<IntentDialogCodeHookGetArgs> dialogCodeHook;

    public Input<IntentDialogCodeHookGetArgs> getDialogCodeHook() {
        return this.dialogCodeHook == null ? Input.empty() : this.dialogCodeHook;
    }

    /**
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
     * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * 
     */
    @InputImport(name="followUpPrompt")
    private final @Nullable Input<IntentFollowUpPromptGetArgs> followUpPrompt;

    public Input<IntentFollowUpPromptGetArgs> getFollowUpPrompt() {
        return this.followUpPrompt == null ? Input.empty() : this.followUpPrompt;
    }

    /**
     * Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
     * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * 
     */
    @InputImport(name="fulfillmentActivity")
    private final @Nullable Input<IntentFulfillmentActivityGetArgs> fulfillmentActivity;

    public Input<IntentFulfillmentActivityGetArgs> getFulfillmentActivity() {
        return this.fulfillmentActivity == null ? Input.empty() : this.fulfillmentActivity;
    }

    /**
     * The date when the $LATEST version of this intent was updated.
     * 
     */
    @InputImport(name="lastUpdatedDate")
    private final @Nullable Input<String> lastUpdatedDate;

    public Input<String> getLastUpdatedDate() {
        return this.lastUpdatedDate == null ? Input.empty() : this.lastUpdatedDate;
    }

    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A unique identifier for the built-in intent to base this
     * intent on. To find the signature for an intent, see
     * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
     * in the Alexa Skills Kit.
     * 
     */
    @InputImport(name="parentIntentSignature")
    private final @Nullable Input<String> parentIntentSignature;

    public Input<String> getParentIntentSignature() {
        return this.parentIntentSignature == null ? Input.empty() : this.parentIntentSignature;
    }

    /**
     * If the user answers "no" to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    @InputImport(name="rejectionStatement")
    private final @Nullable Input<IntentRejectionStatementGetArgs> rejectionStatement;

    public Input<IntentRejectionStatementGetArgs> getRejectionStatement() {
        return this.rejectionStatement == null ? Input.empty() : this.rejectionStatement;
    }

    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    @InputImport(name="sampleUtterances")
    private final @Nullable Input<List<String>> sampleUtterances;

    public Input<List<String>> getSampleUtterances() {
        return this.sampleUtterances == null ? Input.empty() : this.sampleUtterances;
    }

    /**
     * An list of intent slots. At runtime, Amazon Lex elicits required slot values
     * from the user using prompts defined in the slots. Attributes are documented under slot.
     * 
     */
    @InputImport(name="slots")
    private final @Nullable Input<List<IntentSlotGetArgs>> slots;

    public Input<List<IntentSlotGetArgs>> getSlots() {
        return this.slots == null ? Input.empty() : this.slots;
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

    public IntentState(
        @Nullable Input<String> arn,
        @Nullable Input<String> checksum,
        @Nullable Input<IntentConclusionStatementGetArgs> conclusionStatement,
        @Nullable Input<IntentConfirmationPromptGetArgs> confirmationPrompt,
        @Nullable Input<Boolean> createVersion,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> description,
        @Nullable Input<IntentDialogCodeHookGetArgs> dialogCodeHook,
        @Nullable Input<IntentFollowUpPromptGetArgs> followUpPrompt,
        @Nullable Input<IntentFulfillmentActivityGetArgs> fulfillmentActivity,
        @Nullable Input<String> lastUpdatedDate,
        @Nullable Input<String> name,
        @Nullable Input<String> parentIntentSignature,
        @Nullable Input<IntentRejectionStatementGetArgs> rejectionStatement,
        @Nullable Input<List<String>> sampleUtterances,
        @Nullable Input<List<IntentSlotGetArgs>> slots,
        @Nullable Input<String> version) {
        this.arn = arn;
        this.checksum = checksum;
        this.conclusionStatement = conclusionStatement;
        this.confirmationPrompt = confirmationPrompt;
        this.createVersion = createVersion;
        this.createdDate = createdDate;
        this.description = description;
        this.dialogCodeHook = dialogCodeHook;
        this.followUpPrompt = followUpPrompt;
        this.fulfillmentActivity = fulfillmentActivity;
        this.lastUpdatedDate = lastUpdatedDate;
        this.name = name;
        this.parentIntentSignature = parentIntentSignature;
        this.rejectionStatement = rejectionStatement;
        this.sampleUtterances = sampleUtterances;
        this.slots = slots;
        this.version = version;
    }

    private IntentState() {
        this.arn = Input.empty();
        this.checksum = Input.empty();
        this.conclusionStatement = Input.empty();
        this.confirmationPrompt = Input.empty();
        this.createVersion = Input.empty();
        this.createdDate = Input.empty();
        this.description = Input.empty();
        this.dialogCodeHook = Input.empty();
        this.followUpPrompt = Input.empty();
        this.fulfillmentActivity = Input.empty();
        this.lastUpdatedDate = Input.empty();
        this.name = Input.empty();
        this.parentIntentSignature = Input.empty();
        this.rejectionStatement = Input.empty();
        this.sampleUtterances = Input.empty();
        this.slots = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> checksum;
        private @Nullable Input<IntentConclusionStatementGetArgs> conclusionStatement;
        private @Nullable Input<IntentConfirmationPromptGetArgs> confirmationPrompt;
        private @Nullable Input<Boolean> createVersion;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> description;
        private @Nullable Input<IntentDialogCodeHookGetArgs> dialogCodeHook;
        private @Nullable Input<IntentFollowUpPromptGetArgs> followUpPrompt;
        private @Nullable Input<IntentFulfillmentActivityGetArgs> fulfillmentActivity;
        private @Nullable Input<String> lastUpdatedDate;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentIntentSignature;
        private @Nullable Input<IntentRejectionStatementGetArgs> rejectionStatement;
        private @Nullable Input<List<String>> sampleUtterances;
        private @Nullable Input<List<IntentSlotGetArgs>> slots;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.checksum = defaults.checksum;
    	      this.conclusionStatement = defaults.conclusionStatement;
    	      this.confirmationPrompt = defaults.confirmationPrompt;
    	      this.createVersion = defaults.createVersion;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.dialogCodeHook = defaults.dialogCodeHook;
    	      this.followUpPrompt = defaults.followUpPrompt;
    	      this.fulfillmentActivity = defaults.fulfillmentActivity;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.name = defaults.name;
    	      this.parentIntentSignature = defaults.parentIntentSignature;
    	      this.rejectionStatement = defaults.rejectionStatement;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slots = defaults.slots;
    	      this.version = defaults.version;
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

        public Builder setConclusionStatement(@Nullable Input<IntentConclusionStatementGetArgs> conclusionStatement) {
            this.conclusionStatement = conclusionStatement;
            return this;
        }

        public Builder setConclusionStatement(@Nullable IntentConclusionStatementGetArgs conclusionStatement) {
            this.conclusionStatement = Input.ofNullable(conclusionStatement);
            return this;
        }

        public Builder setConfirmationPrompt(@Nullable Input<IntentConfirmationPromptGetArgs> confirmationPrompt) {
            this.confirmationPrompt = confirmationPrompt;
            return this;
        }

        public Builder setConfirmationPrompt(@Nullable IntentConfirmationPromptGetArgs confirmationPrompt) {
            this.confirmationPrompt = Input.ofNullable(confirmationPrompt);
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

        public Builder setDialogCodeHook(@Nullable Input<IntentDialogCodeHookGetArgs> dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder setDialogCodeHook(@Nullable IntentDialogCodeHookGetArgs dialogCodeHook) {
            this.dialogCodeHook = Input.ofNullable(dialogCodeHook);
            return this;
        }

        public Builder setFollowUpPrompt(@Nullable Input<IntentFollowUpPromptGetArgs> followUpPrompt) {
            this.followUpPrompt = followUpPrompt;
            return this;
        }

        public Builder setFollowUpPrompt(@Nullable IntentFollowUpPromptGetArgs followUpPrompt) {
            this.followUpPrompt = Input.ofNullable(followUpPrompt);
            return this;
        }

        public Builder setFulfillmentActivity(@Nullable Input<IntentFulfillmentActivityGetArgs> fulfillmentActivity) {
            this.fulfillmentActivity = fulfillmentActivity;
            return this;
        }

        public Builder setFulfillmentActivity(@Nullable IntentFulfillmentActivityGetArgs fulfillmentActivity) {
            this.fulfillmentActivity = Input.ofNullable(fulfillmentActivity);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParentIntentSignature(@Nullable Input<String> parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder setParentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = Input.ofNullable(parentIntentSignature);
            return this;
        }

        public Builder setRejectionStatement(@Nullable Input<IntentRejectionStatementGetArgs> rejectionStatement) {
            this.rejectionStatement = rejectionStatement;
            return this;
        }

        public Builder setRejectionStatement(@Nullable IntentRejectionStatementGetArgs rejectionStatement) {
            this.rejectionStatement = Input.ofNullable(rejectionStatement);
            return this;
        }

        public Builder setSampleUtterances(@Nullable Input<List<String>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder setSampleUtterances(@Nullable List<String> sampleUtterances) {
            this.sampleUtterances = Input.ofNullable(sampleUtterances);
            return this;
        }

        public Builder setSlots(@Nullable Input<List<IntentSlotGetArgs>> slots) {
            this.slots = slots;
            return this;
        }

        public Builder setSlots(@Nullable List<IntentSlotGetArgs> slots) {
            this.slots = Input.ofNullable(slots);
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
        public IntentState build() {
            return new IntentState(arn, checksum, conclusionStatement, confirmationPrompt, createVersion, createdDate, description, dialogCodeHook, followUpPrompt, fulfillmentActivity, lastUpdatedDate, name, parentIntentSignature, rejectionStatement, sampleUtterances, slots, version);
        }
    }
}
