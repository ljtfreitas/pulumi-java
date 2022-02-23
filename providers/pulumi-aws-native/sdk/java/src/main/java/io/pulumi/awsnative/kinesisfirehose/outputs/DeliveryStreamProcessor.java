// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamProcessorType;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamProcessorParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamProcessor {
    private final @Nullable List<DeliveryStreamProcessorParameter> parameters;
    private final DeliveryStreamProcessorType type;

    @OutputCustomType.Constructor({"parameters","type"})
    private DeliveryStreamProcessor(
        @Nullable List<DeliveryStreamProcessorParameter> parameters,
        DeliveryStreamProcessorType type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
    }

    public List<DeliveryStreamProcessorParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public DeliveryStreamProcessorType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamProcessor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeliveryStreamProcessorParameter> parameters;
        private DeliveryStreamProcessorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable List<DeliveryStreamProcessorParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(DeliveryStreamProcessorType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DeliveryStreamProcessor build() {
            return new DeliveryStreamProcessor(parameters, type);
        }
    }
}
