// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs();

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dictionary")
        private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> getDictionary() {
        return this.dictionary == null ? Input.empty() : this.dictionary;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="excludeInfoTypes")
        private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Input.empty() : this.excludeInfoTypes;
    }

    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
     */
    @InputImport(name="matchingType", required=true)
        private final Input<String> matchingType;

    public Input<String> getMatchingType() {
        return this.matchingType;
    }

    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="regex")
        private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes,
        Input<String> matchingType,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex) {
        this.dictionary = dictionary;
        this.excludeInfoTypes = excludeInfoTypes;
        this.matchingType = Objects.requireNonNull(matchingType, "expected parameter 'matchingType' to be non-null");
        this.regex = regex;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs() {
        this.dictionary = Input.empty();
        this.excludeInfoTypes = Input.empty();
        this.matchingType = Input.empty();
        this.regex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes;
        private Input<String> matchingType;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder setDictionary(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs> dictionary) {
            this.dictionary = dictionary;
            return this;
        }

        public Builder setDictionary(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryArgs dictionary) {
            this.dictionary = Input.ofNullable(dictionary);
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypesArgs excludeInfoTypes) {
            this.excludeInfoTypes = Input.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder setMatchingType(Input<String> matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder setMatchingType(String matchingType) {
            this.matchingType = Input.of(Objects.requireNonNull(matchingType));
            return this;
        }

        public Builder setRegex(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}
