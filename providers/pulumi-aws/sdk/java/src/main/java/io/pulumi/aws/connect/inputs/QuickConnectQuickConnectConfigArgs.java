// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigPhoneConfigArgs;
import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigQueueConfigArgs;
import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigUserConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectQuickConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigArgs Empty = new QuickConnectQuickConnectConfigArgs();

    /**
     * Specifies the phone configuration of the Quick Connect. This is required only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    @InputImport(name="phoneConfigs")
    private final @Nullable Input<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs;

    public Input<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> getPhoneConfigs() {
        return this.phoneConfigs == null ? Input.empty() : this.phoneConfigs;
    }

    /**
     * Specifies the queue configuration of the Quick Connect. This is required only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    @InputImport(name="queueConfigs")
    private final @Nullable Input<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs;

    public Input<List<QuickConnectQuickConnectConfigQueueConfigArgs>> getQueueConfigs() {
        return this.queueConfigs == null ? Input.empty() : this.queueConfigs;
    }

    /**
     * Specifies the configuration type of the quick connect. valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    @InputImport(name="quickConnectType", required=true)
    private final Input<String> quickConnectType;

    public Input<String> getQuickConnectType() {
        return this.quickConnectType;
    }

    /**
     * Specifies the user configuration of the Quick Connect. This is required only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    @InputImport(name="userConfigs")
    private final @Nullable Input<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs;

    public Input<List<QuickConnectQuickConnectConfigUserConfigArgs>> getUserConfigs() {
        return this.userConfigs == null ? Input.empty() : this.userConfigs;
    }

    public QuickConnectQuickConnectConfigArgs(
        @Nullable Input<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs,
        @Nullable Input<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs,
        Input<String> quickConnectType,
        @Nullable Input<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs) {
        this.phoneConfigs = phoneConfigs;
        this.queueConfigs = queueConfigs;
        this.quickConnectType = Objects.requireNonNull(quickConnectType, "expected parameter 'quickConnectType' to be non-null");
        this.userConfigs = userConfigs;
    }

    private QuickConnectQuickConnectConfigArgs() {
        this.phoneConfigs = Input.empty();
        this.queueConfigs = Input.empty();
        this.quickConnectType = Input.empty();
        this.userConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs;
        private @Nullable Input<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs;
        private Input<String> quickConnectType;
        private @Nullable Input<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfigs = defaults.phoneConfigs;
    	      this.queueConfigs = defaults.queueConfigs;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfigs = defaults.userConfigs;
        }

        public Builder setPhoneConfigs(@Nullable Input<List<QuickConnectQuickConnectConfigPhoneConfigArgs>> phoneConfigs) {
            this.phoneConfigs = phoneConfigs;
            return this;
        }

        public Builder setPhoneConfigs(@Nullable List<QuickConnectQuickConnectConfigPhoneConfigArgs> phoneConfigs) {
            this.phoneConfigs = Input.ofNullable(phoneConfigs);
            return this;
        }

        public Builder setQueueConfigs(@Nullable Input<List<QuickConnectQuickConnectConfigQueueConfigArgs>> queueConfigs) {
            this.queueConfigs = queueConfigs;
            return this;
        }

        public Builder setQueueConfigs(@Nullable List<QuickConnectQuickConnectConfigQueueConfigArgs> queueConfigs) {
            this.queueConfigs = Input.ofNullable(queueConfigs);
            return this;
        }

        public Builder setQuickConnectType(Input<String> quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }

        public Builder setQuickConnectType(String quickConnectType) {
            this.quickConnectType = Input.of(Objects.requireNonNull(quickConnectType));
            return this;
        }

        public Builder setUserConfigs(@Nullable Input<List<QuickConnectQuickConnectConfigUserConfigArgs>> userConfigs) {
            this.userConfigs = userConfigs;
            return this;
        }

        public Builder setUserConfigs(@Nullable List<QuickConnectQuickConnectConfigUserConfigArgs> userConfigs) {
            this.userConfigs = Input.ofNullable(userConfigs);
            return this;
        }
        public QuickConnectQuickConnectConfigArgs build() {
            return new QuickConnectQuickConnectConfigArgs(phoneConfigs, queueConfigs, quickConnectType, userConfigs);
        }
    }
}
