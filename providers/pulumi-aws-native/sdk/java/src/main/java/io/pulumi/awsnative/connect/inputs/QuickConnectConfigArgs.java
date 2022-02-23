// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.awsnative.connect.enums.QuickConnectType;
import io.pulumi.awsnative.connect.inputs.QuickConnectPhoneNumberQuickConnectConfigArgs;
import io.pulumi.awsnative.connect.inputs.QuickConnectQueueQuickConnectConfigArgs;
import io.pulumi.awsnative.connect.inputs.QuickConnectUserQuickConnectConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration settings for the quick connect.
 * 
 */
public final class QuickConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectConfigArgs Empty = new QuickConnectConfigArgs();

    @InputImport(name="phoneConfig")
        private final @Nullable Input<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig;

    public Input<QuickConnectPhoneNumberQuickConnectConfigArgs> getPhoneConfig() {
        return this.phoneConfig == null ? Input.empty() : this.phoneConfig;
    }

    @InputImport(name="queueConfig")
        private final @Nullable Input<QuickConnectQueueQuickConnectConfigArgs> queueConfig;

    public Input<QuickConnectQueueQuickConnectConfigArgs> getQueueConfig() {
        return this.queueConfig == null ? Input.empty() : this.queueConfig;
    }

    @InputImport(name="quickConnectType", required=true)
        private final Input<QuickConnectType> quickConnectType;

    public Input<QuickConnectType> getQuickConnectType() {
        return this.quickConnectType;
    }

    @InputImport(name="userConfig")
        private final @Nullable Input<QuickConnectUserQuickConnectConfigArgs> userConfig;

    public Input<QuickConnectUserQuickConnectConfigArgs> getUserConfig() {
        return this.userConfig == null ? Input.empty() : this.userConfig;
    }

    public QuickConnectConfigArgs(
        @Nullable Input<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig,
        @Nullable Input<QuickConnectQueueQuickConnectConfigArgs> queueConfig,
        Input<QuickConnectType> quickConnectType,
        @Nullable Input<QuickConnectUserQuickConnectConfigArgs> userConfig) {
        this.phoneConfig = phoneConfig;
        this.queueConfig = queueConfig;
        this.quickConnectType = Objects.requireNonNull(quickConnectType, "expected parameter 'quickConnectType' to be non-null");
        this.userConfig = userConfig;
    }

    private QuickConnectConfigArgs() {
        this.phoneConfig = Input.empty();
        this.queueConfig = Input.empty();
        this.quickConnectType = Input.empty();
        this.userConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig;
        private @Nullable Input<QuickConnectQueueQuickConnectConfigArgs> queueConfig;
        private Input<QuickConnectType> quickConnectType;
        private @Nullable Input<QuickConnectUserQuickConnectConfigArgs> userConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfig = defaults.phoneConfig;
    	      this.queueConfig = defaults.queueConfig;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfig = defaults.userConfig;
        }

        public Builder setPhoneConfig(@Nullable Input<QuickConnectPhoneNumberQuickConnectConfigArgs> phoneConfig) {
            this.phoneConfig = phoneConfig;
            return this;
        }

        public Builder setPhoneConfig(@Nullable QuickConnectPhoneNumberQuickConnectConfigArgs phoneConfig) {
            this.phoneConfig = Input.ofNullable(phoneConfig);
            return this;
        }

        public Builder setQueueConfig(@Nullable Input<QuickConnectQueueQuickConnectConfigArgs> queueConfig) {
            this.queueConfig = queueConfig;
            return this;
        }

        public Builder setQueueConfig(@Nullable QuickConnectQueueQuickConnectConfigArgs queueConfig) {
            this.queueConfig = Input.ofNullable(queueConfig);
            return this;
        }

        public Builder setQuickConnectType(Input<QuickConnectType> quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }

        public Builder setQuickConnectType(QuickConnectType quickConnectType) {
            this.quickConnectType = Input.of(Objects.requireNonNull(quickConnectType));
            return this;
        }

        public Builder setUserConfig(@Nullable Input<QuickConnectUserQuickConnectConfigArgs> userConfig) {
            this.userConfig = userConfig;
            return this;
        }

        public Builder setUserConfig(@Nullable QuickConnectUserQuickConnectConfigArgs userConfig) {
            this.userConfig = Input.ofNullable(userConfig);
            return this;
        }
        public QuickConnectConfigArgs build() {
            return new QuickConnectConfigArgs(phoneConfig, queueConfig, quickConnectType, userConfig);
        }
    }
}
