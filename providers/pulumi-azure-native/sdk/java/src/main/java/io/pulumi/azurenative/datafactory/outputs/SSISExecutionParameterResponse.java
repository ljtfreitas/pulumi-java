// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;

@OutputCustomType
public final class SSISExecutionParameterResponse {
    /**
     * SSIS package execution parameter value. Type: string (or Expression with resultType string).
     * 
     */
    private final Object value;

    @OutputCustomType.Constructor({"value"})
    private SSISExecutionParameterResponse(Object value) {
        this.value = Objects.requireNonNull(value);
    }

    /**
     * SSIS package execution parameter value. Type: string (or Expression with resultType string).
     * 
     */
    public Object getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public SSISExecutionParameterResponse build() {
            return new SSISExecutionParameterResponse(value);
        }
    }
}
