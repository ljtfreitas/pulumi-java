// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBudgetArgs Empty = new GetBudgetArgs();

    /**
     * Budget Name.
     * 
     */
    @Import(name="budgetName", required=true)
      private final String budgetName;

    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for billingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for invoiceSection scope.
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetBudgetArgs(
        String budgetName,
        String scope) {
        this.budgetName = Objects.requireNonNull(budgetName, "expected parameter 'budgetName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetBudgetArgs() {
        this.budgetName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String budgetName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.budgetName = defaults.budgetName;
    	      this.scope = defaults.scope;
        }

        public Builder budgetName(String budgetName) {
            this.budgetName = Objects.requireNonNull(budgetName);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetBudgetArgs build() {
            return new GetBudgetArgs(budgetName, scope);
        }
    }
}
