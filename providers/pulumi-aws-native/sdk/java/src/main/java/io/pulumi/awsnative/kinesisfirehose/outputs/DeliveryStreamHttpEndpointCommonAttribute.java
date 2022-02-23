// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryStreamHttpEndpointCommonAttribute {
    private final String attributeName;
    private final String attributeValue;

    @OutputCustomType.Constructor({"attributeName","attributeValue"})
    private DeliveryStreamHttpEndpointCommonAttribute(
        String attributeName,
        String attributeValue) {
        this.attributeName = Objects.requireNonNull(attributeName);
        this.attributeValue = Objects.requireNonNull(attributeValue);
    }

    public String getAttributeName() {
        return this.attributeName;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setAttributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public DeliveryStreamHttpEndpointCommonAttribute build() {
            return new DeliveryStreamHttpEndpointCommonAttribute(attributeName, attributeValue);
        }
    }
}
