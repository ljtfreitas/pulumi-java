// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2InspectConfigMinLikelihood;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CustomInfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FindingLimitsArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectionRuleSetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration description of the scanning process. When used with redactContent only info_types and min_likelihood are currently used.
 * 
 */
public final class GooglePrivacyDlpV2InspectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InspectConfigArgs Empty = new GooglePrivacyDlpV2InspectConfigArgs();

    /**
     * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * 
     */
    @InputImport(name="customInfoTypes")
      private final @Nullable Input<List<GooglePrivacyDlpV2CustomInfoTypeArgs>> customInfoTypes;

    public Input<List<GooglePrivacyDlpV2CustomInfoTypeArgs>> getCustomInfoTypes() {
        return this.customInfoTypes == null ? Input.empty() : this.customInfoTypes;
    }

    /**
     * When true, excludes type information of the findings. This is not used for data profiling.
     * 
     */
    @InputImport(name="excludeInfoTypes")
      private final @Nullable Input<Boolean> excludeInfoTypes;

    public Input<Boolean> getExcludeInfoTypes() {
        return this.excludeInfoTypes == null ? Input.empty() : this.excludeInfoTypes;
    }

    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
     * 
     */
    @InputImport(name="includeQuote")
      private final @Nullable Input<Boolean> includeQuote;

    public Input<Boolean> getIncludeQuote() {
        return this.includeQuote == null ? Input.empty() : this.includeQuote;
    }

    /**
     * Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
     * 
     */
    @InputImport(name="infoTypes")
      private final @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;

    public Input<List<GooglePrivacyDlpV2InfoTypeArgs>> getInfoTypes() {
        return this.infoTypes == null ? Input.empty() : this.infoTypes;
    }

    /**
     * Configuration to control the number of findings returned. This is not used for data profiling.
     * 
     */
    @InputImport(name="limits")
      private final @Nullable Input<GooglePrivacyDlpV2FindingLimitsArgs> limits;

    public Input<GooglePrivacyDlpV2FindingLimitsArgs> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    /**
     * Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
     * 
     */
    @InputImport(name="minLikelihood")
      private final @Nullable Input<GooglePrivacyDlpV2InspectConfigMinLikelihood> minLikelihood;

    public Input<GooglePrivacyDlpV2InspectConfigMinLikelihood> getMinLikelihood() {
        return this.minLikelihood == null ? Input.empty() : this.minLikelihood;
    }

    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
     * 
     */
    @InputImport(name="ruleSet")
      private final @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleSetArgs>> ruleSet;

    public Input<List<GooglePrivacyDlpV2InspectionRuleSetArgs>> getRuleSet() {
        return this.ruleSet == null ? Input.empty() : this.ruleSet;
    }

    public GooglePrivacyDlpV2InspectConfigArgs(
        @Nullable Input<List<GooglePrivacyDlpV2CustomInfoTypeArgs>> customInfoTypes,
        @Nullable Input<Boolean> excludeInfoTypes,
        @Nullable Input<Boolean> includeQuote,
        @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes,
        @Nullable Input<GooglePrivacyDlpV2FindingLimitsArgs> limits,
        @Nullable Input<GooglePrivacyDlpV2InspectConfigMinLikelihood> minLikelihood,
        @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleSetArgs>> ruleSet) {
        this.customInfoTypes = customInfoTypes;
        this.excludeInfoTypes = excludeInfoTypes;
        this.includeQuote = includeQuote;
        this.infoTypes = infoTypes;
        this.limits = limits;
        this.minLikelihood = minLikelihood;
        this.ruleSet = ruleSet;
    }

    private GooglePrivacyDlpV2InspectConfigArgs() {
        this.customInfoTypes = Input.empty();
        this.excludeInfoTypes = Input.empty();
        this.includeQuote = Input.empty();
        this.infoTypes = Input.empty();
        this.limits = Input.empty();
        this.minLikelihood = Input.empty();
        this.ruleSet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GooglePrivacyDlpV2CustomInfoTypeArgs>> customInfoTypes;
        private @Nullable Input<Boolean> excludeInfoTypes;
        private @Nullable Input<Boolean> includeQuote;
        private @Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes;
        private @Nullable Input<GooglePrivacyDlpV2FindingLimitsArgs> limits;
        private @Nullable Input<GooglePrivacyDlpV2InspectConfigMinLikelihood> minLikelihood;
        private @Nullable Input<List<GooglePrivacyDlpV2InspectionRuleSetArgs>> ruleSet;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customInfoTypes = defaults.customInfoTypes;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.includeQuote = defaults.includeQuote;
    	      this.infoTypes = defaults.infoTypes;
    	      this.limits = defaults.limits;
    	      this.minLikelihood = defaults.minLikelihood;
    	      this.ruleSet = defaults.ruleSet;
        }

        public Builder setCustomInfoTypes(@Nullable Input<List<GooglePrivacyDlpV2CustomInfoTypeArgs>> customInfoTypes) {
            this.customInfoTypes = customInfoTypes;
            return this;
        }

        public Builder setCustomInfoTypes(@Nullable List<GooglePrivacyDlpV2CustomInfoTypeArgs> customInfoTypes) {
            this.customInfoTypes = Input.ofNullable(customInfoTypes);
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Input<Boolean> excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder setExcludeInfoTypes(@Nullable Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Input.ofNullable(excludeInfoTypes);
            return this;
        }

        public Builder setIncludeQuote(@Nullable Input<Boolean> includeQuote) {
            this.includeQuote = includeQuote;
            return this;
        }

        public Builder setIncludeQuote(@Nullable Boolean includeQuote) {
            this.includeQuote = Input.ofNullable(includeQuote);
            return this;
        }

        public Builder setInfoTypes(@Nullable Input<List<GooglePrivacyDlpV2InfoTypeArgs>> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder setInfoTypes(@Nullable List<GooglePrivacyDlpV2InfoTypeArgs> infoTypes) {
            this.infoTypes = Input.ofNullable(infoTypes);
            return this;
        }

        public Builder setLimits(@Nullable Input<GooglePrivacyDlpV2FindingLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder setLimits(@Nullable GooglePrivacyDlpV2FindingLimitsArgs limits) {
            this.limits = Input.ofNullable(limits);
            return this;
        }

        public Builder setMinLikelihood(@Nullable Input<GooglePrivacyDlpV2InspectConfigMinLikelihood> minLikelihood) {
            this.minLikelihood = minLikelihood;
            return this;
        }

        public Builder setMinLikelihood(@Nullable GooglePrivacyDlpV2InspectConfigMinLikelihood minLikelihood) {
            this.minLikelihood = Input.ofNullable(minLikelihood);
            return this;
        }

        public Builder setRuleSet(@Nullable Input<List<GooglePrivacyDlpV2InspectionRuleSetArgs>> ruleSet) {
            this.ruleSet = ruleSet;
            return this;
        }

        public Builder setRuleSet(@Nullable List<GooglePrivacyDlpV2InspectionRuleSetArgs> ruleSet) {
            this.ruleSet = Input.ofNullable(ruleSet);
            return this;
        }
        public GooglePrivacyDlpV2InspectConfigArgs build() {
            return new GooglePrivacyDlpV2InspectConfigArgs(customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSet);
        }
    }
}
