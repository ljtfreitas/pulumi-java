// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectionRuleResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2InspectionRuleSetResponse {
    /**
     * List of infoTypes this rule set is applied to.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
     */
    private final List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

    @OutputCustomType.Constructor({"infoTypes","rules"})
    private GooglePrivacyDlpV2InspectionRuleSetResponse(
        List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes);
        this.rules = Objects.requireNonNull(rules);
    }

    /**
     * List of infoTypes this rule set is applied to.
     * 
     */
    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }
    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
     */
    public List<GooglePrivacyDlpV2InspectionRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder setInfoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder setRules(List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public GooglePrivacyDlpV2InspectionRuleSetResponse build() {
            return new GooglePrivacyDlpV2InspectionRuleSetResponse(infoTypes, rules);
        }
    }
}
