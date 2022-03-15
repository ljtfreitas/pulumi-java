// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.EventSourceMappingDestinationConfigOnFailureGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceMappingDestinationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingDestinationConfigGetArgs Empty = new EventSourceMappingDestinationConfigGetArgs();

    /**
     * The destination configuration for failed invocations. Detailed below.
     * 
     */
    @Import(name="onFailure")
      private final @Nullable Output<EventSourceMappingDestinationConfigOnFailureGetArgs> onFailure;

    public Output<EventSourceMappingDestinationConfigOnFailureGetArgs> getOnFailure() {
        return this.onFailure == null ? Output.empty() : this.onFailure;
    }

    public EventSourceMappingDestinationConfigGetArgs(@Nullable Output<EventSourceMappingDestinationConfigOnFailureGetArgs> onFailure) {
        this.onFailure = onFailure;
    }

    private EventSourceMappingDestinationConfigGetArgs() {
        this.onFailure = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EventSourceMappingDestinationConfigOnFailureGetArgs> onFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
        }

        public Builder onFailure(@Nullable Output<EventSourceMappingDestinationConfigOnFailureGetArgs> onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        public Builder onFailure(@Nullable EventSourceMappingDestinationConfigOnFailureGetArgs onFailure) {
            this.onFailure = Output.ofNullable(onFailure);
            return this;
        }
        public EventSourceMappingDestinationConfigGetArgs build() {
            return new EventSourceMappingDestinationConfigGetArgs(onFailure);
        }
    }
}
