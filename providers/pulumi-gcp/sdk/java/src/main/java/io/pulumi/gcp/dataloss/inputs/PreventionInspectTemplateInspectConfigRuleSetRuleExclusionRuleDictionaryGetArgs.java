// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudStoragePath")
        private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs> cloudStoragePath;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs> getCloudStoragePath() {
        return this.cloudStoragePath == null ? Input.empty() : this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    @InputImport(name="wordList")
        private final @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs> wordList;

    public Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs> getWordList() {
        return this.wordList == null ? Input.empty() : this.wordList;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs> cloudStoragePath,
        @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs> wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs() {
        this.cloudStoragePath = Input.empty();
        this.wordList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs> cloudStoragePath;
        private @Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs> wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder setCloudStoragePath(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs> cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }

        public Builder setCloudStoragePath(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePathGetArgs cloudStoragePath) {
            this.cloudStoragePath = Input.ofNullable(cloudStoragePath);
            return this;
        }

        public Builder setWordList(@Nullable Input<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs> wordList) {
            this.wordList = wordList;
            return this;
        }

        public Builder setWordList(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordListGetArgs wordList) {
            this.wordList = Input.ofNullable(wordList);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryGetArgs(cloudStoragePath, wordList);
        }
    }
}
