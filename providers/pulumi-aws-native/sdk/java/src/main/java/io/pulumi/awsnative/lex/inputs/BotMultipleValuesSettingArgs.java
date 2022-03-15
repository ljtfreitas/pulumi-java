// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Indicates whether a slot can return multiple values.
 * 
 */
public final class BotMultipleValuesSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotMultipleValuesSettingArgs Empty = new BotMultipleValuesSettingArgs();

    @Import(name="allowMultipleValues")
      private final @Nullable Output<Boolean> allowMultipleValues;

    public Output<Boolean> getAllowMultipleValues() {
        return this.allowMultipleValues == null ? Output.empty() : this.allowMultipleValues;
    }

    public BotMultipleValuesSettingArgs(@Nullable Output<Boolean> allowMultipleValues) {
        this.allowMultipleValues = allowMultipleValues;
    }

    private BotMultipleValuesSettingArgs() {
        this.allowMultipleValues = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotMultipleValuesSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowMultipleValues;

        public Builder() {
    	      // Empty
        }

        public Builder(BotMultipleValuesSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultipleValues = defaults.allowMultipleValues;
        }

        public Builder allowMultipleValues(@Nullable Output<Boolean> allowMultipleValues) {
            this.allowMultipleValues = allowMultipleValues;
            return this;
        }

        public Builder allowMultipleValues(@Nullable Boolean allowMultipleValues) {
            this.allowMultipleValues = Output.ofNullable(allowMultipleValues);
            return this;
        }
        public BotMultipleValuesSettingArgs build() {
            return new BotMultipleValuesSettingArgs(allowMultipleValues);
        }
    }
}
