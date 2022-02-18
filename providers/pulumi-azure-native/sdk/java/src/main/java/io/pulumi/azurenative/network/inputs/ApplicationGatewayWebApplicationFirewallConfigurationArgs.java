// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayFirewallMode;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayFirewallDisabledRuleGroupArgs;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayFirewallExclusionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application gateway web application firewall configuration.
 * 
 */
public final class ApplicationGatewayWebApplicationFirewallConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayWebApplicationFirewallConfigurationArgs Empty = new ApplicationGatewayWebApplicationFirewallConfigurationArgs();

    /**
     * The disabled rule groups.
     * 
     */
    @InputImport(name="disabledRuleGroups")
    private final @Nullable Input<List<ApplicationGatewayFirewallDisabledRuleGroupArgs>> disabledRuleGroups;

    public Input<List<ApplicationGatewayFirewallDisabledRuleGroupArgs>> getDisabledRuleGroups() {
        return this.disabledRuleGroups == null ? Input.empty() : this.disabledRuleGroups;
    }

    /**
     * Whether the web application firewall is enabled or not.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The exclusion list.
     * 
     */
    @InputImport(name="exclusions")
    private final @Nullable Input<List<ApplicationGatewayFirewallExclusionArgs>> exclusions;

    public Input<List<ApplicationGatewayFirewallExclusionArgs>> getExclusions() {
        return this.exclusions == null ? Input.empty() : this.exclusions;
    }

    /**
     * Maximum file upload size in Mb for WAF.
     * 
     */
    @InputImport(name="fileUploadLimitInMb")
    private final @Nullable Input<Integer> fileUploadLimitInMb;

    public Input<Integer> getFileUploadLimitInMb() {
        return this.fileUploadLimitInMb == null ? Input.empty() : this.fileUploadLimitInMb;
    }

    /**
     * Web application firewall mode.
     * 
     */
    @InputImport(name="firewallMode", required=true)
    private final Input<Either<String,ApplicationGatewayFirewallMode>> firewallMode;

    public Input<Either<String,ApplicationGatewayFirewallMode>> getFirewallMode() {
        return this.firewallMode;
    }

    /**
     * Maximum request body size for WAF.
     * 
     */
    @InputImport(name="maxRequestBodySize")
    private final @Nullable Input<Integer> maxRequestBodySize;

    public Input<Integer> getMaxRequestBodySize() {
        return this.maxRequestBodySize == null ? Input.empty() : this.maxRequestBodySize;
    }

    /**
     * Maximum request body size in Kb for WAF.
     * 
     */
    @InputImport(name="maxRequestBodySizeInKb")
    private final @Nullable Input<Integer> maxRequestBodySizeInKb;

    public Input<Integer> getMaxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb == null ? Input.empty() : this.maxRequestBodySizeInKb;
    }

    /**
     * Whether allow WAF to check request Body.
     * 
     */
    @InputImport(name="requestBodyCheck")
    private final @Nullable Input<Boolean> requestBodyCheck;

    public Input<Boolean> getRequestBodyCheck() {
        return this.requestBodyCheck == null ? Input.empty() : this.requestBodyCheck;
    }

    /**
     * The type of the web application firewall rule set. Possible values are: 'OWASP'.
     * 
     */
    @InputImport(name="ruleSetType", required=true)
    private final Input<String> ruleSetType;

    public Input<String> getRuleSetType() {
        return this.ruleSetType;
    }

    /**
     * The version of the rule set type.
     * 
     */
    @InputImport(name="ruleSetVersion", required=true)
    private final Input<String> ruleSetVersion;

    public Input<String> getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public ApplicationGatewayWebApplicationFirewallConfigurationArgs(
        @Nullable Input<List<ApplicationGatewayFirewallDisabledRuleGroupArgs>> disabledRuleGroups,
        Input<Boolean> enabled,
        @Nullable Input<List<ApplicationGatewayFirewallExclusionArgs>> exclusions,
        @Nullable Input<Integer> fileUploadLimitInMb,
        Input<Either<String,ApplicationGatewayFirewallMode>> firewallMode,
        @Nullable Input<Integer> maxRequestBodySize,
        @Nullable Input<Integer> maxRequestBodySizeInKb,
        @Nullable Input<Boolean> requestBodyCheck,
        Input<String> ruleSetType,
        Input<String> ruleSetVersion) {
        this.disabledRuleGroups = disabledRuleGroups;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.exclusions = exclusions;
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        this.firewallMode = Objects.requireNonNull(firewallMode, "expected parameter 'firewallMode' to be non-null");
        this.maxRequestBodySize = maxRequestBodySize;
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        this.requestBodyCheck = requestBodyCheck;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private ApplicationGatewayWebApplicationFirewallConfigurationArgs() {
        this.disabledRuleGroups = Input.empty();
        this.enabled = Input.empty();
        this.exclusions = Input.empty();
        this.fileUploadLimitInMb = Input.empty();
        this.firewallMode = Input.empty();
        this.maxRequestBodySize = Input.empty();
        this.maxRequestBodySizeInKb = Input.empty();
        this.requestBodyCheck = Input.empty();
        this.ruleSetType = Input.empty();
        this.ruleSetVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayWebApplicationFirewallConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ApplicationGatewayFirewallDisabledRuleGroupArgs>> disabledRuleGroups;
        private Input<Boolean> enabled;
        private @Nullable Input<List<ApplicationGatewayFirewallExclusionArgs>> exclusions;
        private @Nullable Input<Integer> fileUploadLimitInMb;
        private Input<Either<String,ApplicationGatewayFirewallMode>> firewallMode;
        private @Nullable Input<Integer> maxRequestBodySize;
        private @Nullable Input<Integer> maxRequestBodySizeInKb;
        private @Nullable Input<Boolean> requestBodyCheck;
        private Input<String> ruleSetType;
        private Input<String> ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayWebApplicationFirewallConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledRuleGroups = defaults.disabledRuleGroups;
    	      this.enabled = defaults.enabled;
    	      this.exclusions = defaults.exclusions;
    	      this.fileUploadLimitInMb = defaults.fileUploadLimitInMb;
    	      this.firewallMode = defaults.firewallMode;
    	      this.maxRequestBodySize = defaults.maxRequestBodySize;
    	      this.maxRequestBodySizeInKb = defaults.maxRequestBodySizeInKb;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setDisabledRuleGroups(@Nullable Input<List<ApplicationGatewayFirewallDisabledRuleGroupArgs>> disabledRuleGroups) {
            this.disabledRuleGroups = disabledRuleGroups;
            return this;
        }

        public Builder setDisabledRuleGroups(@Nullable List<ApplicationGatewayFirewallDisabledRuleGroupArgs> disabledRuleGroups) {
            this.disabledRuleGroups = Input.ofNullable(disabledRuleGroups);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setExclusions(@Nullable Input<List<ApplicationGatewayFirewallExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setExclusions(@Nullable List<ApplicationGatewayFirewallExclusionArgs> exclusions) {
            this.exclusions = Input.ofNullable(exclusions);
            return this;
        }

        public Builder setFileUploadLimitInMb(@Nullable Input<Integer> fileUploadLimitInMb) {
            this.fileUploadLimitInMb = fileUploadLimitInMb;
            return this;
        }

        public Builder setFileUploadLimitInMb(@Nullable Integer fileUploadLimitInMb) {
            this.fileUploadLimitInMb = Input.ofNullable(fileUploadLimitInMb);
            return this;
        }

        public Builder setFirewallMode(Input<Either<String,ApplicationGatewayFirewallMode>> firewallMode) {
            this.firewallMode = Objects.requireNonNull(firewallMode);
            return this;
        }

        public Builder setFirewallMode(Either<String,ApplicationGatewayFirewallMode> firewallMode) {
            this.firewallMode = Input.of(Objects.requireNonNull(firewallMode));
            return this;
        }

        public Builder setMaxRequestBodySize(@Nullable Input<Integer> maxRequestBodySize) {
            this.maxRequestBodySize = maxRequestBodySize;
            return this;
        }

        public Builder setMaxRequestBodySize(@Nullable Integer maxRequestBodySize) {
            this.maxRequestBodySize = Input.ofNullable(maxRequestBodySize);
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Input<Integer> maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Integer maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = Input.ofNullable(maxRequestBodySizeInKb);
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Input<Boolean> requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Boolean requestBodyCheck) {
            this.requestBodyCheck = Input.ofNullable(requestBodyCheck);
            return this;
        }

        public Builder setRuleSetType(Input<String> ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Input.of(Objects.requireNonNull(ruleSetType));
            return this;
        }

        public Builder setRuleSetVersion(Input<String> ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Input.of(Objects.requireNonNull(ruleSetVersion));
            return this;
        }

        public ApplicationGatewayWebApplicationFirewallConfigurationArgs build() {
            return new ApplicationGatewayWebApplicationFirewallConfigurationArgs(disabledRuleGroups, enabled, exclusions, fileUploadLimitInMb, firewallMode, maxRequestBodySize, maxRequestBodySizeInKb, requestBodyCheck, ruleSetType, ruleSetVersion);
        }
    }
}
