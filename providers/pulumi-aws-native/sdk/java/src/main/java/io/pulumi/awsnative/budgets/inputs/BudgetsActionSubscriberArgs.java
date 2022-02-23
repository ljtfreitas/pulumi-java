// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionSubscriberType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BudgetsActionSubscriberArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetsActionSubscriberArgs Empty = new BudgetsActionSubscriberArgs();

    @InputImport(name="address", required=true)
        private final Input<String> address;

    public Input<String> getAddress() {
        return this.address;
    }

    @InputImport(name="type", required=true)
        private final Input<BudgetsActionSubscriberType> type;

    public Input<BudgetsActionSubscriberType> getType() {
        return this.type;
    }

    public BudgetsActionSubscriberArgs(
        Input<String> address,
        Input<BudgetsActionSubscriberType> type) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BudgetsActionSubscriberArgs() {
        this.address = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionSubscriberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> address;
        private Input<BudgetsActionSubscriberType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionSubscriberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder setAddress(Input<String> address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setAddress(String address) {
            this.address = Input.of(Objects.requireNonNull(address));
            return this;
        }

        public Builder setType(Input<BudgetsActionSubscriberType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(BudgetsActionSubscriberType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public BudgetsActionSubscriberArgs build() {
            return new BudgetsActionSubscriberArgs(address, type);
        }
    }
}
