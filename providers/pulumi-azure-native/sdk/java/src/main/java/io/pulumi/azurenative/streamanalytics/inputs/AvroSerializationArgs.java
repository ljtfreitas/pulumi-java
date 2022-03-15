// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in Avro format.
 * 
 */
public final class AvroSerializationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvroSerializationArgs Empty = new AvroSerializationArgs();

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Avro'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AvroSerializationArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AvroSerializationArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroSerializationArgs defaults) {
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
        }
        public AvroSerializationArgs build() {
            return new AvroSerializationArgs(type);
        }
    }
}
