// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkspaceCustomBooleanParameterResponse {
    /**
     * The type of variable that this is
     * 
     */
    private final String type;
    /**
     * The value which should be used for this field.
     * 
     */
    private final Boolean value;

    @OutputCustomType.Constructor({"type","value"})
    private WorkspaceCustomBooleanParameterResponse(
        String type,
        Boolean value) {
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The type of variable that this is
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The value which should be used for this field.
     * 
     */
    public Boolean getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomBooleanParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Boolean value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomBooleanParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(Boolean value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WorkspaceCustomBooleanParameterResponse build() {
            return new WorkspaceCustomBooleanParameterResponse(type, value);
        }
    }
}
