// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Indicates whether a slot can return multiple values.
 * 
 */
public final class BotMultipleValuesSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotMultipleValuesSettingArgs Empty = new BotMultipleValuesSettingArgs();

    @InputImport(name="allowMultipleValues")
        private final @Nullable Input<Boolean> allowMultipleValues;

    public Input<Boolean> getAllowMultipleValues() {
        return this.allowMultipleValues == null ? Input.empty() : this.allowMultipleValues;
    }

    public BotMultipleValuesSettingArgs(@Nullable Input<Boolean> allowMultipleValues) {
        this.allowMultipleValues = allowMultipleValues;
    }

    private BotMultipleValuesSettingArgs() {
        this.allowMultipleValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotMultipleValuesSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowMultipleValues;

        public Builder() {
    	      // Empty
        }

        public Builder(BotMultipleValuesSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultipleValues = defaults.allowMultipleValues;
        }

        public Builder setAllowMultipleValues(@Nullable Input<Boolean> allowMultipleValues) {
            this.allowMultipleValues = allowMultipleValues;
            return this;
        }

        public Builder setAllowMultipleValues(@Nullable Boolean allowMultipleValues) {
            this.allowMultipleValues = Input.ofNullable(allowMultipleValues);
            return this;
        }
        public BotMultipleValuesSettingArgs build() {
            return new BotMultipleValuesSettingArgs(allowMultipleValues);
        }
    }
}
