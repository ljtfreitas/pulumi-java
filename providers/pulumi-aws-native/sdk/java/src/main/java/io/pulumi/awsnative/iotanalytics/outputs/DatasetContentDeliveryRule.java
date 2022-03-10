// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatasetContentDeliveryRuleDestination;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetContentDeliveryRule {
    private final DatasetContentDeliveryRuleDestination destination;
    private final @Nullable String entryName;

    @OutputCustomType.Constructor
    private DatasetContentDeliveryRule(
        @OutputCustomType.Parameter("destination") DatasetContentDeliveryRuleDestination destination,
        @OutputCustomType.Parameter("entryName") @Nullable String entryName) {
        this.destination = destination;
        this.entryName = entryName;
    }

    public DatasetContentDeliveryRuleDestination getDestination() {
        return this.destination;
    }
    public Optional<String> getEntryName() {
        return Optional.ofNullable(this.entryName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetContentDeliveryRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetContentDeliveryRuleDestination destination;
        private @Nullable String entryName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetContentDeliveryRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.entryName = defaults.entryName;
        }

        public Builder setDestination(DatasetContentDeliveryRuleDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEntryName(@Nullable String entryName) {
            this.entryName = entryName;
            return this;
        }
        public DatasetContentDeliveryRule build() {
            return new DatasetContentDeliveryRule(destination, entryName);
        }
    }
}
