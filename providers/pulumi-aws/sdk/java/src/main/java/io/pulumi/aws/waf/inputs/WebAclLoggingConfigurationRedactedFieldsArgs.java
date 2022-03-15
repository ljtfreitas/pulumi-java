// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclLoggingConfigurationRedactedFieldsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldsArgs Empty = new WebAclLoggingConfigurationRedactedFieldsArgs();

    /**
     * Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    @Import(name="fieldToMatches", required=true)
      private final Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs>> fieldToMatches;

    public Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs>> getFieldToMatches() {
        return this.fieldToMatches;
    }

    public WebAclLoggingConfigurationRedactedFieldsArgs(Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs>> fieldToMatches) {
        this.fieldToMatches = Objects.requireNonNull(fieldToMatches, "expected parameter 'fieldToMatches' to be non-null");
    }

    private WebAclLoggingConfigurationRedactedFieldsArgs() {
        this.fieldToMatches = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs>> fieldToMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatches = defaults.fieldToMatches;
        }

        public Builder fieldToMatches(Output<List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs>> fieldToMatches) {
            this.fieldToMatches = Objects.requireNonNull(fieldToMatches);
            return this;
        }

        public Builder fieldToMatches(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs> fieldToMatches) {
            this.fieldToMatches = Output.of(Objects.requireNonNull(fieldToMatches));
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldsArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldsArgs(fieldToMatches);
        }
    }
}
