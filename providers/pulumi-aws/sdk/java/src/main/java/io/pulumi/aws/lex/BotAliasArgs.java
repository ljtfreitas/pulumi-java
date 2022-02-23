// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.lex.inputs.BotAliasConversationLogsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasArgs Empty = new BotAliasArgs();

    /**
     * The name of the bot.
     * 
     */
    @InputImport(name="botName", required=true)
    private final Input<String> botName;

    public Input<String> getBotName() {
        return this.botName;
    }

    /**
     * The name of the bot.
     * 
     */
    @InputImport(name="botVersion", required=true)
    private final Input<String> botVersion;

    public Input<String> getBotVersion() {
        return this.botVersion;
    }

    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    @InputImport(name="conversationLogs")
    private final @Nullable Input<BotAliasConversationLogsArgs> conversationLogs;

    public Input<BotAliasConversationLogsArgs> getConversationLogs() {
        return this.conversationLogs == null ? Input.empty() : this.conversationLogs;
    }

    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BotAliasArgs(
        Input<String> botName,
        Input<String> botVersion,
        @Nullable Input<BotAliasConversationLogsArgs> conversationLogs,
        @Nullable Input<String> description,
        @Nullable Input<String> name) {
        this.botName = Objects.requireNonNull(botName, "expected parameter 'botName' to be non-null");
        this.botVersion = Objects.requireNonNull(botVersion, "expected parameter 'botVersion' to be non-null");
        this.conversationLogs = conversationLogs;
        this.description = description;
        this.name = name;
    }

    private BotAliasArgs() {
        this.botName = Input.empty();
        this.botVersion = Input.empty();
        this.conversationLogs = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> botName;
        private Input<String> botVersion;
        private @Nullable Input<BotAliasConversationLogsArgs> conversationLogs;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botName = defaults.botName;
    	      this.botVersion = defaults.botVersion;
    	      this.conversationLogs = defaults.conversationLogs;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder setBotName(Input<String> botName) {
            this.botName = Objects.requireNonNull(botName);
            return this;
        }

        public Builder setBotName(String botName) {
            this.botName = Input.of(Objects.requireNonNull(botName));
            return this;
        }

        public Builder setBotVersion(Input<String> botVersion) {
            this.botVersion = Objects.requireNonNull(botVersion);
            return this;
        }

        public Builder setBotVersion(String botVersion) {
            this.botVersion = Input.of(Objects.requireNonNull(botVersion));
            return this;
        }

        public Builder setConversationLogs(@Nullable Input<BotAliasConversationLogsArgs> conversationLogs) {
            this.conversationLogs = conversationLogs;
            return this;
        }

        public Builder setConversationLogs(@Nullable BotAliasConversationLogsArgs conversationLogs) {
            this.conversationLogs = Input.ofNullable(conversationLogs);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public BotAliasArgs build() {
            return new BotAliasArgs(botName, botVersion, conversationLogs, description, name);
        }
    }
}
