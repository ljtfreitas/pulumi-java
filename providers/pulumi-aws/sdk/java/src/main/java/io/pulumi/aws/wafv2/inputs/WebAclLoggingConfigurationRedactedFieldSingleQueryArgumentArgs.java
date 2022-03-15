// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs Empty = new WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs();

    /**
     * The name of the query header to redact. This setting must be provided as lower case characters.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="name", required=true)
      private final Output<String> name;

    @Deprecated /* Not supported by WAFv2 API */
    public Output<String> getName() {
        return this.name;
    }

    public WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs(name);
        }
    }
}
