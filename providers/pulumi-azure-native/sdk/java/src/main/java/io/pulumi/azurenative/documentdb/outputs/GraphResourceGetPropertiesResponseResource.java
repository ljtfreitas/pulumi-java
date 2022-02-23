// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GraphResourceGetPropertiesResponseResource {
    /**
     * Name of the Cosmos DB Graph
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"id"})
    private GraphResourceGetPropertiesResponseResource(String id) {
        this.id = Objects.requireNonNull(id);
    }

    /**
     * Name of the Cosmos DB Graph
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphResourceGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphResourceGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GraphResourceGetPropertiesResponseResource build() {
            return new GraphResourceGetPropertiesResponseResource(id);
        }
    }
}
