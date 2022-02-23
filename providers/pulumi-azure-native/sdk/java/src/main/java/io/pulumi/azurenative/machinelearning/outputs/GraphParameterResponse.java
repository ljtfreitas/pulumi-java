// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.GraphParameterLinkResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GraphParameterResponse {
    /**
     * Description of this graph parameter.
     * 
     */
    private final @Nullable String description;
    /**
     * Association links for this parameter to nodes in the graph.
     * 
     */
    private final List<GraphParameterLinkResponse> links;
    /**
     * Graph parameter's type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","links","type"})
    private GraphParameterResponse(
        @Nullable String description,
        List<GraphParameterLinkResponse> links,
        String type) {
        this.description = description;
        this.links = Objects.requireNonNull(links);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Description of this graph parameter.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Association links for this parameter to nodes in the graph.
     * 
     */
    public List<GraphParameterLinkResponse> getLinks() {
        return this.links;
    }
    /**
     * Graph parameter's type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private List<GraphParameterLinkResponse> links;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.links = defaults.links;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLinks(List<GraphParameterLinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GraphParameterResponse build() {
            return new GraphParameterResponse(description, links, type);
        }
    }
}
