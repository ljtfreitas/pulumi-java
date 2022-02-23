// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A custom error rule.
 * 
 */
public final class CustomErrorRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomErrorRuleArgs Empty = new CustomErrorRuleArgs();

    /**
     * Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    @InputImport(name="isErrorType")
      private final @Nullable Input<Boolean> isErrorType;

    public Input<Boolean> getIsErrorType() {
        return this.isErrorType == null ? Input.empty() : this.isErrorType;
    }

    /**
     * Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @InputImport(name="selector")
      private final @Nullable Input<String> selector;

    public Input<String> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public CustomErrorRuleArgs(
        @Nullable Input<Boolean> isErrorType,
        @Nullable Input<String> selector) {
        this.isErrorType = isErrorType;
        this.selector = selector;
    }

    private CustomErrorRuleArgs() {
        this.isErrorType = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isErrorType;
        private @Nullable Input<String> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isErrorType = defaults.isErrorType;
    	      this.selector = defaults.selector;
        }

        public Builder setIsErrorType(@Nullable Input<Boolean> isErrorType) {
            this.isErrorType = isErrorType;
            return this;
        }

        public Builder setIsErrorType(@Nullable Boolean isErrorType) {
            this.isErrorType = Input.ofNullable(isErrorType);
            return this;
        }

        public Builder setSelector(@Nullable Input<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }
        public CustomErrorRuleArgs build() {
            return new CustomErrorRuleArgs(isErrorType, selector);
        }
    }
}
