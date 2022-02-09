// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.BillingDestinationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingArgs Empty = new BillingArgs();

    @InputImport(name="consumerDestinations")
    private final @Nullable Input<List<BillingDestinationArgs>> consumerDestinations;

    public Input<List<BillingDestinationArgs>> getConsumerDestinations() {
        return this.consumerDestinations == null ? Input.empty() : this.consumerDestinations;
    }

    public BillingArgs(@Nullable Input<List<BillingDestinationArgs>> consumerDestinations) {
        this.consumerDestinations = consumerDestinations;
    }

    private BillingArgs() {
        this.consumerDestinations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BillingDestinationArgs>> consumerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
        }

        public Builder setConsumerDestinations(@Nullable Input<List<BillingDestinationArgs>> consumerDestinations) {
            this.consumerDestinations = consumerDestinations;
            return this;
        }

        public Builder setConsumerDestinations(@Nullable List<BillingDestinationArgs> consumerDestinations) {
            this.consumerDestinations = Input.ofNullable(consumerDestinations);
            return this;
        }

        public BillingArgs build() {
            return new BillingArgs(consumerDestinations);
        }
    }
}