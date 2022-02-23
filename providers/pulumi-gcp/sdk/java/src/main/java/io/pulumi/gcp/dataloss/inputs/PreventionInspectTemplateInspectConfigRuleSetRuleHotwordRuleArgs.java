// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs();

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    @InputImport(name="hotwordRegex", required=true)
        private final Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> getHotwordRegex() {
        return this.hotwordRegex;
    }

    /**
     * Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="likelihoodAdjustment", required=true)
        private final Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> getLikelihoodAdjustment() {
        return this.likelihoodAdjustment;
    }

    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    @InputImport(name="proximity", required=true)
        private final Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> getProximity() {
        return this.proximity;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs(
        Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex,
        Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment,
        Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity) {
        this.hotwordRegex = Objects.requireNonNull(hotwordRegex, "expected parameter 'hotwordRegex' to be non-null");
        this.likelihoodAdjustment = Objects.requireNonNull(likelihoodAdjustment, "expected parameter 'likelihoodAdjustment' to be non-null");
        this.proximity = Objects.requireNonNull(proximity, "expected parameter 'proximity' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs() {
        this.hotwordRegex = Input.empty();
        this.likelihoodAdjustment = Input.empty();
        this.proximity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex;
        private Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment;
        private Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRegex = defaults.hotwordRegex;
    	      this.likelihoodAdjustment = defaults.likelihoodAdjustment;
    	      this.proximity = defaults.proximity;
        }

        public Builder setHotwordRegex(Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex) {
            this.hotwordRegex = Objects.requireNonNull(hotwordRegex);
            return this;
        }

        public Builder setHotwordRegex(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs hotwordRegex) {
            this.hotwordRegex = Input.of(Objects.requireNonNull(hotwordRegex));
            return this;
        }

        public Builder setLikelihoodAdjustment(Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment) {
            this.likelihoodAdjustment = Objects.requireNonNull(likelihoodAdjustment);
            return this;
        }

        public Builder setLikelihoodAdjustment(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs likelihoodAdjustment) {
            this.likelihoodAdjustment = Input.of(Objects.requireNonNull(likelihoodAdjustment));
            return this;
        }

        public Builder setProximity(Input<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity) {
            this.proximity = Objects.requireNonNull(proximity);
            return this;
        }

        public Builder setProximity(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs proximity) {
            this.proximity = Input.of(Objects.requireNonNull(proximity));
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs(hotwordRegex, likelihoodAdjustment, proximity);
        }
    }
}
