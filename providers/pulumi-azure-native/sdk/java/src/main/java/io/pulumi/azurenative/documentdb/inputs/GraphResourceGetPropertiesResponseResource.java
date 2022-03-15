// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GraphResourceGetPropertiesResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final GraphResourceGetPropertiesResponseResource Empty = new GraphResourceGetPropertiesResponseResource();

    /**
     * Name of the Cosmos DB Graph
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public GraphResourceGetPropertiesResponseResource(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GraphResourceGetPropertiesResponseResource() {
        this.id = null;
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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GraphResourceGetPropertiesResponseResource build() {
            return new GraphResourceGetPropertiesResponseResource(id);
        }
    }
}
