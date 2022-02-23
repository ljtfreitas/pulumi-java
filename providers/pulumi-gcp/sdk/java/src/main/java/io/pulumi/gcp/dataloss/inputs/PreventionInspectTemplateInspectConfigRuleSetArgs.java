// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetArgs();

    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    @InputImport(name="infoTypes", required=true)
        private final Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes;

    public Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rules", required=true)
        private final Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules;

    public Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> getRules() {
        return this.rules;
    }

    public PreventionInspectTemplateInspectConfigRuleSetArgs(
        Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes,
        Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigRuleSetArgs() {
        this.infoTypes = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes;
        private Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder setInfoTypes(Input<List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs>> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder setInfoTypes(List<PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs> infoTypes) {
            this.infoTypes = Input.of(Objects.requireNonNull(infoTypes));
            return this;
        }

        public Builder setRules(Input<List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<PreventionInspectTemplateInspectConfigRuleSetRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetArgs(infoTypes, rules);
        }
    }
}
