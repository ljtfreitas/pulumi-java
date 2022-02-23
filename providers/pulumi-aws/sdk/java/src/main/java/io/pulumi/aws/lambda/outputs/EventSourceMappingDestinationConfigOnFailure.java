// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventSourceMappingDestinationConfigOnFailure {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    private final String destinationArn;

    @OutputCustomType.Constructor({"destinationArn"})
    private EventSourceMappingDestinationConfigOnFailure(String destinationArn) {
        this.destinationArn = Objects.requireNonNull(destinationArn);
    }

    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    public String getDestinationArn() {
        return this.destinationArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfigOnFailure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfigOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public EventSourceMappingDestinationConfigOnFailure build() {
            return new EventSourceMappingDestinationConfigOnFailure(destinationArn);
        }
    }
}
