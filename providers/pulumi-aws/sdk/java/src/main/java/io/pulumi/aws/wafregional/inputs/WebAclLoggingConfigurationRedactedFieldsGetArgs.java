// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclLoggingConfigurationRedactedFieldsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldsGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldsGetArgs();

    /**
     * Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    @Import(name="fieldToMatches", required=true)
      private final Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches;

    public Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> getFieldToMatches() {
        return this.fieldToMatches;
    }

    public WebAclLoggingConfigurationRedactedFieldsGetArgs(Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches) {
        this.fieldToMatches = Objects.requireNonNull(fieldToMatches, "expected parameter 'fieldToMatches' to be non-null");
    }

    private WebAclLoggingConfigurationRedactedFieldsGetArgs() {
        this.fieldToMatches = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatches = defaults.fieldToMatches;
        }

        public Builder fieldToMatches(Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs>> fieldToMatches) {
            this.fieldToMatches = Objects.requireNonNull(fieldToMatches);
            return this;
        }

        public Builder fieldToMatches(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchGetArgs> fieldToMatches) {
            this.fieldToMatches = Output.of(Objects.requireNonNull(fieldToMatches));
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldsGetArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldsGetArgs(fieldToMatches);
        }
    }
}
