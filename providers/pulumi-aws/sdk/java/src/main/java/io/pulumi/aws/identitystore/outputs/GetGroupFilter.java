// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.identitystore.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGroupFilter {
    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `DisplayName` is the only valid attribute path.
     * 
     */
    private final String attributePath;
    /**
     * The value for an attribute.
     * 
     */
    private final String attributeValue;

    @OutputCustomType.Constructor({"attributePath","attributeValue"})
    private GetGroupFilter(
        String attributePath,
        String attributeValue) {
        this.attributePath = Objects.requireNonNull(attributePath);
        this.attributeValue = Objects.requireNonNull(attributeValue);
    }

    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `DisplayName` is the only valid attribute path.
     * 
     */
    public String getAttributePath() {
        return this.attributePath;
    }
    /**
     * The value for an attribute.
     * 
     */
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributePath;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePath = defaults.attributePath;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder setAttributePath(String attributePath) {
            this.attributePath = Objects.requireNonNull(attributePath);
            return this;
        }

        public Builder setAttributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public GetGroupFilter build() {
            return new GetGroupFilter(attributePath, attributeValue);
        }
    }
}
