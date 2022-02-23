// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.subscription.outputs;

import io.pulumi.azurenative.subscription.outputs.PutAliasResponsePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAliasResult {
    /**
     * Fully qualified ID for the alias resource.
     * 
     */
    private final String id;
    /**
     * Alias ID.
     * 
     */
    private final String name;
    /**
     * Put Alias response properties.
     * 
     */
    private final PutAliasResponsePropertiesResponse properties;
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetAliasResult(
        String id,
        String name,
        PutAliasResponsePropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified ID for the alias resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Alias ID.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Put Alias response properties.
     * 
     */
    public PutAliasResponsePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private PutAliasResponsePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(PutAliasResponsePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAliasResult build() {
            return new GetAliasResult(id, name, properties, type);
        }
    }
}
