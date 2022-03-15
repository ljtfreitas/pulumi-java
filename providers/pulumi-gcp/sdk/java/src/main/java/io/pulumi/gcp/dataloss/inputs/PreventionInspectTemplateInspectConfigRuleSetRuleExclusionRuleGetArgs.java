// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs();

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="dictionary")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> getDictionary() {
        return this.dictionary == null ? Output.empty() : this.dictionary;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @Import(name="excludeInfoTypes")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Output.empty() : this.excludeInfoTypes;
    }

    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
     */
    @Import(name="matchingType", required=true)
      private final Output<String> matchingType;

    public Output<String> getMatchingType() {
        return this.matchingType;
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex;

    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> getRegex() {
        return this.regex == null ? Output.empty() : this.regex;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs(
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary,
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes,
        Output<String> matchingType,
        @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex) {
        this.dictionary = dictionary;
        this.excludeInfoTypes = excludeInfoTypes;
        this.matchingType = Objects.requireNonNull(matchingType, "expected parameter 'matchingType' to be non-null");
        this.regex = regex;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs() {
        this.dictionary = Output.empty();
        this.excludeInfoTypes = Output.empty();
        this.matchingType = Output.empty();
        this.regex = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary;
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes;
        private Output<String> matchingType;
        private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder dictionary(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs> dictionary) {
            this.dictionary = dictionary;
            return this;
        }

        public Builder dictionary(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs dictionary) {
            this.dictionary = Output.ofNullable(dictionary);
            return this;
        }

        public Builder excludeInfoTypes(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder excludeInfoTypes(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesGetArgs excludeInfoTypes) {
            this.excludeInfoTypes = Output.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder matchingType(Output<String> matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder matchingType(String matchingType) {
            this.matchingType = Output.of(Objects.requireNonNull(matchingType));
            return this;
        }

        public Builder regex(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder regex(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexGetArgs regex) {
            this.regex = Output.ofNullable(regex);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleGetArgs(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}
