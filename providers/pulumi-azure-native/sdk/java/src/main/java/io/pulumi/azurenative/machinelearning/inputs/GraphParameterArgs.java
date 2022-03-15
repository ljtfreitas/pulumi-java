// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.ParameterType;
import io.pulumi.azurenative.machinelearning.inputs.GraphParameterLinkArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a global parameter in the graph.
 * 
 */
public final class GraphParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphParameterArgs Empty = new GraphParameterArgs();

    /**
     * Description of this graph parameter.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Association links for this parameter to nodes in the graph.
     * 
     */
    @Import(name="links", required=true)
      private final Output<List<GraphParameterLinkArgs>> links;

    public Output<List<GraphParameterLinkArgs>> getLinks() {
        return this.links;
    }

    /**
     * Graph parameter's type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> getType() {
        return this.type;
    }

    public GraphParameterArgs(
        @Nullable Output<String> description,
        Output<List<GraphParameterLinkArgs>> links,
        Output<Either<String,ParameterType>> type) {
        this.description = description;
        this.links = Objects.requireNonNull(links, "expected parameter 'links' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GraphParameterArgs() {
        this.description = Output.empty();
        this.links = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<GraphParameterLinkArgs>> links;
        private Output<Either<String,ParameterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.links = defaults.links;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder links(Output<List<GraphParameterLinkArgs>> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder links(List<GraphParameterLinkArgs> links) {
            this.links = Output.of(Objects.requireNonNull(links));
            return this;
        }

        public Builder type(Output<Either<String,ParameterType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,ParameterType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public GraphParameterArgs build() {
            return new GraphParameterArgs(description, links, type);
        }
    }
}
