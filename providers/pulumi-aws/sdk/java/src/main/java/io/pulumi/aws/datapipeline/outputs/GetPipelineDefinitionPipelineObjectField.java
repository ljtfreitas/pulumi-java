// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPipelineDefinitionPipelineObjectField {
    /**
     * Field identifier.
     * 
     */
    private final String key;
    /**
     * Field value, expressed as the identifier of another object
     * 
     */
    private final String refValue;
    /**
     * Field value, expressed as a String.
     * 
     */
    private final String stringValue;

    @OutputCustomType.Constructor({"key","refValue","stringValue"})
    private GetPipelineDefinitionPipelineObjectField(
        String key,
        String refValue,
        String stringValue) {
        this.key = Objects.requireNonNull(key);
        this.refValue = Objects.requireNonNull(refValue);
        this.stringValue = Objects.requireNonNull(stringValue);
    }

    /**
     * Field identifier.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Field value, expressed as the identifier of another object
     * 
     */
    public String getRefValue() {
        return this.refValue;
    }
    /**
     * Field value, expressed as a String.
     * 
     */
    public String getStringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionPipelineObjectField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String refValue;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionPipelineObjectField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.refValue = defaults.refValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setRefValue(String refValue) {
            this.refValue = Objects.requireNonNull(refValue);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public GetPipelineDefinitionPipelineObjectField build() {
            return new GetPipelineDefinitionPipelineObjectField(key, refValue, stringValue);
        }
    }
}
