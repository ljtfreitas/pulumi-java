// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemaResult {
    /**
     * The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
     * 
     */
    private final String definition;
    /**
     * Name of the schema. Format is `projects/{project}/schemas/{schema}`.
     * 
     */
    private final String name;
    /**
     * The type of the schema definition.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSchemaResult(
        @CustomType.Parameter("definition") String definition,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.definition = definition;
        this.name = name;
        this.type = type;
    }

    /**
     * The definition of the schema. This should contain a string representing the full definition of the schema that is a valid schema definition of the type specified in `type`.
     * 
    */
    public String getDefinition() {
        return this.definition;
    }
    /**
     * Name of the schema. Format is `projects/{project}/schemas/{schema}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of the schema definition.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String definition;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder definition(String definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSchemaResult build() {
            return new GetSchemaResult(definition, name, type);
        }
    }
}
