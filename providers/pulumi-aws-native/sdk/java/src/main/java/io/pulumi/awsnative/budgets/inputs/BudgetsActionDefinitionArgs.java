// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.awsnative.budgets.inputs.BudgetsActionIamActionDefinitionArgs;
import io.pulumi.awsnative.budgets.inputs.BudgetsActionScpActionDefinitionArgs;
import io.pulumi.awsnative.budgets.inputs.BudgetsActionSsmActionDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetsActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetsActionDefinitionArgs Empty = new BudgetsActionDefinitionArgs();

    @InputImport(name="iamActionDefinition")
        private final @Nullable Input<BudgetsActionIamActionDefinitionArgs> iamActionDefinition;

    public Input<BudgetsActionIamActionDefinitionArgs> getIamActionDefinition() {
        return this.iamActionDefinition == null ? Input.empty() : this.iamActionDefinition;
    }

    @InputImport(name="scpActionDefinition")
        private final @Nullable Input<BudgetsActionScpActionDefinitionArgs> scpActionDefinition;

    public Input<BudgetsActionScpActionDefinitionArgs> getScpActionDefinition() {
        return this.scpActionDefinition == null ? Input.empty() : this.scpActionDefinition;
    }

    @InputImport(name="ssmActionDefinition")
        private final @Nullable Input<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition;

    public Input<BudgetsActionSsmActionDefinitionArgs> getSsmActionDefinition() {
        return this.ssmActionDefinition == null ? Input.empty() : this.ssmActionDefinition;
    }

    public BudgetsActionDefinitionArgs(
        @Nullable Input<BudgetsActionIamActionDefinitionArgs> iamActionDefinition,
        @Nullable Input<BudgetsActionScpActionDefinitionArgs> scpActionDefinition,
        @Nullable Input<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    private BudgetsActionDefinitionArgs() {
        this.iamActionDefinition = Input.empty();
        this.scpActionDefinition = Input.empty();
        this.ssmActionDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BudgetsActionIamActionDefinitionArgs> iamActionDefinition;
        private @Nullable Input<BudgetsActionScpActionDefinitionArgs> scpActionDefinition;
        private @Nullable Input<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder setIamActionDefinition(@Nullable Input<BudgetsActionIamActionDefinitionArgs> iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }

        public Builder setIamActionDefinition(@Nullable BudgetsActionIamActionDefinitionArgs iamActionDefinition) {
            this.iamActionDefinition = Input.ofNullable(iamActionDefinition);
            return this;
        }

        public Builder setScpActionDefinition(@Nullable Input<BudgetsActionScpActionDefinitionArgs> scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }

        public Builder setScpActionDefinition(@Nullable BudgetsActionScpActionDefinitionArgs scpActionDefinition) {
            this.scpActionDefinition = Input.ofNullable(scpActionDefinition);
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable Input<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable BudgetsActionSsmActionDefinitionArgs ssmActionDefinition) {
            this.ssmActionDefinition = Input.ofNullable(ssmActionDefinition);
            return this;
        }
        public BudgetsActionDefinitionArgs build() {
            return new BudgetsActionDefinitionArgs(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
