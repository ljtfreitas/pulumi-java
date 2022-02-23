// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.DestinationArgs;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.SourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of rules.
 * 
 */
public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Optional. List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers. If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
     * 
     */
    @InputImport(name="destinations")
      private final @Nullable Input<List<DestinationArgs>> destinations;

    public Input<List<DestinationArgs>> getDestinations() {
        return this.destinations == null ? Input.empty() : this.destinations;
    }

    /**
     * Optional. List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ip_blocks match. If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
     * 
     */
    @InputImport(name="sources")
      private final @Nullable Input<List<SourceArgs>> sources;

    public Input<List<SourceArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    public RuleArgs(
        @Nullable Input<List<DestinationArgs>> destinations,
        @Nullable Input<List<SourceArgs>> sources) {
        this.destinations = destinations;
        this.sources = sources;
    }

    private RuleArgs() {
        this.destinations = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DestinationArgs>> destinations;
        private @Nullable Input<List<SourceArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.sources = defaults.sources;
        }

        public Builder setDestinations(@Nullable Input<List<DestinationArgs>> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setDestinations(@Nullable List<DestinationArgs> destinations) {
            this.destinations = Input.ofNullable(destinations);
            return this;
        }

        public Builder setSources(@Nullable Input<List<SourceArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<SourceArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }
        public RuleArgs build() {
            return new RuleArgs(destinations, sources);
        }
    }
}
