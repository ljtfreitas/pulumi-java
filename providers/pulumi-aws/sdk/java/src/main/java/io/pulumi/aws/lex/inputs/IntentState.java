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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Checksum identifying the version of the intent that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the intent.
     * 
     */
    @Import(name="checksum")
      private final @Nullable Output<String> checksum;

    public Output<String> getChecksum() {
        return this.checksum == null ? Output.empty() : this.checksum;
    }

    /**
     * The statement that you want Amazon Lex to convey to the user
     * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
     * application, you can't specify this element. The `follow_up_prompt` and `conclusion_statement` are
     * mutually exclusive. You can specify only one. Attributes are documented under statement.
     * 
     */
    @Import(name="conclusionStatement")
      private final @Nullable Output<IntentConclusionStatementGetArgs> conclusionStatement;

    public Output<IntentConclusionStatementGetArgs> getConclusionStatement() {
        return this.conclusionStatement == null ? Output.empty() : this.conclusionStatement;
    }

    /**
     * Prompts the user to confirm the intent. This question should
     * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
     * or neither. Attributes are documented under prompt.
     * 
     */
    @Import(name="confirmationPrompt")
      private final @Nullable Output<IntentConfirmationPromptGetArgs> confirmationPrompt;

    public Output<IntentConfirmationPromptGetArgs> getConfirmationPrompt() {
        return this.confirmationPrompt == null ? Output.empty() : this.confirmationPrompt;
    }

    /**
     * Determines if a new slot type version is created when the initial
     * resource is created and on each update. Defaults to `false`.
     * 
     */
    @Import(name="createVersion")
      private final @Nullable Output<Boolean> createVersion;

    public Output<Boolean> getCreateVersion() {
        return this.createVersion == null ? Output.empty() : this.createVersion;
    }

    /**
     * The date when the intent version was created.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate == null ? Output.empty() : this.createdDate;
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies a Lambda function to invoke for each user input. You can
     * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * 
     */
    @Import(name="dialogCodeHook")
      private final @Nullable Output<IntentDialogCodeHookGetArgs> dialogCodeHook;

    public Output<IntentDialogCodeHookGetArgs> getDialogCodeHook() {
        return this.dialogCodeHook == null ? Output.empty() : this.dialogCodeHook;
    }

    /**
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
     * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * 
     */
    @Import(name="followUpPrompt")
      private final @Nullable Output<IntentFollowUpPromptGetArgs> followUpPrompt;

    public Output<IntentFollowUpPromptGetArgs> getFollowUpPrompt() {
        return this.followUpPrompt == null ? Output.empty() : this.followUpPrompt;
    }

    /**
     * Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
     * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * 
     */
    @Import(name="fulfillmentActivity")
      private final @Nullable Output<IntentFulfillmentActivityGetArgs> fulfillmentActivity;

    public Output<IntentFulfillmentActivityGetArgs> getFulfillmentActivity() {
        return this.fulfillmentActivity == null ? Output.empty() : this.fulfillmentActivity;
    }

    /**
     * The date when the $LATEST version of this intent was updated.
     * 
     */
    @Import(name="lastUpdatedDate")
      private final @Nullable Output<String> lastUpdatedDate;

    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate == null ? Output.empty() : this.lastUpdatedDate;
    }

    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A unique identifier for the built-in intent to base this
     * intent on. To find the signature for an intent, see
     * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
     * in the Alexa Skills Kit.
     * 
     */
    @Import(name="parentIntentSignature")
      private final @Nullable Output<String> parentIntentSignature;

    public Output<String> getParentIntentSignature() {
        return this.parentIntentSignature == null ? Output.empty() : this.parentIntentSignature;
    }

    /**
     * If the user answers "no" to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    @Import(name="rejectionStatement")
      private final @Nullable Output<IntentRejectionStatementGetArgs> rejectionStatement;

    public Output<IntentRejectionStatementGetArgs> getRejectionStatement() {
        return this.rejectionStatement == null ? Output.empty() : this.rejectionStatement;
    }

    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="sampleUtterances")
      private final @Nullable Output<List<String>> sampleUtterances;

    public Output<List<String>> getSampleUtterances() {
        return this.sampleUtterances == null ? Output.empty() : this.sampleUtterances;
    }

    /**
     * An list of intent slots. At runtime, Amazon Lex elicits required slot values
     * from the user using prompts defined in the slots. Attributes are documented under slot.
     * 
     */
    @Import(name="slots")
      private final @Nullable Output<List<IntentSlotGetArgs>> slots;

    public Output<List<IntentSlotGetArgs>> getSlots() {
        return this.slots == null ? Output.empty() : this.slots;
    }

    /**
     * The version of the bot.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public IntentState(
        @Nullable Output<String> arn,
        @Nullable Output<String> checksum,
        @Nullable Output<IntentConclusionStatementGetArgs> conclusionStatement,
        @Nullable Output<IntentConfirmationPromptGetArgs> confirmationPrompt,
        @Nullable Output<Boolean> createVersion,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> description,
        @Nullable Output<IntentDialogCodeHookGetArgs> dialogCodeHook,
        @Nullable Output<IntentFollowUpPromptGetArgs> followUpPrompt,
        @Nullable Output<IntentFulfillmentActivityGetArgs> fulfillmentActivity,
        @Nullable Output<String> lastUpdatedDate,
        @Nullable Output<String> name,
        @Nullable Output<String> parentIntentSignature,
        @Nullable Output<IntentRejectionStatementGetArgs> rejectionStatement,
        @Nullable Output<List<String>> sampleUtterances,
        @Nullable Output<List<IntentSlotGetArgs>> slots,
        @Nullable Output<String> version) {
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
        this.arn = Output.empty();
        this.checksum = Output.empty();
        this.conclusionStatement = Output.empty();
        this.confirmationPrompt = Output.empty();
        this.createVersion = Output.empty();
        this.createdDate = Output.empty();
        this.description = Output.empty();
        this.dialogCodeHook = Output.empty();
        this.followUpPrompt = Output.empty();
        this.fulfillmentActivity = Output.empty();
        this.lastUpdatedDate = Output.empty();
        this.name = Output.empty();
        this.parentIntentSignature = Output.empty();
        this.rejectionStatement = Output.empty();
        this.sampleUtterances = Output.empty();
        this.slots = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> checksum;
        private @Nullable Output<IntentConclusionStatementGetArgs> conclusionStatement;
        private @Nullable Output<IntentConfirmationPromptGetArgs> confirmationPrompt;
        private @Nullable Output<Boolean> createVersion;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> description;
        private @Nullable Output<IntentDialogCodeHookGetArgs> dialogCodeHook;
        private @Nullable Output<IntentFollowUpPromptGetArgs> followUpPrompt;
        private @Nullable Output<IntentFulfillmentActivityGetArgs> fulfillmentActivity;
        private @Nullable Output<String> lastUpdatedDate;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parentIntentSignature;
        private @Nullable Output<IntentRejectionStatementGetArgs> rejectionStatement;
        private @Nullable Output<List<String>> sampleUtterances;
        private @Nullable Output<List<IntentSlotGetArgs>> slots;
        private @Nullable Output<String> version;

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

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder checksum(@Nullable Output<String> checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder checksum(@Nullable String checksum) {
            this.checksum = Output.ofNullable(checksum);
            return this;
        }

        public Builder conclusionStatement(@Nullable Output<IntentConclusionStatementGetArgs> conclusionStatement) {
            this.conclusionStatement = conclusionStatement;
            return this;
        }

        public Builder conclusionStatement(@Nullable IntentConclusionStatementGetArgs conclusionStatement) {
            this.conclusionStatement = Output.ofNullable(conclusionStatement);
            return this;
        }

        public Builder confirmationPrompt(@Nullable Output<IntentConfirmationPromptGetArgs> confirmationPrompt) {
            this.confirmationPrompt = confirmationPrompt;
            return this;
        }

        public Builder confirmationPrompt(@Nullable IntentConfirmationPromptGetArgs confirmationPrompt) {
            this.confirmationPrompt = Output.ofNullable(confirmationPrompt);
            return this;
        }

        public Builder createVersion(@Nullable Output<Boolean> createVersion) {
            this.createVersion = createVersion;
            return this;
        }

        public Builder createVersion(@Nullable Boolean createVersion) {
            this.createVersion = Output.ofNullable(createVersion);
            return this;
        }

        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Output.ofNullable(createdDate);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder dialogCodeHook(@Nullable Output<IntentDialogCodeHookGetArgs> dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder dialogCodeHook(@Nullable IntentDialogCodeHookGetArgs dialogCodeHook) {
            this.dialogCodeHook = Output.ofNullable(dialogCodeHook);
            return this;
        }

        public Builder followUpPrompt(@Nullable Output<IntentFollowUpPromptGetArgs> followUpPrompt) {
            this.followUpPrompt = followUpPrompt;
            return this;
        }

        public Builder followUpPrompt(@Nullable IntentFollowUpPromptGetArgs followUpPrompt) {
            this.followUpPrompt = Output.ofNullable(followUpPrompt);
            return this;
        }

        public Builder fulfillmentActivity(@Nullable Output<IntentFulfillmentActivityGetArgs> fulfillmentActivity) {
            this.fulfillmentActivity = fulfillmentActivity;
            return this;
        }

        public Builder fulfillmentActivity(@Nullable IntentFulfillmentActivityGetArgs fulfillmentActivity) {
            this.fulfillmentActivity = Output.ofNullable(fulfillmentActivity);
            return this;
        }

        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public Builder lastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Output.ofNullable(lastUpdatedDate);
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

        public Builder parentIntentSignature(@Nullable Output<String> parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder parentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = Output.ofNullable(parentIntentSignature);
            return this;
        }

        public Builder rejectionStatement(@Nullable Output<IntentRejectionStatementGetArgs> rejectionStatement) {
            this.rejectionStatement = rejectionStatement;
            return this;
        }

        public Builder rejectionStatement(@Nullable IntentRejectionStatementGetArgs rejectionStatement) {
            this.rejectionStatement = Output.ofNullable(rejectionStatement);
            return this;
        }

        public Builder sampleUtterances(@Nullable Output<List<String>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder sampleUtterances(@Nullable List<String> sampleUtterances) {
            this.sampleUtterances = Output.ofNullable(sampleUtterances);
            return this;
        }

        public Builder slots(@Nullable Output<List<IntentSlotGetArgs>> slots) {
            this.slots = slots;
            return this;
        }

        public Builder slots(@Nullable List<IntentSlotGetArgs> slots) {
            this.slots = Output.ofNullable(slots);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public IntentState build() {
            return new IntentState(arn, checksum, conclusionStatement, confirmationPrompt, createVersion, createdDate, description, dialogCodeHook, followUpPrompt, fulfillmentActivity, lastUpdatedDate, name, parentIntentSignature, rejectionStatement, sampleUtterances, slots, version);
        }
    }
}
