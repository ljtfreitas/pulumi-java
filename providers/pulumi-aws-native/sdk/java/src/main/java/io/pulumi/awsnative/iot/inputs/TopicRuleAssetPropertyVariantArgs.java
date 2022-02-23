// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleAssetPropertyVariantArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleAssetPropertyVariantArgs Empty = new TopicRuleAssetPropertyVariantArgs();

    @InputImport(name="booleanValue")
        private final @Nullable Input<String> booleanValue;

    public Input<String> getBooleanValue() {
        return this.booleanValue == null ? Input.empty() : this.booleanValue;
    }

    @InputImport(name="doubleValue")
        private final @Nullable Input<String> doubleValue;

    public Input<String> getDoubleValue() {
        return this.doubleValue == null ? Input.empty() : this.doubleValue;
    }

    @InputImport(name="integerValue")
        private final @Nullable Input<String> integerValue;

    public Input<String> getIntegerValue() {
        return this.integerValue == null ? Input.empty() : this.integerValue;
    }

    @InputImport(name="stringValue")
        private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    public TopicRuleAssetPropertyVariantArgs(
        @Nullable Input<String> booleanValue,
        @Nullable Input<String> doubleValue,
        @Nullable Input<String> integerValue,
        @Nullable Input<String> stringValue) {
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
    }

    private TopicRuleAssetPropertyVariantArgs() {
        this.booleanValue = Input.empty();
        this.doubleValue = Input.empty();
        this.integerValue = Input.empty();
        this.stringValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAssetPropertyVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> booleanValue;
        private @Nullable Input<String> doubleValue;
        private @Nullable Input<String> integerValue;
        private @Nullable Input<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAssetPropertyVariantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBooleanValue(@Nullable Input<String> booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setBooleanValue(@Nullable String booleanValue) {
            this.booleanValue = Input.ofNullable(booleanValue);
            return this;
        }

        public Builder setDoubleValue(@Nullable Input<String> doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable String doubleValue) {
            this.doubleValue = Input.ofNullable(doubleValue);
            return this;
        }

        public Builder setIntegerValue(@Nullable Input<String> integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setIntegerValue(@Nullable String integerValue) {
            this.integerValue = Input.ofNullable(integerValue);
            return this;
        }

        public Builder setStringValue(@Nullable Input<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = Input.ofNullable(stringValue);
            return this;
        }
        public TopicRuleAssetPropertyVariantArgs build() {
            return new TopicRuleAssetPropertyVariantArgs(booleanValue, doubleValue, integerValue, stringValue);
        }
    }
}
