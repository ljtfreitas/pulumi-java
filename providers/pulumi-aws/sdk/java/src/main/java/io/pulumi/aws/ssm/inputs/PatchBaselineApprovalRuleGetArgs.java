// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchBaselineApprovalRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineApprovalRuleGetArgs Empty = new PatchBaselineApprovalRuleGetArgs();

    /**
     * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100. Conflicts with `approve_until_date`
     * 
     */
    @InputImport(name="approveAfterDays")
    private final @Nullable Input<Integer> approveAfterDays;

    public Input<Integer> getApproveAfterDays() {
        return this.approveAfterDays == null ? Input.empty() : this.approveAfterDays;
    }

    /**
     * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Date is formatted as `YYYY-MM-DD`. Conflicts with `approve_after_days`
     * 
     */
    @InputImport(name="approveUntilDate")
    private final @Nullable Input<String> approveUntilDate;

    public Input<String> getApproveUntilDate() {
        return this.approveUntilDate == null ? Input.empty() : this.approveUntilDate;
    }

    /**
     * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @InputImport(name="complianceLevel")
    private final @Nullable Input<String> complianceLevel;

    public Input<String> getComplianceLevel() {
        return this.complianceLevel == null ? Input.empty() : this.complianceLevel;
    }

    /**
     * Boolean enabling the application of non-security updates. The default value is 'false'. Valid for Linux instances only.
     * 
     */
    @InputImport(name="enableNonSecurity")
    private final @Nullable Input<Boolean> enableNonSecurity;

    public Input<Boolean> getEnableNonSecurity() {
        return this.enableNonSecurity == null ? Input.empty() : this.enableNonSecurity;
    }

    /**
     * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`. Valid combinations of these Keys and the `operating_system` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values.
     * 
     */
    @InputImport(name="patchFilters", required=true)
    private final Input<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters;

    public Input<List<PatchBaselineApprovalRulePatchFilterGetArgs>> getPatchFilters() {
        return this.patchFilters;
    }

    public PatchBaselineApprovalRuleGetArgs(
        @Nullable Input<Integer> approveAfterDays,
        @Nullable Input<String> approveUntilDate,
        @Nullable Input<String> complianceLevel,
        @Nullable Input<Boolean> enableNonSecurity,
        Input<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters) {
        this.approveAfterDays = approveAfterDays;
        this.approveUntilDate = approveUntilDate;
        this.complianceLevel = complianceLevel;
        this.enableNonSecurity = enableNonSecurity;
        this.patchFilters = Objects.requireNonNull(patchFilters, "expected parameter 'patchFilters' to be non-null");
    }

    private PatchBaselineApprovalRuleGetArgs() {
        this.approveAfterDays = Input.empty();
        this.approveUntilDate = Input.empty();
        this.complianceLevel = Input.empty();
        this.enableNonSecurity = Input.empty();
        this.patchFilters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineApprovalRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> approveAfterDays;
        private @Nullable Input<String> approveUntilDate;
        private @Nullable Input<String> complianceLevel;
        private @Nullable Input<Boolean> enableNonSecurity;
        private Input<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineApprovalRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approveAfterDays = defaults.approveAfterDays;
    	      this.approveUntilDate = defaults.approveUntilDate;
    	      this.complianceLevel = defaults.complianceLevel;
    	      this.enableNonSecurity = defaults.enableNonSecurity;
    	      this.patchFilters = defaults.patchFilters;
        }

        public Builder setApproveAfterDays(@Nullable Input<Integer> approveAfterDays) {
            this.approveAfterDays = approveAfterDays;
            return this;
        }

        public Builder setApproveAfterDays(@Nullable Integer approveAfterDays) {
            this.approveAfterDays = Input.ofNullable(approveAfterDays);
            return this;
        }

        public Builder setApproveUntilDate(@Nullable Input<String> approveUntilDate) {
            this.approveUntilDate = approveUntilDate;
            return this;
        }

        public Builder setApproveUntilDate(@Nullable String approveUntilDate) {
            this.approveUntilDate = Input.ofNullable(approveUntilDate);
            return this;
        }

        public Builder setComplianceLevel(@Nullable Input<String> complianceLevel) {
            this.complianceLevel = complianceLevel;
            return this;
        }

        public Builder setComplianceLevel(@Nullable String complianceLevel) {
            this.complianceLevel = Input.ofNullable(complianceLevel);
            return this;
        }

        public Builder setEnableNonSecurity(@Nullable Input<Boolean> enableNonSecurity) {
            this.enableNonSecurity = enableNonSecurity;
            return this;
        }

        public Builder setEnableNonSecurity(@Nullable Boolean enableNonSecurity) {
            this.enableNonSecurity = Input.ofNullable(enableNonSecurity);
            return this;
        }

        public Builder setPatchFilters(Input<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters) {
            this.patchFilters = Objects.requireNonNull(patchFilters);
            return this;
        }

        public Builder setPatchFilters(List<PatchBaselineApprovalRulePatchFilterGetArgs> patchFilters) {
            this.patchFilters = Input.of(Objects.requireNonNull(patchFilters));
            return this;
        }
        public PatchBaselineApprovalRuleGetArgs build() {
            return new PatchBaselineApprovalRuleGetArgs(approveAfterDays, approveUntilDate, complianceLevel, enableNonSecurity, patchFilters);
        }
    }
}