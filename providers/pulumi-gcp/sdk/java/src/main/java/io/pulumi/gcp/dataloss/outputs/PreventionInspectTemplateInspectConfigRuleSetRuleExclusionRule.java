// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule {
    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary dictionary;
    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes excludeInfoTypes;
    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
     */
    private final String matchingType;
    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex regex;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule(
        @CustomType.Parameter("dictionary") @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary dictionary,
        @CustomType.Parameter("excludeInfoTypes") @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes excludeInfoTypes,
        @CustomType.Parameter("matchingType") String matchingType,
        @CustomType.Parameter("regex") @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex regex) {
        this.dictionary = dictionary;
        this.excludeInfoTypes = excludeInfoTypes;
        this.matchingType = matchingType;
        this.regex = regex;
    }

    /**
     * Dictionary which defines the rule.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary> getDictionary() {
        return Optional.ofNullable(this.dictionary);
    }
    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes> getExcludeInfoTypes() {
        return Optional.ofNullable(this.excludeInfoTypes);
    }
    /**
     * How the rule is applied. See the documentation for more information: https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#MatchingType
     * Possible values are `MATCHING_TYPE_FULL_MATCH`, `MATCHING_TYPE_PARTIAL_MATCH`, and `MATCHING_TYPE_INVERSE_MATCH`.
     * 
    */
    public String getMatchingType() {
        return this.matchingType;
    }
    /**
     * Regular expression which defines the rule.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex> getRegex() {
        return Optional.ofNullable(this.regex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary dictionary;
        private @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes excludeInfoTypes;
        private String matchingType;
        private @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex regex;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder dictionary(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionary dictionary) {
            this.dictionary = dictionary;
            return this;
        }

        public Builder excludeInfoTypes(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeInfoTypes excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder matchingType(String matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder regex(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegex regex) {
            this.regex = regex;
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}
