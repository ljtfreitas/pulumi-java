// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionGetArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionGetArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionGetArgs Empty = new BudgetActionDefinitionGetArgs();

    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    @InputImport(name="iamActionDefinition")
    private final @Nullable Input<BudgetActionDefinitionIamActionDefinitionGetArgs> iamActionDefinition;

    public Input<BudgetActionDefinitionIamActionDefinitionGetArgs> getIamActionDefinition() {
        return this.iamActionDefinition == null ? Input.empty() : this.iamActionDefinition;
    }

    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    @InputImport(name="scpActionDefinition")
    private final @Nullable Input<BudgetActionDefinitionScpActionDefinitionGetArgs> scpActionDefinition;

    public Input<BudgetActionDefinitionScpActionDefinitionGetArgs> getScpActionDefinition() {
        return this.scpActionDefinition == null ? Input.empty() : this.scpActionDefinition;
    }

    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    @InputImport(name="ssmActionDefinition")
    private final @Nullable Input<BudgetActionDefinitionSsmActionDefinitionGetArgs> ssmActionDefinition;

    public Input<BudgetActionDefinitionSsmActionDefinitionGetArgs> getSsmActionDefinition() {
        return this.ssmActionDefinition == null ? Input.empty() : this.ssmActionDefinition;
    }

    public BudgetActionDefinitionGetArgs(
        @Nullable Input<BudgetActionDefinitionIamActionDefinitionGetArgs> iamActionDefinition,
        @Nullable Input<BudgetActionDefinitionScpActionDefinitionGetArgs> scpActionDefinition,
        @Nullable Input<BudgetActionDefinitionSsmActionDefinitionGetArgs> ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    private BudgetActionDefinitionGetArgs() {
        this.iamActionDefinition = Input.empty();
        this.scpActionDefinition = Input.empty();
        this.ssmActionDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BudgetActionDefinitionIamActionDefinitionGetArgs> iamActionDefinition;
        private @Nullable Input<BudgetActionDefinitionScpActionDefinitionGetArgs> scpActionDefinition;
        private @Nullable Input<BudgetActionDefinitionSsmActionDefinitionGetArgs> ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder setIamActionDefinition(@Nullable Input<BudgetActionDefinitionIamActionDefinitionGetArgs> iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }

        public Builder setIamActionDefinition(@Nullable BudgetActionDefinitionIamActionDefinitionGetArgs iamActionDefinition) {
            this.iamActionDefinition = Input.ofNullable(iamActionDefinition);
            return this;
        }

        public Builder setScpActionDefinition(@Nullable Input<BudgetActionDefinitionScpActionDefinitionGetArgs> scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }

        public Builder setScpActionDefinition(@Nullable BudgetActionDefinitionScpActionDefinitionGetArgs scpActionDefinition) {
            this.scpActionDefinition = Input.ofNullable(scpActionDefinition);
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable Input<BudgetActionDefinitionSsmActionDefinitionGetArgs> ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable BudgetActionDefinitionSsmActionDefinitionGetArgs ssmActionDefinition) {
            this.ssmActionDefinition = Input.ofNullable(ssmActionDefinition);
            return this;
        }
        public BudgetActionDefinitionGetArgs build() {
            return new BudgetActionDefinitionGetArgs(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
