// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FulfillmentFeature {
    /**
     * The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private FulfillmentFeature(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentFeature defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentFeature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FulfillmentFeature build() {
            return new FulfillmentFeature(type);
        }
    }
}
