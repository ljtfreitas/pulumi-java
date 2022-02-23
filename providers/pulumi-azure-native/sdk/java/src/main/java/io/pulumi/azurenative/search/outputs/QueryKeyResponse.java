// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QueryKeyResponse {
    /**
     * The value of the query API key.
     * 
     */
    private final String key;
    /**
     * The name of the query API key; may be empty.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"key","name"})
    private QueryKeyResponse(
        String key,
        String name) {
        this.key = Objects.requireNonNull(key);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The value of the query API key.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The name of the query API key; may be empty.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public QueryKeyResponse build() {
            return new QueryKeyResponse(key, name);
        }
    }
}
