// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.ArmTemplateParameterPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentDeploymentPropertiesResponse {
    /**
     * The Azure Resource Manager template's identifier.
     * 
     */
    private final @Nullable String armTemplateId;
    /**
     * The parameters of the Azure Resource Manager template.
     * 
     */
    private final @Nullable List<ArmTemplateParameterPropertiesResponse> parameters;

    @CustomType.Constructor
    private EnvironmentDeploymentPropertiesResponse(
        @CustomType.Parameter("armTemplateId") @Nullable String armTemplateId,
        @CustomType.Parameter("parameters") @Nullable List<ArmTemplateParameterPropertiesResponse> parameters) {
        this.armTemplateId = armTemplateId;
        this.parameters = parameters;
    }

    /**
     * The Azure Resource Manager template's identifier.
     * 
    */
    public Optional<String> getArmTemplateId() {
        return Optional.ofNullable(this.armTemplateId);
    }
    /**
     * The parameters of the Azure Resource Manager template.
     * 
    */
    public List<ArmTemplateParameterPropertiesResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentDeploymentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String armTemplateId;
        private @Nullable List<ArmTemplateParameterPropertiesResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentDeploymentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateId = defaults.armTemplateId;
    	      this.parameters = defaults.parameters;
        }

        public Builder armTemplateId(@Nullable String armTemplateId) {
            this.armTemplateId = armTemplateId;
            return this;
        }

        public Builder parameters(@Nullable List<ArmTemplateParameterPropertiesResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public EnvironmentDeploymentPropertiesResponse build() {
            return new EnvironmentDeploymentPropertiesResponse(armTemplateId, parameters);
        }
    }
}
