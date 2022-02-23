// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.outputs;

import io.pulumi.azurenative.features.outputs.SubscriptionFeatureRegistrationResponseProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSubscriptionFeatureRegistrationResult {
    /**
     * Azure resource Id.
     * 
     */
    private final String id;
    /**
     * Azure resource name.
     * 
     */
    private final String name;
    private final SubscriptionFeatureRegistrationResponseProperties properties;
    /**
     * Azure resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetSubscriptionFeatureRegistrationResult(
        String id,
        String name,
        SubscriptionFeatureRegistrationResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Azure resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Azure resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    public SubscriptionFeatureRegistrationResponseProperties getProperties() {
        return this.properties;
    }
    /**
     * Azure resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionFeatureRegistrationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private SubscriptionFeatureRegistrationResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionFeatureRegistrationResult defaults) {
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

        public Builder setProperties(SubscriptionFeatureRegistrationResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSubscriptionFeatureRegistrationResult build() {
            return new GetSubscriptionFeatureRegistrationResult(id, name, properties, type);
        }
    }
}
