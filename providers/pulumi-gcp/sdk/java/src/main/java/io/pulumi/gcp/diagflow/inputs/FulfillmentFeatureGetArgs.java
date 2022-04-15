// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FulfillmentFeatureGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentFeatureGetArgs Empty = new FulfillmentFeatureGetArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public FulfillmentFeatureGetArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FulfillmentFeatureGetArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentFeatureGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentFeatureGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FulfillmentFeatureGetArgs build() {
            return new FulfillmentFeatureGetArgs(type);
        }
    }
}
