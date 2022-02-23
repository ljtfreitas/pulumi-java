// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ArmTemplateParameterPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an environment deployment.
 * 
 */
public final class EnvironmentDeploymentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentDeploymentPropertiesArgs Empty = new EnvironmentDeploymentPropertiesArgs();

    /**
     * The Azure Resource Manager template's identifier.
     * 
     */
    @InputImport(name="armTemplateId")
        private final @Nullable Input<String> armTemplateId;

    public Input<String> getArmTemplateId() {
        return this.armTemplateId == null ? Input.empty() : this.armTemplateId;
    }

    /**
     * The parameters of the Azure Resource Manager template.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<List<ArmTemplateParameterPropertiesArgs>> parameters;

    public Input<List<ArmTemplateParameterPropertiesArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public EnvironmentDeploymentPropertiesArgs(
        @Nullable Input<String> armTemplateId,
        @Nullable Input<List<ArmTemplateParameterPropertiesArgs>> parameters) {
        this.armTemplateId = armTemplateId;
        this.parameters = parameters;
    }

    private EnvironmentDeploymentPropertiesArgs() {
        this.armTemplateId = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentDeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> armTemplateId;
        private @Nullable Input<List<ArmTemplateParameterPropertiesArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentDeploymentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateId = defaults.armTemplateId;
    	      this.parameters = defaults.parameters;
        }

        public Builder setArmTemplateId(@Nullable Input<String> armTemplateId) {
            this.armTemplateId = armTemplateId;
            return this;
        }

        public Builder setArmTemplateId(@Nullable String armTemplateId) {
            this.armTemplateId = Input.ofNullable(armTemplateId);
            return this;
        }

        public Builder setParameters(@Nullable Input<List<ArmTemplateParameterPropertiesArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<ArmTemplateParameterPropertiesArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }
        public EnvironmentDeploymentPropertiesArgs build() {
            return new EnvironmentDeploymentPropertiesArgs(armTemplateId, parameters);
        }
    }
}
