// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectionRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule set for modifying a set of infoTypes to alter behavior under certain circumstances, depending on the specific details of the rules within the set.
 * 
 */
public final class GooglePrivacyDlpV2InspectionRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InspectionRuleSetArgs Empty = new GooglePrivacyDlpV2InspectionRuleSetArgs();

    /**
     * List of infoTypes this rule set is applied to.
     * 
     */
    @InputImport(name="infoTypes")
      private final @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;

    public Input<List<GooglePrivacyDlpV2InfoTypeArgs>> getInfoTypes() {
        return this.infoTypes == null ? Input.empty() : this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleArgs>> rules;

    public Input<List<GooglePrivacyDlpV2InspectionRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public GooglePrivacyDlpV2InspectionRuleSetArgs(
        @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes,
        @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleArgs>> rules) {
        this.infoTypes = infoTypes;
        this.rules = rules;
    }

    private GooglePrivacyDlpV2InspectionRuleSetArgs() {
        this.infoTypes = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;
        private @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder setInfoTypes(@Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder setInfoTypes(@Nullable List<GooglePrivacyDlpV2InfoTypeArgs> infoTypes) {
            this.infoTypes = Input.ofNullable(infoTypes);
            return this;
        }

        public Builder setRules(@Nullable Input<List<GooglePrivacyDlpV2InspectionRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<GooglePrivacyDlpV2InspectionRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public GooglePrivacyDlpV2InspectionRuleSetArgs build() {
            return new GooglePrivacyDlpV2InspectionRuleSetArgs(infoTypes, rules);
        }
    }
}
