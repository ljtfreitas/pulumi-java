// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect;

import io.pulumi.awsnative.mediaconnect.enums.FlowEntitlementEntitlementStatus;
import io.pulumi.awsnative.mediaconnect.inputs.FlowEntitlementEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowEntitlementArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowEntitlementArgs Empty = new FlowEntitlementArgs();

    @InputImport(name="dataTransferSubscriberFeePercent")
    private final @Nullable Input<Integer> dataTransferSubscriberFeePercent;

    public Input<Integer> getDataTransferSubscriberFeePercent() {
        return this.dataTransferSubscriberFeePercent == null ? Input.empty() : this.dataTransferSubscriberFeePercent;
    }

    @InputImport(name="description", required=true)
    private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    @InputImport(name="encryption")
    private final @Nullable Input<FlowEntitlementEncryptionArgs> encryption;

    public Input<FlowEntitlementEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    @InputImport(name="entitlementStatus")
    private final @Nullable Input<FlowEntitlementEntitlementStatus> entitlementStatus;

    public Input<FlowEntitlementEntitlementStatus> getEntitlementStatus() {
        return this.entitlementStatus == null ? Input.empty() : this.entitlementStatus;
    }

    @InputImport(name="flowArn", required=true)
    private final Input<String> flowArn;

    public Input<String> getFlowArn() {
        return this.flowArn;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="subscribers", required=true)
    private final Input<List<String>> subscribers;

    public Input<List<String>> getSubscribers() {
        return this.subscribers;
    }

    public FlowEntitlementArgs(
        @Nullable Input<Integer> dataTransferSubscriberFeePercent,
        Input<String> description,
        @Nullable Input<FlowEntitlementEncryptionArgs> encryption,
        @Nullable Input<FlowEntitlementEntitlementStatus> entitlementStatus,
        Input<String> flowArn,
        @Nullable Input<String> name,
        Input<List<String>> subscribers) {
        this.dataTransferSubscriberFeePercent = dataTransferSubscriberFeePercent;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.encryption = encryption;
        this.entitlementStatus = entitlementStatus;
        this.flowArn = Objects.requireNonNull(flowArn, "expected parameter 'flowArn' to be non-null");
        this.name = name;
        this.subscribers = Objects.requireNonNull(subscribers, "expected parameter 'subscribers' to be non-null");
    }

    private FlowEntitlementArgs() {
        this.dataTransferSubscriberFeePercent = Input.empty();
        this.description = Input.empty();
        this.encryption = Input.empty();
        this.entitlementStatus = Input.empty();
        this.flowArn = Input.empty();
        this.name = Input.empty();
        this.subscribers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dataTransferSubscriberFeePercent;
        private Input<String> description;
        private @Nullable Input<FlowEntitlementEncryptionArgs> encryption;
        private @Nullable Input<FlowEntitlementEntitlementStatus> entitlementStatus;
        private Input<String> flowArn;
        private @Nullable Input<String> name;
        private Input<List<String>> subscribers;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEntitlementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTransferSubscriberFeePercent = defaults.dataTransferSubscriberFeePercent;
    	      this.description = defaults.description;
    	      this.encryption = defaults.encryption;
    	      this.entitlementStatus = defaults.entitlementStatus;
    	      this.flowArn = defaults.flowArn;
    	      this.name = defaults.name;
    	      this.subscribers = defaults.subscribers;
        }

        public Builder setDataTransferSubscriberFeePercent(@Nullable Input<Integer> dataTransferSubscriberFeePercent) {
            this.dataTransferSubscriberFeePercent = dataTransferSubscriberFeePercent;
            return this;
        }

        public Builder setDataTransferSubscriberFeePercent(@Nullable Integer dataTransferSubscriberFeePercent) {
            this.dataTransferSubscriberFeePercent = Input.ofNullable(dataTransferSubscriberFeePercent);
            return this;
        }

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setEncryption(@Nullable Input<FlowEntitlementEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable FlowEntitlementEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setEntitlementStatus(@Nullable Input<FlowEntitlementEntitlementStatus> entitlementStatus) {
            this.entitlementStatus = entitlementStatus;
            return this;
        }

        public Builder setEntitlementStatus(@Nullable FlowEntitlementEntitlementStatus entitlementStatus) {
            this.entitlementStatus = Input.ofNullable(entitlementStatus);
            return this;
        }

        public Builder setFlowArn(Input<String> flowArn) {
            this.flowArn = Objects.requireNonNull(flowArn);
            return this;
        }

        public Builder setFlowArn(String flowArn) {
            this.flowArn = Input.of(Objects.requireNonNull(flowArn));
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

        public Builder setSubscribers(Input<List<String>> subscribers) {
            this.subscribers = Objects.requireNonNull(subscribers);
            return this;
        }

        public Builder setSubscribers(List<String> subscribers) {
            this.subscribers = Input.of(Objects.requireNonNull(subscribers));
            return this;
        }

        public FlowEntitlementArgs build() {
            return new FlowEntitlementArgs(dataTransferSubscriberFeePercent, description, encryption, entitlementStatus, flowArn, name, subscribers);
        }
    }
}