// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs();

    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    @Import(name="words", required=true)
      private final Output<List<String>> words;

    public Output<List<String>> words() {
        return this.words;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs(Output<List<String>> words) {
        this.words = Objects.requireNonNull(words, "expected parameter 'words' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs() {
        this.words = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> words;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.words = defaults.words;
        }

        public Builder words(Output<List<String>> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }
        public Builder words(List<String> words) {
            this.words = Output.of(Objects.requireNonNull(words));
            return this;
        }
        public Builder words(String... words) {
            return words(List.of(words));
        }        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryWordListArgs(words);
        }
    }
}
