// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An attribute value for a Consent or User data mapping. Each Attribute must have a corresponding AttributeDefinition in the consent store that defines the default and allowed values.
 * 
 */
public final class AttributeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttributeResponse Empty = new AttributeResponse();

    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    @Import(name="attributeDefinitionId", required=true)
      private final String attributeDefinitionId;

    public String getAttributeDefinitionId() {
        return this.attributeDefinitionId;
    }

    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines "data type" with acceptable values "questionnaire" and "step-count", when the attribute name is data type, this field must contain one of those values.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public AttributeResponse(
        String attributeDefinitionId,
        List<String> values) {
        this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId, "expected parameter 'attributeDefinitionId' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private AttributeResponse() {
        this.attributeDefinitionId = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeDefinitionId;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDefinitionId = defaults.attributeDefinitionId;
    	      this.values = defaults.values;
        }

        public Builder attributeDefinitionId(String attributeDefinitionId) {
            this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public AttributeResponse build() {
            return new AttributeResponse(attributeDefinitionId, values);
        }
    }
}
