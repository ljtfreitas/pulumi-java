// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AttributeResponse {
    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    private final String attributeDefinitionId;
    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines "data type" with acceptable values "questionnaire" and "step-count", when the attribute name is data type, this field must contain one of those values.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"attributeDefinitionId","values"})
    private AttributeResponse(
        String attributeDefinitionId,
        List<String> values) {
        this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    public String getAttributeDefinitionId() {
        return this.attributeDefinitionId;
    }
    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines "data type" with acceptable values "questionnaire" and "step-count", when the attribute name is data type, this field must contain one of those values.
     * 
     */
    public List<String> getValues() {
        return this.values;
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

        public Builder setAttributeDefinitionId(String attributeDefinitionId) {
            this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public AttributeResponse build() {
            return new AttributeResponse(attributeDefinitionId, values);
        }
    }
}
