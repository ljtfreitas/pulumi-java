// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotGrammarSlotTypeSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotExternalSourceSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotExternalSourceSettingArgs Empty = new BotExternalSourceSettingArgs();

    @InputImport(name="grammarSlotTypeSetting")
    private final @Nullable Input<BotGrammarSlotTypeSettingArgs> grammarSlotTypeSetting;

    public Input<BotGrammarSlotTypeSettingArgs> getGrammarSlotTypeSetting() {
        return this.grammarSlotTypeSetting == null ? Input.empty() : this.grammarSlotTypeSetting;
    }

    public BotExternalSourceSettingArgs(@Nullable Input<BotGrammarSlotTypeSettingArgs> grammarSlotTypeSetting) {
        this.grammarSlotTypeSetting = grammarSlotTypeSetting;
    }

    private BotExternalSourceSettingArgs() {
        this.grammarSlotTypeSetting = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotExternalSourceSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotGrammarSlotTypeSettingArgs> grammarSlotTypeSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotExternalSourceSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grammarSlotTypeSetting = defaults.grammarSlotTypeSetting;
        }

        public Builder setGrammarSlotTypeSetting(@Nullable Input<BotGrammarSlotTypeSettingArgs> grammarSlotTypeSetting) {
            this.grammarSlotTypeSetting = grammarSlotTypeSetting;
            return this;
        }

        public Builder setGrammarSlotTypeSetting(@Nullable BotGrammarSlotTypeSettingArgs grammarSlotTypeSetting) {
            this.grammarSlotTypeSetting = Input.ofNullable(grammarSlotTypeSetting);
            return this;
        }

        public BotExternalSourceSettingArgs build() {
            return new BotExternalSourceSettingArgs(grammarSlotTypeSetting);
        }
    }
}