// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs();

    public WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs();
        }
    }
}
